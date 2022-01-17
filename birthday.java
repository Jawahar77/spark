import java.util.Scanner;

public class birthday{

    static void fir(){
        Scanner myObj = new Scanner(System.in);
        String b =myObj.nextLine();

        String text = b.replaceAll("[^a-z]", "");
        
        String numberOnly = b.replaceAll("[^0-9]", "");
        
        int i=Integer.parseInt(numberOnly); 

        int c=2020-i;

        System.out.println("Happy Birthday! "+text+" Your current age is "+c);

    }

    public static void main(String[] args){


        Scanner myObj = new Scanner(System.in);
        String str =myObj.nextLine();
        
        String[] splited = str.split("\\s+");
    
        String split_one=splited[0];
        String split_second=splited[1];

        //it use to convert string to int
        int i=Integer.parseInt(split_second);
        int c =2020-i;
        
        
        System.out.println("Happy birthday "+split_one+" your current age "+c);
        
    }

}