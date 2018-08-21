def sumOfDigits(decX, base):
	x = decX
	Sum = 0
	while x!=0:
		Sum += x%base
		x /= base
	return Sum


b, t = map(int, input().split())

x = b
cnt = 0
first = None
while True:
	while x%sumOfDigits(x, b) == 0:
		if first == None:
			first = x
		cnt+=1
		x+=1
	else:
		if cnt == t:
			break
		first = None
		cnt = 0
		x+=1

print (first)
