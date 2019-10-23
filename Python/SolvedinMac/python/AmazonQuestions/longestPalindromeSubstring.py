class Solution(object):

    def longestSubstring(self, string):

        if len(string) == 0:
            return ""

        strLen = len(string)

        max_len = 0

        state = [[0] * strLen for x in range(strLen)]

        for x in range(strLen):
            state[x][x] = True
            max_len = 1
            res = string[x]

        for i in range(strLen - 1):
            if string[i] == string[i+1]:
                state[i][i+1] = True
                max_len = 2
                res = string[i: i+2]

        for j in range(strLen):
            for k in range(0, j-1):
                if string[j] == string[k] and state[k+1][j-1]:
                    state[k][j] = True
                    if max_len < j - k + 1:
                        res = string[k:j+1]
                        max_len = j - k + 1

        return res



s = Solution()

print(s.longestSubstring("geeksskeeg"))
