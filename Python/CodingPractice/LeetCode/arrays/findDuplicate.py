class findDuplicate(object):
    def main(self):
        print(self.findDuplicate2([1,3,4,2,3]))

    def findDuplicate(self, arr):
        num = set()
        for n in arr:
            if n in num:
                return n
            else:
                num.add(n)
        return -1

    def findDuplicate2(self, arr):
        slow = arr[0]
        fast = arr[arr[0]]

        while slow != fast:
            slow = arr[slow]
            fast = arr[arr[fast]]

        fast = 0

        while slow != fast:
            slow = arr[slow]
            fast = arr[fast]
        return slow


if __name__ == "__main__":
    findDuplicate().main()
