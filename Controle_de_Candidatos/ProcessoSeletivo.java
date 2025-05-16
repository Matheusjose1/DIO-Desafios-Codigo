package exercicios.ex002_ControleCandidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos){
            entrandoContato(candidato);
        }
    }

    static void entrandoContato(String candidato){
        int tentativosRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando){
                tentativosRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        } while (continuarTentando && tentativosRealizadas<3);

        if (atendeu){
            System.out.println("Conseguimos contato com " + candidato + "NA" + tentativosRealizadas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + "NA" + tentativosRealizadas + "realizadas");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimir a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada");

        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JONATAS"};

        int candidatosSelecionados = 0;
        int canditatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && canditatosAtual < candidatos.length){
            String candidato = candidatos[canditatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou esse valor de salário " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            canditatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando os demais candidatos");
        }
    }
}
