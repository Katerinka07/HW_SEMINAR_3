import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(60000, 120001);
        int age = random.nextInt(18, 70);
        return new Worker(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, age);
    }
    public static Freelancer generateFreelancer(){
        String[] names = new String[] { "Анатолий", "Глеб", "Сергей", "Максим", "Виктор", "Кирилл", "Алексей", "Игорь", "Николай", "Григорий" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(120, 500);
        int hoursWorked = random.nextInt(10, 200);
        int age = random.nextInt(16, 50);
        return new Freelancer(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, age, hoursWorked);
    }
    public static MachineOperator generateOperator(){
        String[] names = new String[] { "Анатолий", "Глеб", "Сергей", "Максим", "Виктор", "Кирилл", "Алексей", "Игорь", "Николай", "Григорий" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(100, 300);
        int age = random.nextInt(18, 70);
        int detailQuantity = random.nextInt(200, 501);
        int defective = random.nextInt(0, 100);

        return new MachineOperator(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, age, detailQuantity, defective);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++){
            int typeEmployee = random.nextInt(1,4);
            if (typeEmployee == 1) {
                workers[i] = generateWorker();
            } else if (typeEmployee == 2){
                workers[i] = generateFreelancer();
            } else {
                workers[i] = generateOperator();
            }
        }
        return workers;
    }
}
