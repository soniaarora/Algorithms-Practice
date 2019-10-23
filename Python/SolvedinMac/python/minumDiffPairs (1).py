class Solution(object):
    def minDiffPairs(self, n, arr):
        arr.sort()
        minDiff = self.findMinDiff(arr, n)

        result = self.uniquePairs(arr, minDiff, n)

        for i in result:
            print(i[0], ' ', i[1])


    def findMinDiff(self, arr, n):  
        diff = float('inf')  
        

        for i in range(n - 1):
            if arr[i + 1] - arr[i] <= diff:
                diff = arr[i + 1] - arr[i]

        return diff

    def uniquePairs(self, arr, k, n):

        result = []
        l = 0
        r = 0

        while r < n:
            if arr[r] - arr[l] == k:
                result.append([arr[l], arr[r]])
                l += 1
                r += 1
                

            elif arr[r] - arr[l] > k:
                l +=1
            else:
                r += 1
        return result


s = Solution()
a = [4, -2, -1, 3]
s.minDiffPairs(len(a), a)

        
                
            
