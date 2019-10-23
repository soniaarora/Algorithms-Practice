import math
def connectedSum(n, edges):
    # Write your code here
    graph = {}
    visited = set()
    for element in edges:
        val1, val2 = element[0], element[1]
        if val1 not in graph:
            graph[val1] = [val2]
            
        else:
            # temp = graph[val1]
            # temp.append(val2)
            # graph[val1] = 
            graph[val1].append(val2)
        if val2 not in graph:
            graph[val2] = [val1]
            
        else:
            # temp = graph[val1]
            # temp.append(val2)
            # graph[val1] = 
            graph[val2].append(val1)
    totalSum = 0
    for i in range(1, n +1):
        if i not in graph:
            totalSum += 1
        else:
            if i not in visited:
                count = bfs(i, graph, visited)
                # print(i)
                # print(count)
                totalSum  += math.ceil(math.sqrt(count))
    return totalSum


def bfs(node, graph, visited):

    queue = []
    queue.append(node)
    visited.add(node)
    count = 0

    while len(queue) > 0:
        tempNode = queue.pop(0)
        count += 1   
        neighbors = graph[tempNode]

        for n in neighbors:
            if n not in visited:
                visited.add(n)
                queue.append(n)

    return count

print(connectedSum(8 , [[8, 1], [5,8], [7,3], [8,6]]))