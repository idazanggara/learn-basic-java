package JavaOOP;

public class Main {
    public static void main(String[] args) {
        /*
         instace seperti buat variable
         tipedata nama_variable = value
         tipedata itu bisa ada tipe data custom, nah class itu tipe data Custom yg hasilnya object

         typedata :Car
         nama variable :civic
         untuk membuat object dari class kita menggunakan keyword new.
        */
//        Car civic = new Car(); // instance
//        System.out.println(civic); // hasilnya sama seperti array, hasilnya hash code, bisa di bilang identitas si object tersebut. kalau alamat memory java enggak terang"an kasih tau alamat memorynya
        // hash code adalah identitas si object

        // Cara 1 - untuk mengisi propertu pada obejct/instance
        // Direct Access -> Mengakses property/attribute secara langsung | sebenernya dilarang
//        Car civic = new Car(); // disini manggil contructor
//
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
                20
        ); // disini manggil contructor

        System.out.println("Name: " + civic.name);
        System.out.println("Color: " + civic.color);
        System.out.println("Brand: " + civic.brand);

        System.out.println("=======");
        Car agya = new Car(
                "Agya",
                "Grey",
                "Toyota",
                10
        );
        System.out.println("Name: " + agya.name);
        System.out.println("Color: " + agya.color);
        System.out.println("Brand: " + agya.brand);
        System.out.println("=======");

        Car supra =  new Car();
        System.out.println("Name: " + supra.name);
        System.out.println("Color: " + supra.color);
        System.out.println("Brand: " + supra.brand);

        System.out.println("=======");
        System.out.println(civic.print());
        System.out.println("=======");
        System.out.println(agya.print());
        System.out.println("=======");
        System.out.println(supra.print());



    }
}
