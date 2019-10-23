class insertionSort(object):
    def main(self):
        print(self.insertionSort([5,3,2,10,7]))

    def insertionSort(self, arr):
        n = len(arr)

        for i in range(1,n):
            key = arr[i]
            j = i-1

            while j >=0 and arr[j] > key:
                arr[j],arr[j+1] = arr[j+1], arr[j]
                j -= 1
                

        return arr

if __name__ == "__main__":
    insertionSort().main()