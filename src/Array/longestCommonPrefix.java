package Array;

import java.util.Scanner;

public class longestCommonPrefix {
    public static String longest_Common_Prefix(String[] strs) {
        String prefix=strs[0];

        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.println(longest_Common_Prefix(arr));
    }
}
