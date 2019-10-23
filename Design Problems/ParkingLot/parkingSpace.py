from enum import Enum
from abc import ABC, abstractmethod
from ParkingSlot import ParkingSlot
from Vehicle import Vehicle
from VehicleSize import VehicleSize
from VehicleType import VehicleType


class smallSlot(ParkingSlot):
    def __init__(self, slotNum):
        super().__init__(slotNum)

class compactSlot(ParkingSlot):
    def __init__(self, slotNum):
        super().__init__(slotNum)

class handicappedSlot(ParkingSlot):
    def __init__(self, slotNum):
        super().__init__(slotNum)


class parkingSpots:
    num_small_slots = 10
    num_compact_slots = 10
    num_handicapped_slots = 10

    small_spots = []
    handicappedSpots = []
    compactSpots = []
    
    # self.vehicleSizeMap = {}

    def __init__(self, numRows, spots_row ):
        self.small_spots = [smallSlot] * self.num_small_slots
        self.compactSpots = [compactSlot] * self.num_compact_slots
        self.handicappedSpots = [handicappedSlot] * self.num_handicapped_slots
        self.VehicleOccupiedSpotMap = {}
        self.createSlots()

    def createSlots(self):
        for i in range(1, self.num_small_slots + 1):
            self.small_spots.append(smallSlot(i))
        for j in range(1, self.num_compact_slots + 1):
            self.compactSpots.append(compactSlot(j))
        for k in range(1, self.num_handicapped_slots):
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
                if slot == self.getFirstEmptySlot(self.handicappedSpots) != None:
                    uniqueToken = self.parkHelper(slot, vehicle)
                elif slot == self.getFirstEmptySlot(self.compactSpots) != None:
                    uniqueToken = self.parkHelper(slot, vehicle)
        if vehicle.type == VehicleType.Car.name:
            if vehicle.getVehicleSize() == VehicleSize.compact.name:
                if slot == self.getFirstEmptySlot(self.compactSpots) != None:
                    uniqueToken = self.parkHelper(slot, vehicle)

        return uniqueToken

    def unpark(self, uniqueToken):
        self.VehicleOccupiedSpotMap[uniqueToken].unpark()
        self.VehicleOccupiedSpotMap.pop(uniqueToken, None)


    def getFirstEmptySlot(self, slots):
        isSlotFound = False
        emptySlot = None
        iterSlots = iter(slots)
        if iterSlots.next() and not isSlotFound:
            emptySlot = iterSlots.next
            if not emptySlot.isOccupied:
                isSlotFound = True
        return emptySlot

    def parkHelper(self, slot, vehicle):
        slot.park()
        uniqueToken = vehicle.hashCode() * 43
        self.VehicleOccupiedSpotMap[uniqueToken] = slot
        return uniqueToken
    
 
    # def parkVehicle(Vehicle, type, num):
    #     if type == VehicleType.motorCycle.name:
    #         for i in range(len(self.moto_spots)):
    #             if moto_spots[i] == None:
    #                 moto_spots[i] = Vehicle
    #                 # self.VehicleSizeMap[VehicleSize.motorCycles.name] = i
    #                 self.VehicleSpotMap[Vehicle][VehicleSize.motorCycles.name]  = i
    #                 return True


    #     elif size == VehicleSize.Compact.name:
    #         for i in range(len(self.compactSpots)):
    #             if self.compactSpots[i] == None:
    #                 compactSpots[i] = Vehicle
    #                 self.VehicleSpotMap[Vehicle][VehicleSize.Compact.name]  = i
    #                 return True

    #         for i in range(len(self.LargeSpots)):
    #             if self.LargeSpot[i] == None:
    #                 LargeSpots[i] = Vehicle
    #                 self.VehicleSpotMap[Vehicle][VehicleSize.Large.name] = i
    #                 return True

    #     elif size == VehicleSize.Large.name:
    #         for i in range(len(self.LargeSpots)):
    #             if self.LargeSpots[i] == None:
    #                 can_park = True
    #                 for j in  range(i, i+num):
    #                     if self.LargeSpots[j] != None:
    #                         can_park = False
    #                         break
                    
    #                 if can_park:
    #                     for j in  range(i, i+num):
    #                         self.LargeSpots[j] = Vehicle
    #                     self.VehicleSpotMap[Vehicle][VehicleSize.Large.name]  = i
    #                     return True

    #     return False
