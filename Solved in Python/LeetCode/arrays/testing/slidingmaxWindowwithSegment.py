class Node(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
        self.total = 0
        self.left = None
        self.right = None
        
class Solution(object):
    def __init__(self):
        self.root = None
        
    def maxSlidingWindow(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        self.root = self.constructTree(nums, 0, len(nums) - 1)
        result = []
        
        for i in range(0,len(nums) - (k - 1)):
            result.append(self.suminRange(self.root, i, i + (k - 1)))
                          
        return result
        
        
        
    def constructTree(self, nums, start, end):
        if start == end:
            n = Node(start, end)
            n.total = nums[start]
            return n
        
        mid = start + (end - start) // 2
        
        root = Node(start, end)
        
        root.left = self.constructTree(nums, start, mid)
        root.right = self.constructTree(nums, mid + 1, end)
        
        root.total = root.left.total + root.right.total
        
        return root
    
    
    def suminRange(self, root,  i, j):
        if i <= root.start and j >= root.end:
            return root.total
                          
        mid = (root.start + root.end) // 2
        
        if i >= mid + 1:
            return self.suminRange(root.right, mid + 1, end, i, j)
                          
        elif j <= mid:
            return self.suminRange(root.left, start, mid, i, j)
                          
        else:
            return self.suminRange(root.left, start, mid ) + self.suminRange(root.right, mid + 1, end)
                          
                          


