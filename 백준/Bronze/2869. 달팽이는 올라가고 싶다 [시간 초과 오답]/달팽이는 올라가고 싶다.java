import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Baekjoon2869();
        algorithm.solution();
    }
}

interface Algorithm {
    public void solution();

}
class Baekjoon2869 implements Algorithm{
    int height;
    int up;
    int down;

    public void solution(){
        input();
        int day = calc();
        print(day);
    }

    public void input(){
        Scanner sc = new Scanner(System.in);

        up = sc.nextInt();
        down = sc.nextInt();
        height = sc.nextInt();

        sc.close();
    }

//    public int calc(){
//        int date = 1;
//        height -= speedP;                   첫날 낮에 정상을 달성할 가능성 때문에 따로 처리
//
//        while(height > 0){                  해당 방법은 시간제한 때문에 문제가 실패하게 된다.
//            date++;
//            height -= (speedP - speedM);
//        }
//
//        return date;
//    }
    public int calc(){
        int day = (height - down) / (up - down);


        if ((height - down) % (up - down) != 0) {       // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
            day++;
        }
        
        return day;
    }

    public void print(int date){
        System.out.println(date);
    }
}
