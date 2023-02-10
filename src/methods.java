public class methods {


    public static void print(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void calculatingAmount(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = employees[i].getSalary() + sum;
        }
        System.out.println("Сумму затрат на зарплаты в месяц: " + sum);
    }

    public static void searchMin(Employee[] employees) {
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

    public static void searchMax(Employee[] employees) {
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

    public static void averageValue(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = employees[i].getSalary() + sum;
        }
        System.out.println("Средняя зарплата за месяц: " + sum / employees.length);
    }

    public static void checkFio(Employee[] employees) {
        for (int i = 0; i <employees.length; i++) {
            System.out.println(employees[i].getFio());
        }
    }
}
