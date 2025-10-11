# https://www.acmicpc.net/problem/1269

import sys
input = sys.stdin.readline

def sol(): 
    num_a, num_b = map(int, input().strip().split())
    matix_a = set(map(int, input().strip().split()))   # x in set 평균 O(1) -> (해시), x in list 평균 O(N) -> (앞에서부터 찾음)
    matix_b = set(map(int, input().strip().split()))

    # cnt = 0
    # for x in matix_a:
    #     if x not in matix_b:
    #         cnt += 1
    # for y in matix_b:
    #     if y not in matix_a:
    #         cnt += 1
            
    # print(cnt)

    # A ^ B(대칭 차), A - B(차), A & B(교집합) 같은 연산 제공
    print(len(matix_a ^ matix_b))

sol()