package alura.primeiro.curso;

public class ExercicioCondicionaisBool {
    public static void main(String[] args) {

        System.out.println("testando condicionais");

        int idade = 16;
        int quantidadePessoas = 3;

        if (idade >=18 || quantidadePessoas >=2){
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("infelizmente voce nao pode entrar");
        }
    }
}
