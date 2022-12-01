public class Hexagon implements Shape {
    private int sidelength;
    private String color;
    
    public Hexagon (int sidelengthPar, String colorPar) {
        this.sidelength = sidelengthPar;
        this.color = colorPar;
    }
    
    public double getArea() {
        double x = sidelength / 2;
        double distanceToMiddle = x * Math.sqrt(3);
        double area = ((x * distanceToMiddle) / 2) * 12;
        return area;
    }
    
    public double getPerimeter() {
        return sidelength * 6;
    }
    
    public String getColor() {
        return color;
    }
}