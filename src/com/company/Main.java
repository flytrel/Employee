package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя сотрудника: ");
        String name = sc.nextLine();
        System.out.println("Введите возраст сотрудника: ");
        int age = sc.nextInt();
        System.out.println("Введите зарплату сотрудника: ");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите пол сотрудника: ");
        String sex = sc.nextLine();

        Employee e1 = new Employee(name, age, salary, sex); //создание объекта класса(сотрудника)

        e1.printEmployee(); //вывод информации о сотруднике

        Employee e2 = new Employee("Anna", 18 ,40000); //создание сотрудника без пола

        e2.printEmployee();

        e1.sayHello();

        Manager m1 = new Manager("Alex", 35, 50000, "male");
        m1.printEmployee();
        m1.sayHello();
        System.out.println("Bonus = " + m1.getBonus());

    }
}
