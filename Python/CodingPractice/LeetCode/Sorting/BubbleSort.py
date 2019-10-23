class BubbleSort(object):
    def main(self):
        print(self.bubbleSort([5,3,7,9,2]))

    def bubbleSort(self, arr):
        n = len(arr)

        for i in range(n):
            for j in range(0, n-i-1):
                if arr[j] > arr[j+1]:
                    arr[j],arr[j+1] = arr[j+1], arr[j]
        return arr

# if __name__=="__main__":
#     BubbleSort().main()