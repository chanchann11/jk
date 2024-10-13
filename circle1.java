public class circle1 {
    private double radius;
    private String color;
    public circle1() {
        radius = 2.0;
        color = "red";
    }
    public circle1(double r) {
        radius = r;
        color = "red";
    }
    void setRadius(double r) {
        this.radius = r;
    }
    void setColor(String c) {
        this.color = c;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String getColor() {
        return color;
    }
}
