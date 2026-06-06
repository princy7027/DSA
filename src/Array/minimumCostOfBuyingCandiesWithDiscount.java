package Array;

import java.util.Arrays;
import java.util.Scanner;

public class minimumCostOfBuyingCandiesWithDiscount {
    public static int minimumCost(int[] cost) {
        // int n=cost.length;
        // int sum=0;
        // int cnt=0;
        // Arrays.sort(cost);
        // for(int i=n-1;i>=0 ;i--){
        //     if(cnt<2){
        //         sum += cost[i];
        //         cnt++;
        //     }else if(cost[i] <= cost[i+1] && cost[i] <= cost[i+2]){
        //         cnt=0;
        //         continue;
        //     }
        // }
        // return sum;
        Arrays.sort(cost);

        int ans = 0;
        int n = cost.length;

        for (int i = n - 1; i >= 0; i -= 3) {
            ans += cost[i];
            if (i - 1 >= 0) {
                ans += cost[i - 1];
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int len=scanner.nextInt();
        int[] arr=new int[len];

        for(int i=0;i<len;i++){
            arr[i]=scanner.nextInt();
        }

        System.out.println(minimumCost(arr));

    }
}
