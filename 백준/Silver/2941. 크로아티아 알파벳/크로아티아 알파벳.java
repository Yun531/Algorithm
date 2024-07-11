import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Backjoon2941();
        algorithm.solution();
    }
}

interface Algorithm {
    public void solution();

}
class Backjoon2941 implements Algorithm{
    String test;

    public void solution(){
        input();
        int count = calc();
        print(count);
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        test = sc.nextLine();

        sc.close();
    }

    public int calc(){
        int count = test.length();
        int findIndex;

        findIndex = test.indexOf("-");
        while(findIndex >= 0){
            count--;
            findIndex = test.indexOf("-", findIndex + 1);       //검색결과 없으면 -1 리턴
        }

        findIndex = test.indexOf("=");
        while(findIndex >= 0){
            count--;
            if(findIndex > 1){
                if(test.charAt(findIndex-2) == 'd' && test.charAt(findIndex-1) == 'z')
                    count--;
            }
            findIndex = test.indexOf("=", findIndex + 1);
        }

        for(int i = 1; i < test.length(); i++){
            if(test.charAt(i) == 'j'){
                if((test.charAt(i-1) == 'l') || (test.charAt(i-1) == 'n'))
                    count--;
            }
        }

        return count;
    }

    public void print(int count){
        System.out.println(count);
    }
}