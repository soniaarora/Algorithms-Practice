class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if prices == None or len(prices) == 0:
            return 0
        
        
        leftmaxProfit = []
        minPrice = prices[0]  # 3, 3, 3, 0, 0, 0, 0, 0 
        leftmaxProfit.insert(0, 0)  
        
        for i in range(1, len(prices)):
            if prices[i] < minPrice:
                minPrice = prices[i]
            print(leftmaxProfit[i-1])
            leftmaxProfit.insert(i, max(leftmaxProfit[i-1], prices[i] - minPrice) ) 
            
        
        rightMax = prices[len(prices) - 1] # 4, 4
        rightMaxProfit = 0                  # 0, 3
        totalProfit = prices[len(prices) - 1]    # 4, 
        for i in range(len(prices) - 2, 0, -1):
            if prices[i] > rightMax:
                rightMax = prices[i]
                
            rightMaxProfit = max(rightMaxProfit, rightMax - prices[i])
            totalProfit = max(totalProfit, leftmaxProfit[i-1] + rightMaxProfit)
            
        return totalProfit
        

s = Solution()
print(s.maxProfit([3,3,5,0,0,3,1,4]))               