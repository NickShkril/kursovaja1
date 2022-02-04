package ru.skypro;

public class Employee {
    private final String firstName, middleName, lastName;
    private double salary;
    private int department;
    private int id;
    public static int counter;

    public Employee(String firstName, String middleName, String lastName, double salary, int department) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        counter = counter + 1;
        this.id = counter;

    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public static Integer getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }


    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }


    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return firstName + " " + middleName + " " + lastName + " " + salary + " " + department + " " + id;
    }
}
