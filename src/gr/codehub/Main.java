package gr.codehub;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Company company = new Company();
        company.hireEmployee("Dina", "Manager");
        company.hireEmployee("Dina", "Developer");
        company.hireEmployee("Dina", "Chef");
        System.out.println(company.getEmployees());

    }
}
