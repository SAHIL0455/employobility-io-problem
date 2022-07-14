package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries(){
        EmployeePayrollData[] arrayofEmp = {
                new EmployeePayrollData(1,"pavan",3000),
                new EmployeePayrollData(2,"sai",4000),
                new EmployeePayrollData(3,"mansi",5000)
        };
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayofEmp));
        employeePayrollService.writeEmployeePayRollData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entries);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        System.out.println("Number of employee payroll service entries are: " + entries);
    }
}
