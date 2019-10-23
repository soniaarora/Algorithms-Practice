
from queue import Queue
class biPartite(object):
    def biPartite(self, arr):
        q = Queue()

        
        color = [0 for x in range(len(arr))]
    
        for index in range(0, len(arr)):
            if color[index] == 0:
                q.put(index)
                color[index] = 1
                while not q.empty():
                    val = q.get()
                    data = arr[val]
                    for n in data:
                        if color[n] == 0:
                            q.put(n)
                            color[n] = 3 - color[val]
                        elif color[val] == color[n]:
                            return False

        return True                      


inp = biPartite()
print(inp.biPartite([[1, 3], [0, 2], [1, 3], [0, 2]]))