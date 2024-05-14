import java.util.*;

class Functions{
    // Split Function
    public static int[] Split_Expression(String Equation){

        String[] s1 = Equation.split("[\\-+wxyzXYZW= ]+");
       
        int[] expression = new int[s1.length]; 

        for(int i = 0; i < s1.length; i++){
            if(s1[i].length() > 0){ 
                expression[i] = Integer.parseInt(s1[i]);  
            }
        }
      return expression;
    }

        // Print Function
        public static void Print_Expression(int[] Expression_1){

            for (int i = 0; i < Expression_1.length; i++) {
                if (i == 3){
                     System.out.print("|  ");
                }   
                    System.out.print(Expression_1[i] + "    ");
        }
        System.out.println();
        }
    
}

// Main code-------------------------------------------------------------------------------
public class Gauss_jordan_method{
    public static void main(String args[]){
        
    }
}