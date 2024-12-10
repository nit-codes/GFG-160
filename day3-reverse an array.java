class Solution {
    public void reverseArray(int arr[]) {
        // Initialize two pointers
        int left = 0;
        int right = arr.length - 1;

        // Swap elements until pointers meet in the middle
        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers
            left++;
            right--;
        }
    }
}
