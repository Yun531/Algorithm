import sys
input = sys.stdin.readline

def sol():
    ins = []
    
    for _ in range(9):
        i = int(input())
        ins.append(i)
        
    print(max(ins))
    print(ins.index(max(ins))+1)
    
sol()