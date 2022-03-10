package movieClasses;

import cinemaWorkers.BackStage;
import cinemaWorkers.DownStage;
import java.util.ArrayList;


public class Film extends Movie{
    private int filmId;
    private static int lastUsedId = 5000;
    private double length;

    public Film(double length, String title, String genre, BackStage director, BackStage writer, ArrayList<DownStage> cast, String country, String production, int releaseDate, ArrayList<String> awards, ArrayList<String> availablePlatforms) {
        super(title, genre, director, writer, cast, country, production, releaseDate, awards, availablePlatforms);
        this.length = length;
        filmId = lastUsedId++;
    }

    public int getFilmId() {
        return filmId;
    }        
    
    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return  super.toString() + "Length: " + length + " min.\n";
    }
}