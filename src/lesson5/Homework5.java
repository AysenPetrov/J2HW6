package lesson5;
public class Homework5 {
    public static void main(String[] args) {

        // Task 1: OOP Basics
        Employee[] employeeDb = new Employee[5];

        employeeDb[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "+79451234595", 32000, 27);
        employeeDb[1] = new Employee("Doe John", "Designer", "dojohn@mailbox.com", "+79451234565", 40500, 42);
        employeeDb[2] = new Employee("Vasilieva Natasha", "Developer", "VasNatasha@mailbox.com", "+79350801234", 45500, 32);
        employeeDb[3] = new Employee("Brode Ben", "Programmer", "brben@mailbox.com", "+72251234548", 60000, 35);
        employeeDb[4] = new Employee("Petrov Roman", "Programmer", "petrov.rome@mailbox.com", "+79851345321", 55000, 57);

        for (Employee emp : employeeDb) {
            if (emp.getAge() > 40) {
                emp.getEmployeeInfo();
            }
        }

        System.out.println();

    }
}