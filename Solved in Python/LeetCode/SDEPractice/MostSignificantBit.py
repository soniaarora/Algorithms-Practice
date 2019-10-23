class MostSignificantBit(object):
    def main(self):
        print(self.msb(19))

    def msb(self,num):
        count = 0
        while num > 0:
            num = num >> 1
            count += 1
        result = 1 << count-1
        return result
        
if __name__ == "__main__":
    MostSignificantBit().main()