import heapq

class Solution:
    def kthSmallest(self, matrix , k):
        
        
        heap = []
        heapq.heapify(heap)
        
        for i in range(len(matrix[0])):
            heapq.heappush(heap, [matrix[0][i], 0, i])
            
        while k > 0:
            
            val, i, j = heapq.heappop(heap)
            if i == len(matrix) - 1:
                
                heapq.heappush(heap, [float('inf'), i, j])
            else:
                heapq.heappush(heap, [matrix[i + 1][j], i+1, j])
            k -= 1
                
        # res, row, col = heapq.heappop(heap)
        
        return val


s = Solution()

matrix = [
   [ 1,  5,  9],
   [10, 11, 13],
   [12, 13, 15]
]
k = 8

print(s.kthSmallest(matrix, k))