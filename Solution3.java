public class Solution3 {
    //Write a program to reverse a given number using loops
    public static void main(String[] args) {
        String s1="876";
        String reverse="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            reverse=reverse+s1.charAt(i);
        }
        System.out.println(reverse);

    }
}
