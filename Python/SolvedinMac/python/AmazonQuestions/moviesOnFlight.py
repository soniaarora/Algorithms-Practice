class Solution(object):
    def totalTime(self, times, d):
        minTime = d- 30

        times.sort()
        maxTime = float('-inf')
        l = 0
        r = len(times) - 1
        while l <= r:
            if times[l] + times[r] <= minTime:
                maxTime = max(maxTime, times[l] + times[r])
                
                i = l
                j = r
                l += 1
                

            else:
                r -= 1
           

        return [times[i], times[j]]







s = Solution()

times = [90, 85, 75, 60, 120, 150, 125]
print(s.totalTime(times, 250))


# 60, 75, 85, 90, 120, 125, 150