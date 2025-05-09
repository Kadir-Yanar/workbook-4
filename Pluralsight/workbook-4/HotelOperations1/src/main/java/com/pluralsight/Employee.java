package com.pluralsight;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {

        return employeeID;
    }

    public void setEmployeeID(int employeeID) {

        this.employeeID = employeeID;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public double getPayRate() {

        return payRate;
    }

    public void setPayRate(double payRate) {

        this.payRate = payRate;
    }

    public double getHoursWorked() {

        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {

        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        }
        else {
            return hoursWorked;
        }
    }

    public double getOvertimeHours(){
        if (hoursWorked>40){
            return hoursWorked-40;
        }
        else return 0;
    }

    public double getTotalPay(){
        return  (getRegularHours()*payRate) + (getOvertimeHours()*payRate*1.5);
    }

}