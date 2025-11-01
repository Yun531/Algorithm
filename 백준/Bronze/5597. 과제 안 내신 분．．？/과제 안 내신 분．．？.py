import sys

submitted = {int(line.strip()) for line in sys.stdin if line.strip()}
all_students = set(range(1, 31))

missing = sorted(all_students - submitted)
print(missing[0])
print(missing[1])