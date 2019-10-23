class reverseVowels(object):

    def main(self):
        print(self.reverseVowels("hello"))

    def reverseVowels(self, strs):
        strs = strs.lower()
        vowels = set()
        vowels.add('a')
        vowels.add('e')
        vowels.add('i')
        vowels.add('o')
        vowels.add('u')

        charArr = list(strs)
        start = 0
        end = len(charArr) - 1

        while start <= end:
            if charArr[start] not in vowels:
                start += 1
                continue
            if charArr[end] not in vowels:
                end -= 1
                continue

            charArr[start],charArr[end]  = charArr[end], charArr[start]
            start+=1
            end-=1

        return ''.join(charArr)



        

        
