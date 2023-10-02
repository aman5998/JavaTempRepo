import java.util.Scanner;

public class CharInputIsConstOrVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.nextLine().charAt(0);
        x = Character.toLowerCase(x);
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
            System.out.println("It is a vowel");
        else
            System.out.println("It is a consonant");
        sc.close();
    }
}
