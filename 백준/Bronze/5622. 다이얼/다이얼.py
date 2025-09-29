import sys

def sol():
    # .strip() 으로 개행문자도 제거됨
    s = sys.stdin.readline().strip().upper()
    dial = ["ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"]

    result = 0
    for ch in s:
        for i, grp in enumerate(dial, start=3):
            if ch in grp:
                result += i
                break

    print(result)

# def sol2():
#     s = sys.stdin.readline().strip().upper()
#     dial = ["ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"]
#
#     # 문자 → 시간 매핑 사전 만들기
#     time = {}
#     for t, grp in enumerate(dial, start=3):
#         for c in grp:
#             time[c] = t
#
#     print(sum(time[ch] for ch in s))

sol()