public class Exercicio5 {
    public static void main(String[] args) {
        
            int n1 = 0;
            int n2 = 1;
       
        while(n1 < 100)
        {
            n1 = n2;
            n2 += n1;

            System.out.println(n1);  
        }
    }
}
