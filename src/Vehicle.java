import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    protected String plate;
    protected String brand;
    protected String colour;
    protected List<Wheel> wheels = new ArrayList<Wheel>();
    protected int frontWheelRequired = 0;
    protected int backWheelRequired = 0;


    public Vehicle(String plate, String brand, String colour) throws Exception {
        checkPlate(plate);
        this.plate = plate;
        checkBrand(brand);
        this.brand = brand;
        checkColour(colour);
        this.colour = colour;
    }
public abstract void createWheelOfVehicle(Wheel wheel) throws Exception;

    protected void addOneWheel(Wheel wheel){
        wheels.add(wheel);
    }
    protected void addTwoWheels(Wheel wheel){
        wheels.add(wheel);
        wheels.add(wheel);
    }


    private void checkColour(String colour) throws Exception {
        if (plate == null || plate.equals("")) throw new Exception("Error");
    }

    private void checkBrand(String brand) throws Exception {
        if (plate == null || plate.equals("")) throw new Exception("Error");
    }

    protected static void checkPlate(String plate) throws Exception {
        if (!plate.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
            throw new Exception("Plate should have 4 numbers and 3 letters ");
        }
        if (plate == null || plate.equals("")) throw new Exception("Error");
    }
    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", wheels=" + wheels +
                ", frontWheelRequired=" + frontWheelRequired +
                ", backWheelRequired=" + backWheelRequired +
                '}';
    }
}

//        int countNums=0;
//        int countLetter = 0;
//        for (int i = 0; i < plate.length(); i++) {
//            if(Character.isDigit(plate.charAt(i))){
//                countNums++;
//            }
//                if(Character.isLetter(plate.charAt(i))){
//                    countLetter++;}
//        }
//        if(countNums!=4) throw new Exception("Plate should have 4 numbers ");
//        if(countNums!=3) throw new Exception("Plate should have 3 letters ")







