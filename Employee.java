//Object class
public class Employee{
    private String name;
    private double salary;

    //Construct
    public Employee(){
        name = "";
        salary = 0.0;
    }
    //Constructor Parameter
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    //Method
    public void print(){
        System.out.println("--------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + "Rp." + salary);
        System.out.println("--------------------------------");
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Method menghasilkan value
    public String print2() {
        return "Employee : " + name
        + "\nSalary : " + "Rp." + salary;
    }
}