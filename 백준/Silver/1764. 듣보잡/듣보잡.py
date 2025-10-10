# https://www.acmicpc.net/problem/1764

import sys
input = sys.stdin.readline

def sol():
    N, M = map(int, input().split())
    memo = dict()
    
    for i in range(N):
        memo[str(input().strip())] = 1
    
    result = []
    for i in range(M):
        temp = str(input().strip())
        if temp in memo:
            result.append(temp)
    
    result.sort()
    print(len(result))
    for s in result:
        print(s)

sol()    
