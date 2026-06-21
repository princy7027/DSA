package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class buildAnArrayWithStackOperations {
    public static List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();

        int curr=1;
        int index=0;

        while(curr <=n && index < target.length){
            int num=target[index];
            if(num ==curr){
                res.add("Push");
                curr++;
                index++;
            }else{
                res.add("Push");
                res.add("Pop");
                curr++;
            }
        }
        return res;
    }
    public static  void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(buildArray(arr,n));
    }
}
