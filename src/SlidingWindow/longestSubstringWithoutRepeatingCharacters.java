package SlidingWindow;

import java.util.Scanner;
import  java.util.*;

public class longestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int left=0;
        int n=s.length();
        Map<Character,Integer> mp=new HashMap<>();
        int maxLen=0;
        for(int right=0;right<n;right++){

            char c=s.charAt(right);
            mp.put(c,mp.getOrDefault(c,0)+1);

            while(mp.get(c) > 1){
                mp.put(s.charAt(left),mp.get(s.charAt(left)) - 1);
                if(mp.get(s.charAt(left)) == 0) mp.remove(s.charAt(left));
                left++;
            }
            maxLen=Math.max(maxLen , right - left + 1);
        }
        return maxLen;
    }

    public  static  void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
}
