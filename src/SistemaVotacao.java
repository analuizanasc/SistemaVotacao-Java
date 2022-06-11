import java.util.Calendar;
import java.util.Scanner;

public class SistemaVotacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();

        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Você nasceu em que ano?");
        int nascimento = entrada.nextInt();

        //DESCOBRIR IDADE > COMO FAZER FUNCAO?
        int ano = calendario.get(Calendar.YEAR);
        int idade = ano - nascimento;


        //CONDIÇOES PARA VOTAÇAO
        if (idade<16) {
            System.out.println(nome + ",você tem " + idade + " anos. Você ainda não pode votar!");
        } if ((idade >= 16 && idade<18) || idade>=80) {
            System.out.println(nome + ",você tem " + idade + " anos. Seu voto é opcional!");
        } if (idade>= 18 && idade<80) {
            System.out.println(nome + ",você tem " + idade + " anos. Seu voto é obrigatório!");
        }
    }
}
