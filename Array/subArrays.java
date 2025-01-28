public class subArrays{
    public static void sub(int nums[]){
        int curr = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                curr = 0;
                for(int k=i; k<=j; k++){
                    curr += nums[k];
                }
                System.out.println(curr);
            }
            ms = Math.max(curr,ms);
        }
        System.out.println(ms);
    }
    public static void main(String argas[]){
        int nums[] = {2, 4, 5, 1, 7, 8, 12};
        sub(nums);
    }
}