class Solution {
    public int missingNumber(int[] nums) {
        int total_sum=0;
        int arr_sum=0;
        int n=nums.length;
        total_sum=(n*(n+1))/2;
        for(int val : nums){
            arr_sum += val;
        }
        return total_sum-arr_sum;
        
    }
}