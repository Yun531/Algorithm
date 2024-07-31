import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Algorithm algorithm = new Baekjoon2751();
        algorithm.solution();
    }
}

interface Algorithm{
    public void solution() throws IOException;
}
class Baekjoon2751 implements Algorithm {
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
        //quickSort(0, numbers.length-1);
        //heapSort(numbers.length-1);
        mergeSort();
    }

    public void quickSort(int low, int high){               //중앙 pivot의 위치를 기준으로, 동일한 크기의 배열 두 개로 나뉘는거 아님(크기 다를 수 있음)
        if(low >= high){                                    //분할된 후, 원소의 개수가 1개 이하인 경우 단순 리턴
            return;
        }

        int pivot = numbers[low + (high-low)/2];            //피벗 값을 임시 저장하여 사용해야 함, 혹시 모를 오버플로 방지
        int left = low;                                     //left, right 값이 변경되고 swap 되면서 pivot 위치의 값이 변경될 수 있음
        int right = high;

        while(left <= right){                               //검사 중인 left, right의 인덱스 값 비교
            while(numbers[left] < pivot){                   //정렬을 위한 내부 값 비교
                left++;
            }
            while(pivot < numbers[right]){                  //정렬을 위한 내부 값 비교
                right--;
            }
            if(left <= right){                              //검사중인 left, right의 인덱스 값 비교
                swapArrayElement(left, right);
                left++;
                right--;
            }
        }

        if(low < right){                                    //남은 크기가 2 이상인 경우
            quickSort(low, right);
        }
        if (left < high) {                                  //남은 크기가 2 이상인 경우
            quickSort(left, high);
        }

    }
    //기본 아이디어 >
    // 1) 입력받은 배열을 최대 힙 구조로 구성
    // 2) 루트 노드를 제거하고, 마지막 요소를 루트로 옮김 (루트 노드와 마지막 요소의 위치를 변경
    // 3) 1~2 의 단계를 반복한다. >> 1~n > 1~n-1 > 1~n-2 ... 의 배열(힙 노드)에서 정렬을 반복
    public void heapSort(int size){
        heapify(size);

        for(int i = size; i >= 0; i--){                     //배열의 마지막 요소부터 두번째 요소까지 반복 >> (최소값)을 n-1번 제거 함
            swapArrayElement(0, i);                         //루트노드 제거(배열의 마지막 위치로 이동)

            heapify(i);                                     //루트 노드와 마지막 요소가 변경되어 깨진 힙 구조를 다시 힙 구조로 재구성
        }
    }
    public void heapify(int size){                          //배열을 (최소 min) 힙 구조로 변경
        int child, parent;

        for(int i = 1; i < size; i++){                      //첫 반복부터 부모 노드에 접근해야 하기 때문에, 루트 노드인 '0'이 아닌 '1'부터 반복 시작
            child = i;

            while(child > 0){
                parent = (child-1) / 2;                     //루트 노드의 인덱스(?)가 '0' 부터 시작 >> 부모:3 , 자식: 7, 8 식의 인덱스(?)를 이룸

                if(numbers[parent] < numbers[child]){
                    swapArrayElement(parent, child);
                }

                child = parent;                             //자식-부모 의 값을 비교한 뒤, 부모-조부모 의 값이 존재하면 비교하기 위함
            }
        }
    }
    public void mergeSort(){
        int[] temp = new int[numbers.length];                   //병합을 진행하기 위한 임시 배열

        divide(temp, 0, numbers.length-1);
    }
    public void divide(int[] temp, int low, int high){          //배열을 두개의 배열로 분할시킨다
        if(low >= high){
            return;                                             //배열의 크기가 1 이하인 경우, 분할과정을 중단
        }

        int mid = low + (high-low)/2;

        divide(temp, low, mid);                                 //분할된 왼쪽 배열을 대상으로, 분할을 진행
        divide(temp, mid+1, high);                          //분할된 오른쪽 배열을 대상으로, 분할을 진행
        merge(temp, low, mid, high);                                 //해당 재귀에서 분할된 두 배열을 '병합'
    }
    public void merge(int[] temp, int low, int mid, int high){           //분할된 두 개의 배열을, 병합하는 동시에 정렬한다
        int pointL = low;                   //왼쪽 분할 배열의 현재 index
        int pointR = mid + 1;               //오른쪽 분할 배열의 현재 index
        int index = low;                    //본 배열에 저장할 위치를 가리키는 index


        for(int i = low; i <= high; i++){                        //정렬 전 배열의 값들을, 임시 배열에 복사
            temp[i] = numbers[i];
        }

        while(pointL <= mid && pointR <= high){                 //분할된 두 배열 중, 하나의 배열이라도 다 소비할 때 까지 반복
            if(temp[pointL] < temp[pointR]){
                numbers[index] = temp[pointL];
                pointL++;
            }
            else{
                numbers[index] = temp[pointR];
                pointR++;
            }
            index++;
        }

        if(pointL <= mid){                                      //분할된 두 배열 중, 왼쪽 배열이 다 소비되지 못한 경우
            for(int i = 0; i < mid-pointL+1; i++){
                numbers[index+i] = temp[pointL+i];
            }
        }
        else{
            for(int i = 0; i < high-pointR+1; i++){           //분할된 두 배열 중, 오른쪽 배열이 다 소비되지 못한 경우
                numbers[index+i] = temp[pointR+i];
            }
        }
    }

    public void swapArrayElement(int index1, int index2){
        int temp = numbers[index2];
        numbers[index2] = numbers[index1];
        numbers[index1] = temp;
    }



    public void print() throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < numbers.length; i++){
            bw.write(numbers[i] + "\n");            //출력 시간도 고려해야 함
        }

        bw.flush();
        bw.close();
    }
}