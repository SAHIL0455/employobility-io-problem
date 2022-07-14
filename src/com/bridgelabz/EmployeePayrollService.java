package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {CONSOLE_IO, FILE_IO, DB_IO, REST_ID;
    }
    static List<EmployeePayrollData> EmployeePayrollList;

    public EmployeePayrollService() {
    }

    public EmployeePayrollService(List<EmployeePayrollData> EmployeePayrollList) {
        this.EmployeePayrollList = EmployeePayrollList;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employability IO problem");
        Scanner consoleInputService = new Scanner(System.in);
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        employeePayrollService.readEmployeePayRollData(consoleInputService);
        employeePayrollService.writeEmployeePayRollData(IOService.CONSOLE_IO);
    }

    public static void writeEmployeePayRollData(IOService ioService) {
        if (ioService.equals(IOService.CONSOLE_IO)) {
            System.out.println("writing Employee Payroll Roaster to console\n" + EmployeePayrollList);
        } else if (ioService.equals(IOService.FILE_IO)) {
            new EmployeePayrollFileIOService().writeData(EmployeePayrollList);
        }
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
    public long countEntries(IOService ioService) {
        if (ioService.equals(IOService.FILE_IO))
            return new EmployeePayrollFileIOService().countEntries();
        return 0;
    }
    public void printData(IOService ioService) {
        if (ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().printData();
    }

}
