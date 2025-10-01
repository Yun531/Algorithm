import sys
input = sys.stdin.readline

def sol():
    num = int(input())

    if num == 1:
        print('0')
    elif num == 2:
        print("1")
    elif num == 3:
        print("1")
    else :
        memo = [0] * (num)
        memo[0] = 0
        memo[1] = 1
        memo[2] = 1

        for i in range(4, num+1):
            if i % 6 == 0 :
                memo[i-1] = min(memo[i//3-1]+1, memo[i//2-1]+1, memo[i-2]+1)
            elif i % 3 == 0 :
                memo[i-1] = min(memo[i//3-1]+1, memo[i-2]+1)
            elif i % 2 == 0 :
                memo[i-1] = min(memo[i//2-1]+1, memo[i-2]+1)
            else:
                memo[i-1] = memo[i-2]+1
        print(memo[num-1])

sol()





