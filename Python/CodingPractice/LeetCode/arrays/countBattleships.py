class Solution(object):

    def __init__(self):
        self.flag = []
        self.xIndex = [1, 0, -1, 0]
        self.yIndex = [0, 1, 0, -1]


    def countBattleships(self, board):
        """
        :type board: List[List[str]]
        :rtype: int
        """
        
        if len(board) == 0: 
            return 0        

        row_length = len(board)
        col_length = len(board[0])

        for i in range(row_length):
            for j in range(col_length):
                self.flag[i][j] = False

        result = 0
        for r in range(row_length):
            for c in range(col_length):
                if board[r][c] == 'X' and self.flag[r][c] != True:
                    result += 1
                    self.dfs(board, r, c)
                    
        return result
    
    def dfs(self, board, row, col):
        if row >= len(board) or row < 0 or col < 0 or col >= len(board[0]) or board[row][col] == '.' or self.flag[row][col] == True:
            return
        
        board[row][col] = True
        
        for i in range(len(self.xIndex)):
            r = row + self.xIndex[i]
            c = col + self.yIndex[i]
            self.dfs(board, r, c)



s = Solution()

input = [["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]]
count = s.countBattleships(input)
print(count)