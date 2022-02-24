public class Truck extends Vehicle {
    public Truck(String plate, String brand, String colour) throws Exception {
        super(plate, brand, colour);
        frontWheelRequired = 2;
        backWheelRequired =4;
    }
    @Override
    public void createWheelOfVehicle(Wheel wheel) throws Exception {
        addTwoWheels(wheel);
        addTwoWheels(wheel);
        addTwoWheels(wheel);
    }

}
