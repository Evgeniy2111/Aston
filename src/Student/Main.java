package Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//создание обьекта Группа
        Group group = new Group();
//создание объектов Студент
        Student student0 = new Student("Zhenya", "101-А", 1, Arrays.asList(4, 8, 9, 8, 7));
        Student student1 = new Student("Ivan", "202-B", 2, Arrays.asList(2, 1, 2, 3, 5));
        Student student2 = new Student("Daria", "101-A", 1, Arrays.asList(9, 10, 10, 8, 8));
        Student student3 = new Student("Andrey", "202-A", 5, Arrays.asList(8, 9, 7, 10, 8));
//добавление обектов в список(коллекцию)
        Group.addStudent(student0);
        Group.addStudent(student1);
        Group.addStudent(student2);
        Group.addStudent(student3);
        System.out.println();
//вывод готового списка студентов
        Group.printStudents();
        System.out.println();

//вывод списка студентов, после удаления
        Group.delStudent();
        System.out.println("После удаления не успквающих: ");
        Group.printStudents();
        System.out.println();
//вывод списка учащихся определенного курса, в данном случае первого
        Group.printByCourse(1);
        System.out.println();
//вывод списка студентов, перешедших на следующий курс, с учетом максильного курса, в данном случае 5 курс
        Group.nextCource();
        Group.printStudents();


    }
}