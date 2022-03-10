
package movieClasses;


public interface Editable {
    abstract void addAwards(String award);
    abstract void removeAwards(String award);
    abstract void addAvailablePlatforms(String availablePlatform);
    abstract void removeAvailablePlatforms(String availablePlatform);
    
}
