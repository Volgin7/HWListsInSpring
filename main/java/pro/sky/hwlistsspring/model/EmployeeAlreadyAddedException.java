package pro.sky.hwlistsspring.model;

public class EmployeeAlreadyAddedException extends Exception{
    public EmployeeAlreadyAddedException() {
        super("Employee Already Added");
    }
}
