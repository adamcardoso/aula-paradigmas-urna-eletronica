package entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    Candidato candidato = new Candidato();
    double totalVotosEmBranco;
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
                        candidato.setVotos1(candidato.getVotos1() + 1);
                        candidato.setTotalVotos(candidato.getTotalVotos() + 1);
                        break;

                    case 2:
                        candidato.setVotos2(candidato.getVotos2() + 1);
                        candidato.setTotalVotos(candidato.getTotalVotos() + 1);
                        break;
                    case 3:
                        candidato.setVotos3(candidato.getVotos3() + 1);
                        candidato.setTotalVotos(candidato.getTotalVotos() + 1);
                        break;
                    case 4:
                        candidato.setVotos4(candidato.getVotos4() + 1);
                        candidato.setTotalVotos(candidato.getTotalVotos() + 1);
                        break;

                    case 5:
                        candidato.setVotosNulo(candidato.getVotosNulo() + 1);
                        break;
                    case 6:
                        candidato.setVotosEmBranco(candidato.getVotosEmBranco() + 1);
                        totalVotosEmBranco = (double) candidato.getVotosEmBranco() / 100;
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

        int maiorVotacao = candidato.getVotos1();

        if (candidato.getVotos2() > maiorVotacao){
            maiorVotacao = candidato.getVotos2();
        }
        if (candidato.getVotos3() > maiorVotacao){
            maiorVotacao = candidato.getVotos3();
        }
        if (candidato.getVotos4() > maiorVotacao){
            maiorVotacao = candidato.getVotos4();
        }
        System.out.println("\nCandidato vencedor das eleições: ");
        if (candidato.getVotos1() == maiorVotacao)
            System.out.println(candidato.getCandidato1());
        if (candidato.getVotos2() == maiorVotacao)
            System.out.println(candidato.getCandidato2());
        if (candidato.getVotos3() == maiorVotacao)
            System.out.println(candidato.getCandidato3());
        if (candidato.getVotos4() == maiorVotacao)
            System.out.println(candidato.getCandidato4());


        System.out.println("\nTotal de votos nulos: "+candidato.getVotosNulo());
        System.out.println("Total de votos em branco: "+candidato.getVotosEmBranco());
        System.out.println("Porcentagem de votos em branco: "+totalVotosEmBranco+" %");

        input.close();

    }
}
