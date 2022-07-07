public class Rectangle {
    int width, length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(){
        this.width = 5;
        this.length = 10;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }
}
