package Array;

import java.util.*;

public class MinDistanceToTargetElement {
    public static int getMinDistance(int[] nums, int target, int start) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int absVal=Math.abs(i - start);
                if(mini > absVal) mini=absVal;
            }
        }
        return mini;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();
        int start=sc.nextInt();

        System.out.println(getMinDistance(arr,target,start));
    }
}
