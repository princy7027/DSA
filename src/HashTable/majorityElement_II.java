package HashTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class majorityElement_II {
        public static List<Integer> majorityElement(int[] nums) {

            int candidate1 = 0, candidate2 = 0;
            int count1 = 0, count2 = 0;

            // Find potential candidates
            for (int num : nums) {

                if (candidate1 == num) {
                    count1++;
                }
                else if (candidate2 == num) {
                    count2++;
                }
                else if (count1 == 0) {
                    candidate1 = num;
                    count1 = 1;
                }
                else if (count2 == 0) {
                    candidate2 = num;
                    count2 = 1;
                }
                else {
                    count1--;
                    count2--;
                }
            }

            // Verify candidates
            count1 = 0;
            count2 = 0;

            for (int num : nums) {
                if (num == candidate1)
                    count1++;
                else if (num == candidate2)
                    count2++;
            }

            List<Integer> ans = new ArrayList<>();

            if (count1 > nums.length / 3)
                ans.add(candidate1);

            if (count2 > nums.length / 3)
                ans.add(candidate2);

            return ans;
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
