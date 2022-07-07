public class threeDRectangle extends Rectangle {
    private int height;

    public threeDRectangle (int width, int length, int height) {
        super(width, length);
        setHeight(height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
