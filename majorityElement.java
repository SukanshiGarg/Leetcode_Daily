class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        Integer candidate=null;

        //Phase 1:Find the candidate 
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            count+=(num == candidate )? 1:-1;
        }

        //Phase 2: Verification of the candidate
        count=0;
        for(int num:nums){
            if(num == candidate) count++;
        }

        //Phase 3: Ensure that the candidate is the majority element
        if(count> nums.length/2) return candidate;
        else return -1;  //No majority element
        
    }
}
