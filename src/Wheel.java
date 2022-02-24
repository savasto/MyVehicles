import java.util.Objects;

public class Wheel {
    private String brand;
    private double diameter;

    public Wheel(String brand, double diameter) throws Exception {
        checkDiameter(diameter);
        checkBrand(brand);
        this.brand = brand;
        this.diameter = diameter;
    }


    private void checkBrand(String brand) throws Exception {
        if (brand == null || brand.equals("")) {
            throw new Exception("Error. Brand should be the same");
        }
    }
    private void checkDiameter(double diameter) throws Exception {
        if ( diameter <0.4 && diameter > 4)
            throw new Exception("Error. Diameter of wheel should be from 0.4 to 4");
    }

    public String getBrand() {
        return brand;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.diameter, diameter) == 0 && brand.equals(wheel.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, diameter);
    }
}
