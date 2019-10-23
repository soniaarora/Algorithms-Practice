class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
        if len(s) != len(t):
            return False
    
        dictionary = {}
        
        for x in range(len(s)):
            first = s[x]
            second = t[x]
            
            if first in dictionary:
                if dictionary[first] == second:
                    continue
                else:
                    False
                    
            if  second not in dictionary.values():
                dictionary[first] = second
                
            else:
                return False
                
        return True


s = Solution()
print(s.isIsomorphic("ab", "ba"))