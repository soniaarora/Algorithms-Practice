class wordFreq:
    def __init__(self, count, word):
        self.count = count
        self.word = word

    def __cmp__(self, other):

        if self.count != other.count:
            return cmp(self.count, other.count)
        else:
            return cmp(self.word, other.word)





def frequentKwords(words, k):
    
    Dict = {}
    for w in words:
        if w in Dict:
            Dict[w] += 1
        else:
            Dict[w] = 1

    
    dictSort = sorted(Dict, key= lambda x: (-Dict[x], x))
    res = dictSort[:k]
    return res
 




words =["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"]
print(frequentKwords(words, 4))