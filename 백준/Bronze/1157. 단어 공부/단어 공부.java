import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Backjoon1157();
        algorithm.solution();
    }
}

interface Algorithm {
    public void solution();

}
class Backjoon1157 implements Algorithm{
    String s;
    int[] text = new int[26];


    public void solution(){
        input();
        int maxIndex = calc();
        print(maxIndex);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);

        this.s = sc.nextLine();

        sc.close();
    }

    public int calc(){
        textCount();                //(1) 아스키코드를 사용하여 대문자 26개에 해당하는 배열에 나온 횟수 저장
        return textMax();           //(2.1) 가장 많이 사용된 알파벳의 횟수 계산 / (2.2) 가장 많이 사용된 알파벳 검색
    }
    public void textCount(){
        s = s.toUpperCase();

        int temp;
        for(int i = 0; i < s.length(); i++){
            temp = (int)s.charAt(i) - 65;
            text[temp]++;
        }

    }
    public int textMax(){
        int max = 0;
        int index = 0;

        for(int i : text){
            max = Math.max(max, i);
        }

        int temp = 0;
        for(int i = 0; i < text.length; i++){
            if(text[i] == max){
                if(++temp == 2){        //가장 많이 사용된 알파벳 두 개 이상 검색됨
                    index = 26;
                    break;
                }
                index = i;
            }
        }

        return index;
    }

    public void print(int maxIndex){
        if(maxIndex == 26){
            System.out.println("?");
        }
        else{
            System.out.println((char)(maxIndex+65));
        }
    }
}