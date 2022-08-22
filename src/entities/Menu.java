package entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Menu {
    private final Scanner input = new Scanner(System.in);

    ResultadoEleicao resultadoEleicao = new ResultadoEleicao();

    public void menu() {
        int op = 0;

        do {
            try {
                System.out.print("\n##--Escolha uma opção--##\n");
                System.out.print("|-----------------------------|\n");
                System.out.print("| Opção 1 - Ada               |\n");
                System.out.print("| Opção 2 - Einstein          |\n");
                System.out.print("| Opção 3 - Jobs              |\n");
                System.out.print("| Opção 4 - Turing            |\n");
                System.out.print("| Opção 5 - Nulo              |\n");
                System.out.print("| Opção 6 - Branco            |\n");
                System.out.print("| Opção 7 - Sair              |\n");
                System.out.print("|-----------------------------|\n");
                System.out.print("Escolha uma opção: ");

                op = input.nextInt();


                switch (op) {
                    case 1:
                        resultadoEleicao.calculoVotacaoCandidatoUm();
                        break;

                    case 2:
                        resultadoEleicao.calculoVotacaoCandidatoDois();
                        break;
                    case 3:
                        resultadoEleicao.calculoVotacaoCandidatoTres();
                        break;
                    case 4:
                        resultadoEleicao.calculoVotacaoCandidatoQuatro();
                        break;

                    case 5:
                        resultadoEleicao.calculaTotalDeVotosNulos();
                        break;
                    case 6:
                        resultadoEleicao.calculaTotalDeVotosEmBranco();
                        break;
                    case 7:
                        System.out.println("Sistema encerrado!");
                        break;
                    default:
                        System.out.println("Opção inváilda");
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("Ops... você digitou caracteres. Precisamos que digite apenas números.");
            }
            input.nextLine();
        }while (op != 7);

        resultadoEleicao.mostraResultadoDaEleicao();

        input.close();

    }
}
