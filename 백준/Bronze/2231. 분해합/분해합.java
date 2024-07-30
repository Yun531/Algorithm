import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon2231();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon2231 implements Algorithm{
    public void solution() throws IOException{
        int targetN = input();
        int calcN = calc(targetN);
        print(calcN);
    }

    public int input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp = Integer.parseInt(br.readLine());

        br.close();

        return temp;
    }

    public int calc(int targetN){
        int result = 0, calcN, temp;

        for(int i = 1; i < targetN; i++) {                  //1부터 접근하여 가장 작은 생성자가 나올때 까지 계산을 진행
            temp = calcN = i;

            while (temp != 0) {
                calcN += temp % 10;
                temp = temp / 10;
            }
            if(calcN == targetN){
                result = i;
                break;
            }
        }

        return result;
    }

//    for(int i = (N - (N_length * 9)); i < N; i++) {
//        N - (9 × K의 길이) 부터 탐색하여 N 까지만 탐색하면 된다.
//
//        N(4) = K + k1 + k2 + k3 + k4
//        그리고 이항을 하면 다음과 같다.
//        N(4) - (k1 + k2 + k3 + k4) = K
//
//        즉, 네자릿수 N 의 각 자릿수의 합이 최대일 때는 언제인가?
//        9 + 9 + 9 + 9 일 것이다.
//
//        즉, 우리는 입력받은 정수 N 에 대하여 자릿수의 길이만큼 9를 빼주면 된다.
//                그 미만의 수는 생성자가 될 수 없다는 것은 자명하다는 것이다.
//
//    }


    public void print(int calcN){
        System.out.println(calcN);
    }
}