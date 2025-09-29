def cal():
    while True:
        inputA, inputB = map(int, input().split())
        if inputA == 0 and inputB == 0 :
            return

        print(inputA+inputB)

cal()