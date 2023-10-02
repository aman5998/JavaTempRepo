import java.util.Scanner;

public class GcdAndHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // GCD --> Greatest Common Divisor
        int x = num1 > num2 ? num1 : num2;
        int i;
        for (i = x; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0)
                break;
        }
        System.out.println("Gcd is " + i);
        // LCM --> Least Common Multiple
        for (i = 1; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0)
                break;
        }
        System.out.println("Lcm is " + i);
    }
}
