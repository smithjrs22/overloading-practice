import java.util.ArrayList;
import java.util.Scanner;


//Animal main
// public class Main {
//     public static void main(String[] args) {
//         ArrayList<Animal> animalArray = new ArrayList<>();
//         Scanner input = new Scanner(System.in);
//         animalArray.add(new Animal("Stacy", true));
//         animalArray.add(new Animal(false));
//         animalArray.add(new Animal("Meon"));
        

    
//         while (true){
//             System.out.println("Enter the name of your animal");
//             String userInput = input.nextLine();
//             System.out.println("Is your animal a dog? Yes or no:");
//             String isDog = input.nextLine();
//             Boolean userInput2;
//             if (userInput.equals("")){
//                 break;
//             }
//             userInput2 = isDog.equalsIgnoreCase("yes");
//             animalArray.add(new Animal(userInput, userInput2));
//         }
//         for (int i = 0; i < animalArray.size(); i++ ){
//             System.out.println(animalArray.get(i).toString());
//         }
//     }
// }

//Tvshow 
// public class Main {
//     public static void main(String[] args){
//         ArrayList<TvShow> tvShowArray = new ArrayList<>();
//         Scanner input = new Scanner(System.in);
//         tvShowArray.add(new TvShow("Batman"));
//         tvShowArray.add(new TvShow("Batman", 5));
//         tvShowArray.add(new TvShow(6, "Horror"));
//         tvShowArray.add(new TvShow("Family Guy", "Adult Humor"));
//         tvShowArray.add(new TvShow("Suspense"));


//         while (true){
//             System.out.println("Name of show: ");
//             String userNameOfShow = input.nextLine();
//             if (userNameOfShow.equals("")){
//                 break;
//             }
//             System.out.println("How many episodes? ");
//             int userNumberOfEpisodes = Integer.valueOf(input.nextLine());
//             System.out.println("What is the genre: ");
//             String userNameOfGenre = input.nextLine();    
            
//             tvShowArray.add(new TvShow(userNameOfShow, userNumberOfEpisodes, userNameOfGenre));
//         }
//         for (int i = 0; i < tvShowArray.size(); i++){
//             System.out.println(tvShowArray.get(i).toString());
//         }
    
//     }
// }

//Book
// public class Main {
//     public static void main(String[] args){
//         ArrayList<Book> bookArray = new ArrayList<>();
//         Scanner input = new Scanner(System.in);
//         Book moby = new Book("Moby Dick", 378,1851);
//         Book cagedBird = new Book("I Know Why the Caged Bird Sings", 304, 1969);
//         Book shining = new Book ("The Shining", 688, 1977);
//         bookArray.add(cagedBird);
//         bookArray.add(moby);
//         bookArray.add(shining);
//         //Another way to add book instances in one line
//         // bookArray.add(new Book("The Shining", 688, 1977));
//         bookArray.add(new Book("The Shining"));
//         bookArray.add(new Book(378));
//         bookArray.add(new Book(1977));
//         bookArray.add(new Book("The Shining", 1977));
//         bookArray.add(new Book(378, 1851));
//         bookArray.add(new Book("I Know Why the Caged Bird Sings", 1969));



        
//         while (true){
//             System.out.println("What information will be printed: ");
//             String userInput = input.nextLine();
//             if (userInput.equals("")) {
//                 break;
//             } 
//                 else if (userInput.equalsIgnoreCase("everything")){
//                     bookArray.get(0).getEverything();
//                 }
//                 else if (userInput.equalsIgnoreCase("name")){
//                     System.out.println(bookArray.get(0).getName());//for return statements must have a printout of what it will be returning
//                 } 
//         }
//     }
// }