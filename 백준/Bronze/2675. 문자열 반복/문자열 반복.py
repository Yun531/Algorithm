import sys
input = sys.stdin.readline

def sol():

    roof = int(input())
    for _ in range(roof):
        mul, s = input().split()
        mul = int(mul)
        result = ''.join(ch * mul for ch in s)
        print(result)
        
    # for i in range(roof):
    #     mul, str = input().split()
    #     mul = int(mul)
    #     str_result = []
    #     for k in range(len(str)):
    #         for l in range(mul):
    #             str_result.append(str[k])
    #     result = "".join(str_result)
    #     print(result)

sol()