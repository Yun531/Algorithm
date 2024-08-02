import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon10814();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon10814 implements Algorithm {
    Member[] members;

    public void solution() throws IOException{
        input();
        calc();
        print();
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        members = new Member[Integer.parseInt(br.readLine())];
        for(int i = 0; i < members.length; i++){                                            //입력된 온라인 회원 정보를 배열에 저장
            st = new StringTokenizer(br.readLine());
            members[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        br.close();
    }


    public void calc(){
        Arrays.sort(members, new Comparator<Member>(){
            public int compare(Member o1, Member o2){
//                if(o1.age == o2.age){                                                         //조건이 이름순이 아닌 등록 순임
//                    return o1.name.compareTo(o2.name);                                        //문자열 사전순 정렬 함수
//                }

                return o1.age - o2.age;
            }
        });
    }


    public void print() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < members.length; i++){
            bw.write(members[i].age + " " + members[i].name + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class Member{
    int age;
    String name;

    public Member(int age, String name){
        this.age = age;
        this.name = name;
    }
}