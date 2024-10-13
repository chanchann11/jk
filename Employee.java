public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;
    Employee(int ID, String firstName, String lastName, int Salary) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getID() {
        return ID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        return this.salary += percent * 12;
    }
    public String toString() {
        return "Employee [ID= " + ID + ",name: " + firstName + " " + lastName + " " + salary + "]";
    }
}
