package gr.codehub;

import java.util.ArrayList;

public class Company {

    ArrayList<Employee> employees;

    public Company(){
        this.employees = new ArrayList<>();
    }

    public double calculateExpenses() {
        double expenses = 0;
        for (Employee employee: employees){
            expenses += employee.getSalary();
        }
        return expenses;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void hireEmployee(String name, String employeeType) {
       Employee employee = new Employee(name, employeeType);
       this.employees.add(employee);
    }
}
