import java.util.Scanner;
public class test2 {
 
public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
   
    System.out.print("enter the num");
    int b =myObj.nextInt();

       String[] names = new String[b];
       myObj.skip(System.lineSeparator());

        for(int i = 0; i < names.length; i++){
        
          names[i] =myObj.nextLine();
        } 
    
            for(int j=0;j<names.length;j++){
            System.out.println(names[j].toUpperCase());
            }
       
        }



            
}