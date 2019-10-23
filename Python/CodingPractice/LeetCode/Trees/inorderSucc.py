class Node(object):
   
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None


class Solution(object):
    def inorderSucc(self, root, target):
        if root == None:
            return None

        current = root
        next = None
        while(current != None and current.val != target.val):
            if current.val > target.val:
                next = current
                current = current.left
            else:
                current = current.right

        if current == None:
            return None
        if current.right == None:
            return next
        if current.right != None:
            current = current.right
        
        while current.left != None:
            current = current.left
        return current.val

    prev = None
    def inorderSuccDes(self, root, target):
        if not root:
            return None
        
        right = self.inorderSuccDes(root.right, target)
        if right != None:
            return right
        if root.val == target.val:
            return self.prev
        self.prev = root
      
        left = self.inorderSuccDes(root.left, target)
        if left != None:
            return left

        



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


