# https://www.acmicpc.net/problem/1010

import sys
input = sys.stdin.readline

def sol():
    N = int(input()) 

    for _ in range(N):
        vals = list(map(int, input().split()))
        print( fac(vals[1]) // (fac(vals[1]-vals[0]) * fac(vals[0]) ) )


def fac(n):
    result = 1
    for i in range(1, n+1):
        result *= i
    return result


sol()
