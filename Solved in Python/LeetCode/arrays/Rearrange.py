class Rearrange(object):

    def get_len_of_ones(self, val):
        count = 0
        while val > 0:
            count += 1
            val = val & (val - 1)
        return count

    def count(self, list):
        map = {}

        for item in list:
            b = self.get_len_of_ones(item)
            data = map.get(b, [])
            data.append(item)
            map[b] = data

        result = []
        for key in sorted(map):
            data = map[key]
            data.sort()            
            # result.extend(list(data).sort())
            result.extend(data)
        print(result) 

if __name__=="__main__":
    myList = [7,8,6,5]
    Rearrange().count(myList)