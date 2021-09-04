package com.example.countWords;
import java.util.*;
public class countWords {
    public static void main(String[] args) {
        System.out.println("Enter the paragraph: ");
        Scanner scan = new Scanner(System.in);
        String p = scan.nextLine();
        int count = 1;
        for(int i = 0; i < p.length() - 1; i++) {
            if((p.charAt(i) == ' ') && (p.charAt(i + 1) != ' ')) {
                count ++;
            }
        }
        System.out.println("Number of words in the paragraph is: " + count);
    }
}
