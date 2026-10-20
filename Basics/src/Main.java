import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(getChoice());
        int choice = userInput.nextInt();
        do {
            switch (choice) {
                case 1:
                    LargestOfTwoNumbers largestOfTwoNumbers = new LargestOfTwoNumbers();
                    System.out.println("Enter 2 input integer to find largest of two number:");
                    System.out.println("Largest of two number: " +
                            largestOfTwoNumbers.findLargestOfTwoNumber(
                            userInput.nextInt(),
                            userInput.nextInt()
                    ));
                    break;
                default:
                    choice = 0;
                    break;
            }
            System.out.println(getChoice());
            choice = userInput.nextInt();
        }while(choice != 0);
    }
    public static String getChoice(){
        return "Which program you wish to run? (0 to exit)\n" +
                "1. Largest of two number";
    }
}