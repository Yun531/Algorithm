# https://www.acmicpc.net/problem/10773

import sys
input = sys.stdin.readline

def sol():
    N = int(input().strip())
    stack = []

    for _ in range(N):
        n = input().strip()
        if n == '0':
            stack.pop()
        else:
            stack.append(int(n))
    
    print(sum(stack))

sol()