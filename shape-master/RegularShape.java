public class RegularShape implements Shape {
    private double SideLengthOrRadius;
    private int Sides;
    private String Color;
    
    public RegularShape (double sideLengthOrRadius, int sides, String color) {
        this.SideLengthOrRadius = sideLengthOrRadius;
        this.Sides = sides;
        this.Color = color;
    }
    
    public double getArea() {
        if (Sides >= 3) {
            double angle = Math.toRadians(((180 - 360 / this.Sides) / 2));
            double x = this.SideLengthOrRadius / 2;
            double distanceToCenter = Math.tan(angle) * x;
            double area = ((x * distanceToCenter) / 2) * (this.Sides * 2);
            return area;
        } else if (Sides == 0) {
            return Math.PI * this.SideLengthOrRadius * this.SideLengthOrRadius;
        }
        return 0;
    }
    
    public double getPerimeter() {
        if (Sides >= 3) {
            return this.SideLengthOrRadius * this.Sides;
        }
        else if (Sides == 0) {
            return 2 * Math.PI * this.SideLengthOrRadius; 
        }
        return 0;
    }
    
    public String getColor() {
        return this.Color;
    }
}