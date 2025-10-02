# https://www.acmicpc.net/problem/10989

import sys
input = sys.stdin.readline

# def sol(): # 시간초과
#     n = int(input())
#     num_list = [ int(input()) for _ in range(n) ]
#     num_list.sort()
#
#     for i in range(n):
#         print(num_list[i])

# def sol(): # 계수정렬 적용
#     n = int(input())
#     num_list = [ int(input()) for _ in range(n) ]  # 입력 리스트를 만드는것 자체가 리소스를 너무 많이 잡아먹음
#
#     num_min, num_max = min(num_list), max(num_list)
#     length = num_max - num_min + 1
#     memo = [0]*length
#
#     for i in reversed(num_list):  # 리스트 역순으로 이용, 계수정렬할 때, 동일 원소들의 순서를 유지해주기 위함
#         temp = i-num_min
#         memo[temp] += 1
#
#     for i in range(length):
#         for k in range(memo[i]):
#             print(i+num_min)

def sol():
    n = int(input())
    memo = dict()

    for _ in range(n):
        num = int(input())
        if num not in memo:
            memo[num] = 1
        else:
            memo[num] += 1

    for num in sorted(memo.keys()):  # dict 의 키값들은 정렬되어 있지 않음
        for k in range(memo[num]):
            print(num)

sol()