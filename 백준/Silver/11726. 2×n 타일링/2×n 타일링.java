import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon11726();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon11726 implements Algorithm {
    int calN, rowN ;
    long result=0;

    public void solution() throws IOException {
        input();
        calc();
        print();
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        calN = Integer.parseInt(br.readLine());
        rowN = calN/2;
    }

    public void calc(){
        if (calN == 1) {
            result = 1;
            return;
        }
        if (calN == 2) {
            result = 2;
            return;
        }

        int a = 1; // F(1)
        int b = 2; // F(2)
        for (int i = 3; i <= calN; i++) {
            int c = (a + b) % 10007; // F(i) = F(i-1) + F(i-2)
            a = b;
            b = c;
        }
        result = b;
    }
//    public void calc(){
//        if(calN == 1){
//            result = 1;
//            return;
//        }
//
//        for(int i = 0; i <= rowN; i++){
//            result += calculateNCP(calN-i, i);
//        }
//
//        result = result % 10007;
//    }
//
//    public static long calculateNCP(int n, int p) {
//        if (n < 2) {
//            return 0;
//        }
//        return factorial(n) / (factorial(n-p) * factorial(p));
//    }
//
//    public static long factorial(int n) {
//        if (n < 0) throw new IllegalArgumentException("음수입력.");
//
//        long temp = 1;
//        for (int i = 2; i <= n; i++) {
//            temp *= i;
//        }
//        return temp;
//    }


    public void print() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
