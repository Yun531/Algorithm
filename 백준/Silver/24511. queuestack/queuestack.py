# https://www.acmicpc.net/problem/24511

# 대략 10*7 연산이 1초임

import sys
input = sys.stdin.readline

from collections import deque

def sol():
    N = int(input())
    types = input().split()
    vals = input().split()

    dque = deque()

    for i, type in enumerate(types):
        if type == '0':
            dque.append(vals[i])

    N = int(input())
    datas = input().split()
    results = []
    for data in datas:
        dque.appendleft(data)
        results.append(dque.pop())

    
    print(' '.join(results))

sol()