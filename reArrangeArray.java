class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int posIndx=0;
        int negIndx=1;

        for(int i=0;i<n;i++){
            if(nums[i]<0){
                ans[negIndx]=nums[i];
                negIndx+=2;
            }
            else{
                ans[posIndx]=nums[i];
                posIndx+=2;
            }
        }
        return ans;
        
    }
}
