from VehicleType import VehicleType
from VehicleSize import VehicleSize
from abc import ABC, abstractmethod
class Vehicle(ABC):

    def __init__(self, licensePlate, size, vehicletype):
        self.licensePlate = licensePlate
        self.size= size
        self.type = vehicletype
        
    def getVehicleSize(self):
        return self.size

class Handicap(Vehicle):
    def __init__(self, licensePlate):
        super().__init__(licensePlate, VehicleSize.compact.name, VehicleType.Handicapped.name)

class Car(Vehicle):
    def __init__(self, licensePlate):
        super().__init__(licensePlate, VehicleSize.compact.name, VehicleType.Car.name) 

class MotorCycle(Vehicle):
    def __init__(self, licensePlate):
        super().__init__(licensePlate, VehicleSize.small.name, VehicleType.motorCycle.name)

