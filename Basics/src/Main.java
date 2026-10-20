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
                case 2:
                    ReportCard reportCard = new ReportCard();
                    System.out.println("Enter the score of the 3 subjects: ");
                    int a = userInput.nextInt();
                    int b = userInput.nextInt();
                    int c = userInput.nextInt();
                    int avg = reportCard.findAverage(a,b,c);
                    System.out.println("Average score: " + avg);
                    System.out.println("Subject report: " + reportCard.isSubjectWisePass(a,b,c));
                    System.out.println("Overall Report: " + reportCard.isPass(avg));
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
                "1. Largest of two number\n" +
                "2. Average Score and Report";
    }
}