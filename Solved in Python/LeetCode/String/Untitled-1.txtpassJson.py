class Solution(object):
    def passJson(self,input, key):
  
        minValue = float('inf')
        minRow = -1

        map
        for i, inp in enumerate(input):
            value = self.minByColumn(inp, key)
            minValue, minRow  = self.findMinValue(minValue, value)
            elif minValue == value:
                for Key in inp:
                    if Key != key:
                        self.findMinValue(inp[i+1:], Key)
                        for j in range(i+1, len(input)):

                    


        return input[minRow]

    def minByColumn(self, dictt, key ):
        if key not in dictt:
            return 0

        return dictt[key]

    def findMinimums(self, inp,key ):
        for i , inp in enumerate(inp):
            value = self.minByColumn(inp, key)
            minValue, minRow  = self.findMinValue(minValue, value)


    
    def findMinValue(self, value, minValue):
        if minValue > value:
                minValue = value
                minRow = i

        return minValue, minRow



#want to creae common method which        

s = Solution()

# input = [ {"a": 1, "b": 0, "c": 0, "d": 0},{"a": 0, "b": 2, "c": 3, "d": 0},{"a": 0, "b": 0, "c": 0, "d": 4} ]
#input = [{"a": 1, "b": 2},{"a": 3}]
input = [ {"a": 1, "b": -2}, {"a": 3}]
print(s.passJson(input, "b"))

