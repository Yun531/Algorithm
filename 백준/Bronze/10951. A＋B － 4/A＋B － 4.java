import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Beakjoon10951.solution();
    }
}
class Beakjoon10951 {
    static int count = 0;
    static String[] test = new String[100];

    public static void solution() throws IOException{
        input();        //테스트 케이스 '전체' 입력
        calc();         //테스트 케이스 계산
        print();        //테스트 케이스 출력
    }

    public static void input(){                                         //Scanner.hasNext() 가 BufferedReader.readLine() 보다 성능이 좋지 않았음
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            test[count++] = sc.nextLine();
        }
        sc.close();
    }

    /*public static void input() throws IOException{                              //예외처리용 "throws IOException" 필요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp;

        while((temp = br.readLine()) != null){                          //Scanner.hasNExtLine() & BufferedReader.readLind() -> 입력이 있을 때까지 기다렸다가 true를 반환
            test[count] = temp;                                         // >> ctrl + z 등으로 입력 중단(EOF) 명령을 입력해 줘야 함 >> IDE 환경에서 실행했을 때, 정상적인 결과를 얻기 힘듦
            count++;
        }

        br.close();
    }*/

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
