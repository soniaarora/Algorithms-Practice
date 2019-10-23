from queue import Queue

class MovingAverage(object):
    windowSize = 0
    currentSum = 0
    #q = Queue()
    def __init__(self, size):
        self.windowSize = size
        self.q = Queue(maxsize = size)

    def next(self,val):
        removeElement = 0
        if self.q.qsize() == self.windowSize:
            removeElement = self.q.get()
        self.q.put(val)
        self.currentSum = self.currentSum + val - removeElement
        return self.currentSum//self.q.qsize()


m = MovingAverage(3)
print(m.next(3))
print(m.next(2))
print(m.next(10))
print(m.next(1))


        