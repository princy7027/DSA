package HashTable;

import  java.util.*;
public class stringEqualWithOperations {

        public static boolean checkStrings(String s1, String s2) {
//            Map<Character, Integer> e1 = new HashMap<>();
//            Map<Character, Integer> o1 = new HashMap<>();
//            Map<Character, Integer> e2 = new HashMap<>();
//            Map<Character, Integer> o2 = new HashMap<>();
//
//            int n = s1.length();
//
//            for (int i = 0; i < n; i++) {
//                char c1 = s1.charAt(i);
//                char c2 = s2.charAt(i);
//                if (i % 2 == 0) {
//                    e1.put(c1, e1.getOrDefault(c1, 0) + 1);
//                    e2.put(c2, e2.getOrDefault(c2, 0) + 1);
//                } else {
//                    o1.put(c1, o1.getOrDefault(c1, 0) + 1);
//                    o2.put(c2, o2.getOrDefault(c2, 0) + 1);
//                }
//            }
//            return e1.equals(e2) && o1.equals(o2);

            int n = s1.length();

            int[] even1 = new int[26];
            int[] odd1 = new int[26];
            int[] even2 = new int[26];
            int[] odd2 = new int[26];

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    even1[s1.charAt(i) - 'a']++;
                    even2[s2.charAt(i) - 'a']++;
                } else {
                    odd1[s1.charAt(i) - 'a']++;
                    odd2[s2.charAt(i) - 'a']++;
                }
            }

            for (int i = 0; i < 26; i++) {
                if (even1[i] != even2[i] || odd1[i] != odd2[i]) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            System.out.println(checkStrings(s1,s2));
        }
}
