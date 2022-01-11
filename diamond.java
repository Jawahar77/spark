import java.util.Scanner;
public class diamond {


    static void abc(int n){
        int i,j,k;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(k=0;k<2*i+1;k++){
                System.out.print("*");
            }
             System.out.println("");
            }
            
         for(i=n-1;i>0;i--) {

            for(j=n-1;j>=i;j--) {
                System.out.print(" ");
            }
           for(k=2*i-1;k>0;k--){
              System.out.print("*");
            }
            System.out.println("");
        }
    } 


    
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number of row for full diamond: ");  
        int n= sc.nextInt(); 
        abc(n);
        
}}
