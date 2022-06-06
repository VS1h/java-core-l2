package oop.lesson9.stream.task1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class Student {
    // почему Idea предлагает сделать переменные  private final? изначально они private
    private String name;
    private String lastName;
    private final int numberCourse;
    private final List<Integer> studentGradeList;

    public Student(String name, String lastName, int numberCourse, List<Integer> studentGradeList) {
        this.name = name;
        this.lastName = lastName;
        this.numberCourse = numberCourse;
        this.studentGradeList = studentGradeList;
    }

    public static Map<Integer, Double> sortStudentsByCourseAndAverageGrades(List<Student> list) {
        return list.stream()
                .filter(student -> student.getStudentGradeList().size() > 3)
                .collect(Collectors.groupingBy(Student::getNumberCourse, Collectors.averagingDouble(Student::averageGradeOneStudent)));
    }

    public static Map<Integer, List<String>> sortStudentsByCourseAndFullName(List<Student> list) {
        return list.stream()
                .sorted(Comparator
                        .comparing(Student::getName)
                        .thenComparing(Student::getLastName))
                .collect(Collectors.groupingBy(Student::getNumberCourse, mapping(Student::getFullName, toList())));
    }

    public double averageGradeOneStudent() {
        double averageGrade = 0.0;
        for (Integer integer : studentGradeList) {
            averageGrade += integer;
        }
        return averageGrade / studentGradeList.size();
    }

    public List<Integer> getStudentGradeList() {
        return studentGradeList;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberCourse() {
        return numberCourse;
    }

    public String getFullName() {
        return name + " " + lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberCourse=" + numberCourse +
                ", studentGradeList=" + studentGradeList +
                '}';
    }
}
