package fundamentos;
import java.util.Scanner;
import java.time.LocalDate; //entende o que é uma data (sabe que fevereiro tem 28 dias, sabe calcular anos bissextos e etc.
import java.time.format.DateTimeFormatter; // é tipo um tradutor que ensina o java a ler datas no nosso formato

public class PrimeiroExercicio_tiposPrimitivos {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Esse programa serve para você fazer uma declaração do seu salário!");
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Primeiro, qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Agora me informe o seu endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite o valor do salário recebido: ");
        double salario = scanner.nextDouble();

        scanner.nextLine(); // limpeza de buffer

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Informe agora a data do recebimento do salário: ");
        String dataTexto = scanner.nextLine();

        LocalDate data = LocalDate.parse(dataTexto, formatador);

        System.out.println("Perfeito, estamos gerando a sua declaração... Aguarde um momento.");
        Thread.sleep(3000);
        String relatorio = "Eu " +nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+data.format(formatador);
        System.out.println(relatorio);
        scanner.close();
    }
}
