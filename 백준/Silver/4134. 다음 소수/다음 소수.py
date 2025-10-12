# https://www.acmicpc.net/problem/4134

import sys
input = sys.stdin.readline

def sol():
    N = int(input().strip())

    for _ in range(N):
        n = int(input().strip())
        print(find_prime(n))

def find_prime(target):
    if target <= 2:
        return 2
    if target % 2 == 0:
        target += 1
    while True:
        for i in range(3, int(target ** 0.5) + 1, 2):
            if target % i == 0:
                break
        else:
            return target
        target += 2
    
sol()