package maashesaplama;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public void raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked < 10) {
            salary *= 1.05;
        } else if (yearsWorked < 20) {
            salary *= 1.1;
        } else {
            salary *= 1.15;
        }
    }

    public String toString() {
        return "Name: " + name + "\nSalary: " + salary + "\nWork Hours: " + workHours + "\nHire Year: " + hireYear;
    }
}
