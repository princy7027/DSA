package HashTable;

import java.util.*;
public class twoSum {
    public static int[] twoSumfind(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int ans=target-nums[i];
            if(mp.containsKey(ans)) return new int[]{mp.get(ans),i};
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(Arrays.toString(twoSumfind(arr,target)));
    }
}
