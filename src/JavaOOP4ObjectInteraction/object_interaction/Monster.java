package JavaOOP4ObjectInteraction.object_interaction;

public class Monster {
    private String name;
    private Integer hp;
    private Integer damage;

    public Monster(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    // Overloading -> Membuat method yg sama dengan parameter yg berbeda
    public void attack(Monster monster) {
//        monster.hp -= this.damage;
        monster.receivedDamage(this.damage);
    }

    public void attack(Hero hero) {
//        hero.hp -= this.damage;
        hero.receivedDamage(this.damage);

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
}
