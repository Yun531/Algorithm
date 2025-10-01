# https://www.acmicpc.net/problem/24265

import sys
input = sys.stdin.readline

def sol():
    n = int(input())
    print(int(n*(n-1)/2)) # '/' 연산은 실수를 생성하기 때문에. int()로 감싸주거나 '//' 연산을 사용해야 함
    print(2)


sol()
