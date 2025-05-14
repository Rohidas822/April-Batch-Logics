import java.util.Scanner;

public class HorizontalCalculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Value: ");
        int num=sc.nextInt();
        int num1=0;

        for(int i=1; i<=num; i++)
        {
            System.out.print(i + " ");
        }

    }
}
