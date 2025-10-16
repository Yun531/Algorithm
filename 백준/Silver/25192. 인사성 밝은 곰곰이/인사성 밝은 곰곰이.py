# https://www.acmicpc.net/problem/25192

# 딕셔너리
# https://www.acmicpc.net/problem/25192

# set
# https://wikidocs.net/1015

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

def sol_2():               # 단순 중복 여부만 확인할 것이기 때문에, set 이 더 적합함
    N = int(input())
    count = 0
    users = set()

    for _ in range(N):
        name = input().rstrip()
        if name == 'ENTER':
            users.clear()
        elif name not in users:
            users.add(name)
            count += 1

    print(count)

sol()
