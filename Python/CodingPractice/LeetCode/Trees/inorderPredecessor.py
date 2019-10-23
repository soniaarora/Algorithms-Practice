class Node(object):
   
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None









root = Node(10)
root.left = Node(5)
root.right = Node(15)
root.left.left = Node(1)
root.left.right = Node(7)
root.left.right.left = Node(6)
root.left.right.right = Node(9)
root.right.right = Node(19)
root.right.left = Node(13)
root.right.left.right = Node(14)
root.right.left.left = Node(12)

s = Solution()
print(s.inorderSuccDes(root, root.right.right).val)