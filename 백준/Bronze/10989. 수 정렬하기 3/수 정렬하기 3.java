import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon10989();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon10989 implements Algorithm{
    int[] data;

    public void solution() throws IOException{
        input();
        calc();
        print();
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        data = new int[Integer.parseInt(br.readLine())];

        for(int i = 0; i < data.length; i++){
            data[i] = Integer.parseInt(br.readLine());
        }
    }


    public void calc(){
        Arrays.sort(data);
        //mergeSort();
    }
    public void mergeSort(){
        int[] temp = new int[data.length];
        divide(temp, 0, data.length-1);             //배열 인덱스로 범위 설정
    }
    public void divide(int[] temp, int low, int high){
        if (low >= high) {
            return;
        }

        int mid = low + (high-low)/2;

        divide(temp, low, mid);
        divide(temp, mid+1, high);
        merge(temp, low, mid ,high);
    }
    public void merge(int[] temp, int low, int mid, int high){
        int pointLeft = low;
        int pointRight = mid+1;
        int point = low;

        for(int i = low; i < high+1; i++){                  //배열의 값을 임시배열로 복사
            temp[i] = data[i];
        }

        while(pointLeft <= mid && pointRight <= high){
            if(temp[pointLeft] < temp[pointRight]){
                data[point] = temp[pointLeft];
                pointLeft++;
            }
            else{
                data[point] = temp[pointRight];
                pointRight++;
            }
            point++;
        }

        if(pointLeft <= mid){
            for(int i = 0; i < mid-pointLeft+1; i++){
                data[point+i] = temp[pointLeft+i];
            }
        }
        else{
            for(int i = 0; i < high-pointRight+1; i++){
                data[point+i] = temp[pointRight+i];
            }
        }
    }
    public void swapArrayElement(int a, int b){
        int temp = data[b];
        data[b] = data[a];
        data[a] = temp;
    }


    public void print() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int datum : data) {
            bw.write(datum + "\n");
        }

        bw.flush();
        bw.close();
    }
}