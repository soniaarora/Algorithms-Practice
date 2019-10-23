def charRoll(s, arr):

    newString = ""
    
    for i in arr:
        j  = 0
        newString = ""
        while j < i:
            if s[j] != 'z':
                newString += chr(ord(s[j]) + 1) 
            else:
                newString += 'a'
            j += 1
        while len(newString) < len(s):
            newString += s[j]
            j += 1
            

        s = newString


    return s

s = 'abz'
print(charRoll(s, [3, 2, 1]))


