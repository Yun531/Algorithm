# [Bronze II] 알고리즘 수업 - 알고리즘의 수행 시간 6 - 24267 

[문제 링크](https://www.acmicpc.net/problem/24267) 

### 버퍼 리더 or 버퍼 라이터 사용법

[버퍼 링크](https://coding-factory.tistory.com/251)

### 알고리즘의 수행 시간 1 ~ 6 해설

[ ( 1 ) ](https://velog.io/@gayeong39/%EB%B0%B1%EC%A4%80-24262-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%EC%97%85-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%EC%9D%98-%EC%88%98%ED%96%89-%EC%8B%9C%EA%B0%841) <br> 
[ ( 2 ) ](https://velog.io/@gayeong39/%EB%B0%B1%EC%A4%80-24263-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%EC%97%85-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%ED%96%89-%EC%8B%9C%EA%B0%842) <br> 
[ ( 3 ) ](https://velog.io/@gayeong39/%EB%B0%B1%EC%A4%80-24264-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%EC%97%85-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%ED%96%89-%EC%8B%9C%EA%B0%843) <br> 
[ ( 4 ) ](https://velog.io/@gayeong39/%EB%B0%B1%EC%A4%80-24265-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%EC%97%85-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98) <br> 
[ ( 5 ) ](https://velog.io/@gayeong39/%EB%B0%B1%EC%A4%80-24266-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%98%EC%97%85-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%EC%9D%98-%EC%88%98%ED%96%89-%EC%8B%9C%EA%B0%845)  <br>  
[ ( 6-1 ) ](https://dokuny-devlog.tistory.com/93)  / 
[ ( 6-2 ) ](https://yester-today.tistory.com/7)


### 성능 요약

메모리: 15952 KB, 시간: 148 ms

### 분류

구현, 수학, 시뮬레이션

### 제출 일자

2024년 7월 29일 18:32:28

### 문제 설명

<p>오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.</p>

<p>입력의 크기 <em>n</em>이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.</p>

<p>MenOfPassion 알고리즘은 다음과 같다.</p>

<pre>MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2
        for j <- i + 1 to n - 1
            for k <- j + 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}</pre>

### 입력 

 <p>첫째 줄에 입력의 크기 <em>n</em>(1 ≤ <i>n</i> ≤ 500,000)이 주어진다.</p>

### 출력 

 <p>첫째 줄에 코드1 의 수행 횟수를 출력한다.</p>

<p>둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.</p>

