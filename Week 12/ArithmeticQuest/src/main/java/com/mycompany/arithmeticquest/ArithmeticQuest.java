package com.mycompany.arithmeticquest;

public class ArithmeticQuest {
  
    public static int divide(int n){
        return 100/n;
    }

    public static double findSquareRoot(int number){
        
        if (number<0){
            throw new ArithmeticException("Can't take square root of negative integers");
        }
        return Math.sqrt(number);
    }
    
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("=== Division Error ===");
        for (int i=3; i>=-1; i--){
            try {
                System.out.println("Trying with " +i);
                int result = divide(i);
                System.out.println("result: " +result);
            }
            catch (ArithmeticException e){
                System.out.println("Exception caught: " +e.getLocalizedMessage());
            }
            System.out.println("----------------------------");
        }
        
        
        System.out.println();
        System.out.println("=== Square Root Error ===");
        for (int a=3; a>=-2; a--){
        try {
            System.out.println("trying with " +a);
            double r = findSquareRoot(a);
            System.out.printf("Result: %.4f", r);
            System.out.println();
        }
        catch (ArithmeticException f){
            System.out.println("Exception caught: " +f.getMessage());
        }
            System.out.println("----------------------------");
        }
    }
}
