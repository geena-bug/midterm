package user_defined_logic;


    public class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }

        public void main(String[] args) {
            double[] radii = {2.5, 3.7, 1.2, 4.0, 2.0};

            for (double radius : radii) {
                Circle circle = new Circle(radius);
                System.out.println("The area of a circle with radius " + radius + " is: " + circle.getArea());
            }
        }
    }

