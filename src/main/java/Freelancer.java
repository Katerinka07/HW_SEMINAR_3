/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee {
    /**
     * Количество отработааных часов
     */
    private int hoursWorked;

    public Freelancer(String surName, String name, int salary, int age, int hoursWorked) {
        super(surName, name, salary, age);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return salary * hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("%s %s, возраст: %d ; Фрилансер; Почасовая ставка: %.2f руб.;Среднемесячная заработная плата: %.2f руб.",
                surName, name, age, salary, calculateSalary());
    }
}
