
import java.util.Scanner;
public class Vaccines19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of Vaccines you have taken: ");
        int Vaccines=sc.nextInt();

        if(Vaccines==2){
            System.out.println("You are eligible for Interview");
        }

        else{
            System.out.println("You are not eligible for Interview");
        }

    }
}
