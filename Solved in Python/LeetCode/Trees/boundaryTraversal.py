class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None


class Solution(object):
    def __init__(self):
        self.result = []
    def boundaryTraversal(self, root):
        self.result.append(root.val)
        self.printLeftTree(root.left)

        self.printLeaves(root.left)
        self.printLeaves(root.right)

        self.printRightTree(root.right)

        return self.result

    def printLeftTree(self, root):

        if root:
            if root.left:
                self.result.append(root.val)
                self.printLeftTree(root.left)
            elif root.right:
                self.result.append(root.val)
                self.printLeftTree(root.right)

    def printLeaves(self, root):
        if root == None:
            return root
        
        self.printLeaves(root.left)

        if root.left is None and root.right is None:
            self.result.append(root.val)

        self.printLeaves(root.right)


    def printRightTree(self, root):
        if root:
            if root.right:
                self.printRightTree(root.right)
                self.result.append(root.val)
            elif root.left:
                self.printLeftTree(root.left)
                self.result.append(root.data)

s = Solution()
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

print(s.boundaryTraversal(root))