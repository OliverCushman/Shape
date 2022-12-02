public class Hexagon implements Shape {
    private double SideLength;
    private String Color;
    
    public Hexagon (double sideLength, String color) {
        this.SideLength = sideLength;
        this.Color = color;
    }
    
    public double getArea() {
        double x = SideLength / 2;
        double distanceToCenter = x * Math.sqrt(3);
        double area = ((x * distanceToCenter) / 2) * 12;
        return area;
    }
    
    public double getPerimeter() {
        return SideLength * 6;
    }
    
    public String getColor() {
        return Color;
    }
}
