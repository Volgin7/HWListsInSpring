package pro.sky.hwlistsspring.model;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;


    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // all getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    // all setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return this.lastName + " " + this.firstName;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }

    public boolean equals(Employee employee) {
        if(employee.firstName.equals(this.firstName) && employee.lastName.equals(this.lastName)) {
            return true;
        } else {
            return false;
        }
    }

}
