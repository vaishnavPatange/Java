public class reverseArray{
   public static void reverse(int nums[]){
        int start = 0 , end = nums.length-1;
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

   }
    public static void main(String args[]){
        int nums[] = {2, 4, 5, 1, 7, 8, 12};
        reverse(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }
}