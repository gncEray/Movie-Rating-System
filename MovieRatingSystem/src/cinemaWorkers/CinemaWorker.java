package cinemaWorkers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import userAndEditor.User;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class CinemaWorker implements Serializable {

    private String name;
    private String job;
    private String gender;
    private String nationality;
    private String birthDate;
    private static String personReview;
    private static ArrayList<String> reviewList = new ArrayList<String>(); 
    private double personScore;
    private static ArrayList<Integer> personScoreList = new ArrayList<Integer>();
    private String biography;
    private String underratedMovie; 
    private static ArrayList<String> movies = new ArrayList<String>(); 
    private static ArrayList<String> awards = new ArrayList<String>();

    public CinemaWorker(String name, String job, String gender, String nationality, String birthDate, String biography, String underratedMovie, ArrayList<String> movies, ArrayList<String> awards) {
        this.name = name;
        this.job = job;
        this.gender = gender;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.personReview = "";
        this.personScore = 10.0;
        this.underratedMovie = underratedMovie;
        this.biography = biography;
        personScoreList = new ArrayList<>();
        this.movies = movies;
        this.awards = awards;
    }



    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getBirthDate() {
        return birthDate;
    }


    public String getBiography() {
        return biography;
    }

    public String getUnderratedMovie() {
        return underratedMovie;
    }

    public static ArrayList<String> getMovies() {
        return movies;
    }
    
    public static void addMovies(String movie) { //for cinemaworker edit button
        movies.add(movie);
    }

    public ArrayList<String> getAwards() {
        return awards;
    }
    
    public String displayMovies() {
        String str = ":\n";
        for (String movie : movies) {
            str += movie + "\n";
        }
        return str;
    }
    
    public String displayAwards() {
        String str = ":\n";
        for (String award : awards) {
            str += award + "\n";
        }
        return str;
    }
    
    
    public double getPersonScore() {
        return personScore;
    }

    public double addPersonScore(int score) { //fix later
        double totalScore = 0;
        personScoreList.add(score);
        for (int personScore : personScoreList) { //may causes problem about variable name
            totalScore += personScore;
        }
        personScore = totalScore / personScoreList.size();
        return personScore;
    }    
    
    public String getPersonReview() {
        return personReview;
    }
    
    public void addReview(User user, String newReview) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        String filename = this.name + "UserScores.bin";
        File file = new File(filename);                     
               
        if(file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            reviewList = (ArrayList<String>) ois.readObject();
        }
        
        reviewList.add(user.getName() + ": " + newReview + "\n\n\n");
        
        
        String allReviews = "";
        for (String review : reviewList) {
            allReviews += review;
        }
        
        personReview = allReviews;
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(reviewList);
        oos.close();
    }

    @Override
    public String toString() {
        return  "\nName: " + name + "\nJob: " + job + "\nGender: " + gender + "\nNationality: " + nationality + "\nBirth Date: " + birthDate + "\nPerson Review: " + personReview + "\nPerson Score: " + personScore + "\nShort Biography:" + biography + "\nUnderrated Movie: " + underratedMovie + "\nMovies" + displayMovies() + "\nAwards" + this.displayAwards() + "\n";
    }

}
