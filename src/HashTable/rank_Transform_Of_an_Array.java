package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class rank_Transform_Of_an_Array {

    public static int[] arrayRankTransform(int[] arr){
         int[] sortArr=arr.clone();
        Arrays.sort(sortArr);

        Map<Integer,Integer> mp=new HashMap<>();
        int rank=1;
        for(int i :sortArr){
            if(!mp.containsKey(i)){
                mp.put(i,rank);
                rank++;
            }
        }

        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=mp.get(arr[i]);
        }

        return ans;
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
}
