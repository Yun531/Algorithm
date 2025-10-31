import sys
input = sys.stdin.readline

def sol():
    n = int(input())
    for i in range(1,n+1):
        nums = list(map(int, input().split()))
        print(f'Case #{i}: {nums[0]+nums[1]}')
              
sol()