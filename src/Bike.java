import java.util.ArrayList;
import java.util.List;

public class Bike extends Vehicle {

    public Bike(String plate, String brand, String colour) throws Exception {
        super(plate, brand, colour);
        frontWheelRequired = 1;
        backWheelRequired = 1;
    }

    @Override
    public void createWheelOfVehicle(Wheel wheel) throws Exception {
        addOneWheel(wheel);
        addOneWheel(wheel);
    }

//    public void addOneWheel(List<Wheel> wheels) throws Exception {
//        if (wheels.size() != 1) throw new Exception();
//        this.wheels.add(wheels.get(0));
//
//    }


}

