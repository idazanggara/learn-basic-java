package JavaOOP3Inheritance.Inheritance;

public class Child extends Parent {
    // kalau kita memiliki parent, berarti child harus ada constructor yg sama
    public Child(Integer eyes, String hairColor, String skinColor) {
        super(eyes, hairColor, skinColor); // super ini kita enggak perlu buat ulang attribut/propertinya, jadi langsung ambil punya parent
    }

    // anotation, enggak di kasih enggak papa. ini hanya sebagai penanda
    @Override
    public void run() {
//        super.run(); ini tetep menggunakan punyanya parent
        this.stamina -= 3;
    }

    @Override
    public void eat() {
        this.stamina += 15;
    }

    public String print(){
         //properti punya parent
         //bisa panggil
         //eyes aja -> parameter kalo ada, kalau enggak ada si child
         //this.eyes -> diri sendiri/ child
         //super.eyes -> Parent
        return "Child{" +
                "eyes='" + super.eyes + "'," +
                "hairColor='" + super.hairColor + "'," +
                "skinColor='" + super.skinColor + "'," +
                "stamina='" + super.stamina +
                "}";
    }
}
