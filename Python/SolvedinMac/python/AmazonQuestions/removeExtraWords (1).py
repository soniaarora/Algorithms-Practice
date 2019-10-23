class Solution(object):
    def removeWords(self, paragraph, banned):

        for c in "!?',;.": paragraph = paragraph.replace(c, " ")
        d, res, count = {},[],0
        for word in paragraph.lower().split():
            if word in banned:
                continue
            elif word in d:
                d[word] += 1
            else:
                d[word] = 1
            if d[word] > count:
                count = d[word]

        for item in d:
            if d[item] == count:
                res.append(item)
                
        return res


s = Solution()
literature Text = “Jack and Jill went to the market to buy bread and cheese. Cheese is Jack’s and Jill’s favorite food.”
wordsToExclude = [“and”, “he”, “the”, “to”, “is”. “Jack”, “Jill”]

went, 1, 1
market, 1, 1
cheese, 2,2
s, 2 

maxCount - 2
keys - cheese , s





res - cheese