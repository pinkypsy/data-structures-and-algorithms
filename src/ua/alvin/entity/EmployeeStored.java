package ua.alvin.entity;

public class EmployeeStored {

    private String key;
    private Employee employee;

    public EmployeeStored(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }

    public String getKey() {
        return key;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString(){
        return employee.toString();
    }
}
