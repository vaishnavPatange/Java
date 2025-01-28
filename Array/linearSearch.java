public class linearSearch{
    public static int lineSearch(int nums[], int key){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2, 4, 5, 1, 7, 8, 12};
        int key = 12;
        int index = lineSearch(nums, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        } else{
            System.out.println("The key found at index : " + index);
        }
    }
}