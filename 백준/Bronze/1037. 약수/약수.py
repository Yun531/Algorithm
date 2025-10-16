# https://www.acmicpc.net/problem/1037

import sys
input = sys.stdin.readline

def sol():
    N = input()
    vals = list(map(int, input().split()))

    print(max(vals)*min(vals))

sol()