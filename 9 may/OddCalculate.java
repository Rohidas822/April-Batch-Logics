import java.util.Scanner;
public class OddCalculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter ur number: ");
        int num=sc.nextInt();

        

        for(int i=1; i<=num; i++){
            if(i%2==1)
            {
                System.out.println(i);
            }
        }

    }
}
