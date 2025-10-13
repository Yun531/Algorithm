# https://www.acmicpc.net/problem/13909

# https://parade621.tistory.com/56
# 약수의 개수 >> 2*a, 3*b 의 형태로 소인수분해 될 때, (a+1)*(b*1) 이 약수의 개수이다

import sys
input = sys.stdin.readline

def sol():
    N = int(input().strip())
    print(int(N**0.5))

sol()
