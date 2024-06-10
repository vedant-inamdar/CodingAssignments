// import java.util.*;
public class MissingNumber {
    public static int find(int[] arr){
        // Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(find(arr));
    }
}