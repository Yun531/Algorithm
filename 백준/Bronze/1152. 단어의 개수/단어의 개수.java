import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Beakjoon1152();
        algorithm.solution();
    }
}

interface Algorithm {
    public void solution();

}
class Beakjoon1152 implements Algorithm{
    public void solution(){
        String in = input();
        int count = calc(in);
        print(count);
    }

    // 대소문자 공백 문자열 입력 > 몇 개의 단어
    // 한 줄 입력
    public String input(){
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        sc.close();

        return temp;
    }

    public int calc(String s){
        int temp = 0;
        StringTokenizer st = new StringTokenizer(s);

        while(st.hasMoreTokens()){
            st.nextToken();             //해당 상황에서 토근을 꺼내와서 할 작업은 없지만,
            temp++;                     //토근을 꺼내줌으로서 제거를 해줘야 정상작동함
        }

        return temp;
    }

    public void print(int count){
        System.out.println(count);
    }
}
