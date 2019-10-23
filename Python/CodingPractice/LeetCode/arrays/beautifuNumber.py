def beautifyNumber(arr, m):
    if len(arr) == 0:
        return 0
    n = len(arr)
    prefixStore = [0] * n
    odd = 0
    count = 0
    for i in range(n):
        prefixStore[odd]+= 1

        if arr[i] % 2 == 1:
            odd+= 1

        if odd >= m:
            count += prefixStore[odd - m]

    return count 



print(beautifyNumber([1, 2, 3, 4, 5], 2))

