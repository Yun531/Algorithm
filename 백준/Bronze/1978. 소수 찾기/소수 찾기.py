# https://www.acmicpc.net/problem/1978

import sys
input = sys.stdin.readline

def sol():
    n = int(input())
    nums = list(map(int, input().split()))

    count = 0
    for i in nums:
        if i < 2:
            continue

        r = int(i**(1/2))
        for k in range(2, r+1): # 2,3 을 검사하지 못함
            if i % k == 0:
                break
        else:                   # for or while 문에 else 가 걸릴 수 있음, 반복문 정상 종료시 실행 됨
            count += 1

    print(count)

sol()