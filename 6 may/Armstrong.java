import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int num=sc.nextInt();

        int arm=0;
        int n=num;

        while (num>0) {
            int digit=num%10;
            arm=arm+digit*digit*digit;
            num=num/10;
            
        }
        if(n==arm){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
    }
}
