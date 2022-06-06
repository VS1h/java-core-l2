package oop.lesson9.stream.task1;
/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StreamTask {
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Anna", "Svanova", 3, Arrays.asList(4, 5, 2, 6, 5, 2)));
        listStudents.add(new Student("Cidr", "Letrov", 3, Arrays.asList(4, 4, 2)));
        listStudents.add(new Student("Anna", "Sidorova", 3, Arrays.asList(4, 4, 5, 5, 4, 5)));
        listStudents.add(new Student("Fedor", "Medorov", 5, Arrays.asList(4, 4, 5, 3)));
        listStudents.add(new Student("Basta", "Krestova", 2, Arrays.asList(4, 4, 5)));
        System.out.println((listStudents));

        Map<Integer, Double> mapSortByCourseAndAverageGrade = Student.sortStudentsByCourseAndAverageGrades(listStudents);
        System.out.println(mapSortByCourseAndAverageGrade);
        Map<Integer, List<String>> mapSortByCourseAndFullname = Student.sortStudentsByCourseAndFullName(listStudents);
        System.out.println(mapSortByCourseAndFullname);
    }
}


