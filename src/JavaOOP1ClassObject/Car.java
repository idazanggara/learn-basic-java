package JavaOOP1ClassObject;
// reserved keywords
// untuk saat ini public kita abaikan dulu dan kita biarkan
public class Car { // ini blueprint / class
    // entripoint apa? itu adalah main. jadi kedepan  sebuah aplikasi itu entripoint cuman 1 yaitu di main aja, lalu di kelas lain ngapain? buat atribute sama ngebuat behavior atau si method.

    // instace variable
    // blueprint orang, atribut apa? detail orangnya

    // public ini acces modifier, nanti kita bahas
    // ini properti / attribute
    // kalau langsung di isi gini, percuma dong baut bule print kan
//    public String name = "Civic";
//    public String color = "white";
    public String brand = "Honda";
//    public Integer fuel = 10;

    public String name ;
    public String color ;
//    public String brand ;
    public Integer fuel ;

    /**
     * Contructor
     * Fungsi/method yg akan di panggil pada saat obejct itu di buat
     *
     * Constuctor tidak memiliki return value, bukan void atau lainnya, dia method khusus
     * Consturctor namanya sama dengan class, dan menggunakan pascalcase, bukan seperti method yg camelcase
     *
     * Constuctor menerapkan overload
     * Overload -> membuat sebuah method dengan nama yg sama namun parameternya berbeda
     *
     */
    public Car(String name, String colorParam, String brand, Integer fuel){
        // Shadowing Variable
        //  name = name;
        // this -> memanggil dirinya sendiri, atau memanggil si classnya
        this.name = name;
        color = colorParam; // ini tetap bisa, tapi membingungkan
        this.brand = brand;
        this.fuel = fuel;
    }

    public Car(String name) {
        this.name = name;
    }

    public Car() {

    }

    // Method non static itu seperti instance method seperti instance varibale kemaren. jadi methodnya nempel di object bukan di classnya
    public void startEngine(){
//        System.out.println("Bruuum");
        System.out.println(this);
        if(this.fuel <= 0){
            System.out.println("Isi bensin dulu dong!, rugi dong!!");
        } else {
            System.out.println("Bruuum");

        }
    }
    static public void startEngineNon(){
        System.out.println("test");
    }

    public String print(){
        return "Car{"+
                "name='" + this.name + "'," +
                "color='" + this.color + "'," +
                "brand='" + this.brand + "'," +
                "fuel='" + this.fuel +
                "}";
    }

}
