package org.domain;

public class Employee {
    private int empId;
    private String empName;
    private String email;
    private double salary;

    public Employee() {
        System.out.println("Employee Object Created Successfully");
    }

    public Employee(int empId, String empName, String email, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
