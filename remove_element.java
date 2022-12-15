class Solution {
    public int removeElement(int[] nums, int val) {
        // int n = nums.length;
        // int temp;
        // for(int i = 0; i < n; i++){
        //       int count; 
        //     if(val == nums[i]){
               
        //         count +=1;
                
        //     }
        //     temp = count;
        // }     
        // return temp;
        if(nums.length == 0) return 0;

        int j = 0; 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
             }
        }
        return j;
    }
} 
class remove_element{
    public static void main(String args[]){
       Solution s = new Solution();
       System.out.println(s.removeElement([3,52,52,52,5,6,9,4,2,58,],52)); 
    }
}