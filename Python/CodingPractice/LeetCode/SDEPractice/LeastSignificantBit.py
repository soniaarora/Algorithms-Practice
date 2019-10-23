class LeastSignificantBit(object):
    def main(self):
        
        print(self.lsb(10))
        print(self.lsb1(10))
        print(self.lsb2(10))
        print(self.lsb3(11))

    def lsb(self,num):
        # -num = 1's complement of num -> +1 (2's complement)
        result = num & (-num)

        return result

    def lsb1(self,num):
        # -num = 1's complement of num -> +1 (2's complement)
        result = num & (~num + 1)

        return result

    def lsb2(self,num):
        result = 1
        while num > 0:
            if (num & 1) == 1:
                break
            num = num >> 1
            result = result << 1
        return result

    def lsb3(self, num):
        result = 1
        while num > 0:
            if(num % 2) == 1:
                break
            num = num//2
            result = result * 2
        return result
                

if __name__ == "__main__":
    LeastSignificantBit().main()