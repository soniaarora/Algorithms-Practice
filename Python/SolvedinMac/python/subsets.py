import copy
class Solution(object):
   
    
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        result = []
        self.backtrack(result, [], nums, 0)
        
        return self.result

    def backtrack(self, result, tempR, nums,  pos):
        tempL = copy.deepcopy(tempR)
        result.append(tempL)

        for j in range(pos, len(tempR)):
            tempR.append(nums[j])
            self.backtrack(result, tempR, nums, j+1)
            del tempR[len(tempL) - 1]
        # if len(nums) == 0:
        #     numList = copy.deepcopy(tempR)
        #     self.result.append(numList)
        # else:
        #     v = nums[0]
        #     nums.pop(0)   

        #     if v == None:
        #         self.subListHelper(nums, self.result, tempR )

        #     else: 
        #         tempR.append(v)
        #         self.subListHelper(nums, self.result, tempR)
        #         # tempR.remove(len(tempR) - 1)
        #         del tempR[len(tempR) - 1]
        #         nums.insert(0, v) 
        
           

s = Solution()
results = s.subsets([1,2,3])





# class Solution {
#     public List<List<Integer>> subsets(int[] nums) 
#     {
#         List<List<Integer>> list = new ArrayList<>();
#         Arrays.sort(nums);
#         backtrack(list, new ArrayList<>(), nums, 0);
        
#         return list;
            
        
#     }
    
#  public static void backtrack(List<List<Integer>> list, List<Integer> new_list, int[] nums, int pos)
#  {
#      list.add(new ArrayList<>(new_list));
#      for(int j = pos; j < nums.length ; j++)
#      {
#          new_list.add(nums[j]);
#          backtrack(list, new_list, nums, j+1);
#          new_list.remove(new_list.size() - 1);
#      }
#  }
# }


