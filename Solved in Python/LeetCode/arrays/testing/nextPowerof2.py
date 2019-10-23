class Power(object):

    def nextPowerof2(self, n):

        if n == 0:
            return 1

        if n & 1 == 0:
            return n
        count = 0
        while n != 0:
           
            n >>= 1
            count += 1
        res = 1 << count
        return res 

s = Power()

print(s.nextPowerof2(5))