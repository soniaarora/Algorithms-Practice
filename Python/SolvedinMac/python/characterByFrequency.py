class Solution(object):
    def frequencySort(self, s):
        """
        :type s: str
        :rtype: str
        """
        heapDict = {}
        
        for i in s:
            if i in heapDict:
                heapDict[i] += 1
            else:
                heapDict[i] = 1
            
        items = sorted(heapDict.items(), key=lambda x: x[1], reverse=True)
            
        result = ''
        for value in range(len(items)):
            k, v = items[value]
            result += k*v

        return result

s = Solution()
print(s.frequencySort("tree"))