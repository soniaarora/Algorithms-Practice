# class MergeSort(object):
    # def main(self):
    #     array = [6,3,2,5,7,9,1]
    #     print(self.mergeSort(array, 0, len(array) - 1))
import sys
    
sys.setrecursionlimit(2500)
def mergeSort(arr, low, high):

    if low < high:
        middle =(low + high )//2
        mergeSort(arr, low, middle)
        mergeSort(arr, middle +1, high)
        merge(arr, low, middle, high)

    

def merge(arr, low, middle, high):
    l1 = middle - low + 1
    l2 = high - middle
    len_one = [0] * l1
    len_two = [0] * l2
    for i in range(0, l1):
        len_one[i] = arr[low + i]

    for j in range(0, l2):
        len_two[j] = arr[middle+1+j]

    x = 0
    y = 0
    k = low
    while x < l1 and y < l2:
        if len_one[x] <= len_two[y]:
            arr[k] = len_one[x]
            x += 1
            k += 1

        else:
            arr[k] = len_two[y]
            y += 1
            k += 1

    while x < l1:
        arr[k] = len_one[x]
        x += 1
        k += 1

    while y < l2:
        arr[k] = len_two[y]
        y += 1
        k += 1

    
array = [6,3,2,5,7,9,1]
    
mergeSort(array, 0, len(array) - 1)
print(array)

