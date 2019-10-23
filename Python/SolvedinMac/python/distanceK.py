import queue
# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    
    mapParent = dict()
        
    def distanceK(self, root, target, K):
        """
        :type root: TreeNode
        :type target: TreeNode
        :type K: int
        :rtype: List[int]
        """
        head =root
        
        
        
        mapParent = self.getMap(head, target)
        
        
        result = self.getValues(head, target, K)
        
        return result
        
        
    def getValues(self, head, target, K):
        
        q = queue()
        visited = set()
        q.put(target)
        visited.add(target)
        
        while not q.empty and K > 0:
            node = q.get()
                  
            if (node.left != None) and (node.left not in visited):
                q.put(node.left)
                visited.add(node.left)
                  
            if (node.right != None) and (node.left not in visited):
                  q.put(node.right)
                  
            parent = self.mapParent[node]
            
            if parent not in visited:
                  q.put(parent)
                  
            K -= 1
        res = self.getListofQueue(q)
                  
        return res
                  
    
    def getListofQueue(self, q):
        result = []
                  
        while not q.empty():
            node = q.get()
            result.append(node.val)
        return result       
        
        
    def getMap(self, head, target):
        que= queue()
        que.put(head)
        mappingParent = dict()
        
        while not que.empty():
            
            size = que.qsize()
            
            while size > 0:
                node = que.get()
                
                if node.left != None:
                    mappingParent[node.left] = node
                    que.put(node.left)
                
                if node.right != None:
                    mappingParent[node.right] = node
                    que.put(node.right)
                    
                    
                size -= 1
                  
        return mappingParent


s = Solution()
head = TreeNode(3)
head.left = TreeNode(5)
head.right = TreeNode(1)
head.left.left = TreeNode(6)
head.left.right = TreeNode(2)
head.right.left = TreeNode(0)
head.right.right = TreeNode(8)
head.left.right.left = TreeNode(7)
head.left.right.right = TreeNode(4)

print(s.distanceK(head, head.left, 2))