package org.example.array_by_amit;

public class Find123LargestElement {
    public static void main(String[] args) {

        int arr[] = {6,9,2,5,12,5,6,2,3};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != first && num != second) {
                third = num;
            }
        }
        System.out.println("First Largest Element: "+first);
        System.out.println("Second Largest Element: "+second);
        System.out.println("Third Largest Element: "+third);
    }
}
