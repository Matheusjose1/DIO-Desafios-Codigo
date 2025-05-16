package src;

import java.util.Scanner;
        /*
        TODO:
        1. Importar classe Scanner
        2. Exebir mensagens
        3. Obter valores digitados no terminal
        4. Exbir mensagens criadas
         */

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite seu número");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite sua agencia");
        agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo");
        saldo = scanner.nextDouble();

        System.out.println("Número: " + numero );
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);

    }
}
