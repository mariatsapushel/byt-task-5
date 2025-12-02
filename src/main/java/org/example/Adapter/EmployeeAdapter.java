package org.example.Adapter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter implements ITarget {
    private final BillingSystem thirdPartyBillingSystem = new BillingSystem();
    @Override
    public void processCompanySalary(String[][] employeesArray) {
        List<Employee> employees = new ArrayList<>();

        for (String[] empData : employeesArray) {
            int id = Integer.parseInt(empData[0]);
            String name = empData[1];
            String designation = empData[2];
            BigDecimal salary = new BigDecimal(empData[3]);
            Employee employee = new Employee(id, name, designation, salary);
            employees.add(employee);
        }
        thirdPartyBillingSystem.processSalary(employees);
    }
}
