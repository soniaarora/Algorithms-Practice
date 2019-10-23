class Solution(object):
    def sumSubarrayMins(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        mod = 10**9 + 7

        
        subArrays = self.findsubArrays(A)

        total = 0

        for arr in subArrays:
            total += min(arr)

        return total
        
        
        
    def findsubArrays(self, A):

        
        i = 0
        result = []
        while len(A) > 0:
            tempList = list(A)
            for k in range(len(tempList)):
                newList = list(tempList)
                result.append(newList)
                tempList.pop(0)
                
            
            A.pop(len(A) - 1)
        return result
            

        
        
            
                    
            
input = Solution()

arr = [3, 1, 2, 4]
print(input.sumSubarrayMins(arr))