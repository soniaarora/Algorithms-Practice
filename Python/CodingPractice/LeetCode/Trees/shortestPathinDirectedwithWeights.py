from collections import defaultdict 
  
class Graph: 
    def __init__(self,vertices): 
  
        self.V = vertices 
        self.graph = defaultdict(list) 
  
    
    def addEdge(self,u,v,w): 
        self.graph[u].append((v,w)) 
  
  
    # A recursive function used by shortestPath 
    def topologicalSortUtil(self,v,visited,stack): 
  
        
        visited[v] = True
  
        if v in self.graph.keys(): 
            for node,weight in self.graph[v]: 
                if visited[node] == False: 
                    self.topologicalSortUtil(node,visited,stack) 
  
        
        stack.append(v) 
  

    def shortestPath(self, s): 
  
        # Mark all the vertices as not visited 
        visited = [False]*self.V 
        stack =[] 
  
        # Call the recursive helper function to store Topological 
        # Sort starting from source vertice 
        for i in range(self.V): 
            if visited[i] == False: 
                self.topologicalSortUtil(s,visited,stack) 
  
        # Initialize distances to all vertices as infinite and 
        # distance to source as 0 
        dist = [float("Inf")] * (self.V) 
        dist[s] = 0
  
        # Process vertices in topological order 
        while stack: 
  
           ]
            i = stack.pop() 
  
            
            for node,weight in self.graph[i]: 
                if dist[node] > dist[i] + weight: 
                    dist[node] = dist[i] + weight 
  
        # Print the calculated shortest distances 
        for i in range(self.V): 
            print ("%d" %dist[i]) if dist[i] != float("Inf") else  "Inf" , 
  