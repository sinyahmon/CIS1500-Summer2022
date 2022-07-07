public class Vehicle {
    private String make;
    private String model;
    private String color;
    private int currentSpeedInKilometersPerHour;
    private int maxSpeedInKilometersPerHour;

    public Vehicle(String make, String model, String color, int currentSpeedInKilometersPerHour, int maxSpeedInKilometersPerHour) {
        this.make = make;
        this.model = model;
        this.color = color;
        currentSpeedInKilometersPerHour = 0;
        this.maxSpeedInKilometersPerHour = maxSpeedInKilometersPerHour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getCurrentSpeedInKilometersPerHour() {
        return currentSpeedInKilometersPerHour;
    }

    public int getMaxSpeedInKilometersPerHour() {
        return maxSpeedInKilometersPerHour;
    }

    public int setCurrentSpeedInKilometersPerHour(int currentSpeedInKilometersPerHour) {
        if (currentSpeedInKilometersPerHour > maxSpeedInKilometersPerHour) {
            currentSpeedInKilometersPerHour = maxSpeedInKilometersPerHour;
        } else if (currentSpeedInKilometersPerHour < 0) {
            currentSpeedInKilometersPerHour = 0;
        }
        return currentSpeedInKilometersPerHour;
    }
}
