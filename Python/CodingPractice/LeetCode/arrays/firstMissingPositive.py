#https://leetcode.com/problems/first-missing-positive/


class fistMissing(object):
    def missingPositive(self, nums):
        # if len(nums) == 0:
        #     return 1        
        # for i in range(1, len(nums)+1):            
        #         if i not in nums:
        #             return i
        # return i+1
        nums.append(0)
        n = len(nums)
        for i in range(len(nums)): #delete those useless elements
            if nums[i]<0 or nums[i]>=n:
                nums[i]=0
        for i in range(len(nums)): #use the index as the hash to record the frequency of each number
            nums[nums[i]%n]+=n
        for i in range(1,len(nums)):
            if nums[i]/n==0:
                return i
        return n





l = fistMissing()
arr = [1]

print(l.missingPositive(arr))