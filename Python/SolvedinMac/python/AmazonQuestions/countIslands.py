class Solution(object):
    
    def __init__(self):
            self.rows = [1, 0, -1, 0]
            self.columns = [0, 1, 0, -1]
            
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        
        if len(grid) == 0:
            return 0
        
        visited = [[False] * len(grid[0]) for i in range(len(grid)) ]
        
        count = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                
                if grid[i][j] == '1' and visited[i][j] == False:
                    self.DFS(grid, i, j, len(grid), len(grid[0]), visited)
                    count += 1
                    
                    
        return count

    def DFS(self, grid, row, col, totalRow, totalCol, visited):
        visited[row][col] = True
        for i in range(len(self.rows)):
           
            newRow = row + self.rows[i]
            newCol = col + self.columns[i]
            if self.isSafe(grid, newRow, newCol, totalRow, totalCol, visited):

                self.DFS(grid, newRow, newCol, totalRow, totalCol, visited)
            
            
    def isSafe(self, grid, row, col, totalRow, totalCol, visited):
        
        return (row >= 0) and (col >= 0) and (row < totalRow) and (col < totalCol) and (grid[row][col] == '1') and (not visited[row][col])
        
      
s = Solution()

grid = [["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]

print(s.numIslands(grid))