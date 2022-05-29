package oop.lesson7.collections.part2.task1;

public class Films {
    private int id;
    private int year;
    private int month;
    private String genre;
    private double rating;

    public Films(int id, int year, int month, String genre, double rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Films{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
