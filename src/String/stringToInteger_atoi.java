package String;

import java.util.Scanner;

public class stringToInteger_atoi {

    public static int myAtoi(String s) {
        //if start by words - stop = return 0
        //whitespace - ignored
        //-/+ -- contain in answer
        //start by digit and in between non-digit occur - reading stop
        //skip leading zeros until a non-digit is encountered

        int n=s.length();
        int i=0;
        while(i<n && (s.charAt(i) == ' ')) i++;

        int sign=1;
        if (i<n && (s.charAt(i) == '-' || s.charAt(i)=='+')){
            sign= s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        while (i<n && (s.charAt(i) == '0')){ i++;}

        long num=0;
        while(i< n && (Character.isDigit(s.charAt(i)))){
            int digit=s.charAt(i) - '0';
            num =num *10 + digit;

            if(sign == 1 && num > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -num < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (sign*num);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        System.out.println(myAtoi(s));
    }
}
