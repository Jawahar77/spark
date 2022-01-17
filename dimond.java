import java.util.Scanner;

public class dimond {

    static void pram(int r){

        for (int i = 1; i <= r; ++i) {
            for(int j=r-i;j>0;j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
              System.out.print("# ");
            }
            System.out.println();
          }
        
    }
    
    
    static void sec(int r){
        //int r=4;
        for (int i = r; i >= 1; --i) {

            for(int j=r-i;j>0;j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print("# ");
              }
              System.out.println();
          
            
          }
    }
    
    


    public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter pramid size >");
    int r = myObj.nextInt();
    //int k=--r;
    //System.out.print(k);
    int k=r--;

      pram(r);  
      sec(k);

    }

    
}
