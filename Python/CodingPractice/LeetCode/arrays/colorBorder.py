class colorborder(object):
    
    def _init_(self):
        self.R
        self.C
        self.visited
        self.finalColor 
    def colorBorder(self, grid, r0, c0, color):
        self.R = len(grid)
        self.C = len(grid[0])
        self.finalColor = color
        self.visited = [[False for y in range(self.C)] for x in range(self.R)]
        
        self.dfs(grid, r0, c0, grid[r0][c0])

        for r in range(self.R):
            for c in range(self.C):
               if grid[r][c] < 0:
                   grid[r][c] = self.finalColor

        return grid

    def dfs(self,grid, r0, c0, targetColor):
        if r0 >= self.R or r0 < 0 or c0 >= self.C or c0 < 0:
            return 
        elif self.visited[r0][c0]:
            return
        elif grid[r0][c0] != targetColor:
            return

        self.visited[r0][c0] = True
        self.dfs(grid, r0, c0 - 1, targetColor)
        self.dfs(grid, r0 , c0 + 1, targetColor)
        self.dfs(grid, r0-1, c0, targetColor)
        self.dfs(grid, r0+1, c0, targetColor)

        if self.isborder(grid, r0, c0, targetColor):
            grid[r0][c0] = -grid[r0][c0]


    def isborder(self, grid, r0, c0, targetColor):
        if r0 == self.R - 1 or r0 == 0 or c0 == self.C - 1 or c0 == 0:
            return True

        left = grid[r0][c0-1]
        top = grid[r0-1][c0]
        right = grid[r0][c0 + 1]
        down = grid[r0 - 1][c0]

        if left != targetColor or top != targetColor or right != targetColor or down != targetColor:
            return True
        return False




ob = colorborder()
print(ob.colorBorder([[1,1],[1,2]], 0, 0, 3))