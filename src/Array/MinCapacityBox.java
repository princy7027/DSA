package Array;

public class MinCapacityBox {
    public static int minimumIndex(int[] arr, int size) {
        int ans=-1;
        int minCapacity=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= size && arr[i] < minCapacity){
                minCapacity=arr[i]; ;
                ans = i;
            }
        }
        return ans;
    }

    public  static  void main(String[] args){
        int[] arr={1,5,3,7};
        int size=3;
        System.out.println(minimumIndex(arr,size));
    }
}
