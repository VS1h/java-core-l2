package oop.lesson7.collections.part2.task1;

import java.util.*;

public class Cinema {

    private Map<Films, List<Films>> map;

    public Cinema() {
    }

    //    public Map<Integer, LinkedList<Films>> addFilm(Films film) {
//        Map<Integer, LinkedList<Films>> map = new TreeMap<>();
//        map.put(film.getYear(), new LinkedList<Films>(Arrays.asList(film)));
//        return map;
//    }
    public void searchFilmByYear(Map<Integer, LinkedList<Films>> map, int yearFilm) {
        System.out.println(map.get(yearFilm));
    }

    public Map<Films, List<Films>> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "map=" + map +
                '}';
    }
}
