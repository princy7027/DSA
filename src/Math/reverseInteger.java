package Math;

import java.util.Scanner;

public class reverseInteger {
//    public static int reverse(int x) {
//        int n=Math.abs(x);
//        int rev=0;
//        while(n !=0){
//            int ld=n%10;
//            if (rev > (Integer.MAX_VALUE - ld) / 10) {
//                return 0;
//            }
//            rev = rev * 10 + ld;
//            n /= 10;
//        }
//        return x < 0 ? -rev : rev;
//    }
public static int reverse(int x) {

    int reversed=0;
    while(x != 0){
        int n=x % 10;
        x /= 10;
        if(reversed > Integer.MAX_VALUE / 10) return 0;
        if(reversed < Integer.MIN_VALUE / 10) return 0;

        reversed= reversed * 10 + n;
    }
    return reversed;

}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
    }
}
