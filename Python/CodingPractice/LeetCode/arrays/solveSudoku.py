class Solution(object):
    
    def solveSudoku(self, board):
        self.board = board
        self.solve()
        print(self.board)

    def unAssigned(self):
        for i in range(9):
            for j in range(9): 
                if self.board[i][j] == ".":
                    return i, j

        return -1, -1
    def solve(self):
        row, col = self.unAssigned()

        if row == -1 and col ==-1:
            return True
        listt =["1", "2", "3", "4", "5", "6", "7", "8", "9"]
        for num in listt:
            if self.isSafe(row, col, num):
                self.board[row][col] = num
                if self.solve():
                    return True
                self.board[row][col] = "."
        return False            


    def isSafe(self, row, col, ch):
        boxRow = row - row % 3
        boxCol = col - col % 3

        if self.checkRow(row, ch) and self.checkCol(col, ch) and self.checkGrid(boxRow, boxCol, ch):

            return True

        return False

    def checkRow(self, row, ch):
        for c in range(9):
            if self.board[row][c] == ch:
                return False

        return True

    def checkCol(self, col, ch):
        for r in range(9):
            if self.board[r][col] == ch:
                return False
        return True

    def checkGrid(self, row, col, ch):
        for r in range(row , row +3):
            for c in range(col , col + 3):
                if self.board[r][c] == ch:
                    return False
        return True
        


s = Solution()


board= [
  ["8","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","7",".",".",".",".","6","."],
  ["3",".",".",".","6",".",".",".","4"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]


s.solveSudoku(board)

