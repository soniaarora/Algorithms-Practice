import heapq
import math

class Solution(object):
    def kClosest(self, points, K):
        """
        :type points: List[List[int]]
        :type K: int
        :rtype: List[List[int]]
        """
        heap = []
        heapq.heapify(heap)
        
        for x, y in points:
            dis = -math.sqrt(x*x + y * y)
           
            if len(heap) == K:
               
                heapq.heappushpop(heap, (dis, x, y))
                
            else:
                heapq.heappush(heap, (dis, x, y))
                
            
                
        return [(x, y) for dis, x, y in heap]


s = Solution()
points = [[1,3],[-2,2]]

print(s.kClosest(points, 1))
