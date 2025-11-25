# https://www.acmicpc.net/problem/11720

import sys
input = sys.stdin.readline

def sol():
    n = input()
    nums = input().strip()
    total = 0
    for i in nums :
        total += int(i)  
    print(total)

sol()