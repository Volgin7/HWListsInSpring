package pro.sky.hwlistsspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.hwlistsspring.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
        this.employeeService.addEmployee("Alex", "Volgin");  // as example
        this.employeeService.addEmployee("Ilya", "Sazonos");  // as example
        this.employeeService.addEmployee("Artyem", "Petrosyan");  // as example
        this.employeeService.addEmployee("Anastasiya", "Zabrodina");  // as example

    }

    @GetMapping()
    public String hello() {
        return "Welcome to Employee Service";
    }
    @GetMapping("/add")
    public String add(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName ) {
        return "New employee " + employeeService.addEmployee(firstName,lastName) + " added";
    }

    @GetMapping("/find")
    public String find(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName ) {
        return "Employee " + employeeService.findEmployee(firstName,lastName) + " found";
    }

    @GetMapping("/remove")
    public String remove(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName ) {
        return "Employee " + employeeService.removeEmployee(firstName,lastName) + " removed";
    }

}
