def find_majority(l):
    myMap = {}
    maxValue = 0
    maximum = [] # (occurring element, occurrences)
    for n in l:
        if n in myMap:
            myMap[n] += 1
        else:
            myMap[n] = 1

        # Keep track of maximum on the go
    for n in myMap:
        if myMap[n] > maxValue:
            maxValue = myMap[n]
            maximum.append(n)

    return maximum

l = [1,2,3,1,2,1,1,2,1,0,0,2,2]
ans = find_majority(l)
if len(ans)>1:
    print('more than 1')
else:
    print(ans[0])