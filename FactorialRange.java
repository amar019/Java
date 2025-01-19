public class FactorialRange {
    public static void main(String[] args) {
        System.out.println("Factorials from 1 to 10:");
        
        for (int num = 1; num <= 10; num++) {
            long factorial = 1;
            
          
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            
            System.out.println(num + "! = " + factorial);
        }
    }
}
