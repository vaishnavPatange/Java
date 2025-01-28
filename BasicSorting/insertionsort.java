public class insertionsort {
    public static void insertsort(int nums[]){
        for(int i=1; i<nums.length; i++){
            int curr = nums[i];
            int prev = i-1;
           // finding out the correct position
            while(prev >=0 && nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            //insertion
            nums[prev+1] = curr;

        }
    }
    public static void main(String args[]){
        int nums[] = {5, 4, 3, 1, 2};
        insertsort(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
