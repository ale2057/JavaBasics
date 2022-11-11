import java.util.Scanner;
public class ChallengeOneQuestions {
    public static void main(String[] args) {
        char Repeat='N';
        char Option=' ';
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("Dolphins are:");
            System.out.println("A) Reptile.");
            System.out.println("B) Mammal.");
            System.out.println("C) Fish.");

            Option=input.next().charAt(0);

            if(Option=='b' || Option=='B'){
                System.out.println("The answer is correct");
            }else {
                System.out.println("The answers are wrong");
            }

            System.out.println("BONUS QUESTION!!!");
            System.out.println("What was the result of the operation (2+2)*3+6");
            System.out.println("A) None.");
            System.out.println("B) 36.");
            System.out.println("C) 18.");

            Option=input.next().charAt(0);

            if(Option=='c' || Option=='C'){
                System.out.println("the answer is correct");
            }else {
                System.out.println("The answers are wrong");
            }

            System.out.print("Do you want to play again?Y/N: ");

            Repeat=input.next().charAt(0);
        }while (Repeat=='Y' || Repeat=='y');
        System.out.println("End of questions");
    }
}
