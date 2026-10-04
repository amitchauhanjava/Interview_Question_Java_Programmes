package org.example.interview_string_program;

public class Palindrome {
    public static void main(String[] args) {
        String palindromString="kanak";
        String reverse="";
        for(int i=palindromString.length()-1;i>=0;i--){
            reverse+=palindromString.charAt(i);
        }
        if(reverse.equals(palindromString)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }
    }
}
