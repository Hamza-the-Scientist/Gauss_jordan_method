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

        
        // Divide the Row 1 first element ==> 1 
        public static int[] Divide(int location, int[] Expression){
            if(Expression[location] != 1){
    
                System.out.println("Row "+ (location+1) +" /" + Expression[location]);
    
                int New_Expression[] = new int[4];
                for(int i = 0; i <= 3; i++){
                New_Expression[i] = Expression[i] / Expression[location];
                }
                for(int i = 0; i <= 3; i++){
                Expression[i] = New_Expression[i];
                }
            } 
    
            return Expression;
        }
    
        //Subtract to get ==> 0
        public static int[] Subtract(int location, int[] Expression,int[] Expression_1){
            if(Expression[location] != 0 ){
                System.out.println("Row 2 - ("+ Expression[location]+")Row 1");
    
                int[] New_Expression = new int[4];
                for(int i = 0; i <= 3; i++){   
                New_Expression[i] = (Expression[location]* Expression_1[i]);
                }
                // row2 = row2 - row1
                for(int i = 0; i <= 3; i++){
                Expression[i] = Expression[i] - New_Expression[i];
                }
            } 
    
    
            return Expression;
        }
    
}

// Main code-------------------------------------------------------------------------------
public class Gauss_jordan_method{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        
        // Taking Input
        System.out.print("Enter an Expression_1 : ");
        String Equation1 = sc.nextLine();

        System.out.print("Enter an Expression_2 : ");
        String Equation2 = sc.nextLine();

        System.out.print("Enter an Expression_3 : ");
        String Equation3 = sc.nextLine();

        // Calling function in to an new Array
        int[] Expression_1 = Functions.Split_Expression(Equation1);
        int[] Expression_2 = Functions.Split_Expression(Equation2);
        int[] Expression_3 = Functions.Split_Expression(Equation3);

        Functions.Print_Expression(Expression_1);
        Functions.Print_Expression(Expression_2);
        Functions.Print_Expression(Expression_3);
        System.out.println("_____________________ \n");

         // Checking already have 1 at 0 index
         if(Expression_2[0] == 1 && Expression_1[0] != 1){
            int[] New_Expression = new int[3];
            New_Expression =  Expression_1;
            Expression_1 =  Expression_2;
            Expression_2 =  New_Expression;

            System.out.println("Row 1 <--> Row 2");

            Functions.Print_Expression(Expression_1);
            Functions.Print_Expression(Expression_2);
            Functions.Print_Expression(Expression_3);
            System.out.println("_____________________ \n");

        }
        if(Expression_3[0] == 1 && Expression_1[0] != 1){
            int[] New_Expression = new int[3];
            New_Expression =  Expression_1;
            Expression_1 =  Expression_3;
            Expression_3 =  New_Expression;

            System.out.println("Row 1 <--> Row 3");

            Functions.Print_Expression(Expression_1);
            Functions.Print_Expression(Expression_2);
            Functions.Print_Expression(Expression_3);
            System.out.println("_____________________ \n");
        }        
    
    
    

        
    }
}