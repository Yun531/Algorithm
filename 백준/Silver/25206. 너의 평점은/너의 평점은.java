import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Baekjoon25206();
        algorithm.solution();
    }
}

interface Algorithm {
    public void solution();

}
class Baekjoon25206 implements Algorithm {
    double countTime = 0;
    double countScore = 0;

    public void solution(){
        input();
    //    calc();
        print();
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 20; i++){
            calc(sc.nextLine());
        }

        sc.close();
    }

    public void calc(String inputStr){                      //입력받은 과목 하나에 대한 계산
        StringTokenizer str = new StringTokenizer(inputStr);

        str.nextToken();                                        //과목명 스킵
        double temp = Double.parseDouble(str.nextToken());      //과목 학점 저장
        String score = str.nextToken();                         //과목 평점 계산
        double scoreDouble = calcScore(score);

        if(scoreDouble >= 0){
            countTime += temp;
            countScore += scoreDouble * temp;
        }
    }
    public double calcScore(String score){
        switch(score){
            case "A+" :
                return 4.5;
            case "A0" :
                return 4.0;
            case "B+" :
                return 3.5;
            case "B0" :
                return 3.0;
            case "C+" :
                return 2.5;
            case "C0" :
                return 2.0;
            case "D+" :
                return 1.5;
            case "D0" :
                return 1.0;
            case "F" :
                return 0.0;
            case "P" :
                return -1;
        }
        return -2;
    }

    public void print(){
        System.out.println(countScore/countTime);
    }
}
