public class Largest{
    public static void largest(int nums[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            largest = Math.max(largest, nums[i]);
        }
        System.out.println(largest);
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            smallest = Math.min(smallest, nums[i]);
        }
        System.out.println(smallest);
    }
    public static void main(String args[]){
        int nums[] = {2, 4, 5, 1, 7, 8, 12};
        largest(nums);

    }
}