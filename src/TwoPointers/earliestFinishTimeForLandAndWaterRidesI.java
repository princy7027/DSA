package TwoPointers;

import java.util.Scanner;

public class earliestFinishTimeForLandAndWaterRidesI {
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;

        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //land -> water
                int landFinish=landStartTime[i]+landDuration[i];

                int waterStart=Math.max(landFinish,waterStartTime[j]);
                int finish1=waterStart + waterDuration[j];

                //water -> land
                int waterFinish=waterStartTime[j]+waterDuration[j];

                int landStart=Math.max(waterFinish,landStartTime[i]);
                int finish2=landStart + landDuration[i];

                ans=Math.min(ans, Math.min(finish1, finish2));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] landStartTime = new int[n];
        for (int i = 0; i < n; i++) {
            landStartTime[i] = sc.nextInt();
        }

        int[] landDuration = new int[n];
        for (int i = 0; i < n; i++) {
            landDuration[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] waterStartTime = new int[m];
        for (int i = 0; i < m; i++) {
            waterStartTime[i] = sc.nextInt();
        }

        int[] waterDuration = new int[m];
        for (int i = 0; i < m; i++) {
            waterDuration[i] = sc.nextInt();
        }

        System.out.println(
                earliestFinishTime(
                        landStartTime,
                        landDuration,
                        waterStartTime,
                        waterDuration
                )
        );
    }
}
