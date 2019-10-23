class Solution(object):

    def find_treasure(self,t_map, row, col, curr_steps, min_steps):
        if row >= len(t_map) or row < 0 or col >= len(t_map[0]) or col < 0 or t_map[row][col] == 'D' or t_map[row][col] == '#':
            return None, min_steps

        if t_map[row][col] == 'X':
            curr_steps += 1
            if min_steps > curr_steps:
                min_steps = min(curr_steps, min_steps)

            return None, min_steps

        else:
            tmp = t_map[row][col]
            t_map[row][col] = '#'
            curr_steps += 1
            left = self.find_treasure(t_map, row, col-1, curr_steps, min_steps)
            right = self.find_treasure(t_map, row, col+1, curr_steps, min_steps)
            up = self.find_treasure(t_map, row-1, col, curr_steps, min_steps)
            down = self.find_treasure(t_map, row+1, col, curr_steps, min_steps)

            t_map[row][col] = tmp

            return curr_steps, min(left[1], right[1], up[1], down[1])

    # def __init__(self):
    #     self.ROWS = [1, -1, 0, 0]
    #     self.COLS = [0, 0, 1, -1]
    #     self.minCount = float('inf')
    # def countPaths(self, matrix):

    #     MaxRow = len(matrix)
    #     MaxCol = len(matrix[0])
    #     count = 0
    #     visited = set()

    #     self.dfs(matrix, 0, 0, MaxRow, MaxCol,  count, visited)
    #     return self.minCount

    # def dfs(self, matrix, row, col, MaxRow, MaxCol,  count):
    #     if row == MaxRow or col == MaxCol:
    #         return 

    #     if self.isSafe(matrix, row, col, MaxRow, MaxCol, visited):
    #         matrix[row][col] == '#'
            
    #         if matrix[row][col] == 'X':
    #             count += 1
    #             self.minCount = min(self.minCount, count)
    #             return 
            
    #         for x in range(len(self.ROWS)):
    #             row = row + self.ROWS[x]
    #             col = col + self.COLS[x]
    #             self.dfs(matrix, row, col, MaxRow, MaxCol, count, visited)
    #         # self.dfs(matrix, row + 1, col, MaxRow, MaxCol, count, visited)
    #         # self.dfs(matrix, row, col + 1, MaxRow, MaxCol, count, visited)
    #         # self.dfs(matrix, row - 1, col, MaxRow, MaxCol, count, visited)
    #         # self.dfs(matrix, row, col - 1, MaxRow, MaxCol, count, visited)



    # def isSafe(self, matrix, row, col, MaxRow, MaxCol):
    #     if (matrix[row][col] == 'O') and (row < MaxRow) and (row >= 0) and (col < MaxCol) and (col >= 0) and (matrix[row][col] != '#'):
    #         return True
        
    #     return False


s = Solution()

matrix = [['O', 'O', 'O', 'O'],['D', 'O', 'D', 'O'],['O', 'O', 'O', 'O'],['X', 'D', 'D', 'O']]
print(s.find_treasure(matrix, 0, 0, -1, float('inf'))[1])