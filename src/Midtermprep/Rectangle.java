package Midtermprep;

public class Rectangle {
    private double width;
    private double height;

    // Default constructor
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        // Display information about the first rectangle
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        // Display information about the second rectangle
        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
