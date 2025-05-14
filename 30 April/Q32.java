 import java.util.Scanner;
 public class Q32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Python");
        int a= sc.nextInt();

        System.out.println("Enter Java: ");
        int b= sc.nextInt();

        System.out.println("Enter Javascript :");
        int c= sc.nextInt();

        if(a>40 && b>=40 && c>=40){
            int total=a+b+c;
            double percentage=(total/3.0);
            if(percentage>=90){
                System.out.println("Distinction");
            }
            else if(percentage>=70){
                System.out.println("First class");
            }

            else if(percentage>50){
                System.out.println("Second class");
            }
            else if(percentage>=40){
                System.out.println("pass class");
            }
        }
            else{
                System.out.println("ATKT");
            
        }
    }
}
