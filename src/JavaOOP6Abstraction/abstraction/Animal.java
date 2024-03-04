package JavaOOP6Abstraction.abstraction;

public abstract class Animal {
    private String name;

  // untuk membuat abstrack method
    public abstract void makeSound();

    public void eat(){
        System.out.println("Makan");
    };

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
