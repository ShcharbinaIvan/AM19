package homeworks.home6.task1;

public class FiguresTest {
    public static void main(String[] args) {
//        1. Написать иерархию классов «Фигуры».
//Фигура-> Треугольник -> Прямоугольник -> Круг.
//Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
//периметра.
//Создать массив из 5 фигур.
//Вывести на экран сумму периметра всех фигур в массиве.
        double sum = 0;
        Figures[] arrF = new Figures[5];
        arrF[0] = new Circle(123);
        arrF[1] = new Triangle(10, 20, 30);
        arrF[2] = new Rectangle(222, 321);
        arrF[3] = new Circle(321);
        arrF[4] = new Triangle(25, 32, 44);
        for (Figures figures : arrF) {
            sum += figures.perimeter();

        }
        System.out.println("Сумма периметров: " + sum);

    }
}
