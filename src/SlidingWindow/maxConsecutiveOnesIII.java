package SlidingWindow;

import java.util.Scanner;

public class maxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int left=0, right =0 , maxLen=0;
        while(right < nums.length){
            if(nums[right] == 0) k--;
            while(k < 0) {
                if(nums[left] == 0) k++;
                left ++;
            }
            maxLen=Math.max(maxLen , right - left +1 );
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Input for  flipping k times");
        int k=sc.nextInt();
        System.out.println(longestOnes(arr,k));
    }
}
