package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNumber;
    private int salary;

    public Employee(String name, String nationalInsuranceNumber, int salary) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNationalInsuranceNumber() {
        return this.nationalInsuranceNumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0) {
            this.salary += raise;
        }
    }

    public double payBonus() {
        return this.salary / 100;
    }
}
