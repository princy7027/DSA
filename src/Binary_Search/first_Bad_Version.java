package Binary_Search;

import java.util.Scanner;

public class first_Bad_Version {

    static int bad = 4;

    public static boolean isBadVersion(int version) {
        return version >= bad;
    }

    public static int firstBadVersion(int n) {
        int start=1;
        int end=n;
        while(start <= end){
            int mid= start + (end - start) / 2;
            if(isBadVersion(mid)) end= mid -1;
            else start = mid +1;
        }
        return start;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(firstBadVersion(n));
    }
}
