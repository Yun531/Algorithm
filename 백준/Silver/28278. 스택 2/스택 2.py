# https://www.acmicpc.net/problem/28278

import sys
input = sys.stdin.readline

def sol():
    N = int(input().strip())
    stack = []

    for _ in range(N):
        buf = input().strip().split()   # 한줄의 입력이 몇개의 단어로 제공되는지 알 수 없을 때, split() 처리한 단어들을 list 에 넣어 저장한다
        if buf[0] == '1':
            stack.append(int(buf[1]))

        elif buf[0] == '2':
            if stack:                   # 리스트(list), 문자열(str), 튜플(tuple), 딕셔너리(dict), 집합(set) 등 컨테이너 타입은 비어 있으면 False, 비어 있지 않으면 True 로 평가된다
                print(stack.pop(-1))
            else:
                print(-1)

        elif buf[0] == '3':
            print(len(stack))

        elif buf[0] == '4':
            if stack:
                print(0)
            else:
                print(1)

        elif buf[0] == '5':
            if stack:
                print(stack[-1])
            else:
                print(-1)

sol()