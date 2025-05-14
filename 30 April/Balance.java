import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        double balance=1000;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your withdrawl amount: ");
        double amt = sc.nextDouble();

        if(amt<=balance){
            System.out.println("Withdrawl success");
            System.out.println("Your new balance is: ");
        }
        else{
            System.out.println("Insufficient balance: ");
        }
    }
}
