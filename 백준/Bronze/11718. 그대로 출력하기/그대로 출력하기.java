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

    public void solution(){
        print();
    }
    

    public void print(){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String str = sc.nextLine();

            System.out.println(str);
        }
        sc.close();

    }
}
