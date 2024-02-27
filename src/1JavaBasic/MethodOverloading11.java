package JavaBasic;

public class MethodOverloading11 {
    public static void main(String[] args) {
        // jadi overloading, kita bisa buat method dengan nama yg sama sebanyak mungkin tapi parameternya berbeda. di js tidak bisa
        sayHello();
        sayHello("Idaz");
        sayHello("Idaz", "Anggara");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
