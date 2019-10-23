import copy
import sys
class Solution(object):
    def colorBorder(self, grid, r0, c0, color):
        sys.setrecursionlimit(10000)
        rowLength = len(grid)
        colLength = len(grid[0])
        
        
        visited = [[False for y in range(colLength)] for x in range(rowLength)] 
        
        result = copy.deepcopy(grid)

        visited[r0][c0] = True
        self.dfs(grid, r0, c0, visited, grid[r0][c0], color, result)
        
        return result
                
    def dfs(self, grid, r, c, visited, color, newColor, result):
        xDir = [0, -1, 0, 1]
        yDir = [-1, 0, 1, 0]
        
        setColor = False 
        for d in range(0,4):
            newX = r + xDir[d]
            newY = c + yDir[d]
            valid = self.isValid(newX, newY, color, newColor, grid)
            
            if not valid:
                setColor = True

            if valid and (visited[newX][newY] == False):
                visited[newX][newY] = True
                self.dfs(grid, newX, newY, visited, color, newColor, result)
                           
        if setColor:
            result[r][c] = newColor
            
             
    def isValid(self, r , c, color, newColor, grid):                
        return ( r>= 0 and r < len(grid)) and (c >= 0 and c < len(grid[0])) and (grid[r][c] == color)   

if __name__=="__main__":
    print(Solution().colorBorder([[1,2,2],[2,3,2]], 0, 1, 3))