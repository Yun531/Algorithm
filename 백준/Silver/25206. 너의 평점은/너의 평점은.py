import sys
input = sys.stdin.readline

def sol():
    grad_dict = {"A+":4.5, "A0":4, "B+":3.5, "B0":3, "C+":2.5, "C0":2, "D+":1.5, "D0":1, "F":0}

    grad_sum, grad_time_sum = 0, 0
    for _ in range(20):
        _, grad_time, grad = input().split()
        if grad == 'P':
            continue
        grad_time = float(grad_time)
        grad_time_sum += grad_time
        grad_sum += grad_dict[grad]*grad_time

    print(grad_sum/grad_time_sum)

sol()