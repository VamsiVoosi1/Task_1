import java.util.Scanner;
public class Solution2 {
    //Write a program to find a given number is positive or negative
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=obj.nextInt();
        if(num>0)
        {
            System.out.println(num + " is Positive");
        }
        else{
            System.out.println(num + " is Negative");
        }

    }
}
