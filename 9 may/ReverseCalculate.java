import java.util.Scanner;

public class ReverseCalculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ur no.: ");
        int num=sc.nextInt();

        for(int i=num; i>=1; i--){
            System.out.println(i);
        }
    }
}
