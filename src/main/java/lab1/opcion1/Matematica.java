package lab1.opcion1;

public class Matematica {
    
    public static boolean numEsPrimo(int num){
        int div = 2;
        
        while (div!=num){
            if (num % div == 0){
                return false;
            }
          div++;
        }
        return true;
    }
    
    public static int mcd (int num1, int num2){
        
        int resto;
        
        do
        {            
            resto = num1 % num2;
            num1 = num2;
            
            if (resto != 0){
                num2 = resto;    
            }
        } while (resto != 0);

        return num2;
        
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
