import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Beakjoon1546();
        algorithm.solution();
    }
}

interface Algorithm {
    public void solution();

}

class Beakjoon1546 implements Algorithm {
    int count;
    double[] score;


    public void solution(){
        input();
        double AVG = calc();
        print(AVG);
    }


    public void input(){
        // 첫 줄에 과목 개수 N
        // 둘째 줄에 각 점수
        Scanner sc = new Scanner(System.in);

        count = sc.nextInt();

        score = new double[count];
        for(int i = 0; i < count; i++){
            score[i] = sc.nextInt();
        }

        sc.close();
    }

    public double calc(){
        double max = calcMax();    //f: 최댓값 계산
        manipulateScore(max);      //f: 조작 점수 계산
        return calcAVG();          //f: 평균 계산

    }

    public void print(double AVG){
        System.out.println(AVG);
    }


    public double calcMax(){
        double temp = score[0];
        for(int i = 1; i < count; i++){
            temp = temp >= score[i] ? temp : score[i];
        }

        return temp;
    }
    public void manipulateScore(double max){
        for(int i = 0; i < count; i++){
            score[i] = (score[i]/max)*100;
        }

    }
    public double calcAVG(){
        double temp = 0;
        for(double i : score){
            temp += i;
        }

        return temp/count;
    }
}
