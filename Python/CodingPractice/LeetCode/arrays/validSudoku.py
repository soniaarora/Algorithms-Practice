class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        
        
        for i in range(9):
            rows = set()
            columns = set()
            grid = set()
            for j in range(9):
                if board[i][j] is not '.':
                    if board[i][j] not in rows:
                        rows.add(board[i][j])
                    else:
                        return False
                if board[j][i] is not '.':
                    if board[j][i] not in columns:
                        columns.add(board[j][i])
                    else:

                        return False
                
                rowIndex = 3 * (i//3)
                colIndex = 3 * (i % 3)
                
                if board[rowIndex +j//3 ][colIndex + j % 3] is not '.':
                    if board[rowIndex +j//3 ][colIndex + j % 3] not in grid:
                        grid.add(board[rowIndex +j//3 ][colIndex + j % 3])
                    else:
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

print(s.isValidSudoku(board))
                
                
                    