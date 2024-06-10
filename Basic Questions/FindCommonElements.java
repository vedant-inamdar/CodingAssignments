import java.util.*;
public class FindCommonElements {
    public static List<Integer>find(int[] list1, int[] list2){
        Arrays.sort(list1);
        Arrays.sort(list2);
        List<Integer>result=new ArrayList<>();
        int i=0,j=0;
        while(i<list1.length && j<list2.length){
            if(list1[i]==list2[j]){
                result.add(list1[i]);
                i++;j++;
            }else if(list1[i]<list2[j]){
                i++;
            }else{
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] L1={ 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 
                        71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80 };
        int[] L2={81, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90, 1, 91, 92, 93};
        List<Integer>common=find(L1,L2);
        System.out.println(common);
    }
}