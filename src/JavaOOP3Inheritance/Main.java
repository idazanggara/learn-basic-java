package JavaOOP3Inheritance;

import JavaOOP3Inheritance.Inheritance.Child;
import JavaOOP3Inheritance.day_2.Block;
import JavaOOP3Inheritance.day_2.Rectangle;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(2, "hijau", "hijau");
        System.out.println(child.getHairColor());
        child.run();

        System.out.println(child.print());

        System.out.println("====");

        Rectangle rectangle = new Rectangle(5.0, 2.0);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getRound());

        System.out.println("---");

        Block block = new Block(5.0, 2.0, 3.0);
        System.out.println(block.getArea());
        System.out.println(block.getRound());

    }
}
