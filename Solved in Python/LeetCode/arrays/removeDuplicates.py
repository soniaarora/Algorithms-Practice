class removeDuplicates(object):
    def main(self):
        arr = [0,0,1,1,1,2,2,3,3,4]
        result = self.removeDuplicates(arr)
        print(arr[0:result])
        

    def removeDuplicates(self, array):
        n = len(array)
        pos = 1
        for i in range(1, n):
            if  array[i] != array[i-1]:
                array[pos] = array[i]
                pos+=1

        return pos


if __name__=="__main__":
    removeDuplicates().main()
        