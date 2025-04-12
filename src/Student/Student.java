package Student;

import java.util.List;

public class Student {

    private String name;//имя студента
    private String group;//группа
    private int course;//курс
    private List<Integer> grades;//оценка

    //создал конструктр Student.Student
    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    //создал методы возращающие параметры (для создания новых объектов)
    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    // метод рассчета среднего балла
    public double calculatorAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    //метод проверки среднего балла, на условие <3
    public boolean pasGrades() {
        return calculatorAverageGrade() < 3;
    }

    //метод проверки и перевода студента на след. курс, ввод ограничений на максимальный курс
    public void nextCourse() {
        if (!pasGrades() && course < 5) {
            course++;
        } else {
            System.out.println("выпускной курс");
        }
    }

    public String toString() {
        return "Студент: " + name + " -- учащийся группы: " + group + ", " + course + " курса" +
                "\nИмеет средний балл: " + calculatorAverageGrade();
    }
}




