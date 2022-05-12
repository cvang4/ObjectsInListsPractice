package ObjectsInListsPractice;
import java.util.Scanner;
import java.util.ArrayList;;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        // Used contructors with one and three parameters
        animals.add(new Animal("Roscoe"));
        animals.add(new Animal("Snake", "green", false));
        
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.println("Please enter a name: ");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            } 
            
            System.out.println("Is it a dog? Yes or no: ");
            String response = scanner.nextLine();
            Boolean dog = response.equalsIgnoreCase("Yes");
        
        animals.add(new Animal(name, dog));

        }
        for (int i = 0; i < animals.size(); i ++) {
            System.out.println(animals.get(i));
    }
    scanner.close();
    }
}


