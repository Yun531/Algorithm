import sys
input = sys.stdin.readline
INF = 10**18

def solve():
    T = int(input())
    for _ in range(T):
        N = int(input())
        w = [0] + list(map(int, input().split()))

        ps = [0]*(N+1)
        for i in range(1, N+1):
            ps[i] = ps[i-1] + w[i]

        dp = [[0]*(N+1) for _ in range(N+1)]

        for gap in range(1, N):
            for i in range(1, N - gap + 1):
                j = i + gap
                seg = ps[j] - ps[i-1]
                best = INF
                row_i = dp[i]              # 지역변수 캐싱
                for k in range(i, j):      # 분할점 i..j-1
                    v = row_i[k] + dp[k+1][j]
                    if v < best:
                        best = v
                dp[i][j] = best + seg

        print(dp[1][N])

if __name__ == "__main__":
    solve()