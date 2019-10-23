class CourseSchedule(object):
    def findOrder(self, numCourses, prerequisites):
        visited = [False for x in range(numCourses)]
        preMap = {}
        for val in prerequisites:
            key = val[1]
            value = val[0]
            if key in preMap:

                preMap[key].append(value)
            else:
                preMap[key] = [value]


        stackOutput = []
        currentStack = set()

        for i in range(numCourses):
            if not visited[i]:                         
                result = self.dfs(i, preMap, visited, stackOutput, currentStack)
                if not result:
                    return []         

        result = []
        while len(stackOutput) > 0:
            result.append(stackOutput.pop())

        return result          


    def dfs(self,i, preMap, visited, stackOutput, currentStack):
        visited[i] = True
        currentStack.add(i)
        if i in preMap:
            neighbors = preMap[i]

            for n in neighbors:
                if n in currentStack:
                    return False
                if not visited[n]:                                      
                    result = self.dfs(n, preMap, visited, stackOutput, currentStack)
                    if not result:
                        return False 

        stackOutput.append(i)
        currentStack.remove(i)
        return True

ob = CourseSchedule()
print(ob.findOrder(4, [[1, 0], [2, 0], [3, 1], [0, 3], [3, 2]]))

        