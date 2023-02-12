public class Main {
    private static Employee [] employees = new Employee[10];

    public static void print() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void calculatingAmount() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = employees[i].getSalary() + sum;
        }
        System.out.println("Сумму затрат на зарплаты в месяц: " + sum);
    }

    public static void searchMin() {
        //int min = employees[0].getSalary() ;
        Employee worker = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < worker.getSalary()) {
                //min = employees[i].getSalary();
                worker = employees[i];
            }

        }
        System.out.println("Сотрудника с минимальной зарплатой: " +worker.toString() );
    }

    public static void searchMax() {
        //int max = employees[0].getSalary();
        Employee worker = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > worker.getSalary()) {
                //max = employees[i].getSalary();
                worker = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + worker.toString());
    }

    public static void averageValue() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = employees[i].getSalary() + sum;
        }
        System.out.println("Средняя зарплата за месяц: " + sum / employees.length);
    }

    public static void checkFio() {
        for (int i = 0; i <employees.length; i++) {
            System.out.println(employees[i].getFio());
        }
    }
    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович",11111,1);
        employees[1] = new Employee("Старикова Елизавета Егоровна",20001,2);
        employees[2] = new Employee("Васильева Варвара Романовна",30400,3);
        employees[3] = new Employee("Калугин Даниил Юрьевич",40220,4);
        employees[4] = new Employee("Ушакова Таисия Георгиевна",11440,5);
        employees[5] = new Employee("Крюков Илья Всеволодович",22344,2);
        employees[6] = new Employee("Семенова Алиса Андреевна",70001,1);
        employees[7] = new Employee("Лебедев Тимофей Фёдорович",22000,3);
        employees[8] = new Employee("Соколов Михаил Елисеевич",9000,3);
        employees[9] = new Employee("Сергеева Александра Романовна",8888,3);
        print();
        calculatingAmount();
        searchMin();
        searchMax();
        averageValue();
        checkFio();
    }

}