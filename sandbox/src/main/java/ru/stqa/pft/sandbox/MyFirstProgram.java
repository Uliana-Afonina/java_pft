package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Ulik");

        Square s = new Square(5);

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь квадрата со стороной "+ s.l + " = " + area(s));
        System.out.println("Площадь пр-ка со сторонами "+ r.a + " и " + r.b + " = " + area(r));
    }

    public static void hello(String smd) {
        System.out.println("Hello, " + smd +  "!");
    }

    public static double area(Square s) {
        return s.l * s.l;
    }

    public static double area(Rectangle r){
        return r.a * r.b;
    }

}