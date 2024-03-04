package JavaOOP5Polymorphism;

import JavaOOP5Polymorphism.polymorphism.Developer;
import JavaOOP5Polymorphism.polymorphism.Employee;
import JavaOOP5Polymorphism.polymorphism.Trainer;

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
        Trainer idaz =  new Trainer("Idaz", "IT", 1L);


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
                ismail,
                idaz
        };

//        System.out.println("===");
//        System.out.println(employees[0].print());
//        System.out.println("===");
        for (Employee employee: employees) {
            System.out.printf("Nama : %s, Divisi : %s, Gaji : %d \n",employee.getName(), employee.getDivision(), employee.getSalary());
            System.out.println(employee.print());
        }
        // Kalian misalnya enggak tau urutan di datanya gimana? yg mana trainer dan mana dev? apakah index 0 itu pasti dev?
        for (Employee employee: employees) {
            // pengecekkan apakah new nyta Trainer atau Developer
            if (employee instanceof Trainer) {
                // casting bisanya turunannya aja, sibling enggak bisa
                Trainer trainer = (Trainer) employee;
                trainer.teaching();
                // employee.teach(); // error ya
                // ((Trainer) employee).teach(); // contoh lain
                // tapi sebenernya kalau enggak perlu di casting, tapi kalau kita panggil yg methodnya sama, maka tetap miliknya trainer


            }else if (employee instanceof Developer) {
                Developer developer = (Developer) employee;
                developer.developing();
            }
        }
        // ini enggak bisa, karena sibling
        // Trainer trainer = (Trainer) dev;
        // dari child ke parent bisa di casting, cuman enggak guna
        // Employee emp = (Employee) ismail;
    }
}
