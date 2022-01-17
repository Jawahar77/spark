import java.util.Scanner;
public class test1 {
 
public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.print("enter the num");
    int b =myObj.nextInt();

    String[] nums = new String[b];
    for(int i = 0; i < nums.length; i++){
        Scanner myObj1 = new Scanner(System.in);
        String c=myObj1.nextLine();
        String cd=c.toUpperCase();
        nums[i] = cd;
        
    } 
    System.out.println(nums);
    int n=nums.length;
    for(int j=0;j<n;j++){
        System.out.println(nums[j]);
    }
        //int declare pandrathu once scanner difine panna podum 
         // but string na another scanner function vanganum
}
}