import java.util.Scanner;

public class problems{

    static void sameValues(){
        System.out.println("Enter the two number");

        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b =myObj.nextInt();

        if(a == b){
            System.out.println("You are Entering same values "+a+" and "+ b);
        }
        else{
            System.out.println("you are Entering diffent values "+a+" and " +b);
        }
    } 

    static void oddOReven(){

        System.out.println("Enter the number");

        Scanner secin = new Scanner(System.in);
        int c = secin.nextInt();

        if (c%2==0){
            System.out.println("THIS IS A  EVEN NUM "+c);
        }
        else{
            System.out.println("THIS IS A  ODD NUM "+ c);
        }
       


    }

    static void greatest(){
        System.out.println("Enter the Three inputs ");

        Scanner thrd = new Scanner(System.in);
        int a = thrd.nextInt();
        int b =thrd.nextInt();
        int c =thrd.nextInt();

        if (a>b && a>c){
            System.out.println("A is greater than "+b+" and "+c);
         }
        else if (b>a && b>c){
            System.out.println("B is greater than "+a+" and "+b);
        }
        else if (c>b && c>a){
            System.out.println("C is greater than "+a+" and "+b);
        }
        else{
            System.out.println("Every this equal "+a+" "+b+" "+c);
        }

    }

    static void pos_neg(){
        System.out.println("Enter the number ");

        Scanner fourin = new Scanner(System.in);
        int c = fourin.nextInt();

        if (c<0){
            System.out.println("IT IS A NEGATIVE NUMBER --> "+c);
        }
        else if(c>0){
            System.out.println("IT IS A POSITIVE NUMBER --> "+c);

        }
        else{
            System.out.println("I think you are Enter another character "+c );
        }
    }

    public static void main(String[] args){

        while(true){
            System.out.print("\n\n\n ------------------------\n  1 = ODD OR EVEN\n  2 = Greatest Of THREE NUM\n  3 = POS_NEG\n  4 = Same_value_or_not\n------------------------\n");

            System.out.println("\n  Select the Option --> \n");

            Scanner fourin = new Scanner(System.in);
            int c = fourin.nextInt();

            if(c==1){
              oddOReven();
            }
            else if(c==2){
              greatest();
            }
            else if(c==3){
              pos_neg();
            }
            else if(c==4){
              sameValues();
            }
            else{
              System.out.println("you are enter wrong input");

        }
        

        }
    }

}