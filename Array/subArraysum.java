public class subArraysum{
    public static void MaxSum(int nums[]){
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                curr = 0;
                for(int k=i; k<=j; k++){
                    curr += nums[k];
                }
                System.out.println(curr);
                maxSum = Math.max(maxSum, curr);
            }
            
        }
        System.out.println("Max Sum is : "+maxSum);
    }
    public static void main(String args[]){
        int nums[] = {-2,3,4,-5,6,-7,8,9};
        MaxSum(nums);
    }
}