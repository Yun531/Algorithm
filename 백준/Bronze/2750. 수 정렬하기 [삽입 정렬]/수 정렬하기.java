import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon2750();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon2750 implements Algorithm{
    int[] numbers;

    public void solution() throws IOException{
        input();
        calc();
        print();
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        numbers = new int[Integer.parseInt(br.readLine())];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }

        br.close();
    }


    public void calc(){
        insertionSort();
    }
//    public void insertionSort(){
//        int temp;
//        for(int i = 1; i < numbers.length; i++){
//            temp = numbers[i];
//            for(int k = i-1; k > -1; k--){
//                if(temp > numbers[k]){
//                    numbers[k+1] = temp;                      //temp 값이 가장 작은 숫자인 경우, 해당 숫자를 저장하는 코드가 작동되지 않음
//                    break;
//                }
//                numbers[k+1] = numbers[k];
//            }
//        }
//    }
    public void insertionSort() {
        int temp;
        for (int i = 1; i < numbers.length; i++) {
            temp = numbers[i];
            int k;
            for (k = i - 1; k >= 0 && numbers[k] > temp; k--) {
                numbers[k + 1] = numbers[k];
            }
            numbers[k + 1] = temp;                              // 올바른 위치에 temp를 삽입
        }
    }


    public void print(){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
