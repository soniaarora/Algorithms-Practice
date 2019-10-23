import heapq


class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None
class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        if lists == None or len(lists) == 0:
            return None
        heap = []
        heapq.heapify(heap)
        
        for v in lists:
            if v:
                heapq.heappush(heap, (v.val, v))
                
        head = ListNode(-1)
        curr = head
        
        while heap:
            val, node = heapq.heappop(heap)
            curr.next = node
            curr = curr.next
            
            if node.next:
                heapq.heappush(heap,(node.next.val, node.next))
                
        return head.next
    
s = Solution()

lists = []
head = ListNode(1)
head.next = ListNode(4)
head.next.next = ListNode(5)
lists.append(head)
new = ListNode(1)
new.next = ListNode(3)
new.next.next = ListNode(4)
lists.append(new)
f = ListNode(2)
f.next = ListNode(6)
lists.append(f)
for v in lists:
    print(v.val)
s.mergeKLists(lists)