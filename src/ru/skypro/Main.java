package ru.skypro;

public class Main {
    public static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees[0] = new Employee("Mark", "mark", "Mark", 111.11, 1);
        employees[1] = new Employee("Mike", "Mike", "Mike", 222.22, 2);
        employees[2] = new Employee("Mick", "Mick", "Mick", 333.33, 3);
        employees[3] = new Employee("Dick", "Dick", "Dick", 444.33, 4);
        employees[4] = new Employee("Rick", "Rick", "Rick", 555.33, 5);
        employees[5] = new Employee("Nick", "Nick", "Nick", 666.33, 1);
        employees[6] = new Employee("Sick", "Sick", "Sick", 777.33, 2);
        employees[7] = new Employee("Wick", "Wick", "Wick", 888.33, 3);
        employees[8] = new Employee("Brick", "Brick", "Brick", 999.33, 4);
        employees[9] = new Employee("Big", "Big", "Big", 1100.33, 4);

        printListOfEmployees();
        salaryByMonthEmployee(employees);
        minimumSalaryEmployee();
        maximumSalaryEmployee();
        printAllSalaries(employees);
        fullNameEmployees();

    }
    // печать всех сотрудников без данных
    public static void fullNameEmployees() {
        System.out.println("Ф.И.О. все сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
    // печать всех сотрудников с данными
    public static void printListOfEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    // 1) Сумма зарплат за месяц.

    public static int salaryByMonthEmployee(Employee[] employees) {
        Employee[] arr = new Employee[10];
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            employees[i].getSalary();
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма трат за мессяц = " + sum + "рублей.");
        return sum;
    }
    // 2) Поиск сотрудника по минимальной зарплате

    public static Employee minimumSalaryEmployee() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    minSalaryEmployee = employee;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой = " + minSalaryEmployee + "рублей.");
        return minSalaryEmployee;
    }
    // 3) Поиск сотрудника по максимальной зарплате

    public static Employee maximumSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    maxSalaryEmployee = employee;
                }
            }
        }

        System.out.println("Сотрудник с максимальной зарплатой = " + maxSalaryEmployee + "рублей.");
        return maxSalaryEmployee;
    }
    // 4) Среднее значение зарплат

    public static void printAllSalaries(Employee[] salary) {
        float sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i].getSalary();
        }
        float average = sum / salary.length;
        System.out.println("Среднее значение зарплат = " + average);
    }
}





