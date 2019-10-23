from abc import ABC, abstractmethod
import enum.Enum
class VehicleSize(Enum):
    motorCycles = 1,
    Compact =2,
    Large =3

class VehicleType(Enum):
    handicap = 1
    car = 2
    motorcycle = 3

class Vehicle(ABC):

    def __init__(self, licensePlate, spotsNeeded, size, type):
        self.parkingSpotList = []
        self.licensePlate = None 
        self.spotsNeeded = None
        self.size= None
        self.type

    def getSpots():
        return self.spotsNeeded

    def getVehicleSize():
        return self.size

    def parkingSpots(self, s):
        self.parkingSpotList.add(s)

    def clearSpot():
        pass

    def canFitinSpot(s):
        pass

class Bus(Vehicle):

    def __init__(self, licensePlate):
        super().__init__(licensePlate, 5, VehicleSize.Large,)

    # check if available spots are greater than or equal to spots needed
    def canFitinSpot(spot):
        if 


class Car(Vehicle):
    def size():
        return VehicleSize.Compact.name

    
    # check if available spots are greater than or equal to spots needed
    def canFitinSpot(spot):
        return True


class MotorCycles(Vehicle):
    

    # check if available spots are greater than or equal to spots needed
    def canFitinSpot(spot)


class ParkingAlot:
  
    def __init__(self, levels, num_levels):
        self.levels = levels
        self.num_levels = 5

    def parkVehicle(vehicle):
        return True
    
class Level:
    def __init__(self, floor, availableSpots):
        self.floor = floor
        self.parkingSpots = []
        self.availableSpots = 0

    def availableSpots(self):
        return self.availableSpots

    def parkVehicle(vehicle):
        
        return True
    
    def parkingSpotNumber(spotNum, vehicle):
        return True

    def findAvailableSpots(vehicle):
        

    def spotsFree():
        self.availableSpots+= 1


class ParkingSpot:
    def __init__(self, level, row, spotNum, spotSize):
        self.vehicleSize = spotSize
        self.row = row
        self.spotNum = spotNum
        self.level = level
        self.Vehicle = None

    def isAvailable():
        return self.vehicle == None

    def canFitVehicle(vehicle):
        vehicle.getSpots() == 1

    def parkVehicle(vehicle):
        this.vehicle = vehicle

    def getRow():
        return self.row

    def getSpot():
        return self.spotNum

    def removeVehicle():
        return self.vehicle = None





# class ParkingAlot:
#     self.moto_spots = []
#     self.compactSpots = []
#     self.LargeSpots = []
#     self.VehicleSpotMap = {}
#     self.vehicleSizeMap = {}

#     def __init__(self, numRows, spots_row ):
#         moto = spots_row// 4
#         self.moto_spots = [None] * moto
#         car = spots_row // 4*3
#         self.compactSpots = [None] * (car - moto)
#         self.LargeSpots = [None] * (spots_row - car)

    
#     def parkVehicle(Vehicle, size, num):
#         if size == VehicleSize.motorCycles.name:
#             for i in range(len(self.moto_spots)):
#                 if moto_spots[i] == None:
#                     moto_spots[i] = Vehicle
#                     # self.VehicleSizeMap[VehicleSize.motorCycles.name] = i
#                     self.VehicleSpotMap[Vehicle][VehicleSize.motorCycles.name]  = i
#                     return True


#         elif size == VehicleSize.Compact.name:
#             for i in range(len(self.compactSpots)):
#                 if self.compactSpots[i] == None:
#                     compactSpots[i] = Vehicle
#                     self.VehicleSpotMap[Vehicle][VehicleSize.Compact.name]  = i
#                     return True

#             for i in range(len(self.LargeSpots)):
#                 if self.LargeSpot[i] == None:
#                     LargeSpots[i] = Vehicle
#                     self.VehicleSpotMap[Vehicle][VehicleSize.Large.name] = i
#                     return True

#         elif size == VehicleSize.Large.name:
#             for i in range(len(self.LargeSpots)):
#                 if self.LargeSpots[i] == None:
#                     can_park = True
#                     for j in  range(i, i+num):
#                         if self.LargeSpots[j] != None:
#                             can_park = False
#                             break
                    
#                     if can_park:
#                         for j in  range(i, i+num):
#                             self.LargeSpots[j] = Vehicle
#                         self.VehicleSpotMap[Vehicle][VehicleSize.Large.name]  = i
#                         return True

#         return False


#     def unParkVehicle(self, Vehicle):
        








    

