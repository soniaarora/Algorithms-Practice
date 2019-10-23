# given biotonic array you need to find a num
# {-3,  8, 20, 17, 5, 1} 
# number - 20
# index - 2

#number - 22
#index -1

# 1- iterate the array - find the particular -
#             return Index
#     else - (-1)

#     Complexity - 0(n)

# 2 - Binary Search - finding middle
#         low - 0, high - endArray


def bitonicArraySearch(arr, target):
    if len(arr) == 0:
        return -1
    pivot = findPivot(arr, 0, len(arr) - 1)

    result = binarySearch1(arr, 0, pivot, target)

    if result != -1:
        return result
    else:
        return binarySearch2(arr, pivot + 1, len(arr) - 1, target)




def binarySearch1(arr, lo, hi, target):

    while lo <= hi:

        mid = lo + (hi - lo) // 2

        if target == arr[mid]:
            return mid

        if  target < arr[mid]:
            hi = mid - 1
        else:
            lo = mid + 1

    return -1

def binarySearch2( arr, lo, hi, target):

    if hi > lo:
        return False

    while lo <= hi:

        mid = lo + (hi - lo) // 2

        if target == arr[mid]:
            return mid

        if  target < arr[mid]:
            lo = mid + 1
        else:
            hi = mid - 1

    return -1


def findPivot(arr, lo, hi):
    while lo < hi:
        mid = lo + (hi - lo) // 2
        
        if arr[mid] < arr[mid + 1]:
            lo = mid + 1
            
        else:
            hi = mid

    return lo

    

# {-3, 4, 17 , 20, 21, 25, 6, 2, 1}

input = [1,2,1,3,5,6,4]

print(bitonicArraySearch(input, 4))

