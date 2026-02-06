import java.util.Scanner;
public class Multiply_Strings {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        int a = Integer.valueOf(num1);  // with this we can convert a string to an integer
        int b = Integer.valueOf(num2);
        int c=a*b;
        String num = Integer.toString(c);// now integer back to string
        System.out.println(num);
    }
}