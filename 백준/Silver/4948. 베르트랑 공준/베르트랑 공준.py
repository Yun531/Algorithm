# https://www.acmicpc.net/problem/4948

import sys
input = sys.stdin.readline

def sol():
    while True:
        n = int(input().strip())
        if n == 0:
            break

        find_prime_N_2N(n)

def find_prime(target):
    if target <= 2:
        return 2
    if target % 2 == 0:
        target += 1

    while True:
        limit = int(target**0.5) + 1
        for i in range(3, limit, 2):
            if target % i == 0:
                break
        else:
            return target
        
        target += 2

def find_prime_N_2N(N):
    target = N+1
    count = 0
    while True :
        target = find_prime(target)
        if target <= 2*N :
            count += 1
        else:
            break
        target += 1
        
    print(count)

sol()