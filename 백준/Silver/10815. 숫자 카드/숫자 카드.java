import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon10815();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon10815 implements Algorithm {
    HashMap<Integer, String> holds = new HashMap<>();


    public void solution() throws IOException{
        input();
//        calc();
//        print();
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());           //(상근이)가 가지고 있는 카드 세팅
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < count; i++){
            holds.put(Integer.parseInt(st.nextToken()), "1");
        }

        count = Integer.parseInt(br.readLine());               //(상근이)가 가지고 있는 카드와 비교할 카드 세팅
        st = new StringTokenizer(br.readLine());

        String temp = holds.getOrDefault(Integer.parseInt(st.nextToken()), "0");
        bw.write(temp);

        for(int i = 1; i < count; i++){
            temp = holds.getOrDefault(Integer.parseInt(st.nextToken()), "0");
            bw.write(" " + temp);
        }

        bw.write("\n");

        bw.flush();
        br.close();
        bw.close();
    }



    public void calc(){
    }


    public void print() throws IOException{
    }
}