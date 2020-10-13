package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Ulik");

        Square s = new Square(5);
        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello(String smd) {
        System.out.println("Hello, " + smd + "!");
    }


}