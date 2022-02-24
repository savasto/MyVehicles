import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {

    public Car(String plate, String brand, String colour) throws Exception {
        super(plate, brand, colour);
        frontWheelRequired = 2;
        backWheelRequired = 2;
    }

    @Override
    public void createWheelOfVehicle(Wheel wheel) throws Exception {
        addTwoWheels(wheel);
        addTwoWheels(wheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    //    public void addWheelstoCar(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
//        List<Wheel> frontWheels = new ArrayList<>();
//        List<Wheel> backWheels = new ArrayList<>();
//        Wheel wheelFrontRight = new Wheel(brand, diameter);
//        Wheel wheelFrontLeft = new Wheel(brand, diameter);
//        Wheel wheelBackRight = new Wheel(brand, diameter);
//        Wheel wheelBackLeft = new Wheel(brand, diameter);
//
//
//        addWheelstoCar(frontWheels, backWheels);
//    }

    public void addTwoWheels(List<Wheel> wheels) throws Exception {
        if (wheels.size() != 2)
            throw new Exception("List should have two wheels");

        Wheel rightWheel = wheels.get(0);
        Wheel leftWheel = wheels.get(1);

        if (!rightWheel.equals(leftWheel))//tienen que ser iguales les ruedas
            throw new Exception("Las ruedas no son compatibles");

        this.wheels.add(leftWheel);
        this.wheels.add(rightWheel);
    }

}