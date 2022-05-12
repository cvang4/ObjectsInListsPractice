package ObjectsInListsPractice;
public class Book {
    
    private String title;
    private int pages;
    private int year;

    public Book (String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    // Constructor with two parameters
    public Book (String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // Constructor with one parameter
    public Book (String title) {
        this.title = title;
    }

    // Used an extension to auto generate getters and setters :)
    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return int return the pages
     */
    public int getPages() {
        return pages;
    }

    /**
     * @param pages the pages to set
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * @return int return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    public String toString () {
        return title + ", " + pages + " pages, " + year; 
    }
}
