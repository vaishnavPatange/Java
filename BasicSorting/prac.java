import java.util.*;
public class prac {
    public static void BubbleSort(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-1; j++){
                if(nums[j+1] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void InsertionSort(int nums[]){
        for(int i=1; i<nums.length; i++){
            int curr = nums[i];
            int prev = i-1;
            while(prev >= 0 && nums[prev] < curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
    }

    public static void CountingSort(int nums[]){
        int largest = 0;
        for(int i=0; i<nums.length; i++){
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }

        //sorting
        int j=0;
        for(int i=count.length-1; i >= 0; i--){
            while(count[i] > 0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        Integer nums[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        //BubbleSort(nums);
        //InsertionSort(nums);
        //CountingSort(nums);
        Arrays.sort(nums, Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
