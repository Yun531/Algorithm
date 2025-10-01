# https://www.acmicpc.net/problem/15486

import sys
input = sys.stdin.readline

# 시간초과
# def sol():
#     n = int(input())
#     time = []
#     income = []
#     for i in range(n):
#         temp1, temp2 = map(int, input().split())
#         time.append(temp1)
#         income.append(temp2)
#     # data = [tuple(map(int, input().split())) for _ in range(n)]   # 튜플 사용해서 더 깔끔하게 할 수 있음
#     # time = [t for t, _ in data]
#     # income = [p for _, p in data]

#     memo = [0]*n
#     for i in range(n):
#         income_temp = income[i] if i + time[i] <= n else 0
#         temp = [income_temp]
#         # 이전 상담(k)이 i일 전에 끝난다면 i일 상담을 붙일 수 있음
#         for k in range(i):
#             if k + time[k] <= i:
#                 temp.append(memo[k] + income_temp)
#         memo[i] = max(temp)

#     print(max(memo))

def sol():
    n = int(input())
    t = [0]*(n+1)
    p = [0]*(n+1)
    for i in range(1, n+1):
        t[i], p[i] = map(int, input().split())

    dp = [0]*(n+2)  # n+1까지 커버
    for i in range(1, n+1):
        # 상담을 하지 않고 다음 날로 넘어가는 경우
        dp[i+1] = max(dp[i+1], dp[i])
        # 상담을 하는 경우
        if i + t[i] <= n+1:
            dp[i+t[i]] = max(dp[i+t[i]], dp[i] + p[i])

    print(max(dp))

sol()