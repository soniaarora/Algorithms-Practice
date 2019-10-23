class maxSubArray(object):
    def main(self):
        print(self.maxSubArray([4,-2,0,-1,2,7]))

    def maxSubArray(self, array):

        dp = []
        dp.append(array[0])
        
        maxVal = dp[0]

        for i in range(1,len(array)):
            val = array[i] + dp[i-1] if dp[i-1] > 0 else 0
            dp.append(val)
            maxVal = max(maxVal, dp[i])

        return maxVal

if __name__=="__main__":
    maxSubArray().main()