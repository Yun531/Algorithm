import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Baekjoon2581();
        algorithm.solution();
    }
}

interface Algorithm {
    public void solution();

}
class Baekjoon2581 implements Algorithm{
    int high, low;

    public void solution(){
        boolean[] prime = input();
        int[] result = calc(prime);
        print(result);
    }

    public boolean[] input(){
        Scanner sc = new Scanner(System.in);

        low = sc.nextInt();
        high = sc.nextInt();
        boolean[] prime = new boolean[high+1];

        sc.close();

        return prime;
    }

    public int[] calc(boolean[] prime){
        int[] result = new int[2];

        calcPrime(prime);                                           //범위 내 소수 계산
        result[0] = minPrime(prime);
        result[1] = totalPrime(prime);

        return result;
    }
    public void calcPrime(boolean[] prime){                         //에라토스테네스 체 알고리즘
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {         //검사 범위 조절
            for(int k = i * i; k < prime.length; k += i) {          //소수가 아닌 경우 true 저장
                prime[k] = true;
            }
        }
    }
    public int minPrime(boolean[] prime){
        int min = -1;

        for(int i = low; i <= high; i++){
            if(!prime[i]) {
                min = i;
                break;
            }
        }

        return min;
    }
    public int totalPrime(boolean[] prime){
        int total = 0;

        for(int i = low; i <= high; i++){
            if(!prime[i]) {
                total += i;
            }
        }

        return total;
    }

    public void print(int[] result){
        if(result[0] == -1){
            System.out.println(result[0]);
        }
        else{
            System.out.println((result[1]));
            System.out.println(result[0]);
        }

    }
}
