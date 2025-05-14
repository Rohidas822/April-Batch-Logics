import java.util.Scanner;
public class AdditionCalculate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num=sc.nextInt();
        int add=0;
        for( int i=1; i<=num; i++){
          
            add=add+i;
        }
        System.out.println(add);
    }
}