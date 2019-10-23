class Solution(object):

    def minWindowSize(self, str1, str2):
        if len(str1) == 0 or len(str2) == 0 or len(str2) > len(str1):
            return ""
        len_s = len(str1)
        len_t = len(str2)
        dictt = {}

        minSize = len_s + 1

        output = ""
        for c in str2:
            dictt[c] = dictt.get(c, 0) + 1

        i = j = 0

        while i < len_s:

            if str1[i] in dictt:
                if  dictt[str1[i]] > 0:
                    len_t -= 1

                dictt[str1[i]] -= 1

                while len_t == 0:
                    if i - j + 1 < minSize:
                        minSize = i - j + 1
                        output = str1[j: i+1]

                    if str1[j] in dictt:
                        dictt[str1[j]] += 1

                        if dictt[str1[j]] > 0:
                            len_t += 1

                    j += 1

            i += 1

        return "empty" if minSize == len_s + 1 else output 


s = Solution()
str1 = "ADOBECODEBANC"

str2 = "ABC"

print(s.minWindowSize(str1, str2))

