
class allCellsDistOrder(object):

    def main(self):
        
        print(self.allCellsDistOrder(1,2,0,0))

    def allCellsDistOrder(self, R, C, r0, c0):   
        result = []
        temp = []
        for i in range(0,R):
            for j in range(0,C):
                distance = self.distance(r0, c0, i, j)
                dist = Dist(distance, i , j)
                temp.append(dist)
                
                
        # temp_sorted = sorted(temp)
        temp.sort(key= lambda x:x.dist)
        for c in temp:
            result.append([c.x,c.y])
            
            
        return result          

    def distance(self,r0, c0, row, col):

        distance = abs(r0-row)+ abs(c0 - col)

        return distance

    def allCellsDistOrder2(self, R, C, r0, c0):
        result = []
        for i in range(0,R):
            for j in range(0,C):
                result.append([i,j])

        result.sort( key= lambda x: (abs(r0-x[0]) + abs(c0-x[1])))
        # result = sorted(result, key= lambda x:x[0])


        return result

            
class Dist(object):
    def __init__(self, dist, x, y):
        self.dist = dist
        self.x = x
        self.y = y
        
    # def __eq__(self, other):
    #     return self.dist == other.dist 

    # def __lt__(self, other):
    #     return self.dist < other.dist

if __name__ == "__main__":
    allCellsDistOrder().main()
