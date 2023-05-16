package pro.sky.hwlistsspring.service;

import org.springframework.stereotype.Service;
import pro.sky.hwlistsspring.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    public final int MAX_NUMBER_OF_EMPLOYEES = 10;
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    public String addEmployee(String firstName, String lastName) {
        Employee newEmployee = new Employee(firstName,lastName);
        this.employees.add(newEmployee);
        return this.employees.get(this.employees.size()).toString();
    }

}
