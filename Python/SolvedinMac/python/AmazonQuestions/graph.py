def criticalConnection(numOfWarehouses, numOfRoads, roads):
    # WRITE YOUR CODE HERE
    result = []
    g = Graph(numOfWarehouses) 
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
            
        
class Graph: 
  
    def __init__(self, V): 
        self.V = V  
        self.adj = [[] for i in range(V)] 
      
    def addEdge(self, u, v): 
        self.adj[u].append(v)  
        self.adj[v].append(u) 
      
    def DFS(self, v, visited): 
     
        visited[v] = True
      
        i = 0
        while i != len(self.adj[v]): 
            if (not visited[self.adj[v][i]]):  
                self.DFS(self.adj[v][i], visited) 
            i += 1
            
    def isCritical(self, u, v):
        indexU = self.adj[v].index(u)
        indexV = self.adj[u].index(v)
        del self.adj[u][indexV]
        del self.adj[v][indexU]
        
        result = self.isConnected()
        self.addEdge(u, v)
        
        return result == False
    
    def isConnected(self): 
        visited = [False] * self.V 
      
        self.DFS(0, visited)  
      
        for i in range(1, self.V): 
            if (visited[i] == False):  
                return False
      
        return True



if __name__ == '__main__':
    tree = [[1,2],[2, 3], [3, 4], [4, 5], [6, 3]]

    criticalConnection(6, 5, tree)