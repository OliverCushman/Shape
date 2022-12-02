public class RegularShape implements Shape {
    private double SideLengthOrRadius;
    private int Sides;
    private String Color;
    
    /* 
     * Sides being initialized as 0 makes the class behave like a circle, Sides being 
     * initialized as an integer equal to or greater than 3 makes the class behave like 
     * a polygon with that amount of sides (1, 2, and all negative values are invalid 
     * values and will return areas and perimeters of 0)
     */
    
    public RegularShape (double sideLengthOrRadius, int sides, String color) {
        this.SideLengthOrRadius = sideLengthOrRadius;
        this.Sides = sides;
        this.Color = color;
    }
    
    public double getArea() {
        if (Sides >= 3) {
            double angle = Math.toRadians(((180.0 - 360.0 / this.Sides) / 2.0));
            double x = (Math.abs(this.SideLengthOrRadius)) / 2.0;
            double distanceToCenter = Math.tan(angle) * x;
            double area = ((x * distanceToCenter) / 2.0) * (this.Sides * 2.0);
            return round(area);
        } else if (Sides == 0) {
            return round(Math.PI * Math.pow((Math.abs(this.SideLengthOrRadius)), 2.0));
        }
        return 0;
    }
    
    public double round(double d) {
        return (Math.round(d * 1000.0)) / 1000.0;
    }
    
    public double getPerimeter() {
        if (Sides >= 3) {
            return round((Math.abs(this.SideLengthOrRadius)) * this.Sides);
        }
        else if (Sides == 0) {
            return round(2.0 * Math.PI * (Math.abs(this.SideLengthOrRadius))); 
        }
        return 0;
    }
    
    public String getColor() {
        return this.Color;
    }
}