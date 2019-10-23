
from queue import Queue
class Node(object):
    self.val = None
    self.neighbors = None
    def __init__(self, val, neighbors):
        self.val = val
        self.neighbors = neighbors


class cloneGraph(object):
    def deepCopyBfs(self, node):
        clone = Node(node.val, [])
        q = Queue()
        q.put(node)

        visited = {}
        visited[node] = clone

        while not q.empty():
            removeNode = q.get()
            clonedVal = visited.get(removeNode)

            for n in removeNode.neighbors:
                if n not in visited:
                    visited[n] = Node(n.val, [])
                    q.put(n)
                clonedVal.neighbors.append(visited[n])

        return clone

    def deepCopyDfs(self, node):
        clone = Node(node.val, [])
        stack = []
        stack.append(node)

        visited = {}
        visited[node] = clone

        while len(stack) > 0:
            removeNode = stack.pop()
            clonedVal = visited.get(removeNode)

            for n in removeNode.neighbors:
                if n not in visited:
                    visited[n] = Node(n.val, [])
                    stack.append(n)
                clonedVal.neighbors.append(visited[n])

        return clone

    def deepCopyDfs1(self, node):
        cloneVal = Node(node.val, [])
        visited = {}
        visited[node] = cloneVal
        self.dfs(node, visited)
        return cloneVal
        

    def dfs(self, node, visited):
        clonedVal = visited.get(node)

        for n in node.neighbors:
            if n not in visited:
                visited[n] = Node(n.val, [])
                self.dfs(n , visited)
            clonedVal.neighbors.append(visited[n])
        return
            



        
    


                



        

