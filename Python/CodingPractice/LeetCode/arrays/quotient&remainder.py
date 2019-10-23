def findQuestientremainder(dividend, divisor):

    if divisor == 0:
        return 0, 0

    if divisor < 0:
        divisor = -divisor

    if dividend < 0:
        dividend = -dividend

    

    # count = 0
    # i = 0

    # product = 0
    # while product <= dividend:
    #     i += 1
    #     product = divisor * i
    i = 0
    while (dividend >= divisor): 
        dividend -= divisor; 
        i += 1


    return i, dividend
  

    # return i - 1, dividend - (product - divisor)


print(findQuestientremainder(10, 4))