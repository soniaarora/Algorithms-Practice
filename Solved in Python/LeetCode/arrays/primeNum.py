class Prime(object):
    def primeNum(self, n):
        count = 0
        res =  [False for i in range(n)] 
        for i in range(2, n):
            if res[i] == False:
                count += 1

            for j in range(i, n, i):                
                    res[j] = True

        return count


        
            
obj= Prime()
print(obj.primeNum(4335))
