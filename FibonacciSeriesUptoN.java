import java.util.Scanner;

public class FibonacciSeriesUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prePreNum, preNum = 0, currNum = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(preNum + " ");
            prePreNum = preNum;
            preNum = currNum;
            currNum = prePreNum + preNum;
        }
        sc.close();
    }
}
