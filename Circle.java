public class Circle {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Circle [radius= " + radius + "]";
    }
}

