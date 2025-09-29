def calc1(input):
    count = 0

    while input >= 0:
        if input % 5 == 0:
            count += int(input // 5)
            return(count)

        input -= 3
        count += 1

    else:
        return(-1)

def calcDP1(input):
    memo = dict()
    memo[3] = 1
    memo[5] = 1

    for i in range(1, input+1):
        if i - 3 in memo and i - 5 in memo :
            memo[i] = 1 + memo[i - 3] if memo[i - 3] <= memo[i - 5] else 1 + memo[i - 5]
        elif i - 3 in memo :
            memo[i] = 1 + memo[i - 3]
        elif i - 5 in memo :
            memo[i] = 1 + memo[i - 5]
        else:
            continue
            
    return memo[input] if input in memo else -1



print(calcDP1(int(input())))