import sys
try:
    r=int(input())
    if r>10:
         raise ValueError
except ValueError:
    sys.exit()
msg=input()
buffer=msg.split()
a=[]
for i in range(0,len(msg)):
    a.append(msg[i])
b=[]
for i in range(0,r):
    c=[]
    for j in range(0,len(a)):
        c.append(0)
    b.append(c)
#print(b)
count=0
for i in range(r-1,0,-1):
    for j in range(0,2*i):
        if j==1 or j==(2*i-1):
            b[i][j]=a[count]
            count+=1
for i in range(0,r):
    for j in range(1,2*i):
        if j==r or j==(2*i-1):
            b[i][j]=a[count]
            count+=1
s=""
for j in range(0,len(a)):
    for i in range(0,r):
        if b[j][i]!=0:
            s=s+str(b[j][i])
print(s)         
        
    