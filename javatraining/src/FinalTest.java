import java.util.Scanner;
public class FinalTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double Rate=0;
        System.out.print("Enter student's final grade: ");
        Rate= input.nextDouble();
        if (Rate>70){
            System.out.println("The student is approved");
        }else {
            System.out.println("The student is failed");
        }
    }
}
