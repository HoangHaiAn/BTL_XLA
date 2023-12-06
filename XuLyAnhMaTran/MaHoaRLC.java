package xulyanh;

import java.util.Scanner;


public class MaHoaRLC {
    public static String compress(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        result.append(input.charAt(input.length() - 1)).append(count);
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String compressed = compress(input);
        System.out.println("Compressed: " + compressed);
    }
}
//ABBBBBCAAADD