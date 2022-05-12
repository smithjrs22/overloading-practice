import java.util.Scanner;
import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        ArrayList<Animal> animalArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        animalArray.add(new Animal("Stacy", true));
        animalArray.add(new Animal(false));
        animalArray.add(new Animal("Meon"));
        
        for (int i = 0; i < animalArray.size(); i++){
            System.out.println(animalArray.get(i));
        }
        

    
    //     while (true){
    //         System.out.println("Enter the name of your animal");
    //         String userInput = input.nextLine();
    //         System.out.println("Is your animal a dog? Yes or no:");
    //         String isDog = input.nextLine();
    //         Boolean userInput2;
    //         if (userInput.equals("")){
    //             break;
    //         }
    //         userInput2 = isDog.equalsIgnoreCase("yes");
    //         animalArray.add(new Animal(userInput, userInput2));
    //     }
    //     for (int i = 0; i < animalArray.size(); i++ ){
    //         System.out.println(animalArray.get(i).toString());
    //     }
     }
}