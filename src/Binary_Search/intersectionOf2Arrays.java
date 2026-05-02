package Binary_Search;

import java.util.*;

public class intersectionOf2Arrays {

    public static  int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();

        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // add only if unique
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }

        return result;
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

        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }
}
