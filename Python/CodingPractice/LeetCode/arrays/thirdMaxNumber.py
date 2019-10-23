
from queue import PriorityQueue
class maxNumber(object):
    
    def thirdMax(self, nums):
        pq = PriorityQueue()
        st = set()

        if len(nums) == 0:
            return nums[0]

        j = 0

        while (j < len(nums)) and (pq.qsize() < 3):
            if nums[j] not in st:
                pq.put(nums[j])
                st.add(nums[j])
            j += 1
                 
        for i in range(j, len(nums)):
            temp = pq.get()
            if nums[i] > temp and nums[i] not in st:                
                pq.put(nums[i])
                st.add(nums[i])
            else:
                pq.put(temp)

        if pq.qsize() < 3:
            while pq.qsize() > 1:
                pq.get()
       
        return pq.get()