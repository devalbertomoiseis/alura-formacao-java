package alura.primeiro.curso;

public class EscopoVariaveis {
    public static void main(String[] args) {

        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;
        //boolean acompanhado = true;

        if (quantidadePessoas >= 2) {
            boolean acompanhado = true;
        }else {
            boolean acompanhado = false;
        }

        if (idade >=18 || acompanhado){

            System.out.println("Seja bem vindo");
        } else {
            System.out.println("infelizmente voce nao pode entrar");
        }
    }
}
