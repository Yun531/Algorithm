import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon1620();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon1620 implements Algorithm {
    HashMap<String, String> dictName = new HashMap<>();
    HashMap<String, String> dictNumber = new HashMap<>();
    String[] questions;

    public void solution() throws IOException{
        input();
        calc();
        print();
    }


    public void input() throws IOException{
        int tempN;
        String tempS;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        tempN = Integer.parseInt(st.nextToken());                                   //사전의 입력을 두개의 해쉬맵에 저장
        for(int i = 1; i <= tempN; i++){
            tempS = br.readLine();
            dictName.put(tempS, Integer.toString(i));
            dictNumber.put(Integer.toString(i), tempS);
        }

        questions = new String[Integer.parseInt(st.nextToken())];                   //문제의 입력을 String 배열에 저장
        for(int i = 0; i < questions.length; i++){
            questions[i] = br.readLine();
        }

        br.close();
    }


    public void calc(){
        for(int i = 0; i < questions.length; i++){
            convert(i);
        }
    }


    public void print() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < questions.length; i++){
            bw.write(questions[i] + "\n");
        }

        bw.flush();
        bw.close();
    }



    public void convert(int index){
        String temp = questions[index];

        if(temp.charAt(0) - 'A' >= 0 && temp.charAt(0) - 'A' <=25 ){                //포켓몬 이름이 대문자로 시작하는 조건을 사용
            questions[index] = dictName.get(temp);
        }
        else{
            questions[index] = dictNumber.get(temp);
        }

    }
}