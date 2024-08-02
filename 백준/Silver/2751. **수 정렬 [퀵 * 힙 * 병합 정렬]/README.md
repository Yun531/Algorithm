# [Silver V] 수 정렬하기 2 - 2751 

[문제 링크](https://www.acmicpc.net/problem/2751) 

### 퀵 정렬 / 힙 정렬 / 병합 정렬 
[ 퀵 정렬 ](https://st-lab.tistory.com/250) <br>
[ 힙 정렬 ](https://datamoney.tistory.com/240) <br>
[ 병합 정렬 ](https://datamoney.tistory.com/238) <br>


### ArrayList 정렬하기 (오름*내림 차순, 사용자 정의)
[ ArrayList 정렬 ](https://hianna.tistory.com/569)  <br>
- compare(data1, data2) : <br>
   - return 값이 양수 이면 data1과 data2의 위치를 변경한다.
   - 오름차순 정렬 : `return data1 - data2;`  <br>
   - 내림차순 정렬 : `return data2 - data1;`  <br>
   - [이차원 배열 compare (Comparator)](https://ifuwanna.tistory.com/328) <br>

- 문자열 사전순으로 정렬 : str1.compareTo(str2) <br>
   - str1 이 큰 경우 1, str1 이 작은 경우 -1 리턴
   - compare() 에서 return str1.compareTo(str2); 식으롤 사용하여 문자열을 사전순으로 정렬할 수 있음
 
[ Arrays.sort() / Collections.sort() ](https://80000coding.oopy.io/21cb57a3-681b-404d-a4ac-8ab0e7289bc0)


### 성능 요약

메모리: 113064 KB, 시간: 1016 ms

### 분류

정렬

### 제출 일자

2024년 7월 31일 19:39:35

### 문제 설명

<p>N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.</p>

### 출력 

 <p>첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.</p>

