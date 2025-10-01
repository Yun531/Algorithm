# https://www.acmicpc.net/problem/14215

import sys
input = sys.stdin.readline

def sol():
    nums = list(map(int, input().split()))
    nums.sort()

    if nums[0]+nums[1] > nums[2] :
        print(sum(nums))
    else:
        print((nums[0]+nums[1])*2 - 1)

sol()