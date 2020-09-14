/*
 * 3. Program to replace some characters in a string and then add a number on that string
 * For added number check this below example :

 * a : 1
 * b : 2
 * .........
 * y : 25
 * z : 26
 * So, hey  == 8525 because h : 8 , e :5 and y:25
 * Input: hellow techmonastic
 * string to be replaced: hellow
 * string to be replaced with: hey
 * output: hey techmonastic 8525
*/

import java.util.Scanner;

public class ReplaceCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        String str = scan.nextLine();
        System.out.print("String to be replaced : ");
        String oldStr = scan.nextLine();
        System.out.print("String to be replaced with : ");
        String newStr = scan.nextLine();
        scan.close();

        String cipher = getCipher(newStr);
        str = str.replaceFirst(oldStr, newStr);
        str += " " + cipher;
        System.out.println("Output : " + str);
    }

    static String getCipher(String newStr) {
        String out = "";

        for (char c : newStr.toLowerCase().toCharArray()) {
            int num = (c - 'a') + 1;
            out += "" + num;
        }

        return out;
    }
}
