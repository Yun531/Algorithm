# https://www.acmicpc.net/problem/2164

import sys
input = sys.stdin.readline

from collections import deque
def sol():
    N = int(input())
    deck = deque()

    for i in range(1,N+1):
        deck.append(i)

    while True:
        if len(deck) == 1:
            print(deck[0])
            break
        else:
            deck.popleft()

        if len(deck) == 1:
            print(deck[0])
            break
        else:
            deck.append(deck.popleft())

sol()