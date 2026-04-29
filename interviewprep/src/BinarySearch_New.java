public class BinarySearch_New {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;
        int start = 0;
        int end = arr.length - 1;
        int resultIndex = -1; // Default if not found

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                resultIndex = mid;
                break; // Exit loop once found
            } else if (arr[mid] < target) {
                start = mid + 1; // Search right half
            } else {
                end = mid - 1; // Search left half
            }
        }

        System.out.println(" Target found at index :  " + resultIndex);
    }
}
