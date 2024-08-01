import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon1181();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon1181 implements Algorithm {
    String[] data;

    public void solution() throws IOException{
        input();
        calc();
        print();
    }


    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        data = new String[Integer.parseInt(br.readLine())];
        for(int i = 0; i < data.length; i++){
            data[i] = br.readLine();
        }
    }


    public void calc() {
        Arrays.sort(data, new Comparator<String>() {
            public int compare(String A, String B) {
                char a, b;

                if (A.length() == B.length()) {                       //문자열 길이 같은 경우 > 사전순 오름차순
                    for (int i = 0; i < A.length(); i++) {
                        a = A.charAt(i);
                        b = B.charAt(i);
                        if (a != b) {
                            return a - b;
                        }
                    }
                }

                return A.length() - B.length();                     //문자열의 길이가 같지 않은 경우 > 문자열 길이 오름차순
            }
        });
    }


    public void print() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(data[0] + "\n");
        for(int i = 1; i < data.length; i++){
            if(!data[i].equals(data[i-1])){                         //중복 단어 필터링
                bw.write(data[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}