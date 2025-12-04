# https://www.acmicpc.net/problem/2749

# https://kyun2da.github.io/2020/08/30/fibonacci/
# https://yuuki0930.tistory.com/121

# 피보나치 수열 성질들
# https://www.acmicpc.net/blog/view/28 

import sys
input = sys.stdin.readline

def sol():
    N = int(input())
    period = 15*10**5         # 주기의 길이가 P 일 때, N번째 피보나치 수를 M으로 나눈 나머지는 N%P번째 피보나치 수를 M을 나눈 나머지와 동일

    dp = [0]*(period+1)
    dp[1] = 1

    for i in range(2, period+1):
        dp[i] = (dp[i-2] + dp[i-1]) % 10**6
    
    print(dp[N % period])

sol()

    
