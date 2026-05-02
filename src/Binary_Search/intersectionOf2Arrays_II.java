
package Binary_Search;

import java.util.*;
public class intersectionOf2Arrays_II {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums1){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        List<Integer> list=new ArrayList<>();
        for(int n2:nums2){
            if(map.containsKey(n2) && map.get(n2) > 0) {
                list.add(n2);
                map.put(n2,map.get(n2) -1);
            }
        }

        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }

        return res;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("First arr ");
        int n= sc.nextInt();
        int[] arr1=new int[n];
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("2nd arr ");
        int n2= sc.nextInt();
        int[] arr2=new int[n2];
        for (int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(intersect(arr1,arr2)));
    }

}

