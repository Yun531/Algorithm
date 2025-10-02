# https://www.acmicpc.net/problem/1436

import sys
input = sys.stdin.readline

def sol():
    n = int(input())

    memo = [0]*n
    num = 1
    for i in range(n):
        while True:
            if "666" in str(num):
                memo[i] = num
                num += 1
                break
            else:
                num += 1

    print(memo[n-1])

sol()