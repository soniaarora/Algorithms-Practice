#https://leetcode.com/problems/available-captures-for-rook/

class Solution(object):
    def numRookCaptures(self, board):
        """
        :type board: List[List[str]]
        :rtype: int
        """
        
        if len(board) == 0:
            return 0
        
        row = len(board)
        col = len(board[0])
        
        for r in range(row):
            for c in range(col):
                if board[r][c] == 'R':
                    count = self.findCount(r, c, row, col, board)
                    
        return count
    
    
        
    def findCount(self, r, c , row, col, board):
        count = 0
        
        xRows = [0, -1, 0, 1]
        yCols = [-1, 0, 1, 0]
        
        for i in range(len(xRows)):
            newX = r + xRows[i]
            newY = c + yCols[i]
            
            while newX >= 0 and newX < row and newY >=0 and newY < col and board[newX][newY] == '.':
                newX += xRows[i]
                newY += yCols[i]
                
            if newX < 0 or newX >= row or newY < 0 or newY >= col:
                continue
                
            if board[newX][newY] == 'p':
                
                count += 1
                
        return count


obj = Solution()
arr = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
print(obj.numRookCaptures(arr))
            