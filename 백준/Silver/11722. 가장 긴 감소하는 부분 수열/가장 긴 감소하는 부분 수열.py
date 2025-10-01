import sys
input = sys.stdin.readline

def sol():
    n = int(input())
    arr = list(map(int, input().split()))

    memo = [1]*n
    for i in range(1,n):
        for k in range(i):
            if arr[i] < arr[k]:
                memo[i] = max(memo[i], memo[k]+1)

    print(max(memo))

sol()