package lab1;

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
        
    }
    
    public static int factorial(int num){
        return 0;
    }
    
}
