package cinemaWorkers;

import java.util.ArrayList;

public class DownStage extends CinemaWorker {

    private int dsId;
    private static int lastUsedId = 3000;
    private int firstActingYear;
    private double height;

    public DownStage(int firstActingYear, double height, String name, String job, String gender, String nationality, String birthDate, String biography, String underratedMovie, ArrayList<String> movies ,ArrayList<String> awards) {
        super(name, job, gender, nationality, birthDate, biography, underratedMovie, movies, awards);
        this.firstActingYear = firstActingYear;
        this.height = height;
        dsId = lastUsedId++;
    }    

    public int getDsId() {
        return dsId;
    }   
        
    public int getFirstActingYear() {
        return firstActingYear;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFirstActingYear: " + firstActingYear + "\nHeight: " + height + "\n";
    }
}
