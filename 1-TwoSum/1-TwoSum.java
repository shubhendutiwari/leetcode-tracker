// Last updated: 9/26/2025, 1:18:19 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
     int temp= 0;
     for(int i=0;i < nums.length;i++){
        for(int j=0;j<nums.length;j++){
            if(i!=j){
                if(nums[i] + nums[j]==target){
                int[] arr = { i,j };
                return arr;
                    }
                }
            }
            
        }
        return null;
     }   
}
