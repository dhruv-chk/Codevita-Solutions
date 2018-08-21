s=0
n=int(input())
i=0
while 2**i<=n:
    for j in range(0,n):
        s=int(s+(2**((2**i)+(2*j))))
print(s)
        