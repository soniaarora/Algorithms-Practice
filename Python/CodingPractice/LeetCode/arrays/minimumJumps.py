def minJumps(nums):

    if len(nums) == 0:
        return 0

    cache = [float('inf')] * len(nums)
    
    cache[0] = 0

    for i in range(1, len(nums)):
        for j in range(i):
            if i - j <= nums[j]:
                cache[i] = min(cache[i], cache[j] + 1)

    return cache[-1]



print(minJumps([2,3, 1, 1, 4]))