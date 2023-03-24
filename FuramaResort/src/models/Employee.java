package models;

public class Employee extends Person{
    private String employeeId;
    private String educationLevel;
    private String position;
    private long salary;

    public Employee() {
    }

    public Employee(String fullName, String dateOfBirth, boolean gender, String idCard, String phoneNumber, String email, String employeeId, String educationLevel, String position, long salary) {
        super(fullName, dateOfBirth, gender, idCard, phoneNumber, email);
        this.employeeId = employeeId;
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "employeeId='" + employeeId + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
