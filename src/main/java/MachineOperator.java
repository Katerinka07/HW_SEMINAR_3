/**
 * Работник станка (Сдельная оплата труда)
 */
public class MachineOperator extends Employee{
    /**
     * Количество произведенных деталей
     */
    private int detailQuantity;

    /**
     * Бракованные детали
     */
    private int defective;

    public MachineOperator(String surName, String name, double salary, int age, int detailQuantity, int defective) {
        super(surName, name, salary, age);
        this.detailQuantity = detailQuantity;
        this.defective = defective;
    }
    public double calculatePrize() {
        return salary * (detailQuantity - defective) * 0.1;
    }

    @Override
    public double calculateSalary() {
        return (salary * detailQuantity) + calculatePrize();
    }

    @Override
    public String toString() {
        return String.format("%s %s, возраст: %d; Оператор станка; Ставка за одну деталь: %.2f руб.;Среднемесячная заработная плата: %.2f руб.",
                surName, name, age, salary, calculateSalary());
    }
}
