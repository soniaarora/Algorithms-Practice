class HammingDistance(object):
    def main(self):
        print(self.hammingDistance(3, 7))


    def hammingDistance(self, num1, num2):
        xorResult = num1 ^ num2
        return self.count1(xorResult)

    def count(self, xorResult):
        c  = 0
        while xorResult > 0:
            if (xorResult & 1) != 0:
                c += 1
            xorResult = xorResult >> 1

        return c
    
    def count1(self, xorResult):
        c  = 0
        while xorResult > 0:
            c += 1
            xorResult = xorResult & (xorResult - 1)
            
        return c 

if __name__ == "__main__":
    HammingDistance().main()

