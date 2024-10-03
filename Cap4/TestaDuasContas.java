package Capitulo4;

public class TestaDuasContas {
    
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.saldo = 1000;

        minhaConta.saca(500);
        minhaConta.deposita(5000);

        System.out.println("Saldo real: " + minhaConta.saldo);

        Conta meuSonho = new Conta();

        meuSonho.saldo = 1500000;

        System.out.println("Meu sonho de saldo: " + meuSonho.saldo);
 
    }
}
