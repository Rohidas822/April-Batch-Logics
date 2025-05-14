 import java.util.Scanner;
 
 public class ATM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your password: ");
        int pass=sc.nextInt();

        if(pass==1234){
            System.out.println("Device unlocked");
        }
        else{
            System.out.println("Try again");
        }

    }
}
