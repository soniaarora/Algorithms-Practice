class Solutioon(object):
    def minSizesubArray(self, arr, target):
        if len(arr) == 0:
            return 0
        

        i = 0 
        j = 0
        minimum = float('inf')

        sum = 0

        while i < len(arr): 

            sum += arr[i]
            i += 1

            while sum >= target:
                minimum = min(minimum, i - j)
                sum -= arr[j]
                j += 1
      
        if minimum == float('inf'):
            return 0
        else:
            return minimum
    
s= Solutioon()

print(s.minSizesubArray([4, 1, 3, 2], 6))
