import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon2839();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon2839 implements Algorithm {
    int totalWeight;

    public void solution() throws IOException{
        input();
        int result = calc();
        print(result);
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        totalWeight = Integer.parseInt(br.readLine());

        br.close();
    }


    public int calc(){
        int count3 = 0;
        int result = -1;
        boolean isSolution = true;

        while ((totalWeight - count3*3) % 5 != 0){
            count3++;

            if((totalWeight - count3*3) < 0){                       //입력된 N 이 3과 5로 나누어 떨어지지 않는 경우
                isSolution = false;
                break;
            }
        }

        if(isSolution){
            result = ((totalWeight - count3*3) / 5) + count3;
        }

        return result;
    }


    public void print(int result){
        System.out.println(result);
    }
}