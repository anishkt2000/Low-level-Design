package Principles;

public class LiskovSub {
//    if class B is a subclass of class A, then we should be able to replace A with B without affecting the correctness of the program.
//    subclass should extend the behavior of the superclass without changing its original functionality.

    interface Bike{
        public void TurnOnEngine();
        public void Accelerate();
    }

    class MotorCycle implements Bike{
        boolean isEngineOn = false;
        int speed = 0;

        @Override
        public void TurnOnEngine() {
            this.isEngineOn= true;
            System.out.println("MotorCycle Engine is On");
        }

        @Override
        public void Accelerate() {
            this.speed= this.speed + 10;
            System.out.println("MotorCycle is Accelerating");
        }
    }
    
    class Bicycle implements Bike{
        int speed = 0;

        @Override
        public void TurnOnEngine() {
            // Bicycle does not have an engine, so this method does nothing
            System.out.println("Bicycle does not have an engine to turn on");
            // Alternatively, we could throw an UnsupportedOperationException
            // breaking Liskov Substitution Principle

        }

        @Override
        public void Accelerate() {
            this.speed= this.speed + 5;
            System.out.println("Bicycle is Accelerating");
        }
    }

//    Solution:

    class Vehicle{
        private int numberOfWheels =2;
        public Vehicle(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }
        public int getNumberOfWheels(){
            return numberOfWheels ;
        }
    }

    public class EngineVehicle extends Vehicle{
        public EngineVehicle(int numberOfWheels) {
            super(numberOfWheels);
        }
       public boolean hasEngine(){
              return true;
       }
    }
    public class NonEngineVehicle extends Vehicle{
        public NonEngineVehicle(int numberOfWheels) {
            super(numberOfWheels);
        }
        public boolean hasEngine(){
            return false;
        }
    }
     public class Car extends EngineVehicle {
         public Car() {
             super(4);
         }
     }
        public class MotorCycleNew extends EngineVehicle {
            public MotorCycleNew() {
                super(2);
            }
        }
}
