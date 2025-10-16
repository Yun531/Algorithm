# https://www.acmicpc.net/problem/11050

import sys
input = sys.stdin.readline

def sol():
    vals = list(map(int, input().split()))

    result = ( fac(vals[0]) ) // ( fac(vals[0] - vals[1]) * fac(vals[1]) )
    print(result)

def fac(n):
    result = 1
    for i in range(2, n+1):
        result = result*i
    
    return result

sol()