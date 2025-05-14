import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number :");
        int num=sc.nextInt();
        int n=num;
        int count=0;
        int sum=0;
        while(num>0){
            num/=10;
            count++;
        }
        num=n;
        for(int i=1; i<count; i++){
            int a=num%10;
            num/=10;
            int b=num%10;
            sum+=a*b;
        }
        System.out.println("Sum :" + sum);
    }
}
