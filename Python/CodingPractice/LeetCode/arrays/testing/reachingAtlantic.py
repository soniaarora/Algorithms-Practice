class Solution(object):
    def pacificAtlantic(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[List[int]]
        """
        
        if matrix == None or len(matrix) == 0:
            return [[]]
        
        M = len(matrix)
        N = len(matrix[0])
        visitedP = [[False] *N for _ in range(M)]
        visitedA = [[False] * N for _ in range(M)]
       
        # for x in range(M):
        #    visited[x][M -1] = True      
        # for y in range(N):
        #     visited[N-1][y] = True
        
        for m in range(M):
            self.dfs(matrix, m, 0, visitedP )
            self.dfs(matrix, m, N - 1, visitedA)

        for n in range(N):
            self.dfs(matrix, 0, n, visitedP)
            self.dfs(matrix, M - 1, n, visitedA )
    

        # print(visited)
        res = []
        for i in range(M):
            for j in range(N):
                if visitedP[i][j] and visitedA[i][j]:
                    res.append([i,j])


    def dfs(self, matrix, r, c, visited):
        xRows, yCols = [1, 0, -1, 0], [0, 1, 0, -1]
        # if r == len(matrix) - 3 and c == len(matrix[0]) - 3:
        #     return True

        visited[r][c] = True
        for x in range(len(xRows)):
          
            newR = r + xRows[x]
            newC = c + yCols[x]
            
            if newR < 0 or newR >= len(matrix) or newC < 0 or newC >= len(matrix[0]) or visited[newR][newC] or matrix[newR][newC] < matrix[r][c]:
                continue
            self.dfs(matrix, newR, newC, visited)
                
        
    def isValid(self, matrix, row, col, visited):
        
        return row >=0 and row < len(matrix) - 1 and col >= 0 and col <= len(matrix[0]) - 1 and visited[row][col]


s = Solution()

matrix = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]

s.pacificAtlantic(matrix)