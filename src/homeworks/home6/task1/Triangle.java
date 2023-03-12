package homeworks.home6.task1;

public class Triangle extends Figures {
    private double lengthFirst;
    private double lengthSecond;
    private double lengthThird;

    public Triangle() {
    }

    public Triangle(double lengthFirst, double lengthSecond, double lengthThird) {
        this.lengthFirst = lengthFirst;
        this.lengthSecond = lengthSecond;
        this.lengthThird = lengthThird;
    }

    @Override
    public double area() {
        double s = (lengthFirst + lengthSecond + lengthThird) / 2;
        double area = Math.sqrt(s * (s - lengthFirst) * (s - lengthSecond) * (s - lengthThird));
        System.out.println("Площадь треугольника: " + area);
        return area;

    }

    @Override
    public double perimeter() {
        double perimeter = lengthFirst + lengthSecond + lengthThird;
        System.out.println("Периметр треугольника: " + perimeter);
        return perimeter;

    }
}
