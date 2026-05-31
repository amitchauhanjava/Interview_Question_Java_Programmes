package org.example.string_by_amit;

public class ReverseWords {
    public static void main(String[] args) {

        String str = "Java Program";

        String[] ch = str.split(" ");

        String reverse = "";

        for (int i = ch.length - 1; i >= 0; i--) {

            for (int j = ch[i].length() - 1; j >= 0; j--) {

                reverse += ch[i].charAt(j);
            }

            reverse += " ";
        }

        System.out.println(reverse);
    }
}
