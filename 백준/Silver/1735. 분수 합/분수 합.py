# https://www.acmicpc.net/problem/1735

import sys
input = sys.stdin.readline

def sol():
    A = list(map(int, input().strip().split()))
    B = list(map(int, input().strip().split()))

    up = A[0]*B[1] + B[0]*A[1]
    down = A[1]*B[1]
    t = min(up, down)

    print(f'{up//t} {down//t}')
    
def min(a, b):
    while b != 0 :
        a, b = b, a % b
    
    return a

sol()