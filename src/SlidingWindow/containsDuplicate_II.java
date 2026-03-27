package SlidingWindow;

import java.util.Scanner;
import java.util.*;

public class containsDuplicate_II {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (map.containsKey(val) && i - map.get(val) <= k) {
                return true;
            }
            map.put(val, i);
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter val for k :");
        int k=sc.nextInt();

        System.out.print(containsNearbyDuplicate(arr,k));
    }
}
