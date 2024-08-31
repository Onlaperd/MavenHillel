package Homework_23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Roma", 32, 100);
        Student student2 = new Student("Tymofiy", 21, 98);
        Student student3 = new Student("Stepan", 41, 68);
        Student student4 = new Student("Panas", 15, 92);
        Student student5 = new Student("Max", 18, 50);

        ArrayList<Student> students = new ArrayList<>(List.of(student1, student2, student3, student4, student5));

        ArrayList<Student> filter = students.stream()
                .filter(student -> student.getAge() > 22)
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> string = students.stream()
                .map(Student::getName)
                .collect(Collectors.toCollection(ArrayList::new));

        int studentsAgeSum = students.stream()
                .map(Student::getAge)
                .reduce(0, Integer::sum);

        System.out.println("відфільтрований список: " + filter);
        System.out.println("список імен студентів: " + string);
        System.out.println("сумарний вік студентів: " + studentsAgeSum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

}
