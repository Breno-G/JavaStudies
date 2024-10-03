package Capitulo4;

public class Programa {
    public static void main(String[] args) {
        //variável "conta1" recebe a estrutura dos atributos da Classe Conta
        Conta conta1;
        Conta conta2; 

        //variável "conta1" recebe o objeto Conta() para alterar os dados dos atributos da Classe Conta
        conta1 = new Conta();
        conta2 = new Conta();

        //O ponto acessa qual atributo está sendo alterado por meio do objeto Conta()
        
        conta1.saldo = 1000;

        //conta2
        
        conta2.saldo = 120;


        if (conta1.saca(2000))
        {
            System.out.println("Saque realizado!");
            System.out.println("Saldo atual: " + conta1.saldo);
        }
        else
        {
            System.out.println("Saldo insuficiente para saque");
            System.out.println("Saldo atual: " + conta1.saldo);
        }

        conta1.transferePara(conta2, 100); 
        
        System.out.println("Saldo conta1: " + conta1.saldo);
        System.out.println("Saldo conta2: " + conta2.saldo);
    }
}
 