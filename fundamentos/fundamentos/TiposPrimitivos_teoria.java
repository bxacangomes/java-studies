package fundamentos;

// Esse é apenas para lembrar quais são os tipos primitivos.

public class TiposPrimitivos_teoria {
    public static void main(String[] args) {
       int idade = 27;
       long numeroLongo = 100000000L;
       double salarioDouble = 1620.4041D;
       float salarioFloat = 1620.40F;
       byte idadeByte = 127;
       short idadeShort = 10;
       boolean verdadeiro = true;
       boolean falso = false;
       char caractere = '\u5141';
       String nome = "Bianca";

        System.out.println("Sua idade (int) é "+idade+" anos");
        System.out.println("O numero longo (long) é "+numeroLongo);
        System.out.println("Seu salário em double é "+salarioDouble);
        System.out.println("Seu salário em float é "+salarioFloat);
        System.out.println("Sua idade (byte) é "+idadeByte+" anos");
        System.out.println("Sua idade (short) é "+idadeShort+" anos");
        System.out.println("Sua idade (int) é "+idade+" anos");
        System.out.println(falso);
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
        System.out.println("Seu nome é "+nome);
    }

}
