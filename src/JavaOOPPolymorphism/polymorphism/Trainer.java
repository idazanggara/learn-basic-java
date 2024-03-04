package JavaOOPPolymorphism.polymorphism;

public class Trainer extends Employee{
    public Trainer(String name, String division, Long salary) {
        super(name, division, salary);
    }

    // untuk override bisa generate dan pilih override method
    @Override
    public String print() {
        return "Trainer{"+
                "name='" + name + "'," +
                "division='" + division + "'," +
                "salary='" + salary + "'"+
                "}";
    }
}
