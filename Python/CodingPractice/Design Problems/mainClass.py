from Vehicle import Vehicle
from Vehicle import Car
from Vehicle import Handicap
from parkingSpace import parkingSpots
car1 = Car(123)
handicapped1 = Handicap(234)
handicapped2 = Handicap(34)

p = parkingSpots()
p.park(car1)
p.park(handicapped1)
p.park(handicapped2)
