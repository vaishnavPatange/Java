public class prefix{
    public static void Prefix(int nums[]){
        int currSum = 0; 
        int MaxSum = Integer.MIN_VALUE;
        int pre[] = new int[nums.length];
        pre[0] = nums[0];
        for(int i=1; i<pre.length; i++){
            pre[i] = pre[i-1] + nums[i];
        }

        // to calculate the MaxSum
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                currSum = i == 0 ? pre[j] : pre[i-1] - pre[j];
            }
            MaxSum = Math.max(currSum, MaxSum);
        }
        System.out.println(MaxSum);
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 4, 5};
        Prefix(nums);
    }
}