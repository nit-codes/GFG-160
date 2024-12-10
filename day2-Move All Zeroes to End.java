class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int i=0 , n = arr.length;
        for (int j=0 ; j<n ; j++){
            if(arr[j]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i++] = temp;
            }
        }
    }
}
