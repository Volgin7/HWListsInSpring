package pro.sky.hwlistsspring.service;

import org.springframework.stereotype.Service;
import pro.sky.hwlistsspring.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final int MAX_NUMBER_OF_EMPLOYEES = 5;
    private List<Employee> employees;


    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }
    public int getMAX_NUMBER_OF_EMPLOYEES() {
        return MAX_NUMBER_OF_EMPLOYEES;
    }

    public String addEmployee(String firstName, String lastName) {
        Employee newEmployee = new Employee(firstName,lastName);
        this.employees.add(newEmployee);
        System.out.println("this.employees = " + this.employees);
        return this.employees.get(this.employees.size() - 1).toString();
    }

    public String removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        for (int i = 0; i < this.employees.size(); i++) {
            if(this.employees.get(i).equals(employee)) {
                this.employees.remove(i);
                return employee.toString();
            }
        }
        return "can't be";
    }
    public String findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        for (int i = 0; i < this.employees.size(); i++) {
            if(this.employees.get(i).equals(employee)) {
                return this.employees.get(i).toString();
            }
        }
        return "can't be";
    }


}
