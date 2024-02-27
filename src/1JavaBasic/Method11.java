package JavaBasic;

public class Method11 {
    public static void main(String[] args) {

        sayHelloWorld();

        sayHello("Idaz", "Anggara");
        sayHello("Dear", "Kurniawan");

        var res = sum(100,100);
        System.out.println(res);
        System.out.println(sum(50,50));

        System.out.println(hitung(100, 30, "+"));
        System.out.println(hitung(90, 88, "-"));
        System.out.println(hitung(90, 88, "salah"));

        // varags
        int[] values = {80, 50, 50, 50, 80};
        sayCongrats("Idaz", values); // ini bisa kedua, array dan varags
        sayCongrats("Anggara", 80, 90, 76, 80); // ini hanya bisa menggunakan varags

    }

    // tanpa parameter
    static void sayHelloWorld(){
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
    }

    // mengguanakan parameter
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    // return value
    static int sum(int v1,int v2){
        var total = v1 + v2;
        return total;
    }
    static int hitung(int v1,int v2, String operasi){
        switch (operasi){
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            default:
                return 0;
        }
    }

    // variable argument
    // tanpa varags
    // static void sayCongrats(String name, int[] values) {

    // menggunakan varags, bisa langsung data dan bisa masukkin array juga
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
