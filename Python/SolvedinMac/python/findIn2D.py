class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        if matrix == None or len(matrix) == 0 or len(matrix[0]) == 0:
            
            return False
       
        
        lastElements = []
        rowLength = len(matrix[0])
        
        #append last elements in list
        for i in range(len(matrix)):
            lastElements.append(matrix[i][rowLength - 1])
            
        
        rowIndex = self.findIndex(lastElements,  target)
        
        if self.binarySearch(matrix[rowIndex], 0, rowLength - 1, target):
            return True
        else:
            return False   
    
    #find index from list
    def findIndex(self, row,  target):
        
        for i, ele in enumerate(row):
            if target <= ele or i == len(row) - 1:
                return i
            
    #find element using binary search
    def binarySearch(self, rowList, lo, hi, target):
        
        while lo <= hi:
            mid = lo +(hi - lo)//2
            
            if rowList[mid] == target:
                return True
            
            if target < rowList[mid]:
                hi = mid - 1
            
            else:
                lo = mid + 1
                
        return False
                

s = Solution()

matrix = [[1]]
print(s.searchMatrix(matrix, 2))