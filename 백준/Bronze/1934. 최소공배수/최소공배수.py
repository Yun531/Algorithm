# https://www.acmicpc.net/problem/1934

import sys
input = sys.stdin.readline

def sol():
    N = int(input().strip())
    
    for _ in range(N):
        A, B = map(int, input().strip().split())
        g = gcd(A, B)
        print((A * B) // g)


# A * B = 최대공약수(A, B) * 최소공배수(A, B)
# gcd(): 최대공약수 구하는 함수
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

sol()