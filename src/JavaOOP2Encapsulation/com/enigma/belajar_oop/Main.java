package JavaOOP2Encapsulation.com.enigma.belajar_oop;

public class Main {
    public static void main(String[] args) {

//        Car civic = new Car(); // disini manggil contructor
//        civic.name = "Civic";
//        civic.color = "White";
//        civic.brand = "Honda";
//        civic.fuel = 10;
//        System.out.println("Name: " + civic.name);
//        System.out.println("Color: " + civic.color);
//        System.out.println("Brand: " + civic.brand);
//
//        System.out.println("=======");
//        Car agya = new Car();
//        agya.name = "Agya";
//        agya.color = "Grey";
//        agya.brand = "Toyota";
//        agya.fuel = 10;
//        System.out.println("Name: " + agya.name);
//        System.out.println("Color: " + agya.color);
//        System.out.println("Brand: " + agya.brand);
//
        Car civic = new Car(
                "Civic",
                "White",
                "Honda",
                0
        ); // disini manggil contructor
//        civic.fuel = 9990; // ini enggak baik ya, ini direct acces/akses secara langsung

//        System.out.println("Name: " + civic.name);
//        System.out.println("Color: " + civic.color);
//        System.out.println("Brand: " + civic.brand);

        // instance method
        civic.setFuel(30);
        civic.setFuel(69);
        civic.setFuel(10);
        civic.startEngine();
        // non instance method
//        Car.startEngineNon();
//        System.out.println(civic);
        System.out.println(civic.getFuel());

        System.out.println("=======");
        Car agya = new Car(
                "Agya",
                "Grey",
                "Toyota",
                0
        );
//        System.out.println("Name: " + agya.name);
//        System.out.println("Color: " + agya.color);
//        System.out.println("Brand: " + agya.brand);
//        System.out.println("=======");

        Car supra =  new Car();
//        System.out.println("Name: " + supra.name);
//        System.out.println("Color: " + supra.color);
//        System.out.println("Brand: " + supra.brand);
//
//        System.out.println("=======");
//        System.out.println(civic.print());
//        System.out.println("=======");
//        System.out.println(agya.print());
//        System.out.println("=======");
//        System.out.println(supra.print());



    }
}
