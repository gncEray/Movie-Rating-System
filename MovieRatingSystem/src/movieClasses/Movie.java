package movieClasses;

import cinemaWorkers.BackStage;
import cinemaWorkers.DownStage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import userAndEditor.User;


public abstract class Movie implements Serializable, Editable{

    private String title;
    private String genre;
    private BackStage director; 
    private BackStage writer; 
    private ArrayList<DownStage> cast; 
    private String country;
    private String production;
    private int releaseDate;
    private double userScore;
    private static ArrayList<Integer> userScores = new ArrayList<Integer>();
    private int totalScoreNumber;
    private static String userReview; //fix later
    private static ArrayList<String> userReviews = new ArrayList<String>();
    private ArrayList<String> awards;
    private ArrayList<String> availablePlatforms;
    

    public Movie(String title, String genre, BackStage director, BackStage writer, ArrayList<DownStage> cast, String country, String production, int releaseDate, ArrayList<String> awards, ArrayList<String> availablePlatforms) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.writer = writer;
        this.cast = cast; //fix later
        this.country = country;
        this.production = production;
        this.releaseDate = releaseDate;
        userScore = 10.0;
        this.totalScoreNumber = 0;
        userReview = ""; //fix later
        this.awards = awards;
        this.availablePlatforms = availablePlatforms;
        ArrayList<Double> userScores = new ArrayList<Double>();        
        
        
    }

    public ArrayList<DownStage> getCast() {
        return cast;
    }
    
    public String displayCast() {
        String str = "";
        for (DownStage downStage : cast) {
            str += downStage.getName() + "\n";
        }
        return str;
    }

    public ArrayList<String> getAwards() {
        return awards;
    }

    public ArrayList<String> getAvailablePlatforms() {
        return availablePlatforms;
    }        

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public BackStage getDirector() {
        return director;
    }

    public BackStage getWriter() {
        return writer;
    }

    public String getCountry() {
        return country;
    }

    public String getProduction() {
        return production;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public static String getUserReview() {
        return userReview;
    }  

    public void setUserReview(User user, String newuserReview) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        String filename = this.title + "UserReviews.bin";
        File file = new File(filename);                     
               
        if(file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            userReviews = (ArrayList<String>) ois.readObject();
        }
        
        userReviews.add(user.getName() + ": " + newuserReview + "\n\n");
        
        
        String allReviews = "";
        for (String review : userReviews) {
            allReviews += review;
        }
        
        userReview = allReviews;
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(userReviews);
        oos.close();
    }

    public double getUserScore() {
        return this.userScore;
    }
    
    public void addUserScore(int score) throws FileNotFoundException, IOException, ClassNotFoundException { //fix later //may causes problem about variable name
           
        String filename = this.title + "UserScores.bin";
        File file = new File(filename);                     
               
        if(file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            userScores = (ArrayList<Integer>) ois.readObject();
        }        
        
        userScores.add(score);   
        
        double totalScore = 10.0;
        for (int value : userScores) {
            totalScore += value;
        }
        
        this.userScore = totalScore / (userScores.size() + 1);
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(userScores);
        oos.close();
        
    }
    
    public void addAwards(String award) {
        this.awards.add(award);
    }
    
    public void removeAwards(String award) {
        this.awards.remove(award);
    }
    
    public void addAvailablePlatforms(String availablePlatform) {
        this.availablePlatforms.add(availablePlatform);
    }
    
    public void removeAvailablePlatforms(String availablePlatform) {
        this.availablePlatforms.remove(availablePlatform);
    }
   


    @Override
    public String toString() {
        return "Title: " + title + "\nGenre: " + genre + "\nDirector: " + director.getName() + "\nWriter: " + writer.getName() + "\nCast:\n" + displayCast() + "Country: " + country + "\nProduction: " + production + "\nRelease Date: " + releaseDate + "\nUser Score: " + userScore + "\nUserReview: " + userReview + "\nAwards: " + awards + "\nAvailablePlatforms: " + availablePlatforms + "\n";
    }
    
    
}