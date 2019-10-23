class Solution(object):
    def coinChange(self, coins, amount):
        """
        :type coins: List[int]
        :type amount: int
        :rtype: int
        """
        
        if amount == 0 or len(coins) == 0:
            return 0
        
    
        tempArray = [float('inf') - 1 ] * (amount + 1)
        
        
        tempArray[0] = 0
        
        for coin in coins:
         
            for j in range(1, len(tempArray)):
                
                if j - coin >= 0:
               
                    tempArray[j] = min(tempArray[j], tempArray[j - coin] + 1)
        # print(tempArray)
                    
        return tempArray[-1]


s = Solution()

print(s.coinChange([1, 2, 5], 11))