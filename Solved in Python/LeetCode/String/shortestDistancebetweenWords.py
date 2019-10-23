#244. Shortest Word Distance II
import sys

class WordDistance(object): 
    def __init__(self,words):
        self.wordMap = {}
        i = 0
        for word in words:
            if word not in self.wordMap:
                self.wordMap[word] = [i]
            else:
                val = self.wordMap[word]
                val.append(i)
                self.wordMap[word] = val

            i += 1


    def shortest(self,word1, word2):
        list1 = self.wordMap[word1]
        list2 = self.wordMap[word2]

        #get minimum distance
        minDistance = sys.maxsize
        i = 0
        j = 0
        n1 = len(list1)
        n2 = len(list2)
        while i < n1 and j < n2:
            diff = abs(list1[i] - list2[j] )
            if diff < minDistance:
                minDistance = diff
            if list1[i] < list2[j]:
                i+=1
            else:
                j+=1
        return minDistance



words = ['love', 'points','clouds', 'love', 'makes' ]
word = WordDistance(words)

s = word.shortest('love', 'clouds')
print(s)
