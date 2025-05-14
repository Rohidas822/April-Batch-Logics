import java.util.Scanner;

public class Triangle22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=sc.nextDouble();

        System.out.println("Enter b: ");
        double b=sc.nextDouble();

        System.out.println("Enter c:");
        double c=sc.nextDouble();

        if(a >= 0 && b >= 0 && c >=0){
            if(a==b && b==c){
                System.out.println("It is an Equilateral Triangle");
            }
            else if(a==b || b==c || a==c){
                System.out.println("It is an isoceles Triangle ");
            }
            else if(a*a + b*b == c*c|| b*b + c*c == a*a|| a*a +c*c == b*b)
            {
                System.out.println("It is a right angle triangle");
            }
            else{
                System.out.println("It is scelene Triangle ");
            }
            
         } else{
                System.out.println("It is not a triangle");

            }
        
    }
}
