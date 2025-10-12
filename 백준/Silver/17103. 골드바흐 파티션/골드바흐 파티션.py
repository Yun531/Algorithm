# https://www.acmicpc.net/problem/17103

import sys
input = sys.stdin.readline

## 시간 부족 
# def sol():
#     N = int(input().strip())
#     for _ in range(N):
#         n = int(input().strip())
#         prime_set = make_prime_set(n)

#         count = 0
#         for x in prime_set:
#             if n - x in prime_set:
#                 count += 1
#         if n//2 in prime_set:
#             count += 1
        
#         print(count//2)


# def prev_prime(target):       #  [본인보다 '작거나 같은' 가장 큰 소수 반환 ]
#     if target < 2:
#         return None
#     if target == 2:
#         return 2
    
#     if target % 2 == 0:
#         target -= 1
    
#     while True:
#         limit = int(target**0.5) + 1
#         for i in range(3, limit, 2):     # [ 내부 for 문은 해당 target이 소수인지 판별하는 것, 즉 역순으로 돌 필요가 전혀 없음 ]
#             if target % i == 0:
#                 break
#         else:
#             return target
            
#         target -= 2           # [ 입력값보다 '같거나 작은 가장큰' 소수 를 위함 ]

# def make_prime_set(N):
#     target = N
#     prime_set = set()         # [ set = {} 는 딕셔너리 를 생성함 ]

#     while True:
#         target = prev_prime(target)
#         if target == None:
#             break
#         prime_set.add(target)    #  [ set 에는 .append 대신 .add 를 사용해야 함 ]
#         target -= 1
    
#     return prime_set


# 에라토스테네스의 체 방식으로 구간 내의 모든 소수를 구하고 시작해야 함
def make_prime_list(n):
    prime_list = [True]*(n+1)
    prime_list[0] = prime_list[1] = False

    for i in range(2, n+1):
        if prime_list[i]:
            for k in range(i*2, n+1, i):
                prime_list[k] = False
    
    return prime_list

# ## enumerate(list) >> list의 인덱스(i) 와 값(v) 를 동시에 꺼내줌
# list_2 = [i for i, v in enumerate(list_1) if v]

# ## 위의 코드와 동일한 코드
# list_2 = []
# for i, v in enumerate(list_1):
#     if v:
#         list_2.append(i)

def sol():
    N = int(input().strip())
    prime_list = make_prime_list(1000000)

    for _ in range(N):
        n = int(input().strip())
        count = 0

        for num in range(2, n // 2 + 1):
            if prime_list[num] and prime_list[n - num]:
                count += 1
        print(count)


sol()