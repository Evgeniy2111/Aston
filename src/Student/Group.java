package Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group {

    private static List<Student> students;

    //cоздаем конструктор для создания группы
    public Group() {
        students = new ArrayList<>();
    }

    //метод добавления студента
    public static void addStudent(Student student) {
        students.add(student);
    }

    //метод удаления студента, после проверки среднего балла
    public static void delStudent() {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.pasGrades()) {
                iterator.remove();
            }
        }
    }

    //метод перевода студента на следующий курс со средним баллом >= 3
    public static void nextCource() {

        for (Student student : students) {
            if (student.getCourse() >= 5) {
                System.out.println(student);
            }

            if (!student.pasGrades()) {
                student.nextCourse();
            }
        }
    }

    //метод для вывода списка всех учашихся(для проверок выполнения методов)
    public static void printStudents() {
        System.out.println("Список студентов: ");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    //метод вывода списка учащихся на определенном курсе
    public static void printByCourse(int course) {
        System.out.println("Список студентов на курсе: " + course);

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}