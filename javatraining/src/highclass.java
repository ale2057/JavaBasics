import java.sql.SQLOutput;
import java.util.Scanner;

public class highclass {
    public static void main(String[] args) {
        int StudentAge = 28;
        double Prom = 8.2;
        boolean Attendance = true;

        String StudentName = "Gabriel";
        String LastName = "Torrico";

        char FirstInitial = StudentName.charAt(0);
        char LastInitial = LastName.charAt(0);

        System.out.println("The Student Age is: " + StudentAge);
        System.out.println("The Prom is: " + Prom);
        System.out.println("The First Initial is: " + FirstInitial);
        System.out.println("The Last Initial is: " + LastInitial);
        System.out.println("The Attendance is: " + Attendance);

        System.out.println("The student name is: " + StudentName);
        System.out.println("The student first name is: " + StudentName);
        System.out.println("The student last name is: " + LastName);

        System.out.println("The student: "+StudentName+" "+LastName+" And their Initials are: "+FirstInitial+LastInitial);

        Scanner input=new Scanner(System.in);
        Prom=input.nextDouble();

        System.out.println("The new prom are: "+ Prom);

        LastName=input.next();
        System.out.println("The new Lastname are: "+ LastName);
    }
}
