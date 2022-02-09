import java.util.Scanner;

public class calculator {

    public static void main(String[] args){

        process_Cal ab=new process_Cal();

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the num 1 ");
        int r = myObj.nextInt();
        System.out.print("Enter the num 2 ");
        int r2 = myObj.nextInt();

        System.out.println(" 1=addition \n 2=subractio \n 3=multiplication \n 4=division");

        System.out.println("enter the choice ");
        int r3 = myObj.nextInt();

        if(r3==1){
            ab.addition(r,r2);
            
        }else if(r3==2){
            ab.subraction(r,r2);

        }else if(r3==3){
            ab.multy(r,r2);
        }
        else if(r3==3){
            ab.Division(r,r2);
        }else{
            System.out.println("you are enter worng choice ");

        }
    }
}


