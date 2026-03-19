import java.util.*;

public class missing_no {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6};
        int n = 6;

        int total = n * (n + 1) / 2;
        int sum = 0;

        // simple for loop
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Missing: " + (total - sum));
    }
}