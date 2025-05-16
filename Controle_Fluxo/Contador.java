package exercicios.Desafio_Controle_Fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número 1");
        int num1 = scanner.nextInt();
        System.out.println("Digite o número 2");
        int num2 = scanner.nextInt();

        try {

            contar(num1, num2);

        } catch (ParametrosInvalidosException exception){
            System.out.println("Erro: " + exception.getMessage());
        }
    }

    static void contar (int num1, int num2) throws ParametrosInvalidosException{

        if (num1 > num2){
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo");
        }

        int ocorrencias = num2 - num1;
        for(int i = 0; i<=ocorrencias; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
