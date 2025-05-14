import java.util.Scanner;

public class Charp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur character :");

        char ch=sc.next().toLowerCase().charAt(0);

        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'){
            System.out.println("It is Vowel");
        }
        else{
            System.out.println("It is not vowel");
        }
    }
}
