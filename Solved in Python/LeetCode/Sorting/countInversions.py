import sys
    
sys.setrecursionlimit(2500)
def mergeSort(arr, temp_arr, low, high):
    count = 0
    if low < high:
        middle =(low + high )//2
        count = mergeSort(arr,temp_arr, low, middle)
        count += mergeSort(arr, temp_arr, middle +1, high)
        count += merge(arr, temp_arr, low, middle, high)

    return count

def merge(arr,temp_arr, low , middle, high):
    l1 = low
    l2 = middle + 1
    count = 0
    # len_one = [0] * l1
    # len_two = [0] * l2
    # for i in range(l1):
    #     len_one[i] = arr[i]

    # for j in range(l2, high):
    #     len_two[j] = arr[j]

    x = 0
    y = 0
    k = low
    while l1 <= middle  and l2 <= high:
        if arr[l1] <= arr[l2]:
            temp_arr[k] = arr[l1]
            
            l1 += 1
            k += 1

        else:
            temp_arr[k] = arr[l2]
            count += middle - l1 + 1 
            l2 += 1
            k += 1

    while l1 <= middle:
        temp_arr[k] = arr[l1]
        l1 += 1
        k += 1

    while l2 <= high:
        temp_arr[k] = arr[l2]
        l2 += 1
        k += 1

    for x in range(low, high + 1):
        arr[x] = temp_arr[x]
    return count
    
array = [6,3,2,5,7,9,1]
    
print(mergeSort(array,[0] * len(array), 0, len(array) - 1))
print(array)

