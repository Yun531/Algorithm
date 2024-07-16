import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Baekjoon1193();
        algorithm.solution();
    }
}

interface Algorithm {
    public void solution();

}
class Baekjoon1193 implements Algorithm {
    public void solution(){
        String str = input();
//        calc();
        print(str);
    }

    public String input(){
        Scanner sc = new Scanner(System.in);

        String result = calc(sc.nextInt());

        sc.close();

        return result;
    }

    public String calc(int targetN) {
        int count = 0;
        int temp = 0;

        while (targetN > 0) {
            count++;                //몇번째 대각선인지 알려주는 값
            temp = targetN;         //대각선에서 몇번째 순서인지 알려주는 값
            targetN -= count;
        }

        if(count%2 == 0) {
            return Integer.toString(temp) + "/" + Integer.toString(count - (temp - 1));
        }
        else{
            return Integer.toString(count - (temp - 1)) + "/" + Integer.toString(temp);
        }

    }

    public void print(String str){
        System.out.println(str);
    }
}