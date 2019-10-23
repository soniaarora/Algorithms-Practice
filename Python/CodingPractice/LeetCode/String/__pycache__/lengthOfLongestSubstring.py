class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        if len(s) == 0:
            return 0
        
        maxCount = 0
        maxString = ''
        k = 0
        i = 0
        while i < len(s):
            if s[i] not in maxString: 
                maxString += s[i]
                maxCount = max(maxCount, len(maxString))
                i += 1
            else:
                k += 1
                maxString = s[k]
                i = k+1
                
        return maxCount
            

ans = Solution()
print(ans.lengthOfLongestSubstring("dvdf"))