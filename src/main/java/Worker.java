/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee{
    public Worker(String surName, String name,double salary, int age) {
        super(surName, name, salary,age);
    }
    @Override
    public double calculateSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s, возраст %d; Рабочий; Среднемесячная заработная плата: %.2f руб.",
                surName, name, age, calculateSalary());
    }

}