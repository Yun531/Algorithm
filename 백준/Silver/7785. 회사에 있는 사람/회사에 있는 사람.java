import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon7785();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon7785 implements Algorithm {
    ArrayList<String> workers;                  //어레이리스트 사용 시, 시간초과가 가능하다 >> 해쉬 셋 사용
    HashSet<String> workersSet = new HashSet<>();

    public void solution() throws IOException{
        input();
//        calc();
        print();
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            calc(st);
        }

        workers = new ArrayList<>(workersSet);                     //해쉬 셋 > 어레이리스트 변환
        workers.sort(Collections.reverseOrder());                  //Collections.reverseOrder()을 추가하면 내림차순 정렬

        br.close();
    }


    public void calc(StringTokenizer st){
        String worker = st.nextToken();
        String temp = st.nextToken();

        if(temp.equals("enter")){                           //문자열 비교할때는 str.equals() 함수를 사용해야 함
            workersSet.add(worker);
        }
        else if(temp.equals("leave")){
            workersSet.remove(worker);                         //어레이리스트 사용 시, '제거' 작업 할 때 O(n)이 소요되므로 시간초가 가능
        }
    }



    public void print() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(String str : workers){
            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
    }
}