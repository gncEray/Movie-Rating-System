package userAndEditor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import movieClasses.Movie;
import java.util.ArrayList;
import movieClasses.Film;
import movieClasses.Series;

public class User extends Member {

    private int userId;
    private static int lastUsedId = 2000;
    private static ArrayList<Movie> savedMovies = new ArrayList<>(); 
    private static ArrayList<String> userScores = new ArrayList<>(); //aynı anda hem filmi hem verdiği puanı tutması gerekiyor
    private static ArrayList<String> myReviews = new ArrayList<>();

    public User(String name, String password) {
        super(name, password);
        userId = lastUsedId++;
    }

    public int getUserId() {
        return userId;
    }
    

    public void addScore(String username, Movie movie, int score) throws FileNotFoundException, IOException, ClassNotFoundException {
            
        String filename =  username + "Scores.bin";
        File file = new File(filename);
        if (file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            userScores = (ArrayList<String>) ois.readObject();            
        }
        
        String scoretext = movie.getTitle() + ": " + score + "\n\n";
        userScores.add(scoretext);        
        file.delete();
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(userScores);
        oos.close();
        System.out.println("successfully added addscore");

    }

    public String getScores() throws FileNotFoundException, IOException, ClassNotFoundException {
        
        String str = "";
        
        String filename = getName() + "Scores.bin";                
        File file = new File(filename);
        
        if (file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            userScores = (ArrayList<String>) ois.readObject();
        }
        
        for (String userScore : userScores) {
            str += userScores;
        }        

        return str;
    }

    public void addReview(String review) throws FileNotFoundException, IOException, ClassNotFoundException {

        String filename = getName() + "Reviews.bin";
        File file = new File(filename);
        if (file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            myReviews = (ArrayList<String>) ois.readObject();
        }

        myReviews.add(review);
        file.delete();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(myReviews);
        oos.close();
        System.out.println("successfully added addreview");

    }

    public String getReviews() throws FileNotFoundException, IOException, ClassNotFoundException {
        
        String str = "";
        
        String filename =  getName() + "Reviews.bin";
        File file = new File(filename);        
        
        if (file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            myReviews = (ArrayList<String>) ois.readObject();
        }
        
        for (String myReview : myReviews) {
            str += myReview;
        }

        return str;
    }

    public ArrayList<Film> getSavedFilms() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Film> savedFilms = new ArrayList<>();
        String filename = getName() + "SavedFilms.bin";
        File file = new File(filename);
        if (file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            savedFilms = (ArrayList<Film>) ois.readObject();
            if(savedFilms != null)
            return savedFilms;
        }
        
        return null;        
    }

    public ArrayList<Series> getSavedSeries() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<Series> savedSeries = new ArrayList<>();
        String filename =  getName() + "SavedSeries.bin";
        File file = new File(filename);
        if (file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            savedSeries = (ArrayList<Series>) ois.readObject();
            if(savedSeries != null)
            return savedSeries;
        }

        return null;
    }

    public boolean addSavedMovies(Movie movie) throws FileNotFoundException, IOException, ClassNotFoundException {

        
        if (movie instanceof Film) {
            ArrayList<Film> savedFilms = new ArrayList<>();
            String filename =  this.getName() + "SavedFilms.bin";
            File file = new File(filename);
            if (file.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                savedFilms = (ArrayList<Film>) ois.readObject();
                file.delete();
            }
            
            for (Film savedFilm : savedFilms) {
                if(savedFilm.getTitle().equals(movie.getTitle())) {
                    return false;
                }
                    
            }
            
                savedFilms.add((Film)movie);

                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(savedFilms);
                oos.close();
                System.out.println("successfully added savedfilms");
            
                

            
        }
        else { //series
            
            ArrayList<Series> savedSeries = new ArrayList<>();
            String filename =  getName() + "SavedSeries.bin";
            File file = new File(filename);
            if (file.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                savedSeries = (ArrayList<Series>) ois.readObject();
                file.delete();
            }
            
            for (Series savedSerie : savedSeries) {
                if(savedSerie.getTitle().equals(movie.getTitle())) {
                    return false;
                }
                    
            }

            savedSeries.add((Series)movie);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(savedSeries);
            oos.close();
            System.out.println("successfully added savedfilms");
        }
        
        return true;

    }

    @Override
    public String toString() {
        return super.toString() + "UserId: " + userId + "\n";
    }

    

}
