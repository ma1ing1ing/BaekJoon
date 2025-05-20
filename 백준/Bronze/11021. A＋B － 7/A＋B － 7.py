import sys

T = int(sys.stdin.readline())
l = []

for _ in range(T):
    A, B = map(int, sys.stdin.readline().split())
    l.append(A+B)

for i in range(T):
    print('Case #' + str(i+1) + ': ' + str(l[i]))