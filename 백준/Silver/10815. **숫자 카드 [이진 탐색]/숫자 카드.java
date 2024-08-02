import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon10815();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon10815 implements Algorithm {
    HashMap<Integer, String> holds = new HashMap<>();
    int count;
    StringTokenizer st;


    public void solution() throws IOException{
        input();
//        calc();
        print();
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        this.count = Integer.parseInt(br.readLine());              //(상근이)가 가지고 있는 카드 세팅
        this.st = new StringTokenizer(br.readLine());
        for(int i = 0; i < this.count; i++){
            holds.put(Integer.parseInt(this.st.nextToken()), "1");
        }

        this.count = Integer.parseInt(br.readLine());               //(상근이)가 가지고 있는 카드와 비교할 카드 입력
        this.st = new StringTokenizer(br.readLine());

        br.close();
    }



    public void calc() throws IOException{                                         //이진 탐색 코드
        int[] holds;
        int result;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Arrays.sort(holds);                                                         //이진 탐색을 하기 위해서는 목표 배열에 정렬되어 있어야 함

        for(int i = 0; i < this.count; i++){
            result = binarySearch(Integer.parseInt(this.st.nextToken()));
            bw.write(result + " ");
        }

        bw.flush();
        bw.close();
    }
    public int binarySearch(int target){
        int pointLeft = 0;
        int pointRight = holds.length-1;

        while(pointLeft <= pointRight){
            int pointMid = pointLeft + (pointRight-pointLeft)/2;
            int mid = holds[pointMid];

            if(target > mid){
                pointLeft = mid+1;
            }
            else if(target < mid){
                pointRight = mid-1;
            }
            else{
                return 1;                               //target과 동일한 값을 정렬된 배열에서 찾은 경우
            }
        }

        return 0;                                       //target과 동일한 값을 정렬된 배열에서 찾지 못한 경우

    }


    public void print() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp = holds.getOrDefault(Integer.parseInt(this.st.nextToken()), "0");       //HashMap에 key 값이 있으면 '1' 출력, 아니면 '0' 출력
        bw.write(temp);

        for(int i = 1; i < this.count; i++){
            temp = holds.getOrDefault(Integer.parseInt(this.st.nextToken()), "0");
            bw.write(" " + temp);
        }

        bw.write("\n");

        bw.flush();
        bw.close();
    }
}
