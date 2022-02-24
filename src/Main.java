import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int CAR = 1;
    private static final int BIKE = 2;
    private static final int TRICYCLE = 3;
    private static final int TRUCK = 4;

    public static void main(String[] args) throws Exception {
        // String option = chooseTypeOfVehicleToCreate();

        Vehicle vehicle = createVehicleWhatUserWant(chooseTypeOfVehicleToCreate());
        vehicle.createWheelOfVehicle(createWheel());
        printResult(vehicle);

    }

    private static int chooseTypeOfVehicleToCreate() {
        System.out.println("What type of vehicle do you want to create (CAR)" + CAR
                + " or (BIKE)" + BIKE + " or (TRICYCLE)" + TRICYCLE + " or (TRUCK)" + TRUCK + "?");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }

    private static Vehicle createVehicleWhatUserWant(int option) throws Exception {
        String plate = askUserForPlate();
        String brand = askUserForBrand();
        String colour = askUserForColour();

        if (option == CAR) {
            return new Car(plate, brand, colour);
        }
        if (option == BIKE) {
            return new Bike(plate, brand, colour);
        }
        if (option == TRICYCLE) {
            return new Tricycle(plate, brand, colour);
        }
        return new Truck(plate, brand, colour);
    }

    private static String askUserForColour() {
        System.out.println("Write a color of your vehicle ");
        Scanner sc = new Scanner(System.in);
        String colour = sc.nextLine();
        return colour;
    }

    private static String askUserForBrand() {
        System.out.println("Write a brand ");
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        return brand;
    }

    private static String askUserForPlate() {
        System.out.println("Write a plate of your car ");
        Scanner sc = new Scanner(System.in);
        String plate = sc.nextLine();
        return plate;
    }

    private static Double askUserForWheelDiameter() throws Exception {
        System.out.println("Write a diameter of your vehicle's wheels ");
        Scanner sc = new Scanner(System.in);
        double diameter = sc.nextDouble();
        return diameter;
    }

    private static void printResult(Vehicle vehicle) {
        System.out.println("Plate of a vehicle is " + vehicle.getPlate() + " Brand of a vehicle is "
                + vehicle.getBrand() + " Color of a vehicle is " + vehicle.getColour() + " Type of vehicle is " +
                vehicle.getClass() + " and has " + vehicle.wheels.size() + " wheels");
    }

    private static Wheel createWheel() throws Exception {// 2.creamos una rueda
        String brand = askUserForBrand();
        Double diameter = askUserForWheelDiameter();

        Wheel wheel = new Wheel(brand, diameter);
        return wheel;
    }

    private static List<Wheel> createTwoWheels() throws Exception {//3 creamos una lista de ruedas
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(createWheel());
        wheels.add(createWheel());
        return wheels;
    }

    private static void addTwoWheelsToVehicle() throws Exception {

        System.out.println("Front wheels: ");
        List<Wheel> frontWheels = createTwoWheels();//3.1 lista de ruedas delanteras
        System.out.println("Back wheels: ");
        List<Wheel> backWheels = createTwoWheels();//3.2 lista de ruedas traseras

    }


}

//    private static String askUserForWheelBrand() {
//        System.out.println("Write a brand of your vehicle's wheels ");
//        Scanner sc = new Scanner(System.in);
//        String brandOfWheel = sc.nextLine();
//        return brandOf;
//    }


//        if (isCar(option)) {
//            createCar();
//            addWheelsToVehicle(car);
//        }
//        if (isBike(option)) {
//            createBike();
//            addTwoWheelsToVehicle();
//        }
//        if (isTricycle(option)) {
//            createTricycle();
//            addTwoWheelsToVehicle();
//
//        }
//        return;
//
//    printResult();
// addTwoWheelsToVehicle(car);
//Car car = createCar();
// printResult();


//    private static Tricycle createTricycle() throws Exception {
//        String tricyclePlate = askUserForPlate();
//        String tricycleBrand = askUserForBrand();
//        String tricycleColor = askUserForColor();
//
//        Tricycle tricycle = new Tricycle(tricyclePlate, tricycleBrand, tricycleColor);
//        // addTwoWheelsToVehicle(tricycle);
//        return tricycle;
//    }

//    private static Bike createBike() throws Exception {
//        String bikePlate = askUserForPlate();
//        String bikeBrand = askUserForBrand();
//        String bikeColor = askUserForColor();
//
//        Bike bike = new Bike(bikePlate, bikeBrand, bikeColor);
//        //addTwoWheelsToVehicle(bike);
//        return bike;
//
//    }

//    private static boolean isTricycle(String option) {
//        return option.equalsIgnoreCase("TRICYCLE");
//    }
//
//    private static boolean isBike(String option) {
//        return option.equalsIgnoreCase("BIKE");
//    }
//
//    private static boolean isCar(String option) {
//        return option.equalsIgnoreCase("CAR");
//    }


//    private static Car createCar() throws Exception {// 1. creamos objeto car
//        String carPlate = askUserForPlate();
//        String carBrand = askUserForBrand();
//        String carColor = askUserForColour();
//
//        Car car = new Car(carPlate, carBrand, carColor);
//
//        return car;
//
//    }



