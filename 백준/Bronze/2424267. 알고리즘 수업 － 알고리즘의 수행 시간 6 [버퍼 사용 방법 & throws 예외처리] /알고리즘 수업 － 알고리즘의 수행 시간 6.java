import java.io.*;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon24267();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon24267 implements Algorithm {
    public void solution() throws IOException {                                         //버퍼 리더로 인한 예외처리 > 해당 함수 + main 함수에서 'throws IOException' 해줌
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

//        int count = 0;
//
//        for (int i = 1; i <= n - 2; i++) {                //가장 단순한 방법 : #코드1이 실행되는 횟수를 단순 카운트 함
//            for (int j = i + 1; j <= n - 1; j++) {
//                for (int k = j + 1; k <= n; k++) {
//                    count++;
//                }
//            }
//        }

        br.close();

        bw.write((n*(n-1)*(n-2)/6)+"\n" + 3);           //쓰기 + 출력
        bw.flush();                                         //후처리 > 버퍼에 남아있는 모든 내용물 출력
        bw.close();
    }

}
