package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    static List<EmployeePayrollData> EmployeePayrollList = new ArrayList<EmployeePayrollData>();

    public static void main(String[] args) {
        System.out.println("Welcome to Employability IO problem");
        Scanner consoleInputService = new Scanner(System.in);
        readEmployeePayRollData(consoleInputService);
        writeEmployeePayRollData();
    }

    private static void writeEmployeePayRollData() {
        System.out.println("writing Employee Payroll Roaster to console\n"+EmployeePayrollList);
    }

    private static void readEmployeePayRollData(Scanner consoleInputService) {
        System.out.println("Enter the Employee ID");
        int id = consoleInputService.nextInt();
        System.out.println("Enter the Employee Name");
        String name = consoleInputService.next();
        System.out.println("Enter the Employee Salary");
        double salary = consoleInputService.nextDouble();
        EmployeePayrollList.add(new EmployeePayrollData(id,name,salary));
    }
}
