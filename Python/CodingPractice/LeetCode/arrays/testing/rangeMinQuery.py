class Node(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
        self.min = 0
        self.left = None
        self.right = None


class numQuery(object):
    def __init__(self, nums):


        def buildTree(nums, start, end):

            if start == end:
                node =  Node(start, end)
                node.min = nums[start]
                return node

            mid = start + (end - start)// 2

            root = Node(start, end)

            root.left = buildTree(nums, start, mid)
            root.right = buildTree(nums, mid +1, end)

            root.min = min(root.left.min, root.right.min)

            return root

        self.root = buildTree(nums, 0, len(nums) - 1)
        



    def minQuery(self, nums, i, j):

        return self.minQueryRange(self.root, i, j)


    def minQueryRange(self, root, i, j):

        if  i <= root.start and root.end <= j:
            return root.min
        
        elif  root.end < i or root.start > j:
            return float('inf')  

        mid = (root.end + root.start) // 2
      
        return min(self.minQueryRange(root.left, i, mid), self.minQueryRange(root.right, mid + 1 , j))
