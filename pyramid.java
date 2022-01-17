import java.util.Scanner;

public class pyramid {

    
  /*  public static int r=5;

    static void nor(){
        for (int i = 1; i <= r; ++i) {
            for (int j = 1; j <= i; ++j) {
              System.out.print("#");
            }
            System.out.println("");
          }

    }
    */

    static void first(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter pramid size >");
        int r = myObj.nextInt();

        

        for (int i = 1; i <= r; ++i) {
            for(int j=r-i;j>0;j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
              System.out.print("* ");
            }
            System.out.println();
          }


    }


    public static void main(String[] args) {
      first();  

    }

    
}
