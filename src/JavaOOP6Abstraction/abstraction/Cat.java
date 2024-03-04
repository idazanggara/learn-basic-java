package JavaOOP6Abstraction.abstraction;

public class Cat extends Animal {
    // diakhir, kita coba tanpa property dulu
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meoww");
    }
    // tipe data saat instace ketika animal enggak bisa menggunakan method clim di bawah ini
    public void climb() {

    }

}
