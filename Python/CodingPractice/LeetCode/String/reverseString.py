class reverseString(object):
    def main(self):
        strs = ["d-ata","name","value"]
        
      
        print(self.reverseList(strs))

    def reverseList(self, strs):
        
        for i,ele in enumerate(strs):
            rev= self.reverse(ele)
            strs[i] = rev
            


        return strs

    def reverse(self,element):
        rev = ""
        for i in element:
            rev = i + rev
        return rev

if __name__=="__main__":
    reverseString().main()