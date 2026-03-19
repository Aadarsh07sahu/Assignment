
    import java.util.*;

public class duplicate {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,4,3};
        int n = arr.length;

        System.out.print("Duplicates: ");

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; 
                }
            }
        }
    }
}
