import copy
class Solution(object):
    
   
    def __init__(self):
        self.result = []    
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result =[]
        self.permuteHelper(nums, self.result, 0)
        return result
    
    def permuteHelper(self, nums, result, index):
        
        if index >= len(nums):

            newList = copy.deepcopy(nums)  
            
            self.result.append(newList)
            

            
        for i in range(index, len(nums)):
           
            nums[i], nums[index] = nums[index], nums[i]
            
            self.permuteHelper(nums, self.result, index + 1)
            # nums[i], nums[index] = nums[index], nums[i]

s = Solution()
result = s.permute([1,2,3])
print(result)
        