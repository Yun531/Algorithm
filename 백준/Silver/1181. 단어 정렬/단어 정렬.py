# https://www.acmicpc.net/problem/1181

import sys
input = sys.stdin.readline

def sol():
    n = int(input())
    words = [str(input().strip()) for _ in range(n)]
    words = list(set(words))                    # set 에 넣어서 중복제거

    words.sort(key=lambda s: (len(s), s))   

    for i in range(len(words)):
        print(words[i])         

sol()
