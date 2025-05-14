
import java.util.Scanner;
public class EMI16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your Loan amount: ");
        double loan_amt=sc.nextDouble();

        System.out.println("Enter duration of month:(6 or 12)");
        int month=sc.nextInt();

        double interest_rate=0;
        if(month==6){
            interest_rate=0.02;
        }

        else{
            interest_rate=0.03;
        }
        double total_interest=loan_amt*interest_rate;
        double EMI=(loan_amt+total_interest)/month;

        System.out.println("Total interest"+ total_interest );
        System.out.println("EMI is"+ EMI +"RS");
    }
}
