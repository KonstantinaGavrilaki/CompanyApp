package gr.codehub;

public class Employee {
    private String name;
    private double salary;
    private String employeeType;
    private double bonus;

    public Employee(String name, String employeeType) {
        this.name = name;
        this.employeeType = employeeType;
        //arxikopoihsh misthou
        calculateMonthlySalary(employeeType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", employeeType='" + employeeType + '\'' +
                ", bonus='" + bonus + '\'' +
                '}';
    }

    public void calculateMonthlySalary(String employeeType) {
        if (employeeType == "Developer" ) {
            this.salary = 1000;
            //arxikopoihsh bonus gia developer
            this.bonus = 0.0;
        }
        else if(employeeType == "Manager"){
            this.salary = 1000 + (0.2*1000);
            //arxikopoihsh bonus gia managern
            this.bonus = 0.2;
        }
        else{
            System.out.println("Something else...");
        }
    }
}
