class TwoSum {
    public static void main(String args[]){
        int[] nums = {1,3,2,3,4,5,3};
        int target = 5;
        System.out.println(twoSum(nums,target));
    }
    public static int[] twoSum(int[] nums, int target) {
        // n = nums.length;
        // for(int i = 0; i<n;i++){
        //     for(int j = i+1; j<n;j++){
    
        //         if((nums[i] + nums[j]) == target){
                    
        //         }
        //     }
        // }

        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++){
            int num =nums[i];
            int rem = target - num;
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(index == i) continue;
                return new int[] {i, index};
            }
        }

        return new int[] {};
    }
}