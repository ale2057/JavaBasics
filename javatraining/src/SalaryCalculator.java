import java.util.Scanner;

public class SalaryCalculator {
    // business days
    public static double totalVacationMoney(double HW, double MH, double BD,double VD){
        double MoneyDay=(HW*MH)/BD;
        double VacationTotal=VD*MoneyDay;
        return VacationTotal;
    }

    // HW hours per week      MH money per hour     WY weeks per year       VD vacation days
    public static String totalSalary(double HW, double MH, double WY, double VD){
        double Total = HW*MH*WY;


        if(VD > 0){
            return "- During your vacation you will receive an amount of: "+totalVacationMoney(HW,MH,5,VD)+"\n- You will get an annual gross salary of: "+Total;
        }else {
            return "- You will get an annual gross salary of: "+Total;
        }
    }

    public static void workFlow(){
        Scanner input=new Scanner(System.in);

        double HoursWeek = 0;
        double MoneyHour = 0;
        double VacationDays = 0;

        System.out.println("Enter the hours you work per week: ");
        HoursWeek=input.nextDouble();

        System.out.println("Enter amount of money you earn per hour: ");
        MoneyHour=input.nextDouble();

        System.out.println("Enter how many vacation days you have");
        VacationDays=input.nextDouble();

        // 52 weeks per year
        System.out.println(totalSalary(HoursWeek,MoneyHour,52,VacationDays));
    }

    public static void main(String[] args) {
        workFlow();
    }
}
