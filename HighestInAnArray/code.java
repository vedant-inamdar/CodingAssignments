public class code {
    public static int find(int[] arr,int idx, int currmax){
        if(idx==arr.length){
            return currmax;
        }
        if(arr[idx]>currmax){
            currmax=arr[idx];
        }
        return find(arr,idx+1,currmax);
    }
    public static void main(String[] args) {
        int[] arr1={1, 3, 5, 6, 99, 12, 2};
        int[] arr2={6, 7, 8};
        System.out.println(find(arr1,0,arr1[0]));
        System.out.println(find(arr2,0,arr2[0]));
    }
}