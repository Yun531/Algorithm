# https://www.acmicpc.net/problem/11049

import sys
input = sys.stdin.readline

def sol():
    n = int(input())
    matrix = [list(map(int, input().split())) for _ in range(n)]         # list() 로 감싼 뒤에 for 문 >> 2차원 배열
    r = [matrix[i][0] for i in range(n)]
    c = [matrix[i][1] for i in range(n)]

    INF = 10**18
    memo = [[0 if i == j else INF for j in range(n)] for i in range(n)]  # 2차원 배열 집어넣는 방법

    # k = 시작 인덱스
    for gap in range(1, n):                # gap = 1..n-1 (길이 2 이상)
        for k in range(0, n - gap):        # 시작 k, 끝 j = k+i
            j = k + gap
            memo[k][j] = min(
                memo[k][t] + memo[t+1][j] + r[k]*c[t]*c[j]
                for t in range(k, j)
            )

    print(memo[0][n-1])

sol()