package movieClasses;

import cinemaWorkers.BackStage;
import cinemaWorkers.DownStage;
import java.util.ArrayList;

public class Series extends Movie{
    private int seriesId;
    private static int lastUsedId = 6000;
    private int seasonNumber;
    private int episodeNumber;

    public Series(int seasonNumber, int episodeNumber, String title, String genre, BackStage director, BackStage writer, ArrayList<DownStage> cast, String country, String production, int releaseDate, ArrayList<String> awards, ArrayList<String> availablePlatforms) {
        super(title, genre, director, writer, cast, country, production, releaseDate, awards, availablePlatforms);
        this.seasonNumber = seasonNumber;
        this.episodeNumber = episodeNumber;
        seriesId = lastUsedId++;
    }

    public int getSeriesId() {
        return seriesId;
    }    

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "Season Number: " + seasonNumber + "\nEpisode Number: " + episodeNumber + "\n";
    }      
       
       
    
}
