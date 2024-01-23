import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Input a word or sentence:");
        String s = scnr.nextLine();
        for (int i = s.length()-1; i >= 0; i--)
        {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
