class Node:
    def __init__(self,val):
        self.val = val
        self.next = None

class mergeLists(object):
    def merge(self,head1, head2, a ,b):        
        current = head1
        previous = self.findA(current,a)
        current = head1
        nextVal = self.findB(current, b)
        endSecond = self.endhead2(head2)
        previous.next = head2
        endSecond.next = nextVal.next

        return head1
        
        

    def findA(self, current, a):
        prev = None
        count = 0
        while current != None:
            if count == a:
                return prev             
            prev = current
            current = current.next
            count += 1

    def findB(self, current, b):
        count = 0
        while current != None:
            if count == b:
                return current
            current = current.next
            count += 1

    def endhead2(self, head):
        current = head
        prev = None
        while current != None:
            prev = current
            current = current.next

        return prev

    def printLinkedList(self, head):
        current = head
        while current != None:
            print(current.val,sep =" ", end = " ")
            current = current.next                      

    

me = mergeLists()

head1 = Node(1)
head1.next = Node(2)
head1.next.next = Node(3)
head1.next.next.next = Node(4)
head1.next.next.next.next = Node(5)
me.printLinkedList(head1)


head2 = Node(10)
head2.next = Node(11)
head2.next.next = Node(12)
head2.next.next.next = Node(13)
me.printLinkedList(head2)


head = me.merge(head1,head2,2,3)
me.printLinkedList(head)


