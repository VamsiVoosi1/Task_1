public class Solution6 {
    //To Print Pattern
    public static void main(String[] args) {
        int k = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < k; j++) {
                if (j < i) {
                    System.out.print(k - j);
                } else {
                    System.out.print(k - i);
                }
            }
            System.out.println();
        }
    }
}
