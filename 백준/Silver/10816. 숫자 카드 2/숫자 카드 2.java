import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon10816();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon10816 implements Algorithm {
    HashMap<Integer, Integer> holds = new HashMap<>();
    int[] questions;

    public void solution() throws IOException{
        input();
        calc();
        print();
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tempCount = Integer.parseInt(br.readLine());
        int tempN;

        StringTokenizer st = new StringTokenizer(br.readLine());                       //소지하고 있는 카드 N 장을 해쉬맵에 저장
        for(int i = 0; i < tempCount; i++){
            tempN = Integer.parseInt(st.nextToken());
            holds.put(tempN, holds.getOrDefault(tempN, 0) + 1);             //해쉬맵에 존재하면 value +1, 아니면 1으로 저장
        }

        questions = new int[Integer.parseInt(br.readLine())];                          //질문을 위한 입력 저장
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < questions.length; i++){
            questions[i] = Integer.parseInt(st.nextToken());
        }
    }


    public void calc(){
        for(int i = 0; i < questions.length; i++){
            questions[i] = holds.getOrDefault(questions[i], 0);             //해당 질문 카드를 몇장 소지하고 있는지 변환
        }
    }


    public void print() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < questions.length; i++){
            bw.write(questions[i] + " ");
        }

        bw.write("\n");
        bw.flush();
        bw.close();
    }
}