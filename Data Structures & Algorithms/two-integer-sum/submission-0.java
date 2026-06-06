class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer> map=new HashMap<>();
        // for(int n:nums){
        //     map.put(n,map.getOrDefault(n,0)+1);
        // }
        // for(int i=0;i<nums.length;i++){
        //     int diff=Maths.abs(target-'')
        //     if()
        // }
        int[] arr={-1,-1};

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
