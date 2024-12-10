class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the first decreasing element from the end
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: If such an element was found
        if (i >= 0) {
            // Find the smallest element larger than arr[i] to the right
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            // Swap arr[i] and arr[j]
            swap(arr, i, j);
        }

        // Step 3: Reverse the elements to the right of index i
        reverse(arr, i + 1, n - 1);
    }

    // Helper function to swap two elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper function to reverse a subarray
    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
