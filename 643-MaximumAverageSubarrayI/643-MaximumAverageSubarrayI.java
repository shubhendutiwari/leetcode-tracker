// Last updated: 9/26/2025, 1:18:20 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right= k-1;
        int maxSum=0;
        int sum=0;
        for(int i=0; i<k;i++){
            sum+=nums[i];
        }
        maxSum= sum;  
        for(int i = k; i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            maxSum=Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
    }
}