# https://www.acmicpc.net/problem/11478

import sys
input = sys.stdin.readline

def sol():
    string = str(input().strip())
    memo = []

    l = len(string)
    for i in range(l):
        for k in range(l-i):   
            memo.append(string[k:k+i+1])   # 문자열 슬라이싱

    result = set(memo)
    print(len(result))

sol()