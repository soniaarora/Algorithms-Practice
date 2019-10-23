from abc import ABC, abstractmethod
class ParkingSlot(ABC):
    
    def __init__(self, s):
        self.slotNumber = s
        self.isOccupied = False
        
    # @abstractmethod
    def getSlotNumber(self): 
        return self.slotNumber
    # @abstractmethod
    def getisOccupied(self):
        return self.isOccupied
    # @abstractmethod
    def park(self): 
        self.isOccupied = True
    # @abstractmethod
    def unPark(self):
        self.isOccupied = False


    # def equals(self, o):
    #     return ((o).slotNumber == slotNumber)
    

    # def hashCode(self): 
    #     hash = 5
    #     hash = 53 * hash + self.slotNumber
    #     return hash 