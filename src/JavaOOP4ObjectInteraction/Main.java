package JavaOOP4ObjectInteraction;

import JavaOOP4ObjectInteraction.object_interaction.Hero;

public class Main {
    public static void main(String[] args) {
        Hero bruno = new Hero("Bruno", 4, 10);
        System.out.println(bruno.print());
        Hero hamada = new Hero("Hamada", 200, 5);
        System.out.println(hamada.print());

        hamada.attack(bruno);
        hamada.attack(bruno);

        // sesudah di attack
        System.out.println(bruno.print());

    }
}
