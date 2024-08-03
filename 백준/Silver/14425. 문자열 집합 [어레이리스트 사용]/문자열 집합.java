import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon14425();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon14425 implements Algorithm {
    int holdN, questionN;
    ArrayList<String> hold = new ArrayList<>();                       //어레이 리스트 사용하여 검색을 진행할 것임

    BufferedReader br;

    public void solution() throws IOException{
        input();
        int count = calc();
        print(count);
    }


    public void input() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        holdN = Integer.parseInt(st.nextToken());
        questionN = Integer.parseInt(st.nextToken());

        for(int i = 0; i < holdN; i++){                                 //검색용(사전?) 문자열 저장
            hold.add( br.readLine());
        }
    }


    public int calc() throws IOException{
        int count = 0;

        for(int i = 0; i < questionN; i++){
            if(hold.contains(br.readLine())){                           //검색용(사전?)에서 검색되는 경우
                count++;
            }
        }

        br.close();

        return count;
    }


    public void print(int count) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(count + "\n");

        bw.flush();
        bw.close();
    }
}
