# https://www.acmicpc.net/problem/12789

import sys
input = sys.stdin.readline

def sol():
    N = int(input())
    lines = list(map(int, input().split()))
    stack = []

    cur = 0
    for s in lines:
        stack.append(s)
        # 스택 꼭대기가 지금 필요한 번호면 계속 꺼냄
        while stack and stack[-1] == cur+1:
            stack.pop()
            cur += 1

    # 입력을 다 본 뒤에도 끝까지 정리
    while stack and stack[-1] == cur+1:
        stack.pop()
        cur += 1

    if cur == N:
        print("Nice")
    else:
        print("Sad")

sol()
