package Array;

//import java.util.Arrays;
import java.util.Scanner;

public class maximumIceCreamBars {

    public static int maxIceCream(int[] costs, int coins) {

//  =========== brute force =============
//        Arrays.sort(costs);
//        if(costs[0] > coins) return 0;
//
//        int ans=0;
//        for(int i=0;i<costs.length;i++){
//            if(costs[i] <= coins){
//                ans++;
//                coins -= costs[i];
//            }else break;
//        }
//
//        return ans;

// ===============  counting sort =============
        int max=0;
        for(int cost : costs){
            if(cost > max) max=cost;
        }

        int[] freq=new int[max+1];
        for(int cost:costs){
            freq[cost]++;
        }

        int ans=0;
        for(int i=0;i<max;i++){
            if(freq[i] == 0) continue;
            if(coins < i) break;

            int quantity=Math.min(freq[i], coins / i );
            ans += quantity;
            coins -= quantity*i;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int coin=sc.nextInt();
        int[] costs =new int[n];
        for(int i=0;i<n;i++){
            costs[i]=sc.nextInt();
        }

        System.out.println(maxIceCream(costs,coin));
    }
}
