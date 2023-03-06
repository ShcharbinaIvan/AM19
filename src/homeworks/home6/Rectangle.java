package homeworks.home6;

public class Rectangle extends Figures {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        double area = length * width;
        System.out.println("Площадь прямоугольника: " + area);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Периметер прямоугольника: " + perimeter);
        return perimeter;

    }
}
