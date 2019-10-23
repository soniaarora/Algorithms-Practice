class Solution(object):
    def numMovesStones(self, a, b, c):
       
        maxNum = 0
        
       
        
        if a> b and a > c:        
               maxNum = a
        elif b > a and b > c:
            maxNum = b
        else:
            maxNum = c
        
        minNum = 0
        if a< b and a<c:
            minNum = a
        elif b <a and b <c:
            minNum = b
        else:
            minNum  = c
            
        mid = a+b+c -(maxNum+minNum)
        
        maxDistance = max(maxNum - (mid-1), mid + 1 - minNum)
        if maxDistance == 0:
            return [0, 0]
        elif maxDistance == 1:
            return [1, 1]
        
        return [1, maxDistance]
            
            