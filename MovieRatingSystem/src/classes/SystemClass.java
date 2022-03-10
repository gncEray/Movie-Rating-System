package classes;

import cinemaWorkers.CinemaWorker;
import cinemaWorkers.DownStage;
import cinemaWorkers.BackStage;
import movieClasses.Movie;
import movieClasses.Film;
import movieClasses.Series;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import userAndEditor.User;

public class SystemClass {

    public static ArrayList<CinemaWorker> personList = new ArrayList<CinemaWorker>();
    public static ArrayList<Movie> movieList = new ArrayList<Movie>();

    public static void addCinemaWorker(CinemaWorker cinemaWorker) throws FileNotFoundException, IOException, ClassNotFoundException {

        if (cinemaWorker instanceof DownStage) {
            ArrayList<DownStage> downStageList = new ArrayList<DownStage>();
            File file = new File("DownStageList.bin");
            DownStage downStage = (DownStage)cinemaWorker;
            if(file.exists()) {
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                downStageList = (ArrayList<DownStage>)reader.readObject();
                file.delete();
                System.out.println("success downstage read");
            }
            
            downStageList.add(downStage);                  
            
            ObjectOutputStream downStageStream = new ObjectOutputStream(new FileOutputStream(file));
            downStageStream.writeObject(downStageList);
            downStageStream.close();
            System.out.println("success downstage write");
            
        }
        else { //backstage
            ArrayList<BackStage> backStageList = new ArrayList<BackStage>();
            
            File file = new File("BackStageList.bin");
            BackStage backStage = (BackStage)cinemaWorker;
            
            if(file.exists()) {
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                backStageList = (ArrayList<BackStage>)reader.readObject();
                file.delete();
                System.out.println("success read backStage");
            }
            
            backStageList.add(backStage);           
                        
            ObjectOutputStream backStageStream = new ObjectOutputStream(new FileOutputStream(file));
            backStageStream.writeObject(backStageList);
            backStageStream.close();
            System.out.println("success write backStage");
        }


    }

    public static void addMovie(Movie movie) throws FileNotFoundException, IOException, ClassNotFoundException {

        if(movie instanceof Film) {
            ArrayList<Film> filmList = new ArrayList<Film>();
            File file = new File("FilmList.bin");
            Film film = (Film)movie;
            
            if(file.exists()) {
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                filmList = (ArrayList<Film>)reader.readObject();
                file.delete();
                System.out.println("success film read");
            }
            
            filmList.add(film);          
                        
            ObjectOutputStream filmStream = new ObjectOutputStream(new FileOutputStream(file));
            filmStream.writeObject(filmList);
            filmStream.close();            
            
        }
        else { //Series
            ArrayList<Series> seriesList = new ArrayList<Series>();
            File file = new File("SeriesList.bin");
            Series series = (Series)movie;
            
            if(file.exists()) {
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                seriesList = (ArrayList<Series>)reader.readObject();
                file.delete(); 
                System.out.println("success serie read");
            }
            
            seriesList.add(series);            
                       
            ObjectOutputStream seriesStream = new ObjectOutputStream(new FileOutputStream(file));
            seriesStream.writeObject(seriesList);
            seriesStream.close();  
            System.out.println("success serie write");
        }        

    }

    
    public static String displayCinemaWorker(CinemaWorker person) throws IOException, FileNotFoundException, ClassNotFoundException {

        if(person != null)
        if (person instanceof DownStage) {
            return ((DownStage) person).toString();
        } else {
            return ((BackStage) person).toString();
        }
        
        return "";
    }

    public static String displayMovie(Movie movie) throws IOException, FileNotFoundException, ClassNotFoundException {

        if(movie != null)
        if (movie instanceof Film) {
            Film film = new Film(((Film) movie).getLength(), movie.getTitle(), movie.getGenre(), movie.getDirector(), movie.getWriter(), movie.getCast(), movie.getCountry(), movie.getProduction(), movie.getReleaseDate(), movie.getAwards(), movie.getAvailablePlatforms());
            return film.toString();
        } else {
            Series series = new Series(((Series) movie).getSeasonNumber(), ((Series) movie).getEpisodeNumber(), movie.getTitle(), movie.getGenre(), movie.getDirector(), movie.getWriter(), movie.getCast(), movie.getCountry(), movie.getProduction(), movie.getReleaseDate(), movie.getAwards(), movie.getAvailablePlatforms());
            return series.toString();
        }
        
        return "";
    }
    

