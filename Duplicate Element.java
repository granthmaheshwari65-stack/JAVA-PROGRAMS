import java.util.Arrays;
import java.util.Scanner;

public class Duplicate Element {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int N=sc.nextInt();
        int[] nums=new int[N];
        System.out.println("Enter a list of array in which only one duplicate is there:");

        for(int i=0; i<N ; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                System.out.println(nums[i]);
            }
        }
    }
}