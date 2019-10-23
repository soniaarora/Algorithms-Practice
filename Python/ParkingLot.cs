using System;
using System.Collections.Generic;

namespace Design
{
    class ParkingLot
    {
        public enum VehicleSize { Motorcycle, Compact, Large }

        public abstract class Vehicle
        {
            protected List<ParkingSpot> parkingSpots = new List<ParkingSpot>();
            protected String licensePlate;
            protected int spotsNeeded;
            protected VehicleSize size;

            public int getSpotsNeeded() { return spotsNeeded; }
            public VehicleSize getSize() { return size; }

            /* Park vehicle in this spot (among others, potentially) */
            public void parkInSpot(ParkingSpot s) { parkingSpots.Add(s); }

            /* Remove car from spot, and notify spot that it's gone */
            public void clearSpots() { }

            /* Checks if the spot is big enough for the vehicle (and is available). This
            * compares the SIZE only. It does not check if it has enough spots. */
            public abstract bool canFitInSpot(ParkingSpot spot);
        }

        public class Bus : Vehicle
        {
            public Bus()
            {
                spotsNeeded = 5;
                size = VehicleSize.Large;
            }

            /* Checks if the spot is a Large. Doesn't check num of spots */
            public override bool canFitInSpot(ParkingSpot spot)
            {
                return false;
            }
        }

        public class Car : Vehicle
        {
            public Car()
            {
                spotsNeeded = 1;
                size = VehicleSize.Compact;
            }

            /* Checks if the spot is a Large. Doesn't check num of spots */
            public override bool canFitInSpot(ParkingSpot spot) { return true; }
        }

        public class Motorcycle : Vehicle
        {
            public Motorcycle()
            {
                spotsNeeded = 1;
                size = VehicleSize.Motorcycle;
            }

            /* Checks if the spot is a Large. Doesn't check num of spots */
            public override bool canFitInSpot(ParkingSpot spot) { return true; }
        }

        public class ParkingLot1
        {
            private Level[] levels;
            private int NUM_LEVELS = 5;

            public ParkingLot1()
            {
            }

            /* Park the vehicle in a spot(or multiple spots). Return false if failed. */
            public bool parkVehicle(Vehicle vehicle) { return true; }
        }

        /* Represents a level in a parking garage*/
        public class Level
        {
            private int floor;
            private ParkingSpot[] spots;
            private int availableSpots = 0; // number of free spots
            private static readonly int SPOTS_PER_ROW = 16;

            public Level(int fIr, int numberSpots) { }
            public int AvailableSpots() { return availableSpots; }
            /* Find a place to park this vehicle.Return false if failed. */
            public bool parkVehicle(Vehicle vehicle) { return true; }

            /* Park a vehicle starting at the spot spotNumber, and continuing until
             * vehicle.spotsNeeded. */
            private bool parkStartingAtSpot(int num, Vehicle v) { return true; }

            /* Find a spot to park this vehicle.Return index of spot, or -1 on failure. */
            private int findAvailableSpots(Vehicle vehicle) { return 1; }

            /* When a car was removed from the spot, increment availableSpots*/
            public void spotFreed() { availableSpots++; }
        }

        public class ParkingSpot
        {
            private Vehicle vehicle;
            private VehicleSize spotSize;
            private int row;
            private int spotNumber;
            private Level level;

            public ParkingSpot(Level lvI, int r, int n, VehicleSize s) { }

            public bool isAvailable() { return vehicle == null; }

            /* Check if the spot is big enough and is available */
            public bool canFitVehicle(Vehicle vehicle) { return false; }

            /* Park vehicle in this spot. */
            public bool park(Vehicle v)
            {
                return false;
            }
            public int getRow() { return row; }
            public int getSpotNumber() { return spotNumber; }

            /* Remove vehicle from spot, and notify level that a new spot is available*/
            public void removeVehicle() { }
        }

    }
}
