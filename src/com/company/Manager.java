package com.company;

public class Manager extends Employee { //наследование от родительского класса Employee

    public Manager(String name, int age, int salary, String sex) { //абстракция
        this.name = name;
        this.salary = salary;
        if ((age > 0) && (age < 100)) {
            this.age = age;
        }
        this.sex = sex;
        int bonus;
    }

    private int generateBonus() { //приватный расчет бонуса, доступен только в классе Manager
        return this.salary * this.age / 100;
    }

    public int getBonus() { //публичное получение бонуса
        return generateBonus();
    }

    public Manager() {}; //создание пустого конструктора класса

    public void sayHello() { //полиформизм, переопределение метода родительского класса
        System.out.println("Hi! I am Manager! My name is " + this.name);
    }



}
