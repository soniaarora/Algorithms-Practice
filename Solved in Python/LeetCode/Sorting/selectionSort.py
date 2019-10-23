class selectionSort(object):
    def main(self):
        print(self.selectionSort([7,4,6,2,9]))

    def selectionSort(self, arr):
        n = len(arr)

        for i in range(n):

            min_index = i
            for j in range(i+1, n):

                if arr[min_index] > arr[j]:
                    min_index = j

            
            arr[i], arr[min_index] = arr[min_index],arr[i]

        return arr