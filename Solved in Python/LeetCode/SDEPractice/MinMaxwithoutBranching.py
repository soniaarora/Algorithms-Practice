class MinMaxWithoutBranching(object):
    def main(self):
        print(self.minMax(1, 100))

    def minMax(self,x, y):
        diff = x - y

        for i in range(0,64):
            print(diff)
            diff = diff >> 1
           
        val = x + diff*(x - y)
        return val


if __name__ == "__main__":
    MinMaxWithoutBranching().main()