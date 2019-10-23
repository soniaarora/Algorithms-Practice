class Node:
    def __init__(self,val):
        self.val = val
        self.next = None

class Reverse(object):
    def reverse(self, head, m , n):

        current = head
        
        if current == None or current.next == None:
            return current
        # 1,2,3,4,5 ; 2, 4
        count = 1
        nodeBeforeRev = None

        while count + 1 <= m and current != None:
            nodeBeforeRev = current
            current = current.next
            count += 1

        tail = current    

        headRev, last = self.reverseBetween(current, count, n)

        if nodeBeforeRev != None:
            nodeBeforeRev.next = headRev
        else:
            head = headRev
        tail.next = last
        return head
    

    def reverseBetween(self, node, i, j):
        prev = None
        curr = node
        while i <= j:
            Next = curr.next
            curr.next = prev
            prev = curr
            curr = Next
            i += 1

        return prev, curr  

   
    def printLinkedList(self, head):
        current = head
        while current != None:
            print(current.val,sep =" ", end = " ")
            current = current.next 



obj = Reverse()
head = Node(1)
head.next = Node(2)
#head.next.next = Node(3)
#head.next.next.next = Node(4)
#head.next.next.next.next = Node(5)
obj.printLinkedList(head)
revHead = obj.reverse(head, 1, 1)
obj.printLinkedList(revHead)