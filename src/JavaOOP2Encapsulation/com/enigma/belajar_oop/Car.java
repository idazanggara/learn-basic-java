package JavaOOP2Encapsulation.com.enigma.belajar_oop;

public class Car { // ini blueprint / class
//    public String name = "Civic";
//    public String color = "white";
//    public String brand = "Honda";
////    public Integer fuel = 10;
//    public String name ;
//    public String color ;
////    public String brand ;
//    private Integer fuel ;

    // ada baiknya semua properti private
    private String brand = "Honda";
    private String name ;
    private String color ;
    private Integer fuel ;

    /**
     * Akses Modifier
     * untuk menghindarkan direct acces, jadi kita enggak mengakses secara langsung dari objectnya
     *
     * Public : bisa diakses dari mana saja / class lain
     * Private : hanya bisa diakses oleh dari dalam class itu sendiri.
     * Protected : bisa diakses diclass itu sendiri,Sub class atau class anak (cllas turunannya), dan sesama package (class yang berada satu package dengannya)
     * No Access Modifier : hanya bisa di akses di class dan sesama package
     */
    public Car(String name, String colorParam, String brand, Integer fuel){
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
//        System.out.println(this);
        if(this.fuel <= 0){
            System.out.println("Isi bensin dulu dong!, rugi dong!!");
        } else {
            System.out.println("Bruuum");

        }
    }
//    static public void startEngineNon(){
//        System.out.println("test");
//    }
    // Encapsulasi cara pertama pakai method
    // public void fillFuel(Integer fuel) {
    public void setFuel(Integer fuel) {
        // cth, mobil enggak boleh lebih dari 50lt dan kurang dari 0
        // Guard Clause -> untuk menghindari else
        // jadi focusny ke yg salah/ error
        if(fuel > 50 || fuel <=0 ) {
            System.out.println("Fuel tidak boleh lebih dari 50lt atau kurang dari 0");
            return; // kalau pakai else enggak usah return
        } else if (this.fuel + fuel > 50) {
            int availableSpace = 50 - this.fuel;
            System.out.println("Tangki hanya dapat menampung hingga 50 liter bahan bakar. Tambahkan maksimal " + availableSpace + " liter.");
            return;
        } else {
            this.fuel += fuel;
        }


        System.out.println(this.fuel);


        // kelemahan direct akses, kita lansung tambah data tampa validasi
    }

    public Integer getFuel() {
        return this.fuel;
    }

    //dari IDE udah di bantu buatin getset
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // otomatis generate. getter, setter, constructor
    // mac cmd + N, windows/linux alt + insert / klik kanan pilih generate
    public String getBrand() {
        return brand;
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
