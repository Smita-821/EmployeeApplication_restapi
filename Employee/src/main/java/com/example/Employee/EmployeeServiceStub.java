package com.example.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceStub {
    private static Map<Long,Employee> employees=new HashMap<>();
    private static Long index=2L;

    static {
        Employee employee1=new Employee(1L,"Smita","89080909009080");
        Employee employee2=new Employee(2L,"Preeti","436666629090");
        employees.put(1L,employee1);
        employees.put(2L,employee2);

    }
    public static List<Employee> getAllEmployees(){
        return new ArrayList<>(employees.values());
    }
    public static Employee  getEmployeeDetails(Long employeeId){
        return employees.get(employeeId);
    }
    public static Employee addEmployee(Employee employee){
        index+=1;
        employee.setId(index);
        employees.put(index,employee);
        return employee;
    }
    public static Employee  updateEmployee(Long employeeId,Employee employee){
        employee.setId(employeeId);
        employees.put(employeeId,employee);
        return employee;
    }
    public static Employee deleteEmployee(Long employeeId){
        return employees.remove(employeeId);

    }


}
