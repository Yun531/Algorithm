import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Beakjoon1008.solution();
    }
}

class Beakjoon1008 {
    static double A, B;
    public static void solution(){
        input();
        calc();
        print();
    }

    public static void input(){
        Scanner sc = new Scanner(System.in);

        A = sc.nextDouble();
        B = sc.nextDouble();

        sc.close();
    }

    public static void calc(){
        A = A/B;
    }

    public static void print(){
        System.out.println(A);
    }
}
