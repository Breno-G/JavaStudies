public class Exercicio4 {
    
    public static void main(String[] args) {
       
        long fatorial = 10, n = (int) fatorial;
        
        System.out.println("Recursivo");

        for(int i = (int)fatorial; i > 2; i--)
        {
            fatorial *=  (i - 1);

            System.out.println(fatorial);
        }


        System.out.println("Iterativo");
        fatorial = 10;
        
        for(int i = 1; i < n; i++)
        {
            fatorial *=  i;

            System.out.println(fatorial);
            
        }
    }
}
