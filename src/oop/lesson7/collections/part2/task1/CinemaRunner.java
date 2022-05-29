package oop.lesson7.collections.part2.task1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Даны 2 класса:
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
 * где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
 * <p>
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * - добавлять в него новый фильм
 * - получить все фильмы по переданному году
 * - получить все фильмы по переданному году и месяцу
 * - получить все фильмы по переданному жанру
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
 * <p>
 * Учесть следующее:
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него (т.е. предусмотреть порядок значения ассоциативного массива)
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * Продемонстрировать работу кинотеатра в отдельном классе.
 */
public class CinemaRunner {
    public static void main(String[] args) {

        Map<Integer, LinkedList<Films>> map = new TreeMap<>();
        Films oneFilm = new Films(1, 2000, 3, "Comedy", 7.6);
        Films twoFilm = new Films(12, 2000, 2, "Action", 3.6);
        Films threeFilm = new Films(32, 2001, 2, "Action", 4.6);
        Films fourFilm = new Films(3, 2003, 3, "Horror", 8.6);
        Films fiveFilm = new Films(4, 2001, 2, "Comedy", 5.6);
        Films sixFilm = new Films(7, 2001, 2, "Horror", 9.6);
        map.put(oneFilm.getYear(), new LinkedList<Films>(Arrays.asList(twoFilm, oneFilm)));
        map.put(threeFilm.getYear(), new LinkedList<Films>(Arrays.asList(threeFilm, fiveFilm,sixFilm)));
        map.put(fourFilm.getYear(), new LinkedList<Films>(Arrays.asList(fourFilm)));
        Cinema cinema=new Cinema();
        cinema.searchFilmByYear(map,2000);
    }

}
