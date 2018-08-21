import sys
def decryptRailFence(cipher, key):

	rail = [[None for c in xrange(len(cipher))] for r in xrange(key)]

	row = 0
	col = 0
	for i in xrange(len(cipher)):
		if row == 0:
			down = True
		if row == key-1:
			down = False

		rail[row][col] = 'X'
		col+=1

		if down:
			row+=1
		else:
			row-=1

	index = 0
	i=0
	while i<key and index<len(cipher):
		j=0
		while j<len(cipher) and index<len(cipher):
			if rail[i][j] == 'X':
				rail[i][j] = cipher[index]
				index+=1
			j+=1
		i+=1

	result = ''

	row = 0
	col = 0
	for i in xrange(len(cipher)):
		if row == 0:
			down = True
		if row == key-1:
			down = False

		if rail[row][col] != 'X':
			result += rail[row][col]
			col+=1

		if down:
			row+=1
		else:
			row-=1
	
	return result


if __name__ == '__main__':
	try:
        depth = input()
        if depth>10:
        raise ValueError
    except ValueError:
        sys.exit()
	cipher = raw_input()
	print decryptRailFence(cipher, depth)
