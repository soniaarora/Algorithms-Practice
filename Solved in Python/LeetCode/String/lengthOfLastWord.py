class lengthOfLastWord(object):
    def main(self):
        print(self.LastWordLen("Hello World"))


    def LastWordLen(self, s):
        if s == None:
            return 0
        s = s.strip()
        words = s.split(" ")
        
        return len(words[len(words)-1])

if __name__=="__main__":
    lengthOfLastWord().main()