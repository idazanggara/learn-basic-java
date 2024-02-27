package JavaBasic;

public class Scope13 {
    public static void main(String[] args) {
        // jadi variable di java siklus hidupnya hanya bisa di akses di dalam bloknya, di luarnya enggak bisa
    sayHello("Idaz");
    sayHello("");
    }
/*
* Ini komentar
*
* */
    static void sayHello(String name) {
        String hello = "Hello "+ name;

        if(!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
//        System.out.println(hi); // enggak bisa akses
    }
}
