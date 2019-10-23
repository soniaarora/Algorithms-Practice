#https://leetcode.com/problems/two-city-scheduling/

from typing import List

class TwoCityScheduling(object):
    def main(self):
        print(self.twoCitySchedCost([[50, 30], [20, 10],[400, 20],[10, 300]]))

    def twoCitySchedCost(self, costs: List[List[int]]) -> int:
        costs.sort(key = lambda x: x[0]-x[1])
        result = sum(i[0] for i in costs[:len(costs)//2]) + sum(j[1] for j in costs[len(costs)//2:])
        return result
        
if __name__ == "__main__":
    TwoCityScheduling().main()