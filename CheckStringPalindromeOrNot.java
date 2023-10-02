import java.util.Scanner;

public class CheckStringPalindromeOrNot {
    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        x = x.toLowerCase();
        // System.out.println(x.charAt(0));
        // System.out.println(x.charAt(5));
        boolean ans = checkPalindrome(x);
        if (ans)
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
        sc.close();

    }
}
