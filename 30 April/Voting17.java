
import java.util.Scanner;
public class Voting17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("You are Eligible for voting");
        }
        else{
            System.out.println("You are not Eligible for Voting");
        }
    }
}
