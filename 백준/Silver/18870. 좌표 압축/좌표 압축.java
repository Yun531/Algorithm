import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon18870();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon18870 implements Algorithm {
    int[] data;

    public void solution() throws IOException{
        input();
        calc();
        print();
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        data = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < data.length; i++){
            data[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }


    public void calc() throws IOException{
        HashMap<Integer, Integer> temp = sortArray();                                   //중복값 제거한 정렬된 배열
        calcArray(temp);

    }
    public HashMap<Integer, Integer> sortArray() {
        int[] temp = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        Arrays.sort(temp);

        int point = 1;                                               //임시 배열 저장 위치 포인터(유효하지 않은(비어있는) 위치를 가르킴)
        for (int i = 1; i < temp.length; i++) {                      //중복 값 제거한 정렬된 배열 생성
            if (temp[point - 1] != temp[i]) {
                temp[point] = temp[i];
                point++;
            }
        }

        HashMap<Integer, Integer> hashData = new HashMap<>();        //중복 값 제거한 정렬된 해쉬맵
        for (int i = 0; i < point; i++) {
            hashData.put(temp[i], i);
        }

        return hashData;
    }
    public void calcArray(HashMap<Integer, Integer> temp){          //해쉬맵을 이용하여, 압축된 좌표를 꺼내 옴
        for(int i = 0; i < data.length; i++){
            data[i] = temp.get((Integer)data[i]);
        }
    }


    public void print() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(data[0]));
        for(int i = 1; i < data.length; i++){
            bw.write(" " + data[i]);
        }
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}