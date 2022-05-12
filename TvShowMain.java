package ObjectsInListsPractice;
import java.util.Scanner;
import java.util.ArrayList;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<TvShow> shows = new ArrayList<>();

        // Used contructors with one and two parameters
        shows.add(new TvShow("The Witcher"));
        shows.add(new TvShow("Game of Thrones", 73));
        while(true) {

            System.out.println("Name of the show: ");
            String showName = scanner.nextLine();

            if (showName.isEmpty()) {
                break;
            }

            System.out.println("How many episodes?");
            String response = scanner.nextLine();
            int episodes = Integer.valueOf(response);

            System.out.println("What is the genre?");
            String genre = scanner.nextLine();

        shows.add(new TvShow(showName, episodes, genre));

    }
    //for each loop
    for (TvShow TvShow: shows) {
        System.out.println(TvShow);
    //for loop way
    // for (int i = 0; i < shows.size(); i ++) {
    //     System.out.println(shows.get(i));
    scanner.close();
    }
}
}

