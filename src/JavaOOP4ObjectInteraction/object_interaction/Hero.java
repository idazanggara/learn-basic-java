package JavaOOP4ObjectInteraction.object_interaction;

public class Hero {
    private String name;
    private Integer hp;
    private Integer damage;


    public Hero(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public void attack(Hero hero) {
        // validasi menyerang diri sendiri
        // equals ini membandingkan object dengan object, karena hasilnya hash code atau identitas objectnya. jadi tidak perlu === kan udah equals
        if(hero.equals(this)){
            System.out.println("Tidak bsia menyerang siri sendiri");
            return;
        }
        if (hero.hp <= 0){
            String message = String.format("%s sudah mati", hero.name);
            System.out.println(message);
            return;
        }
        if(this.hp <= 0){
            System.out.println(this.name + " sudah mati");
            return;
        }

        String message = String.format("%s menyerang %s",
                this.name,
                hero.name
        );
        System.out.println(message);
        // hero B mendatap serangan dari Hero A,
        hero.receivedDamage(this.damage);
//        hero.hp = hero.hp - this.damage;
        // Logic coba mereka ngerjain, ini berkaitan dengan Object Interaction
    }

    public void attack(Monster monster){
        monster.receivedDamage(this.damage);
    }

    public void receivedDamage(Integer damage) {
        this.hp -= damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String print(){
        return "Hero{" +
                "name='" + name + "'," +
                "hp='" + hp + "'," +
                "damage='" + damage + "'" +
                "}";
    }
}