    public static Movie searchMovie(String title) throws FileNotFoundException, IOException, ClassNotFoundException {

        ArrayList<Film> filmList = new ArrayList<Film>();
        File fileFilm = new File("FilmList.bin");
        
        if(fileFilm.exists()) {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fileFilm));
            filmList = (ArrayList<Film>) reader.readObject();
        }
        
        for(int i=0; i<filmList.size(); i++) {
             if(filmList.get(i).getTitle().equals(title)) {
                System.out.println(i + " is the indeex");
                return filmList.get(i);
             }
        }
        
        
        ArrayList<Series> seriesList = new ArrayList<Series>();
        File fileSeries = new File("SeriesList.bin");
        
        if(fileSeries.exists()) {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fileSeries));
            seriesList = (ArrayList<Series>) reader.readObject();
        }
        
        for(int i=0; i<seriesList.size(); i++) {
             if(seriesList.get(i).getTitle().equals(title)) {
                System.out.println(i + " is the indeex");
                return seriesList.get(i);
             }
        }

        return null;
    }
    
    public static CinemaWorker searchCinemaWorker(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        ArrayList<DownStage> downStageList = new ArrayList<DownStage>();
        File fileDS = new File("DownStageList.bin");
        
        if(fileDS.exists()) {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fileDS));
            downStageList = (ArrayList<DownStage>) reader.readObject();
        }
        
        for(int i=0; i<downStageList.size(); i++) {
             if(downStageList.get(i).getName().equals(name)) {
                System.out.println(i + " is the indeex");
                return downStageList.get(i);
             }
        }
        
        
        ArrayList<BackStage> backStageList = new ArrayList<BackStage>();
        File fileBS = new File("BackStageList.bin");
        
        if(fileBS.exists()) {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(fileBS));
            backStageList = (ArrayList<BackStage>) reader.readObject();
        }
        
        for(int i=0; i<backStageList.size(); i++) {
             if(backStageList.get(i).getName().equals(name)) {
                System.out.println(i + " is the indeex");
                return backStageList.get(i);
             }
        }

        return null;
    }


    public static void deleteCinemaWorker(String name) throws FileNotFoundException, IOException, ClassNotFoundException {

        CinemaWorker person = searchCinemaWorker(name);
        
        if(person == null)
            System.out.println("no person found");
        else
        if(person instanceof DownStage) {
            ArrayList<DownStage> downStageList = new ArrayList<DownStage>();
            File file = new File("DownStageList.bin");
            
            if(file.exists()){
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                downStageList = (ArrayList<DownStage>) reader.readObject();
                
                for(int i=0; i<downStageList.size(); i++) {
                    if(downStageList.get(i).getDsId() == ((DownStage) person).getDsId()) {
                        downStageList.remove(i);
                        file.delete();
                        System.out.println(i + " is the indeex");
                    }
                }                
                
                
                ObjectOutputStream downStageStream = new ObjectOutputStream(new FileOutputStream(file));
                downStageStream.writeObject(downStageList);
                downStageStream.close();
                System.out.println("DELETED SUCCESSFULLY");
            
            }              
                
         }
        else { //backstage
            ArrayList<BackStage> backStageList = new ArrayList<BackStage>();
            File file = new File("BackStageList.bin");
            
            if(file.exists()) {
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                backStageList = (ArrayList<BackStage>) reader.readObject();
               
                for(int i=0; i<backStageList.size(); i++) {
                    if(backStageList.get(i).getBsId() == ((BackStage)person).getBsId()) {
                        backStageList.remove(i);
                        file.delete();
                        System.out.println(i + " is the indeex");
                    }                
                }                
                
                
                ObjectOutputStream backStageStream = new ObjectOutputStream(new FileOutputStream(file));
                backStageStream.writeObject(backStageList);
                backStageStream.close();
                System.out.println("DELETED SUCCESSFULLY");
                
            }
        }       

    }

    public static void deleteMovie(String title) throws IOException, FileNotFoundException, ClassNotFoundException {

        Movie movie = searchMovie(title);
        
        if(movie == null)
            System.out.println("movie is null");
        else
        if(movie instanceof Film) {
            ArrayList<Film> filmList = new ArrayList<Film>();
            File file = new File("filmList.bin");
            
            if(file.exists()){
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                filmList = (ArrayList<Film>) reader.readObject();
                                
                for(int i=0; i<filmList.size(); i++) {
                    if(filmList.get(i).getTitle().equals(title)) {
                        filmList.remove(i);
                        file.delete();
                        System.out.println(i + " is the indeex");
                    }
                }                
                
                
                ObjectOutputStream filmStream = new ObjectOutputStream(new FileOutputStream(file));
                filmStream.writeObject(filmList);
                filmStream.close();
                System.out.println("DELETED SUCCESSFULLY");            
            }              
                
         }
        else { //backstage
            ArrayList<Series> seriesList = new ArrayList<Series>();
            File file = new File("SeriesList.bin");
            
            if(file.exists()) {
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file));
                seriesList = (ArrayList<Series>) reader.readObject();
               
                for(int i=0; i<seriesList.size(); i++) {
                    if(seriesList.get(i).getTitle().equals(title)) {
                        seriesList.remove(i);
                        file.delete();
                        System.out.println(i + " is the indeex");
                    }                
                }                
                
                
                ObjectOutputStream seriesStream = new ObjectOutputStream(new FileOutputStream(file));
                seriesStream.writeObject(seriesList);
                seriesStream.close();
                System.out.println("DELETED SUCCESSFULLY");
                
            }
        }        

    }

    public static ArrayList<Movie> getAllWithGenre(String genre) { //this returning all movies acoording to genre

        ArrayList<Movie> moviesWithGenre = new ArrayList<>();

        for (Movie movie : movieList) {
            if (movie.getGenre().equals(genre)) {
                moviesWithGenre.add(movie);
            }
        }

        return moviesWithGenre;
    }

    public static String getAllReviews(ArrayList<Movie> list) {
        String allReviews = "";
        for (Movie movie : list) {
            allReviews += movie.getUserReview();
        }
        return allReviews;
    }

    public static String determineCertificateViolence(int violence) { //this determines whether the movie is appropriate for an age group or not
        if (violence == 0) {
            return "All ages admitted – General audiences.";
        } else if (violence == 1) {
            return "All ages admitted – Parental guidance suggested.";
        } else if (violence == 2) {
            return "Restricted – Under 17 requires accompanying parent or adult guardian.";
        } else if (violence == 3) {
            return "No one under 17 admitted.";
        } else {
            return "no certification";
        }
    }

    public static boolean determineCertificateplus18(int plus18content) { //this determines whether the movie is appropriate for an age group or not
        if (plus18content > 2) {
            return false;
        }
        return true;
    }

}
