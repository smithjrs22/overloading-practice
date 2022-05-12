import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args){
        ArrayList<Book> bookArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        // Book moby = new Book("Moby Dick", 378,1851);
        // Book cagedBird = new Book("I Know Why the Caged Bird Sings", 304, 1969);
        // Book shining = new Book ("The Shining", 688, 1977);
        // bookArray.add(cagedBird);
        // bookArray.add(moby);
        // bookArray.add(shining);
        //Another way to add book instances in one line
        // bookArray.add(new Book("The Shining", 688, 1977));
        bookArray.add(new Book("The Shining"));
        bookArray.add(new Book(378));
        bookArray.add(new Book(1977));
        bookArray.add(new Book("The Shining", 1977));
        bookArray.add(new Book(378, 1851));
        bookArray.add(new Book("I Know Why the Caged Bird Sings", 1969));

        // for (int i = 0; i < bookArray.size(); i++){
        //     System.out.println(bookArray.get(i));
        // }

        
        while (true){
            System.out.println("What information will be printed: ");
            String userInput = input.nextLine();
            if (userInput.equals("")) {
                break;
            } 
                else if (userInput.equalsIgnoreCase("everything")){
                    bookArray.get(0).getEverything();
                }
                else if (userInput.equalsIgnoreCase("name")){
                    System.out.println(bookArray.get(0).getName());//for return statements must have a printout of what it will be returning
                } 
        }
    }
}