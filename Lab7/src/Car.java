public class Car {
    private String nameOfCar;
    private String brandOfCar;
    private String colorOfCar;
    private int VIN;
    private double price;

    public Car(String nameOfCar, String brandOfCar, String colorOfCar, int VIN, double price) {
        this.nameOfCar = nameOfCar;
        this.brandOfCar = brandOfCar;
        this.colorOfCar = colorOfCar;
        this.VIN = VIN;
        setPrice(price);
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public String getBrandOfCar() {
        return brandOfCar;
    }

    public String getColorOfCar() {
        return colorOfCar;
    }

    public int getVIN() {
        return VIN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public void setColorOfCar(String colorOfCar) {
        this.colorOfCar = colorOfCar;
    }
}
