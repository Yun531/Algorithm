# https://www.acmicpc.net/problem/28279

import sys
input = sys.stdin.readline

from collections import deque

def sol():
    N = int(input())
    dque = deque()

    for _ in range(N):
        data = input().split()
        if data[0] == '1':
            dque.appendleft(int(data[1]))
        elif data[0] == '2':
            dque.append(int(data[1]))
        if data[0] == '3':
            if dque:
                print(dque.popleft())
            else:
                print('-1')
        elif data[0] == '4':
            if dque:
                print(dque.pop())
            else:
                print('-1')
        elif data[0] == '5':
            print(len(dque))
        elif data[0] == '6':
            if dque:
                print('0')
            else:
                print('1')
        elif data[0] == '7':
            if dque:
                print(dque[0])
            else:
                print('-1')
        elif data[0] == '8':
            if dque:
                print(dque[-1])
            else:
                print('-1')

sol()