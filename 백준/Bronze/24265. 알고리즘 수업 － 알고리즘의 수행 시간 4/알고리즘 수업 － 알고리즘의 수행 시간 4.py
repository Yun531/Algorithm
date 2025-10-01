# https://www.acmicpc.net/problem/24265

import sys
input = sys.stdin.readline

def sol():
    n = int(input())
    print(int(n*(n-1)/2))
    print(2)

sol()