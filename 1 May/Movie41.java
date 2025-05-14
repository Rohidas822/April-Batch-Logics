import java.util.Scanner;

public class Movie41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter age of customer: ");
        int age=sc.nextInt();

        System.out.println("1 Monday");
        System.out.println("2 Tuesday");
        System.out.println("3 Wedday");
        System.out.println("4 Thursday");
        System.out.println("5 Friday");
        System.out.println("6 Saturday");
        System.out.println("7 Sunday");

        int day=sc.nextInt();
        if(day>=1&& day<=5){
            System.out.println("Weekday");

            if(age<=13){
                System.out.println("Ticket price: 100 Rs.");
            }
            else if(age>13 && age <= 64){
                System.out.println("Ticket price: 150 RS.");
            }
            else{
                System.out.println("Ticket price is: 130 RS.");
            }
        }
        else{
            System.out.println("Weekend");
            if(age<=13){
                System.out.println("Ticket price: 120 Rs.");
            }
            else if(age>13 && age <= 64){
                System.out.println("Ticket price: 180 RS.");
            }
            else{
                System.out.println("Ticket price is: 150 RS.");
            }
        }








    }
}
