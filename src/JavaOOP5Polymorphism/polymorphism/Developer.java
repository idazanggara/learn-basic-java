package JavaOOP5Polymorphism.polymorphism;

public class Developer extends Employee{
    public Developer(String name, String division, Long salary) {
        super(name, division, salary);
    }

    @Override
    public String print() {
        return "Developer{"+
                "name='" + name + "'," +
                "division='" + division + "'," +
                "salary='" + salary + "'"+
                "}";
    }

    public void developing() {
        System.out.println("Coding...");
    }
}
