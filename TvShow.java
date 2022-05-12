package ObjectsInListsPractice;
public class TvShow {
    
    private String showName;
    private int episodes;
    private String genre;
    
    //Constructor
    public TvShow (String showName, int episodes, String genre) {
        this.showName = showName;
        this.episodes = episodes;
        this.genre = genre;
    }

    // Constructor with two parameters
    public TvShow (String showName, int episodes) {
        this.showName = showName;
        this.episodes = episodes;
    }
    
    // Constructor with one parameter
    public TvShow (String showName) {
        this.showName = showName;
    }
    
    // Used an extension to auto generate getters and setters :)
    /**
     * @return String return the showName
     */
    public String getShowName() {
        return showName;
    }

    /**
     * @param showName the showName to set
     */
    public void setShowName(String showName) {
        this.showName = showName;
    }

    /**
     * @return int return the episodes
     */
    public int getEpisodes() {
        return episodes;
    }

    /**
     * @param episodes the episodes to set
     */
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    /**
     * @return String return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString () {
        return "The name of the show is " + getShowName() + " with " + getEpisodes() + " number of episodes. The genre is " + getGenre();
    }
}
