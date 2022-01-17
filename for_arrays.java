import java.util.*;
import java.util.Arrays;

public class for_arrays{

    static int[] arr = { 12, 3, 4, 34,15 }; //it wiil return values but void didn't return value
    
    
    static int sum(){
        int sum = 0; 
        int i;
  
        for (i = 0; i < arr.length; i++)
            sum =sum+arr[i];
        return sum;        
    }

    static int multiply(){
        int sum = 1; 
        int i;
  
        for (i = 0; i < arr.length; i++)
            sum =sum*arr[i];
        return sum;        
    }
 
    
    public static void main(String[] args)  {
         // 4..SUM OF THE ARRAY --------------------
        System.out.println(sum());

        //5 ..MULTIPLY OF THE ARRAYS-----------------
        System.out.println(multiply());

        //3..dimention of array-------------------
        int a4[]={1,2,3,4,4};
        System.out.println(a4[4]);
        int b4[][]={{1,2,3,4},{2,3,4,5}};
        System.out.println(b4[0][2]);

        
        //6.. COPYING THE ARRAY---------------------
        int b[]=arr;
        for(int a:b){
            System.out.print(a+" ");
        }
        System.out.println("");

        //7.. CLONING THE ARRAY--------------------
        int[] f = arr.clone();
        for(int kk:f){
            System.out.print(kk+" ");
        }

        //8..binary search of arrays----------------

            int arrr[] = {10,200,3130,420,50}; 
            int key=50;
            Arrays.sort(arrr);
            int result = Arrays.binarySearch(arrr,key); 

            if (result>0)
                System.out.println("that key is index found "+result);
            else{
                System.out.println("you are specified worng keys");
            }


        //9.. Get a Random Value from an Array-------------------
          
        String[] arr={"1", "2", "3", "4", "5"}; 
        Random r=new Random();    
        int randomNumber=r.nextInt(arr.length); 
        System.out.println(arr[randomNumber]); 

        //10.. Get the First and Last Element of an Array---------------
        String[] arr12={"1", "2", "3", "4", "5"}; 

        int a= arr12.length;
        System.out.println(arr12[0]);
        System.out.println(arr12[a-1]);

        //11..Append a New Item to an Array------------------

        String[] ar12={"1", "2", "dd","3", "4", "5"};
        String bb="hai";
        int d=ar12.length-1;
        ar12[d]=bb;
        System.out.println(ar12[d]);

        //12..Insert a Value Between Two Values--------------
        String[] ar2={"1", "2", "dd","3", "4", "5"};
        int positon =2;
        String valu ="ha  ha ha ";
        ar2[positon]=valu;
        System.out.println(ar2[positon]);
        

        //13.Compare Two Arrays------------------------------

        int a1[]={1,2,3};
        int b1[]={1,2,3};
        if (Arrays.equals(a1,b1)){
           System.out.println("both are same");
        }
        else
          System.out.println("both are differ");

        //14.. check whether the array is empty or not-------------

        int[] any={};
        if(any.length<=0)
           System.out.println("it is a empty array");


        //15 .. suffle the array ............

        Integer[] intArray23 = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> intList = Arrays.asList(intArray23);
		Collections.shuffle(intList);
        System.out.println(intList);

        
        //16..Remove Duplicates from an Array----------------

        Integer[] ar7={1,2,3,4,5,1,1,2,};
        Set<Integer> an=new HashSet(Arrays.asList(ar7));
        System.out.println(an);

        
       //17 ..print an arrays-------------------------

       int[] a234={1,23,4,5,6,7};
       for(int ab:a234){
           System.out.println(ab);
       }

       
        //18 ..Filter Values in an Array------------------------

        String[] ddd={"ac","dvdvfe","ejrejd","ervdvvv"};
        int filter_val=3;
        for(int i =0;i<ddd.length;i++){
            String am=ddd[i];
           
            if (am.length()>=filter_val){
                System.out.println(am);

            }
        }

       //19..Check if a Java Array Contains a Value------------------
       int[] a34={1,23,4,5,6,7};
       int val =7;
       for(int t:a34){
           if(t==val){
               System.out.println("the "+val+" is present in the array"); 
           }
        }

   
    }
}