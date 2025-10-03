# https://www.acmicpc.net/problem/11651

import sys
input = sys.stdin.readline

def sol():
    n = int(input())
    points = [tuple(map(int, input().split())) for _ in range(n)]

    points.sort(key=lambda p: (p[1], p[0]))   # -p[1] 등으로 사용하면 2번쨰 요소를 내림차순으로 정렬 

    for i in range(n):
        print(*points[i])         # 튜플에 '*' 을 사용해서 () 을 제거
    # for x, y in points:         
    #     print(f"{x}, {y}")      # 문자열 안에 변수를 직접 삽입

sol()
