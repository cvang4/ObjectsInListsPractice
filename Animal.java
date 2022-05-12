package ObjectsInListsPractice;
public class Animal {

    private String name;
    private String color;
    private boolean dog;

    //Constructor
    public Animal (String name, boolean dog) {
        this.name = name;
        this.dog = dog;
    }

    // Constructor with one parameter
    public Animal (String name) {
        this.name = name;
    }

    // Constructor with three parameters
    public Animal (String name, String color, boolean dog) {
        this.name = name;
        this.color = color;
        this.dog = dog;
    }

    // Used an extension to auto generate getters and setters :)
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return boolean return the dog
     */
    public boolean isDog() {
        return dog;
    }

    /**
     * @param dog the dog to set
     */
    public void setDog(boolean dog) {
        this.dog = dog;
    }

    public String toString() {
        return getName() + " is a dog = " + isDog();
    }

}