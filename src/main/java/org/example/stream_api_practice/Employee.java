package org.example.stream_api_practice;

public class Employee {
    private int empId;
    private String empName;
    private String department;
    private int Salary;

    public Employee(int empId, String empName, String department, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        Salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
