import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[10];
        emp[0] = new Employee("Иванов Иван Иванович",11111,1);
        emp[1] = new Employee("Старикова Елизавета Егоровна",20001,2);
        emp[2] = new Employee("Васильева Варвара Романовна",30400,3);
        emp[3] = new Employee("Калугин Даниил Юрьевич",40220,4);
        emp[4] = new Employee("Ушакова Таисия Георгиевна",11440,5);
        emp[5] = new Employee("Крюков Илья Всеволодович",22344,2);
        emp[6] = new Employee("Семенова Алиса Андреевна",70001,1);
        emp[7] = new Employee("Лебедев Тимофей Фёдорович",22000,3);
        emp[8] = new Employee("Соколов Михаил Елисеевич",9000,3);
        emp[9] = new Employee("Сергеева Александра Романовна",8888,3);
        methods.print(emp);
        methods.calculatingAmount(emp);
        methods.searchMin(emp);
        methods.searchMax(emp);
        methods.averageValue(emp);
        methods.checkFio(emp);
    }

}