#https://leetcode.com/problems/reverse-only-letters/submissions/

class reveseCharacters(object):
    def main(self):
        print(self.reverseCharacters("a-bC-dEf-ghIj"))

    def reverseCharacters(self, S):
        S = list(S)
        start = 0
        end = len(S) - 1
        
        while start <= end:
            if S[start].isalpha() == False:
                start += 1
                continue
            if S[end].isalpha() == False:
                end -= 1
                continue
            S[start], S[end] = S[end], S[start]
            start += 1
            end -= 1
            
        return ''.join(S)

if __name__=="__main__":
    reveseCharacters().main()

    