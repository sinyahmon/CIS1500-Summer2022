public class Dog {
    private String color;
    private String breed;
    private boolean isTrained;
    private int age;
    private int heightInCentimeters;

    public Dog(String color, String breed, boolean isTrained, int age, int heightInCentimeters) {
        this.color = color;
        this.breed = breed;
        this.isTrained = isTrained;
        this.age = age;
        this.heightInCentimeters = heightInCentimeters;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }
    //I think you wanted to use setIsTrianed like this instead of using a boolean?
    public void setIsTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    public boolean getIsTrained() {
        return isTrained;
    }

    public int getAge() {
        return age;
    }

    public int getHeightInCentimeters() {
        return heightInCentimeters;
    }
}
