import java.text.NumberFormat;

public class Employee {
    private int employeeNumber;

    private double hourlyWage;
    private int hoursWorked;

    public Employee(double hourlyWage, int hoursWorked, int employeeNumber) {
        this.employeeNumber = employeeNumber;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Employee Number

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public int getNextEmployeeNumber() {
        return this.employeeNumber + 1;
    }

    // Hourly wage

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    // Hours worked

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    // Regular wage

    public double calculateRegularPay() {
        return Math.min(this.hoursWorked, 8) * this.hourlyWage;
    }

    // Overtime Pay

    public double calculateOvertimePay() {
        return Math.max(this.hoursWorked - 8, 0) * (this.hourlyWage * 1.5);
    }

    public double calculateGrossPay() {
        return calculateRegularPay() + calculateOvertimePay();
    }

    // Constructors

    public boolean equals(int employeeNumber, double hourlyWage, int hoursWorked) {
        boolean results = false;
        if (employeeNumber == this.employeeNumber || hourlyWage == this.hourlyWage || hoursWorked == this.hoursWorked) {
            results = true;

        } else {
            results = false;
        }
        return results;

    }

    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return "Employee ID: " + this.employeeNumber + "\n" +
                "Hours Worked: " + this.getHoursWorked() + "\n" +
                "Hourly Wage: " + currencyFormat.format(this.hourlyWage) + "\n" +
                "Regular Pay: " + currencyFormat.format(calculateRegularPay()) + "\n" +
                "Overtime Pay: " + currencyFormat.format(calculateOvertimePay()) + "\n" +
                "Gross Pay: " + currencyFormat.format(calculateGrossPay());
    }

}
