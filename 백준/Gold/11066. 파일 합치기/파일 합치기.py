# https://www.acmicpc.net/problem/11066

# 크누스 알고리즘
# https://blog.naver.com/hands731/221809346951
import sys
input = sys.stdin.readline

def sol():                          # 시간 초과 발생, 최적화를 극한으로 해야 O(N*3) 으로도 통과 가능
    M = int(input())

    for _ in range(M):
        N = int(input())
        weights = [0] + list(map(int, input().split()))       # 리스트끼리 단순 연결(+) 이 가능함
        
        ps = [0]*(N+1)                                                # 각 단계마다 해당 구간의 모든 원소의 합이 cost로 더해지기 때문
        for i in range(1,N+1):
            ps[i] = ps[i-1] + weights[i]                              # .append() 도 성능에 영향을 미침 

        INF = 10**9
        # memo = [[0 if i == j else INF for j in range(N+1)] for i in range(N+1)]
        memo = [[0]*(N+1) for _ in range(N+1)]

        for gap in range(1,N):
            for i in range(1, N-gap+1):
                k = i + gap
                best = INF                     
                row_i = memo[i]                                      # 2차원 배열 접근은 비쌈, 1차원 배열로 캐싱해서 사용함
                for p in range(i, k):                                # min() 호출 자체가 성능에 영향을 미침, 사용하지 않는것이 가장 빠름
                    cost = row_i[p] + memo[p+1][k]
                    if cost < best:
                        best = cost
                
                memo[i][k] = best + ps[k] - ps[i-1]
        
        print(memo[1][N])

def sol_2():
    T = int(input())
    INF = 10**9

    for _ in range(T):
        N = int(input())
        files = [0] + list(map(int, input().split()))  # 1-based padding

        # prefix_sum[i] = files[1] + ... + files[i]
        prefix_sum = [0] * (N + 1)
        for i in range(1, N + 1):
            prefix_sum[i] = prefix_sum[i - 1] + files[i]

        # dp[i][j]: i..j 구간을 하나로 합치는 최소 비용 (1 ≤ i ≤ j ≤ N)
        dp = [[0] * (N + 1) for _ in range(N + 1)]
        # opt[i][j]: dp[i][j] 최소가 되는 분할점 k (Knuth 최적화용)
        opt = [[0] * (N + 1) for _ in range(N + 1)]
        for i in range(1, N + 1):
            opt[i][i] = i  # 길이 1 구간

        # gap 1..N-1 구간 채우기
        for gap in range(1, N):
            for i in range(1, N - gap + 1):
                j = i + gap
                dp[i][j] = INF

                # Knuth: opt[i][j-1] <= opt[i][j] <= opt[i+1][j]
                left  = opt[i][j - 1]
                right = opt[i + 1][j]  # length >= 2 이므로 i+1 ≤ j 성립

                # 1-based에서 분할점 k는 [i .. j-1] 범위여야 함
                if left  < i:   left  = i
                if right > j-1: right = j - 1

                seg_sum = prefix_sum[j] - prefix_sum[i - 1]
                best_k = left
                for k in range(left, right + 1):  # k ∈ [left, right]
                    cost = dp[i][k] + dp[k + 1][j] + seg_sum
                    if cost < dp[i][j]:
                        dp[i][j] = cost
                        best_k = k
                opt[i][j] = best_k

        print(dp[1][N])

sol_2()
