# https://www.acmicpc.net/problem/12865

import sys
input = sys.stdin.readline

def sol():
    n, max_w = map(int, input().split())
    arr_w = []
    arr_v = []
    for _ in range(n):
        temp_w, temp_v = map(int, input().split())
        arr_w.append(temp_w)
        arr_v.append(temp_v)

    memo = [0]*(max_w+1)
    for i in range(n):
        w_i = arr_w[i]
        v_i = arr_v[i]
        for w in range(max_w, w_i - 1, -1):
            memo[w] = max(memo[w], memo[w - w_i] + v_i)

    print(memo[max_w])

sol()
