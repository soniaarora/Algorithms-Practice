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
