package JavaOOPPolymorphism;

import JavaOOPPolymorphism.inheritance1.Block;
import JavaOOPPolymorphism.inheritance1.Rectangle;
import JavaOOPPolymorphism.polymorphism.Developer;
import JavaOOPPolymorphism.polymorphism.Employee;
import JavaOOPPolymorphism.polymorphism.Trainer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Percobaan pertama
//        Rectangle rectangle = new Rectangle(5.0,2.0);
//        Block block = new Block(5.0,2.0,3.0);
//        System.out.println(block.getArea());


        // Percobaan kedua
        Employee dev = new Developer("Budiman", "IT", 5_000_000L);
        System.out.println(dev.print());

        Trainer ismail = new Trainer("Ismail", "IT", 1L);

        //tipe data trainer, array of trainer boleh enggak?
        // kalau ini strik hanya trainer aja yg masuk
        Trainer[] trainers = {
                ismail,
                new Trainer("Idaz", "IT", 1L),

        };
        for (Trainer trainer: trainers) {
            System.out.println(trainer.print());
        }

        // kalau ini bisa semua selama dia itu turunannya
        Employee[] employees = {
                dev,
                ismail
        };
        for (Employee employee: employees) {
            System.out.printf("Nama : %s, Divisi : %s, Gaji : %d \n",employee.getName(), employee.getDivision(), employee.getSalary());
            System.out.println(employee.print());
        }
    }
}
