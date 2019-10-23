from enum import Enum
from abc import ABC, abstractmethod
from ParkingSlot import ParkingSlot
from Vehicle import Vehicle
from VehicleSize import VehicleSize
from VehicleType import VehicleType


class smallSlot(ParkingSlot):
    def __init__(self, slotNum):
        super().__init__(slotNum)
    # def getSlotNumber(self):
    #     return self.slotNumber

    # def getisOccupied(self):
    #     return self.isOccupied

    # def park(self):
    #     self.isOccupied = True

    # def unPark(self):
    #     self.isOccupied = False

class compactSlot(ParkingSlot):
    def __init__(self, slotNum):
        super().__init__(slotNum)
    
    # def getSlotNumber(self):
    #     return self.slotNumber

    # def getisOccupied(self):
    #     return self.isOccupied

    # def park(self):
    #     self.isOccupied = True

    # def unPark(self):
    #     self.isOccupied = False


class handicappedSlot(ParkingSlot):
    def __init__(self, slotNum):
        super().__init__(slotNum)
    # def getSlotNumber(self):
    #     return self.slotNumber

    # def getisOccupied(self):
    #     return self.isOccupied

    # def park(self):
    #     self.isOccupied = True

    # def unPark(self):
    #     self.isOccupied = False



class parkingSpots:
    num_small_slots = 10
    num_compact_slots = 2
    num_handicapped_slots = 1

    small_spots = []
    handicappedSpots = []
    compactSpots = []
    
    # self.vehicleSizeMap = {}

    def __init__(self):
        # self.small_spots = [smallSlot] * self.num_small_slots
        # self.compactSpots = [compactSlot] * self.num_compact_slots
        # self.handicappedSpots = [handicappedSlot] * self.num_handicapped_slots
        self.VehicleOccupiedSpotMap = {}
        self.createSlots()

    def createSlots(self):
        for i in range(1, self.num_small_slots + 1):
            self.small_spots.append(smallSlot(i))
        for j in range(1, self.num_compact_slots + 1):
            self.compactSpots.append(compactSlot(j))
        for k in range(1, self.num_handicapped_slots + 1):
            self.handicappedSpots.append(handicappedSlot(k))

    def park(self, vehicle):
        uniqueToken = -1
        slot = None
        if vehicle.type == VehicleType.motorCycle.name:
            if vehicle.getVehicleSize() == VehicleSize.small.name:
                if slot == self.getFirstEmptySlot(self.small_spots) != None:
                    uniqueToken = self.parkHelper(slot, vehicle)
                elif slot == self.getFirstEmptySlot(self.compactSpots) != None:
                    uniqueToken = self.parkHelper(slot, vehicle)
                elif slot == self.getFirstEmptySlot(self.handicappedSpots) != None:
                    uniqueToken = self.parkHelper(slot, vehicle)
         
        if vehicle.type == VehicleType.Handicapped.name:
            if vehicle.getVehicleSize() == VehicleSize.compact.name:
                slot = self.getFirstEmptySlot(self.handicappedSpots)
                if slot != None:
                    uniqueToken = self.parkHelper(slot, vehicle)

                elif slot == self.getFirstEmptySlot(self.compactSpots) != None:
                    uniqueToken = self.parkHelper(slot, vehicle)

        if vehicle.type == VehicleType.Car.name:
            if vehicle.getVehicleSize() == VehicleSize.compact.name:
                slot = self.getFirstEmptySlot(self.compactSpots)
                if slot != None:
                    uniqueToken = self.parkHelper(slot, vehicle)

        return uniqueToken

    def unpark(self, uniqueToken):
        self.VehicleOccupiedSpotMap[uniqueToken].unpark()
        self.VehicleOccupiedSpotMap.pop(uniqueToken, None)


    def getFirstEmptySlot(self, spots):
      
        for slot in spots:    
            #num = slot.getSlotNumber()
            if slot.getisOccupied() == False:
                return slot
        return None

        # iterSlots = iter(spots)
        # nextSlot = next(iterSlots)
        # while True:
        #    try:

        #     # emptySlot = nextSlot
        #     if nextSlot.isOccupied() == False:
        #         return nextSlot
        #     nextSlot = next(iterSlots)

    def parkHelper(self, slot, vehicle):
        slot.park()
        uniqueToken = vehicle.licensePlate
        self.VehicleOccupiedSpotMap[uniqueToken] = slot
        return uniqueToken
    
 
  