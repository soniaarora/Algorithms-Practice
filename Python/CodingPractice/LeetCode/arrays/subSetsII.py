
#https://leetcode.com/problems/subsets-ii/ 
import copy
class subSets(object):
    def findSubsets(self, arr):
        arr.sort()
        result = []
        result.append([])
        result.append([])
        result[1].append(arr[0])

        prev  = 1

        for i in range(1, len(arr)):
            size = len(result)
            if arr[i] != arr[i-1]:
                prev = size
            for j in range(size - prev, size):
                listt = list(result[j])
                listt.append(arr[i])
                result.append(listt)

        return result

ob = subSets()
print(ob.findSubsets([3, 2, 1, 2]))