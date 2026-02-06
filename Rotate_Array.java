import java.util.Scanner;
import java.util.Arrays;
public class Rotate_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int z=sc.nextInt();
        int[] nums=new int[z];
        System.out.println("Enter the point of rotation:");
        int k=sc.nextInt();
        System.out.println("Enter the array:");
        for(int i=0;i<z;i++){
            nums[i]=sc.nextInt();
        }
        int w=nums.length-k;
        int[] num1=new int[nums.length];
        for(int i=0;i<k;i++){
            num1[i]=nums[i+w];
        }
        for(int j=k;j< nums.length;j++){
            num1[j]=nums[j-k];
        }
        nums=num1;
        System.out.println(Arrays.toString(nums));
    }
}