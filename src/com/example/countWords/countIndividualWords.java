package com.example.countWords;
import java.util.*;
public class countIndividualWords {
   public static void main(String[] args) {
       Scanner scanPara = new Scanner(System.in);
       System.out.println("Enter the paragraph: ");
       String p = scanPara.nextLine();
       String str = new String(p);
       Map<String, Integer> map = new HashMap<String, Integer>();
       int count = 0;
       for (String word : p.split(" ")) {
           if (map.containsKey(word)) {
               count = map.get(word);
               map.put(word, count + 1);
           } else {
               map.put(word, 1);
           }
       }
       System.out.println(map);
       int maxValue = 0;
       String mKey = " ";
       for(String i: map.keySet()){
           if(map.get(i) > maxValue){
               maxValue = map.get(i);
               mKey = i;
           }
       }
       System.out.println("Max Value " + maxValue + " is associated with " + mKey + " key");
   }
}
