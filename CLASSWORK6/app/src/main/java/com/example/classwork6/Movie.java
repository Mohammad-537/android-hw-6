package com.example.classwork6;

public class Movie {
    private String title;
    private String mainActor;
    private Double movieRate;
    private int pgRate;
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public int getPgRate() {
        return pgRate;
    }

    public void setPgRate(int pgRate) {
        this.pgRate = pgRate;
    }

    public Double getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(Double movieRate) {
        this.movieRate = movieRate;
    }

    public String getTitle() {
        return title;
    }

    public Movie(String title, String mainActor, String movieRate, String pgRate, String genre) {
        this.title = title;
        this.mainActor = mainActor;
        this.movieRate = movieRate;
        this.pgRate = pgRate;
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;



    }
}
