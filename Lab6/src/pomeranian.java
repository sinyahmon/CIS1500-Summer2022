public class pomeranian {
    //attributes
    private String name;
    private int heightInInches;
    private int weightInPounds;

    public pomeranian(String name, int heightInInches, int weightInPounds) {
        this.name = name;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public String getName() {
        return name;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public int getWeightInPounds() {
        return weightInPounds;
    }
}
