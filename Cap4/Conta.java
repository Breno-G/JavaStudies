package Capitulo4;
//Conta eh a classe
public class Conta{
    //atributos da Classe
    int numero;
    String dono;
    double saldo;
    double limite;

    //saca() é o método
    //saca(var argumento <- local)
    /* void saca(double quantidade)
    *    {
    *       double novoSaldo = this.saldo - quantidade;
    *        this.saldo = novoSaldo;
    *    }
    */
    void deposita(double valor)
    {
        this.saldo += valor;
    }
    
    boolean saca(double valor)
    {
        if (this.saldo < valor)
        {
            return false;
        }
        else
        {
            this.saldo -= valor;
            
            return true;
        }
    }

    boolean transferePara(Conta destino, double valor)
    {
        boolean retirou = this.saca(valor);
        if (retirou == false)
        {
            return false;
        }else
        {   
            destino.deposita(valor);
            return true;
        }
    }
} 
