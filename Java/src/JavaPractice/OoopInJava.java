package JavaPractice;

public class OoopInJava {

    public class Vehicle{

        int wheelNumber;

        String fuelType ;

        public Vehicle(){
            this.wheelNumber = 2 ;
            this.fuelType = "petrol";
        }

        public Vehicle(int t , String f){
            this.wheelNumber = t ;
            this.fuelType = f;
        }

        public void engineSound(String sound){
            System.out.println("The sound of this Vehicle is : "+sound);
        }
    }

    public class Car extends Vehicle{

        public Car(){
            this.wheelNumber = 4;
            this.fuelType = "Diesel";
        }
        public void carsound(String sound){
            this.engineSound(sound);
        }
    }
    public class Motorcycle extends Vehicle{

        public Motorcycle(){
            this.wheelNumber = 2;

            this.fuelType = "petrol";
        }

        public void Motorcyclesound(String sound){
            this.engineSound(sound);
        }
    }

}
