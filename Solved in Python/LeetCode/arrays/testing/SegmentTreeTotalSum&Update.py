class Node(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
        self.total = 0
        self.left = None
        self.right = None
        
class NumArray(object):

    def __init__(self, nums):
        """
        initialize your data structure here.
        :type nums: List[int]
        """
        #helper function to create the tree from input array
        def createTree(nums, l, r):
            
            #base case
            if l > r:
                return None
                
            #leaf node
            if l == r:
                n = Node(l, r)
                n.total = nums[l]
                return n
            
            mid = (l + r) // 2
            
            root = Node(l, r)
            
            #recursively build the Segment tree
            root.left = createTree(nums, l, mid)
            root.right = createTree(nums, mid+1, r)
            
            #Total stores the sum of all leaves under root
            #i.e. those elements lying between (start, end)
            root.total = root.left.total + root.right.total
                
            return root
        self.root = createTree(nums, 0, len(nums)-1)

    def update(self, i, val):
        """
        :type i: int
        :type val: int
        :rtype: None
        """
    
        def updateVal( root, i, val):
            
            if root.start == root.end:
                root.total = val
                return root
            
            
            mid = (root.start + root.end)// 2
            
            if i <= mid:
                updateVal(root.left, i, val)
                
            else:
                updateVal(root.right, i, val)
        
            root.total = root.left.total +root.right.total
            
            return root
        
        return updateVal(self.root, i, val)
    
    def sumRange(self, i, j):
        """
        :type i: int
        :type j: int
        :rtype: int
        """ 
    
        def rangeSum(root, i, j):
            
         
            if root.start == i and root.end == j:
                return root.total
            
            mid = (root.start + root.end) // 2
            
            if j <= mid:
                return rangeSum(root.left, i, j)
            
            elif i >= mid :
                return rangeSum(root.right, i, j)
            
            else:
                
                return rangeSum(root.left , i, mid) + rangeSum(root.right, mid + 1, j)
       
        return rangeSum(self.root, i, j)


["NumArray","sumRange","sumRange","sumRange","update","update","update","sumRange","update","sumRange","update"]
[[[0,9,5,7,3]],[4,4],[2,4],[3,3],[4,5],[1,7],[0,8],[1,2],[1,9],[4,4],[3,4]]
        