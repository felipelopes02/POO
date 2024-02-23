import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.println("Insira um numero: ");
        numero = ler.nextInt();

        if (numero > 0){
            System.out.println("Seu número é positvo: " + numero);}
            else if (numero == 0){
                System.out.println("Seu número é 0: " + numero);}
                else{
                System.out.println("Seu número é negativo");
            }
            ler.close();



    }
}
