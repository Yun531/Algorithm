# https://www.acmicpc.net/problem/2346

import sys
input = sys.stdin.readline

from collections import deque

def sol():
    N = int(input())
    dque = deque(enumerate(map(int, input().split()), start = 1))     # enumerate(iterable, start): (index, iterable[index])의 쌍들을 반환해준다. start 로 출력되는 index의 초기값을 수정할 수 있다

    result = []
    for _ in range(N):
        num, move = dque.popleft()
        result.append(num)

        if move > 0:
            dque.rotate(-(move-1))        # deque를 회전시키는 함수
        else:
            dque.rotate(-move)

    print(' '.join(map(str, result)))     # join 은 문자열만 처리할 수 있음 >> 형변환 해서 넣어줘야 함

sol()