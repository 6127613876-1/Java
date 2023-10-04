class Vehicl {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private int km;
    private int lt;
    private int time;
    private int speed;
    public Vehicl(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.km=km;
        this.lt=lt;

    }
    public void displayinfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}
class truck extends Vehicl {
    public truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public void calculateFuelEfficiency(int km,int lt) {
        int fe=km/lt;
        System.out.println("Fuel efficiency of truck "+fe);
    }
    public void calculateDistanceTraveled(int speed,int time) {
        int d =speed*time;
        System.out.println("Distance Travelled is "+d);
    }
}
class car extends Vehicl {
    public car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public void calculateFuelEfficiency(int km,int lt) {
        int fe=km/lt;
        System.out.println("Fuel efficiency car "+fe);
    }
    public void calculateDistanceTraveled(int speed,int time) {
        int d =speed*time;
        System.out.println("Distance Travelled is "+d);
    }
}
class motorcycle extends Vehicl {
    public motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public void calculateFuelEfficiency(int km,int lt) {
        int fe=km/lt;
        System.out.println("Fuel efficiency of motorcycle "+fe);
    }
    public void calculateDistanceTraveled(int speed,int time) {
        int d =speed*time;
        System.out.println("Distance Travelled is "+d);
    }
}
public class vehicle {
    public static void main(String[] args) {
        truck Truck = new truck("Tata", "123", 2023, "petrol");
        car Car = new car("Ford", "Mustang 429 BOSS", 1969, "petrol");
        motorcycle Motorcycle = new motorcycle("Kawasaki", "Z900", 2017, "petrol");
        System.out.println("Truck Information:");
        Truck.displayinfo();
        Truck.calculateFuelEfficiency(5000,50);
        Truck.calculateDistanceTraveled(110,50);
        System.out.println("\nCar Information:");
        Car.displayinfo();
        Car.calculateFuelEfficiency(500,70);
        Car.calculateDistanceTraveled(150,56);
        System.out.println("\nMotorcycle Information:");
        Motorcycle.displayinfo();
        Motorcycle.calculateFuelEfficiency(5000,51);
        Motorcycle.calculateDistanceTraveled(470,11);
    }
}

