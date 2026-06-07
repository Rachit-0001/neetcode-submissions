class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int l=0;
        int h=n-1;

        while(l<h){
            if(numbers[l]+numbers[h]==target) return new int[] {l+1,h+1};
            else if(numbers[l]+numbers[h]>target) h--;
            else l++;
        }
        return new int[]{0};
    }
}
