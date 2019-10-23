class Node:
    def __init__(self,val):
        self.val = val
        self.next = None

class mergeLists(object):
        def mergeSort(self, arr): 
            if len(arr) >1: 
                mid = len(arr)//2 #Finding the mid of the array 
                L = arr[:mid] # Dividing the array elements  
                R = arr[mid:] # into 2 halves 

                l = self.mergeSort(L) # Sorting the first half 
                r = self.mergeSort(R) # Sorting the second half 

                return self.merge(l, r, arr)

        def merge(self, L, R, arr):
            i = j = k = 0
                    
            # Copy data to temp arrays L[] and R[] 
            while i < len(L) and j < len(R): 
                if L[i] < R[j]: 
                    arr[k] = L[i] 
                    i+=1
                else: 
                    arr[k] = R[j] 
                    j+=1
                k+=1
                
            # Checking if any element was left 
            while i < len(L): 
                arr[k] = L[i] 
                i+=1
                k+=1
                
            while j < len(R): 
                arr[k] = R[j] 
                j+=1
                k+=1    

# Code to print the list 
def printList(arr): 
    for i in range(len(arr)):         
        print(arr[i],end=" ") 
    print() 

me = mergeLists()

arr = [4, 3, 0, 1]

print(me.mergeSort(arr))

