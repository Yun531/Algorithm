import sys
input = sys.stdin.readline

def sol():
    count = int(input())
    for i in range(1,count+1):
        print(' '*(count-i) + '*'*(2*i-1))
    for i in range(1,count):
        print(' '*i + '*'*(2*(count-i)-1))

sol()