package pro.sky.hwlistsspring.model;

public class EmployeeStorageIsFullException extends Exception{
    public EmployeeStorageIsFullException() {
        super("StorageFull");
    }
}
