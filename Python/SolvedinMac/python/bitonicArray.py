class Solution(object):
    def findBitonicpoint(self, arr, n, l, r):
        mid = (l + r)//2
        if arr[mid] > arr[mid - 1] and arr[mid] > arr[mid +1]:
            return mid
        else:
            if arr[mid] > arr[mid - 1] and arr[mid] < arr[mid +1]:
                self.findBitonicpoint(arr, n, mid , r )
            elif arr[mid] < arr[mid - 1] and arr[mid] > arr[mid +1]:
                self.findBitonicpoint(arr, n, l, mid)
        return mid

    def searchAscending(self, arr, l, r, k):
        while l <= r:
            mid = (l + (r-l))//2
            if k == arr[mid]:
                return mid
            else:
                if k > arr[mid]:
                    l = mid +1
                else:
                    r = mid - 1
                    
        return -1

    def searchDescending(self, arr, l, r, k):
        while l <= r:
            mid = (l +(r-l))//2
            if k == arr[mid]:
                return mid
            else:
                if k > arr[mid]:
                    r = mid -1
                else:
                    l = mid +1

        return -1

    def searchBitonic(self, arr, n, index, key):
        if key > arr[index]:
            return -1
        elif key == arr[index]:
            return index
        else:
            temp = self.searchAscending(arr, 0, index - 1, key)
            if temp != -1:
                return temp
            
            return self.searchDescending(arr, index + 1, n -1, key)
        


s = Solution()
arr = [-8, 1, 2, 3, 4, 5, -2, -3]
key = 1
index = s.findBitonicpoint(arr, len(arr), 0, len(arr) -1)
print(s.searchBitonic(arr, len(arr), index, key ))