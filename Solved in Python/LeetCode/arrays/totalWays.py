class Solution(object):
    def change(self, amount, coins):
        """
        :type amount: int
        :type coins: List[int]
        :rtype: int
        """
        
        return self.findCount(coins, len(coins), amount )
    
    
    def findCount(self, coins, m , amount):
        
        if amount == 0:
            return 1
        
        if amount < 0:
            return False
        
        if m <= 0 and amount > 0:
            return False
        
        return self.findCount(coins, m -1, amount) + self.findCount( coins, m , amount - coins[m - 1])


s = Solution()

print(s.change(5, [1, 2, 5] ))