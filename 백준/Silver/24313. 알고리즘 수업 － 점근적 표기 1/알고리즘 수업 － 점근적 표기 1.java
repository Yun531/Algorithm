import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon24313();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon24313 implements Algorithm {
    int a1, a0, c, n0;

    public void solution() throws IOException{
        input();
        int isSatified = calc();
        print(isSatified);
    }

    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a1 = Integer.parseInt(st.nextToken());
        a0 = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(br.readLine());
        n0 = Integer.parseInt(br.readLine());

        br.close();
    }

    public int calc(){
        int result = 0;

        if((a1*n0 + a0 <= c*n0) && (a1 <= c)){
            result = 1;
        }

        return result;
    }

    public void print(int isSatisfied){
        System.out.println(isSatisfied);
    }
}
