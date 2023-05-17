package pro.sky.hwlistsspring.model;

public class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException() {
        super("Employee not found");
    }
}
