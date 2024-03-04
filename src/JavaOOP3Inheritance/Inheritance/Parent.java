package JavaOOP3Inheritance.Inheritance;

public class Parent {
    protected Integer eyes;
    protected String hairColor;
    protected String skinColor;
    protected Integer stamina;

    public Parent(Integer eyes, String hairColor, String skinColor) {
        this.eyes = eyes;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.stamina = 100;
    }

    public void eat() {
        System.out.println("Sedang Makan");
        this.stamina += 10;
    }

    public void run() {
        System.out.println("Sedang Berlari");
        this.stamina -= 5;
    }

    public Integer getEyes() {
        return eyes;
    }

    public void setEyes(Integer eyes) {
        this.eyes = eyes;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    // kita bisa langsung buat print di parentnya aja, biar semuanya dapet dari parent dan semua childnya
    public String print(){
        return "Parent{" +
                "eyes='" + eyes + "'," +
                "hairColor='" + hairColor + "'," +
                "skinColor='" + skinColor + "'," +
                "stamina='" + stamina +
                "}";
    }

}
