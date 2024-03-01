package JavaOOPInheritance;

import JavaOOPInheritance.Inheritance.Child;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(2, "hijau", "hijau");
        System.out.println(child.getHairColor());
        child.run();

        System.out.println(child.print());
    }
}
