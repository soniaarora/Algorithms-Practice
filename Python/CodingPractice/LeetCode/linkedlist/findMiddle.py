class Node:
    def __init__(self,val):
        self.val = val
        self.next = None


class findMiddle:
    def __init__(self):
        self.head = None

    def push(self, new_data):
        newNode = Node(new_data)
        newNode.next = self.head
        self.head = newNode

    def findMiddle(self):
        slowptr = self.head
        fastptr = self.head

        while fastptr != None and fastptr.next != None:
            fastptr = fastptr.next.next
            slowptr = slowptr.next
            

        return slowptr.val







listt = findMiddle()
listt.push(20)
listt.push(10)
listt.push(3)
listt.push(14)
listt.push(5)

print(listt.findMiddle())





    