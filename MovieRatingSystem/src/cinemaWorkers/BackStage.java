
package cinemaWorkers;

import java.util.ArrayList;

public class BackStage extends CinemaWorker {

    private int bsId;
    private static int lastUsedId = 4000;
    private String style;
    private String quote;

    public BackStage(String style, String quote, String name, String job, String gender, String nationality, String birthDate, String biography, String underratedMovie, ArrayList<String> movies ,ArrayList<String> awards) {
        super(name, job, gender, nationality, birthDate, biography, underratedMovie, movies ,awards);
        this.style = style;
        this.quote = quote;
        bsId = lastUsedId++;
    }

    public int getBsId() {
        return bsId;
    }    
    

    public String getStyle() {
        return style;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public String toString() {
        return super.toString() + "Style: " + style + "\nQuote:" + quote + "\n";
       
    }              
    
  
}
