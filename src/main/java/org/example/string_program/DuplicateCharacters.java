package string_program;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "Amit Chauhan";
        findDuplicateCharacters(input);
    }

    public static void findDuplicateCharacters(String str) {
        int length = str.length();
        
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }
            if (count > 1 && str.indexOf(currentChar) == i) {
                System.out.println(currentChar);
            }
        }
    }
}
