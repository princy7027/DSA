package HashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class majorityElement_I {
    public static int majorityElement(int[] nums) {
        int len=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }

        len=len/2;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue() > len) return entry.getKey();
        }

        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
}
