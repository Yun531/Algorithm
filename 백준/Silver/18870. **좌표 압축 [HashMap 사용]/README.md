# [Silver II] 좌표 압축 - 18870 

[문제 링크](https://www.acmicpc.net/problem/18870) 

### HashMap

-키(key)와 값(value)가 짝을 이루어 저장되는 자료구조 <br>
-특정 데이터의 저장위치를 해시함수를 통해 바로 알 수 있기 때문에 데이터의 추가, 삭제, 특히 검색이 빠르다는 장점이 있다 <br>
-키(key)를 통해서만 검색 가능하며, 키(key)는 중복이 불가능 함 <br>
[ HashMap ](https://kadosholy.tistory.com/120)


### ArrayList

-크기가 고정되는 배열과 다르게 부족한 공간을 자동으로 조정해주는 선형리스트 <br>
-배열은 데이터를 추가, 삭제 시 반복문으로 인덱스를 한칸씩 밀거나 당기는 식으로 공간을 조절하지만 ArrayList는 이 과정을 자동으로 처리 <br>
[ ArrayList ](https://m.blog.naver.com/fbfbf1/222636992391)


### HashSet && ArrayList 성능비교

-ArrayList의 경우 삽입&삭제의 경우 O(n)의 시간이 요구된다. <br>
[ 성능비교 ](https://hanul-dev.netlify.app/java/list,-set-%EC%96%B4%EB%96%A4-%EA%B2%83%EC%9D%84-%EC%93%B0%EB%8A%94-%EA%B2%83%EC%9D%B4-%EC%9C%A0%EB%A6%AC%ED%95%9C%EA%B0%80/)



![image](https://github.com/user-attachments/assets/5c7d50d2-267d-4336-a2f1-9051f6405986)


### 성능 요약

메모리: 225044 KB, 시간: 1700 ms

### 분류

값 / 좌표 압축, 정렬

### 제출 일자

2024년 8월 2일 14:17:04

### 문제 설명

<p>수직선 위에 N개의 좌표 X<sub>1</sub>, X<sub>2</sub>, ..., X<sub>N</sub>이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.</p>

<p>X<sub>i</sub>를 좌표 압축한 결과 X'<sub>i</sub>의 값은 X<sub>i</sub> > X<sub>j</sub>를 만족하는 서로 다른 좌표 X<sub>j</sub>의 개수와 같아야 한다.</p>

<p>X<sub>1</sub>, X<sub>2</sub>, ..., X<sub>N</sub>에 좌표 압축을 적용한 결과 X'<sub>1</sub>, X'<sub>2</sub>, ..., X'<sub>N</sub>를 출력해보자.</p>

### 입력 

 <p>첫째 줄에 N이 주어진다.</p>

<p>둘째 줄에는 공백 한 칸으로 구분된 X<sub>1</sub>, X<sub>2</sub>, ..., X<sub>N</sub>이 주어진다.</p>

### 출력 

 <p>첫째 줄에 X'<sub>1</sub>, X'<sub>2</sub>, ..., X'<sub>N</sub>을 공백 한 칸으로 구분해서 출력한다.</p>

