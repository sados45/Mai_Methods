package maashesaplama;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ali Cincan", 2000, 45, 2015);
        double tax = employee.tax();
        double bonus = employee.bonus();
        employee.raiseSalary();
        String employeeInfo = employee.toString();
        System.out.println(employeeInfo + "\nTax: " + tax + "\nBonus: " + bonus);
    }
}
