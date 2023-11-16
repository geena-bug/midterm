package Midtermprep;

public class Circle {
    double radius;
    double Area;
    double Perimeter;
    double newRadius;
    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getPerimeter() {
        return Perimeter;
    }

    public void setPerimeter(double perimeter) {
        Perimeter = perimeter;
    }

    public double getNewRadius() {
        return newRadius;
    }

    public void setNewRadius(double newRadius) {
        this.newRadius = newRadius;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", Area=" + Area +
                ", Perimeter=" + Perimeter +
                ", newRadius=" + newRadius +
                '}';
    }
    public String testCircleOverride(){
        return "from circle";
    };
}
