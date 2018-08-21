import sys
def per(a,l,r):
	i=0
	if l==r:
		pal(a)
	else:
		for i in range(l,r+1):
			l1=list(a)
			l1[l],l1[i]=l1[i],l1[l]
			a=''.join(l1)
			per(a,l+1,r)
			l1=list(a)
			l1[l],l1[i]=l1[i],l1[l]
out=[]
def pal(str):
	l=0
	h=len(str)-1
	while h>l:
		if str[l]!=str[h]:
			l=l+1
			h=h-1
			return
		l=l+1
		h=h-1
	out.append(str)
try:
    T=int(input().strip())
    if T>10:
        raise ValueError
except ValueError:
    sys.exit()
mylist=[]
for i in range(0,T):
    inp=input().strip()
    mylist.append(inp)
    
for i in range(0,T):
    s=mylist[i]
    per(s,0,len(s)-1)
    out.sort()
    p=set(out)
    #print(i+1)
    for j in p:
        print (j)
    out=[]
