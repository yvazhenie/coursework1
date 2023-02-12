public class Employee {
    private final int id;
    private String fio;
    private int salary;
    private int department;
    private static int counter;

    public Employee(String fio, int salary, int department) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
        this.id = ++ counter;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Работник " +
                "id-" + id +
                " Ф.И.О: " + fio +
                " зарплата: " + salary +
                " отдел: " + department
                ;
    }
}
