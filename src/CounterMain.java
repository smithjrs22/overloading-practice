import java.util.Scanner;

public class CounterMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's create a counter and start at 0");
        Counter count = new Counter();
        System.out.println(count);
        System.out.println("Increment using increase method");
        count.increase();
        System.out.println(count);
        System.out.println("Decrement using decrease method");
        count.decrease();
        System.out.println(count);

        System.out.println("Let's create a counter. Using a value. Enter a positive value: ");
        int startValue = Integer.valueOf(input.nextLine());
        Counter countValue = new Counter(startValue);
        System.out.println(countValue);
        System.out.println("Enter value to increase the counter by: ");
        int inputValue = Integer.valueOf(input.nextLine());
        countValue.increase(inputValue);
        System.out.println(countValue);
        System.out.println("Enter value to decrease the counter by: ");
        int decreaseValue = Integer.valueOf(input.nextLine());
        countValue.decrease(decreaseValue);
        System.out.println(countValue);

        input.close();
    }
}