public class Tricycle extends Vehicle {
    public Tricycle (String plate, String brand, String colour) throws Exception {
        super(plate, brand, colour);
        frontWheelRequired = 1;
        backWheelRequired = 2;
    }

    @Override
    public void createWheelOfVehicle(Wheel wheel) throws Exception {
        addTwoWheels(wheel);//dos de darrere
        addOneWheel(wheel);

    }
}
