class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remain=target-nums[i];
            if(map.containsKey(remain))
                return new int[] {map.get(remain),i};
            map.put(nums[i],i);

        }
        return new int[] {};


        // int[] arr={-1,-1};

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j] == target){
        //             arr[0]=i;
        //             arr[1]=j;
        //             return arr;
        //         }
        //     }
        // }
        // return arr;
    }
}
