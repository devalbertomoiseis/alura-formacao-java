package alura.java.oo;

public class CriarConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        primeiraConta.agencia = 123;
        primeiraConta.numero = 0436;
        primeiraConta.titular = "Joao da Silva";
        System.out.println(primeiraConta.titular);
        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
    }
}
