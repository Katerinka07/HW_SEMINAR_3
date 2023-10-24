import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Worker worker = new Worker("Михайлов", "Фёдор", 75000, 45);
        System.out.println(worker);
        Freelancer freelancer = new Freelancer("Иванов", "Виталий", 400, 18, 160);
        System.out.println(freelancer);
        MachineOperator machineOperator = new MachineOperator("Сафронов", "Михаил", 200, 55, 130, 0);
        System.out.println(machineOperator);
        System.out.println("-".repeat(25));

        System.out.println("Список сотрудников: ");
        Employee[] workers = EmployeeFabric.generateEmployees(20);
        for (Employee emp : workers) {
            System.out.println(emp);
        }
        System.out.println("-".repeat(25));

        System.out.println("Сортровка по убыванию заработной платы: ");
        Arrays.sort(workers,new SalaryComparator());
        for (Employee emp : workers) {
            System.out.println(emp);
        }
        System.out.println("-".repeat(25));
        System.out.println("Сортровка по возрасту: ");
        Arrays.sort(workers, new AgeComparator());
        for (Employee emp : workers) {
            System.out.println(emp);
        }
        System.out.println("-".repeat(25));

        System.out.println("Сортровка по возрасту(от младшего к старшему) и фамилии: ");  // Метод compareTo созданный на уровне базового типа Employee
        Arrays.sort(workers);
        for (Employee emp : workers) {
            System.out.println(emp);
        }

    }
}
