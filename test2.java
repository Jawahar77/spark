
//find max num  in the array
public class test2 {
 
public static void main(String[] args) {

    int[] a={1,3,4,9,9,0};
    int max=0;

    for(int b:a){
        if(b>=max){
            max=b;
        }
    }
     System.out.println(max);
    }
        
}
