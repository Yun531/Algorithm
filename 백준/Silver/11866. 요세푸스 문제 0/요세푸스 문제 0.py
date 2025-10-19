# https://www.acmicpc.net/problem/11866

import sys
input = sys.stdin.readline

from collections import deque
def sol():
    data = list(map(int, input().split()))

    que = deque()
    for i in range(1,data[0]+1):
        que.append(i)

    result = "<"
    while len(que) != 1:
        for _ in range(data[1]-1):
            que.append(que.popleft())
        result = result + str(que.popleft()) + ', ' 

    result = result + str(que.popleft()) + '>'
    print(result)


sol()
