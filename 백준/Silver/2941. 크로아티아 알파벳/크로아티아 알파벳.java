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
class Backjoon2941 implements Algorithm {
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
            findIndex = test.indexOf("-", findIndex + 1);       //문자열 검색, 검색결과 없으면 -1 리턴
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


//        인터넷의 간략한 풀이코드
//
//        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
//        String str = sc.next();
//
//        for (int i = 0; i < croatias.length; i++) {
//            if (str.contains(croatias[i]))                //문자열 검색(문자열 배열 검색 가능), T/F 리턴
//                str = str.replace(croatias[i], "@");      //문자열 일부를 문자열로 교체
//        }
//        System.out.println(str.length());
//        sc.close();

    }

    public void print(int count){
        System.out.println(count);
    }
}
