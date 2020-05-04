package lab1;

public class Matematica {
    
    public static boolean numEsPrimo(int num){
        return false;
    }
    
    public static int mcd (int num1, int num2){
        return 0;
    }
    
    public static void fibonacci (int num){
        int t1 = 0, t2 = 1;
        //System.out.print("Serie fibonacci de " + n + " terminos: ");

        for (int i = 1; i <= num; ++i)
        {
           // System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    
    public static int factorial(int num){
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        //System.out.printf("Factorial de %d = %d", num, factorial);
        return 0;
    }
    
}
