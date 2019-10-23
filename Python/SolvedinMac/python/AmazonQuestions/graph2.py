class Solution(object):
    def criticalConnection(self, numOfWarehouses, numOfRoads, roads):
        # WRITE YOUR CODE HERE
        result = []
        g = Graph1(numOfWarehouses) 
        for node in roads:
            u = node[0] 
            v = node[1]
            g.addEdge(u, v)  
        for road in roads:
            u = road[0]
            v = road[1]
            if g.isCritical(u, v):
                result.append([u, v])
        return result
            

class Graph1: 
  
    def __init__(self,V): 
        self.V = V  
        self.graph = {}
      
    def addEdge(self, u, v): 
        if u in self.graph:
            self.graph.get(u).append(v)
        else:
            self.graph[u] = [v]
            
        if v in self.graph:
            self.graph.get(v).append(u)
        else:
            self.graph[v] = [u]
      
    def DFS(self, v, visited): 
     
        visited.add(v)
      
        i = 0
        while i != len(self.graph[v]): 
            if (self.graph.get(v)[i] not in visited):  
                self.DFS(self.graph.get(v)[i], visited) 
            i += 1
            
    def isCritical(self, u, v):
        self.graph.get(u).remove(v)
        self.graph.get(v).remove(u)
        
        result = self.isConnected()
        self.addEdge(u, v)
        
        return result == False
    
    def isConnected(self): 
        visited = set() 
      
        self.DFS(list(self.graph.keys())[0], visited)  
        return len(visited) == self.V



# if __name__ == '__main__':
s = Solution()

#tree = [[1,2],[2, 3], [3, 4], [4, 5], [6, 3]]
tree = [[1,2], [1,3], [1, 4], [3, 4], [4, 5]]

print(s.criticalConnection(5, 5, tree))