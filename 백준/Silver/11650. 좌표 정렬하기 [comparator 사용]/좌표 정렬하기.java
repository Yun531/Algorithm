import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon11650();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon11650 implements Algorithm {
    int[][] data;

    public void solution() throws IOException{
        input();
        calc();
        print();
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        data = new int[n][2];
        for(int i = 0; i < n; i++){                             //모든 좌표를 입력받아, 2차원 배열에 저장
            st = new StringTokenizer(br.readLine());
            data[i][0] = Integer.parseInt(st.nextToken());
            data[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }


    public void calc(){
        Arrays.sort(data, new Comparator<int[]>() {
            public int compare(int[] data1, int[] data2){       //오름차순 정렬 : `return data1 - data2;
                if(data1[0] == data2[0]){                       //내림차순 정렬 : `return data2 - data1;
                    return data1[1] - data2[1];
                }
                else{
                    return data1[0] - data2[0];
                }
            }
        });
    }


    public void print()throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < data.length; i++){
            bw.write(data[i][0] + " " + data[i][1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
