 import java.util.*;
public class merge {
   


    public static void main(String[] args) {

        int[] arr1 = {1,4,7,8,10};
        int[] arr2 = {2,3,9};

        int n = arr1.length;
        int m = arr2.length;

        for(int i = 0; i < n; i++) {

            if(arr1[i] > arr2[0]) {

                // swap
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // arr2 ko fir se sort karo (insertion type)
                int first = arr2[0];
                int k;

                for(k = 1; k < m && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }

                arr2[k - 1] = first;
            }
        }

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}

