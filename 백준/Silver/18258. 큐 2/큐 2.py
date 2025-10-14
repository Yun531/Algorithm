# https://www.acmicpc.net/problem/18258

import sys
input = sys.stdin.readline

from collections import deque

def sol():
    N = int(input())
    que = deque()

    for _ in range(N):
        data = input().split()
        if data[0] == 'push':
            que.append(int(data[1]))
        elif data[0] == 'pop':
            if que:
                print(que.popleft())
            else:
                print('-1')
        elif data[0] == 'size':
            print(len(que))
        elif data[0] == 'empty':
            if que:
                print('0')
            else:
                print('1')
        elif data[0] == 'front':
            if que:
                print(que[0])
            else:
                print('-1')
        elif data[0] == 'back':
            if que:
                print(que[-1])
            else:
                print('-1')

sol()
