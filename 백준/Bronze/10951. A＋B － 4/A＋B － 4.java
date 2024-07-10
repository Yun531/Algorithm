import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Backjoon10951.solution();
    }
}
class Backjoon10951 {
    static int count = 0;
    static String[] test = new String[100];

    public static void solution() throws IOException{
        input();        //테스트 케이스 '전체' 입력
        calc();         //테스트 케이스 계산
        print();        //테스트 케이스 출력
    }


    public static void input() throws IOException{                              //예외처리용 "throws IOException" 필요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp;

        while((temp = br.readLine()) != null){                          //Scanner.hasNExtLine() -> 입력이 있을 때까지 기다렸다가 true를 반환
            test[count] = temp;
            count++;
        }

        br.close();
    }

    public static void calc(){
        int tempA, tempB;

        for(int i = 0; i < count; i++){
            StringTokenizer str = new StringTokenizer(test[i]);
            tempA = Integer.parseInt(str.nextToken());
            tempB = Integer.parseInt(str.nextToken());

            test[i] = Integer.toString(tempA + tempB);
        }
    }

    public static void print(){
        for(int i = 0; i < count; i++) {
            System.out.println(test[i]);
        }
    }
}