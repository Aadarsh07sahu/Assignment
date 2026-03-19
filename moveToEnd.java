 
 import java.util.*;
 public class moveToEnd {
    
    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};
        int n = arr.length;

        int index = 0;

    
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while(index < n) {
            arr[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(arr));
    }

}
