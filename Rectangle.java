public class Rectangle {
    private float length=1.0f;
    private float width=1.0f;
    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float getLength() {
        return length;
    }
    public float getWidth() {
        return width;
    }
    public void setLength(float l) {
        this.length = l;
    }
    public void setWidth(float w) {
        this.width = w;
    }
    public double getArea() {
        return length*width;
    }
    public double getCircumference() {
        return 2*length*width;
    }
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
