import java.util.Scanner;

public class Solution4 {
    //Write a java program to fine the smallest number among three numbers
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1=scan.nextInt();
        System.out.println("Enter the Second number");
        int num2=scan.nextInt();
        System.out.println("Enter the Third number");
        int num3=scan.nextInt();
        int smallest=num1;
        if(num2<smallest)
        {
            smallest=num2;
        }
        if(num3<smallest)
        {
            smallest=num3;
        }
        System.out.println("The Smallest number is "+smallest);

    }
}
