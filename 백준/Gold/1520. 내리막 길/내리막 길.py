# https://www.acmicpc.net/problem/1520

import sys
input = sys.stdin.readline
sys.setrecursionlimit(10 ** 9)  # 재귀 호출 허용 깊이를 변경

def sol():   
    N, M = map(int, input().strip().split())
    input_list = [list(map(int, input().strip().split())) for _ in range(N)]

    memo = [[0]*M for _ in range(N)]
    memo[0][0] = 1

    H = [(input_list[i][k], i, k) for i in range(N) for k in range(M)]
    H.sort(reverse=True)

    DX = [0,0,1,-1]
    DY = [1,-1,0,0]

    for h,i,k in H:
        if h == 0:
            continue
        else:
            for d in range(4):
                ni, nk = i + DX[d], k + DY[d]
                if 0 <= ni < N and 0 <= nk < M and input_list[i][k] > input_list[ni][nk]:
                    memo[ni][nk] += memo[i][k]
    
    print(memo[N-1][M-1])



## sol_2
N, M = map(int, input().strip().split())
input_list = [list(map(int, input().strip().split())) for _ in range(N)]

memo = [[-1]*M for _ in range(N)]

DI = [0,0,1,-1]
DK = [1,-1,0,0]

def dfs(i, k):
    if i == N-1 and k == M-1:
        return 1
    if memo[i][k] != -1:
        return memo[i][k]
    
    ways = 0
    for d in range(4):
        ni, nk = i + DI[d], k + DK[d]
        if 0 <= ni < N and 0 <= nk < M and input_list[i][k] > input_list[ni][nk]:
            ways += dfs(ni,nk)
    
    memo[i][k] = ways

    return memo[i][k]

def sol_2():
    print(dfs(0,0))

sol_2()