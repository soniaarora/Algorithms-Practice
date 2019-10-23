from collections import defaultdict
def jungleBook(predators):
    map = makeMap(predators)
    queue = []
    queue.append(map[-1])
    totalCount = 0
    while len(queue) > 0:
        elements = queue.pop(0)
        if len(elements) > 0:
            totalCount += 1
        else:
            return totalCount
        newList = []
        for n in elements:
            if n in map:
                newList.extend(map[n])
        queue.append(newList)

def jungleBook1(predators):
    map = makeMap(predators)
    queue = []
    queue = queue + map[-1]
    totalCount = 0
    while len(queue) > 0:
        totalCount += 1
        size = len(queue)        
        while size > 0:
            ele = queue.pop(0)
            if ele in map:
                queue = queue + map[ele]
            size -= 1
    return totalCount
  
def makeMap(predators):
    map = defaultdict(list)
    for i, ele in enumerate(predators):
        map[ele].append(i)
    return map

    

# arr1 = [-1, 8, 6, 0, 7, 3, 8, 9, -1, 6]
arr2 = [1, -1, 3, -1]
# arr3 = [-1, 0, 1]
print(jungleBook1(arr2))