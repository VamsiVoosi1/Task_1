import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Purchased amount");;
        int PurchasedAmount=sc.nextInt();
        if(PurchasedAmount>1000){
            int Discount=PurchasedAmount * 20/100;
            System.out.println("Purchased Amount is: "+PurchasedAmount +"\n"+"Applying discount of 20%: "+Discount +"\n"+
                    "The Final payable amount after applying discount is: "+(PurchasedAmount-Discount) );
        }
        else if(PurchasedAmount>=500 & PurchasedAmount<=1000) {
            int Discount = PurchasedAmount * 10 / 100;
            System.out.println("Purchased Amount is: " + PurchasedAmount + "\n" + "Applying discount of 10%: " + Discount + "\n" +
                    "The Final payable amount after applying discount is: " + (PurchasedAmount - Discount));
        }
        else{
            int Discount = PurchasedAmount * 0/100;
            System.out.println("Purchased Amount is: " + PurchasedAmount + "\n" + "Applying discount of 0%: " + Discount + "\n" +
                    "The Final payable amount after applying discount is: " + (PurchasedAmount - Discount));

        }

    }
}
