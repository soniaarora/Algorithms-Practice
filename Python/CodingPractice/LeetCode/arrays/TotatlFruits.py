
class TotalFruits(object):
    def totalFruit(self, tree):
        """
        :type tree: List[int]
        :rtype: int
        """        
    
         
        map = {}
        maxCount = 0
        
      
        start = 0
        i = 0
        while i < len(tree):
            #print(map)
            #print(len(map))
           
            
            map[tree[i]] = i        
            
            if len(map) >  2:
                minIndex = min(map.values())
                del map[tree[minIndex]]
                start = minIndex + 1    

            maxCount = max(maxCount, i - start + 1) 
            i += 1  
        
        return maxCount
        
obj = TotalFruits()
print(obj.totalFruit([4,7,7,0,8,3,8,2,5]))