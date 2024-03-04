package JavaOOP5Polymorphism.polymorphism;

public class Employee {
    protected String name;
    protected String division;
    protected Long  salary;

    public Employee(String name, String division, Long salary) {
        this.name = name;
        this.division = division;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String print() {
        return "Employee{"+
                "name='" + name + "'," +
                "division='" + division + "'," +
                "salary='" + salary + "'"+
                "}";
    }
}
