package TwoPointers;

import java.util.Scanner;

public class earliestFinishTimeForLandAndWaterRides_II {
    private static int calFinishTime(int[] ls, int[] ld,
                              int[] ws, int[] wd) {

        int mini = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < ls.length; i++) {
            mini = Math.min(mini, ls[i] + ld[i]);
        }

        for (int i = 0; i < ws.length; i++) {
            int finish = Math.max(mini, ws[i]) + wd[i];
            ans = Math.min(ans, finish);
        }

        return ans;
    }

    public static  int earliestFinishTime(int[] landStartTime,
                                  int[] landDuration,
                                  int[] waterStartTime,
                                  int[] waterDuration) {

        int landFirst = calFinishTime(
                landStartTime, landDuration,
                waterStartTime, waterDuration
        );

        int waterFirst = calFinishTime(
                waterStartTime, waterDuration,
                landStartTime, landDuration
        );

        return Math.min(landFirst, waterFirst);
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
