# https://www.acmicpc.net/problem/9252
# https://mobuk.tistory.com/85
# https://velog.io/@elon/Python-%EB%B0%B1%EC%A4%80-9252

# LCS 문제

import sys
input = sys.stdin.readline

str_A = input().strip()
str_B = input().strip()

len_A, len_B= len(str_A), len(str_B)
memo = [[0]*(len_B + 1) for _ in range(len_A + 1)]



def sol():
    lcs()
    print(memo[len_A][len_B])
    print(back_trace())



    
def lcs():
    for i in range(1, len_A+1):
        for k in range(1, len_B+1):
            if str_A[i-1] == str_B[k-1]:
                memo[i][k] = memo[i-1][k-1] + 1
            else:
                memo[i][k] = max(memo[i][k-1], memo[i-1][k])

def back_trace():
    result = []
    i, k = len_A, len_B

    while i > 0 and k > 0:
        if str_A[i-1] == str_B[k-1]:
            result.append(str_A[i-1])
            i -= 1
            k -= 1
        else:
            if memo[i][k-1] >= memo[i-1][k]:
                k -= 1
            else:
                i -= 1

    result.reverse()
    return ''.join(result)


sol()
