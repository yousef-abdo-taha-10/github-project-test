public class Circle {
    
    private double radius;
    private String color;

    public static void main(String[] args) {
        
    }

    public void setRadius(double r) { 
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
}
