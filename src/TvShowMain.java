import java.util.Scanner;
import java.util.ArrayList;
public class TvShowMain {
    public static void main(String[] args){
        ArrayList<TvShow> tvShowArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        tvShowArray.add(new TvShow("Batman"));
        tvShowArray.add(new TvShow("Batman", 5));
        tvShowArray.add(new TvShow(6, "Horror"));
        tvShowArray.add(new TvShow("Family Guy", "Adult Humor"));
        tvShowArray.add(new TvShow("Suspense"));


        while (true){
            System.out.println("Name of show: ");
            String userNameOfShow = input.nextLine();
            if (userNameOfShow.equals("")){
                break;
            }
            System.out.println("How many episodes? ");
            int userNumberOfEpisodes = Integer.valueOf(input.nextLine());
            System.out.println("What is the genre: ");
            String userNameOfGenre = input.nextLine();    
            
            tvShowArray.add(new TvShow(userNameOfShow, userNumberOfEpisodes, userNameOfGenre));
        }
        for (int i = 0; i < tvShowArray.size(); i++){
            System.out.println(tvShowArray.get(i).toString());
        }
    
    }
}