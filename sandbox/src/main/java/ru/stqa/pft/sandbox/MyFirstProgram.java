package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {


        Square s = new Square(5);
        Rectangle r = new Rectangle(4, 6);
        Point p1 = new Point(2, 0);
        Point p2 = new Point(4, 0);

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
        System.out.println("Расстояние между точкой А(" + p1.x + ";" + p1.y + ") и точкой В(" + p2.x + ";" + p2.y +
                ") равно " + distance(p1, p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x- p1.x), 2) +Math.pow((p2.y- p1.y), 2));
    }


}