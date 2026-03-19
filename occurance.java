public class occurance {
    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4};
        int x = 2;

        int index = firstOccurrence(arr, x);

        System.out.println("First Occurrence Index: " + index);
    }

    static int firstOccurrence(int[] arr, int x) {

        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while(left <= right) {

            int mid = (left + right) / 2;

            if(arr[mid] == x) {
                ans = mid;        // store answer
                right = mid - 1;  // left side search
            }
            else if(arr[mid] < x) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}