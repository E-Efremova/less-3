package efremova.qa;

public class EmployeeMain {

    public static void main(String[] args){
        Employee QA1 = new Employee();
        QA1.name="Анастасия";
        QA1.surname="Агапова";
        QA1.age=25;
        QA1.position="QA";
        QA1.salary= 100;
        QA1.dateOfBirth="12 февраля";
        QA1.project="Test";
        System.out.println(QA1.surname);

        Employee QA2 = new Employee();
        QA2.name="Василий";
        QA2.surname="Федоров";
        QA2.age=40;
        QA2.position="QA";
        QA2.salary= 200;
        QA2.dateOfBirth="15 марта";
        QA2.project="Test1";
        System.out.println(QA2.name);
    }
}