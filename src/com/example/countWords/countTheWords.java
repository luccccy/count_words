package com.example.countWords;
import java.util.*;
public class countTheWords {
    public static void main(String[] args) {
        //input paragraph
        Scanner scanPara = new Scanner(System.in);
        System.out.println("Enter the paragraph: ");
        String p = scanPara.nextLine();

        //input the word which is need to be counted;
        Scanner scanWord = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = scanWord.next();

        //count the number of occurring of the word;
        //String str = new String(p);
        int count = 0;
        for (String words: p.split(" ")) {
            if(words.equalsIgnoreCase(word)) {
                count ++;
            }
        }

        //print the console;
        if(count != 0) {
            System.out.println("The word - " + word + " is available in the paragraph; ");
            System.out.println(word + " has occurred " + count + " times");
        }
        else {
            System.out.println("The word - " + word + "is not available in the paragraph;");
        }
    }
}
