package Array;

import java.util.*;
public class threeSum {
    public static List<List<Integer>> three_Sum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length - 2;i++){
            if(i >0 && nums[i] == nums[i-1]) continue;

            int left=i+1;
            int right=nums.length -1;

            while(left < right){
                int sum=nums[i] + nums[left]+nums[right];

                if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(left < right && nums[left] == nums[left + 1]) left++;

                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }else if(sum < 0) left++;
                else right--;
            }
        }
        return list;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(three_Sum(arr));
    }
}
