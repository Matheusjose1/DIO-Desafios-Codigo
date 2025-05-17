import java.util.Scanner;

public class Classificacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        if(saldo>500){
            System.out.println("Confortavel");
        } else if (saldo>=0 && saldo<500) {
            System.out.println("Baixo");
        } else if (saldo<0){
            System.out.println("Negativado");
        }


        scanner.close();
    }
}