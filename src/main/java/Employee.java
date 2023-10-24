/**
 * Рабочий (базовый тип)
 */
public abstract class Employee implements Comparable<Employee> {
    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;
    protected int age;

    public Employee(String surName, String name, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Расчет среднемесячной заработной платы
     *
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();
//    @Override
//    public int compareTo(Employee o) {
//        int surNameRes = surName.compareTo(o.surName);
//        if (surNameRes == 0){
//            return name.compareTo(o.name);
//        }
//        return surNameRes;
//    }


    @Override
    public int compareTo(Employee o) {
        int ageRes = this.age - o.age;
        if (ageRes == 0) {
            return surName.compareTo(o.surName);
        }
        return ageRes;
    }

    @Override
    public String toString() {
        return String.format("%s %s, возраст:%d; ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, age, salary, calculateSalary());
    }

}
