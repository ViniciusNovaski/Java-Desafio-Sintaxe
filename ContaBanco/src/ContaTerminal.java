import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número:");
        int numero = Integer.parseInt(scanner.next());

        System.out.println("Digite a agência:");
        String agencia = scanner.next();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Número: " + numero + "\nAgência: " + agencia + "\nNome: " + nomeCliente.toUpperCase() + "\nSaldo: " + saldo);
    }
}
