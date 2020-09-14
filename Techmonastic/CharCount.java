/* 2. Take a input of a string.Then find frequency of a particular character.
 * If any character ( after a space ) is in small letter then change it in a capital letter.
 * Finally add a special character after that string.Special character should come random basic for every dynamic input-output

 * Enter a string: I Love techmonastic Solution.
 * Input: e
 * Output:
 * Frequency of e = 2
 * Final string = I Love Techmonastic solution $.
*/
import java.util.HashMap;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        System.out.print("Input: ");
        char c = scan.nextLine().charAt(0);
        scan.close();

        System.out.println("Output: ");
        System.out.println("Frequency of " + c + " = " + getCount(str, c));
        System.out.println("Final String = " + titleCase(str));
    }

    static int getCount(String str, char c) {
        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();

        for (char x : str.toLowerCase().toCharArray()) {
            if (counts.containsKey(x)) {
                int value = counts.get(x);
                counts.put(x, value + 1);
            } else
                counts.put(x, 1);
        }
        return counts.get(c);
    }

    static String titleCase(String str) {
        String[] strArr = str.split(" ");
        StringBuilder sbr = new StringBuilder();

        for (String s : strArr) {
            StringBuilder sb = new StringBuilder();
            if (Character.isLowerCase(s.charAt(0))) {
                sb.append(Character.toUpperCase(s.charAt(0)));
                sb.append(s.substring(1));
            } else {
                sb.append(s);
            }
            sbr.append(sb.toString());
            sbr.append(' ');
        }

        String out = sbr.substring(0, sbr.length() - 2);
        char symbol = (char) (33 + (str.length() % 13));
        String temp = " " + symbol + ".";
        return out + temp;
    }
}
