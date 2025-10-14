# https://www.acmicpc.net/problem/4949

import sys
input = sys.stdin.readline

def sol():
    while True:
        str = list(input().rstrip())       # rstrip() : 오른쪽 끝의 공백만 제거
        lengh = len(str)
        if lengh == 1 and str[0] == '.':
            break

        stack = []
        for i in range(lengh):
            if str[i] == '(':
                stack.append('(')
            elif str[i] == '[':
                stack.append('[')
            elif str[i] == ')':
                if stack:
                    if stack.pop() != '(' :
                        print('no')
                        break
                else:
                    print("no")
                    break
            elif str[i] == ']':
                if stack:
                    if stack.pop() != '[' :
                        print('no')
                        break
                else:
                    print("no")
                    break
            elif str[i] == '.':
                if not stack and not stack :
                    print('yes')
                    break
        else:
            print('no')

sol()


        