import java.util.Scanner;

public class Demo14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your basic salary");
        double basic_salary=sc.nextDouble();

        if(basic_salary<700000){
            System.out.println("No Tax");
        }

        else {
            double tax_amt= basic_salary*0.01;
            System.out.println("Tax: "+ tax_amt);
        }
    }
}