package alura.primeiro.curso;

public class Condicionais {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");
        int idade = 20;
        int quantidadePessoas = 3;
        if(idade >= 18) {
            System.out.println("você já tem mais de 18 anos..");
            System.out.println("seja bem vindo");
        }else{
            if(quantidadePessoas >= 2 ){
                System.out.println("você não tem 18, mais pode entrar, " + "pois está acompanhado");
            }
            else{
                System.out.println("infelizmente você não pode entrar! ");
            }
        }
    }
}
