public class TrapingRainwater{
    public static int TrappedWater(int nums[]){
        int trappedWater = 0;
        int leftmax[] = new int[nums.length];
        leftmax[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            leftmax[i] = Math.max(leftmax[i-1], nums[i]);
        }
        int rightmax[] = new int[nums.length];
        rightmax[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            int waterlevel = Math.min( leftmax[i], rightmax[i]);
            trappedWater += waterlevel - nums[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int nums[] = {4, 2, 0, 3, 2, 5};
        System.out.println(TrappedWater(nums));
        
    }
}