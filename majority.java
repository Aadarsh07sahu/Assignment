import java.util.*;
public class majority {
    


    public static void main(String[] args) {

        int[] arr = {1,2,3,1,2,1,1};
        int n = arr.length;

        System.out.print("Majority Elements: ");

        for(int i = 0; i < n; i++) {

            int count = 0;

            // count frequency
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            // check > n/3
            if(count > n/3) {

                // duplicate print avoid karne ke liye
                boolean alreadyPrinted = false;
                for(int k = 0; k < i; k++) {
                    if(arr[k] == arr[i]) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if(!alreadyPrinted) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}

