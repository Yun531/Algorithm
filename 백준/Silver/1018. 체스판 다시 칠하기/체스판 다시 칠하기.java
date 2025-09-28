import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{ 
        Algorithm algorithm = new Baekjoon1018();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon1018 implements Algorithm {
    int width, length;
    boolean[][] board;

    public void solution() throws IOException{
        input();
        int result = calc();
        print(result);
    }


    public void input() throws IOException{
        String temp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        length = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());

        board = new boolean[length][width];             //W > true, B > false 로 간주
        for(int l = 0; l < length; l++){                //타일 배열 내부 계산
            temp = br.readLine();

            for(int w = 0; w < width; w++){
                if(temp.charAt(w) == 'W'){
                    board[l][w] = true;
                }
            }
        }
    }


    public int calc(){
        int result = calcBoardMin();     //왼쪽 위가 W or B 로 시작되는 체스판의 최소값

        return result;
    }
    public int calcBoardMin(){
        int result = 64;

        for(int l = 0; l < length-7; l++){                     //각각의 타일 배열 내부 계산
            for(int w = 0; w < width-7; w++){
                result = Math.min(result, calcBoard(l, w));
            }
        }
        return result;
    }
    public int calcBoard(int L, int W) {
        int countW = 0, countB = 0, result = 0;
        boolean tempW = false;
        boolean tempB = true;

        for(int l = L; l < L+8; l++){                     //타일 배열 내부 계산
            tempW = !tempW;                               //오른쪽 끝에서 '열'을 변경할 때, 동일한 색상이 나와야 함
            tempB = !tempB;

            for(int w = W; w < W+8; w++){
                if(board[l][w] != tempW){
                    countW++;
                }
                if(board[l][w] != tempB){
                    countB++;
                }
                tempW = !tempW;
                tempB = !tempB;
            }
        }

        result = Math.min(countW, countB);

        return result;
    }


    public void print(int result){
        System.out.println(result);
    }

}
