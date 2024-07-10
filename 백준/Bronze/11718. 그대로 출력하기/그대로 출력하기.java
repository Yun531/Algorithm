import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Backjoon11718();
        algorithm.solution();
    }
}

interface Algorithm {
    public void solution();

}
class Backjoon11718 implements Algorithm {
    String[] test = new String[100];
    public void solution(){
        input();
        print();
    }


    public void input(){
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while(sc.hasNextLine()) {
            test[count++] = sc.nextLine();
        }
        sc.close();
    }

//    public void print(){
//        for(String s : test){                 해당 방법은 입력이 몇 줄이 입력되던 상관없이, 100줄 모두를 출력함으로 잘못된 풀이
//            System.out.println(s);
//        }
//    }
    public void print(){
        for(int i = 0; i < test.length; i++){
            if(test[i] == null) break;
            System.out.println(test[i]);
        }
    }
}