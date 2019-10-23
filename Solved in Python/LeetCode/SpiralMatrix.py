class SpiralMatrix(object):

    def main(self):
        print(self.spiralOrder([[1,2,3], [4, 5, 6],[7, 8, 9]]))
        

    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if matrix is None or len(matrix) == 0:
            return []
        
        result = []
        left = 0
        right = len(matrix[0]) - 1
        top = 0
        bottom = len(matrix) - 1
        
        while True:
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            
            top +=1
            if self.isOverlap(top, bottom, left, right):
                break
                
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
                
            right -=1
            
            if self.isOverlap(top, bottom, left, right):
                break
            
            for i in range(right, left - 1, -1):
                result.append(matrix[bottom][i])
                
            bottom -=1
            
            if self.isOverlap(top, bottom, left, right):
                break
                
            for i in range (bottom, top - 1, -1):
                result.append(matrix[i][left])
            
            left +=1
            
            if self.isOverlap(top, bottom, left, right):
                break
                
        return result                            
                
    def isOverlap(self, top, bottom, left, right):
        if left > right or bottom < top:
            return True
        
        return False
        
        
        