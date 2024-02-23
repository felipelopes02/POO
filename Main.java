import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;

        System.out.println("Informe o seu nome:");
        nome = ler.next();
        System.out.println("Hello world " + nome);
        ler.close();

    }
}
