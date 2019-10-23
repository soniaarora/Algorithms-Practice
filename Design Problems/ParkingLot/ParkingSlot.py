from abc import ABC, abstractmethod
class ParkingSlot(ABC):
    def __init__(self, s):
        self.slotNumber = s
        self.isOccupied = False
    
    def getSlotNumber(self): 
        return self.slotNumber
     
    def park(self): 
        self.isOccupied = True
    
    def unPark(self):  
        self.isOccupied = False

    def hashCode(self): 
        hash = 5
        hash = 53 * hash + self.slotNumber
        return hash 