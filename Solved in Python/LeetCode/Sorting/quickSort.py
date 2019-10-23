def quick(arr, lo, hi):
    if lo < hi:
        index = findmiddle(arr, lo, hi)

        quick(arr, lo, index - 1)
        quick(arr, index + 1, hi)



def findmiddle(arr, lo, hi):

    pivot = arr[hi]
    index = lo - 1

    for x in range(lo, hi):

        if arr[x] <= pivot:
            index += 1
            arr[x], arr[index] = arr[index], arr[x]

    arr[index+1], arr[hi] = arr[hi], arr[index + 1]

    return index + 1




arr = [4, 2, 0, 3, 1]
quick(arr, 0, len(arr) - 1)

print(arr)