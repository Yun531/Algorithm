import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Baekjoon1316();
        algorithm.solution();
    }
}

interface Algorithm {
    public void solution();

}
class Baekjoon1316 implements Algorithm {
    public void solution(){
        String[] inputS = input();
        int count = calc(inputS);
        print(count);
    }

    public String[] input(){
        Scanner sc = new Scanner(System.in);

        int inputCount = sc.nextInt();
        sc.nextLine();                              //Scanner.nextInt 다음 Scanner.nextLine 사용할 때 /n 버퍼 조심

        String[] inputS = new String[inputCount];

        for(int i = 0; i < inputCount; i++){
            inputS[i] = sc.nextLine();
        }

        sc.close();
        return inputS;
    }

    public int calc(String[] inputS){
        int count = 0;

        for(int i = 0; i < inputS.length; i++){
            count += calcCont(inputS[i]);           //해당 함수는 그룹 단어인 경우 1, 아닌 경우 0을 리턴한다.
        }

        return count;
    }
    public int calcCont(String s){
        int[] character = new int[26];                  // 불리안 배열 사용하는게 깔끔할듯
        int temp = -1;

        for(int i = 0; i < s.length(); i++){
            temp = s.charAt(i) - 97;
            if(character[temp] != 0){               //그룹 단어가 아닌 경우 0 리턴
                return 0;
            }
            character[temp]++;
            while((i != s.length()-1) && (temp == s.charAt(i+1)-97)){      //문자열 마지막 위치에서 추가 검사 안하도록 조건 달아줘야 함
                i++;                                                            //연속된 동일한 문자 처리
            }
        }

        return 1;                                   //그룹 단어인 경우 1 리턴
    }

    public void print(int count){
        System.out.println(count);
    }
}
