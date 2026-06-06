package Math;

import java.util.Scanner;

public class totalWavinessOfNumbersInRange_I {
    public static int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int j=num1;j<=num2;j++){
            String s=String.valueOf(j);

            for(int i=1;i<s.length()-1;i++){
                if((s.charAt(i) > s.charAt(i-1) && s.charAt(i) > s.charAt(i+1)) ||
                        (s.charAt(i) < s.charAt(i-1) && s.charAt(i) < s.charAt(i+1))) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println(totalWaviness(n1,n2));
    }
}
