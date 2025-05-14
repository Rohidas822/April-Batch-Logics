
import java.util.Scanner;
public class Xy23 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the coordinates for point 1 (x,y):");
        int x1=sc.nextInt();
        int y1=sc.nextInt();

        System.out.println("Enter the co-ordinates for point 2 (x, y) ");
        int x2=sc.nextInt();
        int y2=sc.nextInt();

       if(x>0 && y>0){
        System.out.println("It is belong to I quadrant");
       }
       else if(x<0 && y>0){
       System.out.println("It is belong to II quadrant");
       }

       else if(x<0 && y<0){
        System.out.println("It is belong to III quadrant");
       }

    else if(x>0 && y<0){
        System.out.println("It is belong to IV quadrant");
    }
    else{
        System.out.println("Not valid");
    }
    
    }
}
