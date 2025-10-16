# https://www.acmicpc.net/problem/25192

# 딕셔너리
# https://www.acmicpc.net/problem/25192

import sys
input = sys.stdin.readline

def sol():
    N = int(input())
    count = 0

    for _ in range(N):
        name = input().rstrip()
        if name == 'ENTER':
            users = dict()
            continue
        if name not in users:
            users[name] = True
            count += 1
    
    print(count)

sol()