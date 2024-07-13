import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Beakjoon2525.solution();
    }
}

class Beakjoon2525 {
    static int currentTime_h, currentTime_m, cookTime;
    public static void solution(){
        input();        //현재 시각, 요리 시간 입력
        calc();         //완료 시간 계산
        print();        //결과 출력
    }

    public static void input(){
        Scanner sc = new Scanner(System.in);

        currentTime_h = sc.nextInt();
        currentTime_m = sc.nextInt();
        cookTime = sc.nextInt();

        sc.close();
    }

    public static void calc(){
        int temp = currentTime_m + cookTime;
        if(temp >= 60){
            currentTime_h += temp / 60;
            currentTime_m = temp % 60;
            if(currentTime_h >= 24) currentTime_h -= 24;
        }
        else{
            currentTime_m = temp;
        }
    }

    public static void print(){
        System.out.println(currentTime_h + " " + currentTime_m);
    }
}
