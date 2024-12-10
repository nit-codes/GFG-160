class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max = -1;
        int secMax = -1;
        for (int ele : arr){
            if(ele > max){
            secMax = max;
            max = ele;
        }
        else if(ele > secMax && ele<max){
            secMax = ele;
        }
    }
    return secMax;
    
}
}
