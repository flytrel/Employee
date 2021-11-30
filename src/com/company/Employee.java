package com.company;

public class Employee { //сотрудники

    String name; //имя
    int age; //возраст
    int salary; //зарплата
    String sex; //пол

    public Employee() {}; //создание пустого конструктора

    public Employee(String name, int age, int salary, String sex) { //абстракция
        this.name = name;
        this.salary = salary;
        if ((age > 0) && (age < 100)) {
            this.age = age;
        }
        this.sex = sex;

    }

    public Employee(String name, int age, int salary) { //сотрудник без указания пола
        this.name = name;
        this.salary = salary;
        if ((age > 0) && (age < 100)) {
            this.age = age;
        }
    }

    public void printEmployee() { //метод класса, выводящий информацию о сотруднике
        System.out.print("Name = " + this.name + "\t");
        System.out.print("Age = " + this.age + "\t");
        System.out.print("Salary = " + this.salary + "\t");
        System.out.print("Sex = " + this.sex + "\t");
        System.out.println();
    }

    public void sayHello() {
        System.out.println("Hi! I am Employee! My name is " + this.name);
    }



}
