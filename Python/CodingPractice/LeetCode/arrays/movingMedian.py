class MedianFinder(object):
   
    def __init__(self):
        """
        initialize your data structure here.
        """
        
        self.numList = []
        

    def addNum(self, num):
        """
        :type num: int
        :rtype: None
        """
        
        if self.numList == []:
            self.numList.append(num)
            return
        
        start, end = 0, len(self.numList) - 1
        
        while start <= end:
            mid = start + (end - start) // 2
           
            if num > self.numList[mid]:
                start = mid + 1
            elif num < self.numList[mid]:
                end = mid - 1
            else:
                start = mid
                break
                
        self.numList.insert(start, num)
       
        
        

    def findMedian(self):
        """
        :rtype: float
        """
        totalLength = len(self.numList)
        print(self.numList)
        
        if totalLength % 2 == 0:
            median =(self.numList[totalLength // 2] +  self.numList[(totalLength - 1 )// 2]) / 2
        else:
            median = self.numList[totalLength // 2]
            
        return median



s= MedianFinder()

s.addNum(0)
s.addNum(0)
print(s.findMedian())
# s.addNum(3)
# print(s.findMedian())
