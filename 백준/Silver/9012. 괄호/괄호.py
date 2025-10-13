# https://www.acmicpc.net/problem/9012

import sys
input = sys.stdin.readline

def sol():
    N = int(input().strip())

    for _ in range(N):
        stack = []
        str = input().strip()
        for i in range(len(str)):
            s = str[i:i+1]
            if s == '(':
                stack.append(1)
            else:
                if stack:
                    stack.pop()
                else:
                    print('NO')
                    break
        else:
            if stack:
                print("NO")
            else:
                print('YES')

sol()