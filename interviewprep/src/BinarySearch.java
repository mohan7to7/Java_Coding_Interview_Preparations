public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;
        int start = 0;
        int end = arr.length - 1;
        int result = -1; // To store the index if found

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid; // Found the target!
                break;
            } else if (arr[mid] < target) {
                start = mid + 1; // Search the right half
            } else {
                end = mid - 1;   // Search the left half
            }
        }

        System.out.println("Element found at index: " + result);
    }
}
