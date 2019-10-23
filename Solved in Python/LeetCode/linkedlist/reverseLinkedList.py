from sys import stdout

class Node:
    def __init__(self,val):
        self.val = val
        self.next = None

class reverseLinkedList:
    def __init__(self):
        self.head = None

    def push(self, new_data):
        newNode = Node(new_data)
        newNode.next = self.head
        self.head = newNode
  

    def reverselinkedList(self):
        current = self.head
        prev = None
        while current != None:
            nextValue = current.next
            current.next = prev
            prev = current
            current = nextValue
        self.head = prev

        
    def printList(self):
        temp = self.head
        while temp is not None:
            print(temp.val, end = "")
            temp = temp.next


listt = reverseLinkedList()
listt.push(20)
listt.push(14)
listt.push(12)
listt.push(10)



listt.printList()

print("reverse list")

listt.reverselinkedList()

listt.printList()

