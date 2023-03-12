package homeworks.home6.task1;

public class Circle extends Figures {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = (radius * radius) * Math.PI;
        System.out.println("Радиус круга: "+area);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * radius * Math.PI;
        System.out.println("Периметр круга: "+perimeter);
        return perimeter;
    }
}
