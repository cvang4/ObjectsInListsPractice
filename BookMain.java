package ObjectsInListsPractice;
import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Used contructors with one and two parameters
        books.add(new Book("To Kill A Mocking Bird", 281));
        books.add(new Book("The Ides of March"));

    while(true) {
        System.out.println("Enter name of book: ");
        String title = scanner.nextLine();

        if (title.isEmpty()) {
            break;
        }

        System.out.println("How many pages?");
        String response = scanner.nextLine();
        int pages = Integer.valueOf(response);

        System.out.println("What is the publication year?");
        String response2 = scanner.nextLine();
        int year = Integer.valueOf(response2);

        books.add(new Book(title, pages, year));

    }

    for (Book Book:books) {
    System.out.println("What would you like to print out?");
    System.out.println("Type 'everything' to show all details.");
    System.out.println("Type 'name' to show only book titles.");
    String answer = scanner.nextLine();

        // Not sure why this does not print every entered book and the details. It only prints the first.
    if (answer.equals("everything")) {
        System.out.println(Book);
        break;
    } 
    
        // Same thing here. Only printing the name of the first entry.
    if (answer.equals("name")) {
        System.out.println(Book.getTitle());
        break;
    }
    }
    }
}