public class working{


    public static void main(String[] args){


        String[][] cars = {{"Volvo", "BMW", "Ford", "Mazda"},{"jawa","jajaj","2311"}};

        System.out.println(cars[0][1]);

        for(int i=0;i<cars[0].length;i++){
            System.out.println(cars[0][i]);
        }
        for(int i=cars[0].length-1;i>0;i--){
            System.out.println(cars[0][i]);


        }
        String txt = "Please locate \"jaja\"  9hujfgdfsdai";
        System.out.println(txt.indexOf("h"));
        System.out.println(txt.length());
        System.out.println(txt.indexOf("9"));
        System.out.println(txt.endsWith("i")); //last char checking
        System.out.println(txt.contentEquals("9hai")); //check the 9hai == txt        
        System.out.println(txt.contains("09")); //return the word is in the txt or not
        System.out.println(txt.intern()); // print
        System.out.println(txt.charAt(0)); // index value to get char
        System.out.println(txt.hashCode());

        

    
    
//haia a

    }

}