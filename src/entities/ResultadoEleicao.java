package entities;

public class ResultadoEleicao {
    Candidato candidato = new Candidato();

    public ResultadoEleicao() {
    }

    public void calculoVotacaoCandidatoUm(){
        candidato.setVotos1(candidato.getVotos1() + 1);
        candidato.setTotalVotos(candidato.getTotalVotos() + 1);
    }

    public void calculoVotacaoCandidatoDois(){
        candidato.setVotos2(candidato.getVotos2() + 1);
        candidato.setTotalVotos(candidato.getTotalVotos() + 1);
    }

    public void calculoVotacaoCandidatoTres(){
        candidato.setVotos3(candidato.getVotos3() + 1);
        candidato.setTotalVotos(candidato.getTotalVotos() + 1);
    }

    public void calculoVotacaoCandidatoQuatro(){
        candidato.setVotos4(candidato.getVotos4() + 1);
        candidato.setTotalVotos(candidato.getTotalVotos() + 1);
    }

    public void calculaTotalDeVotosNulos(){
        candidato.setVotosNulo(candidato.getVotosNulo() + 1);
    }

    public void calculaTotalDeVotosEmBranco(){
        candidato.setVotosEmBranco(candidato.getVotosEmBranco() + 1);
    }

    //adicionar os votos nulos ao calculo
    public int calculaTotalDeVotos(){
        int votosTotais = candidato.getVotos1() + candidato.getVotos2()+candidato.getVotos3() + candidato.getVotos4()
                + candidato.getVotosNulo() + candidato.getVotosEmBranco();

        return votosTotais;
    }

    // arrumar essa parte para puxar do total de votos, quantos foram nulos
    public double calculaPorcentagemDeVotosEmBranco(){
        //Porcentagem = (valor obtido x 100) / Valor total
        int votosEmBrancoDoEleitor = candidato.getVotosEmBranco();


        return ((double) (votosEmBrancoDoEleitor * 100) / calculaTotalDeVotos());
    }

    public void mostraResultadoDaEleicao(){
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

        if (candidato.getVotos1() == candidato.getVotos2() && candidato.getVotos1() == candidato.getVotos3()
                && candidato.getVotos1() == candidato.getVotos4()){
            mensagemCandidatosEmpatados();
        }else {
            System.out.println("\nCandidato vencedor das eleições: ");
            if (candidato.getVotos1() == maiorVotacao) {
                System.out.println("\nCandidato vencedor: " +candidato.getCandidato1()+", com "+candidato.getVotos1()+" votos!");

                if (candidato.getVotos2() >= candidato.getVotos3() && candidato.getVotos2() >= candidato.getVotos4()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato2()+", com "+candidato.getVotos2()+" votos!");

                    comparacaoEntreVotosTresEQuatro();
                }else if(candidato.getVotos3() >= candidato.getVotos2() && candidato.getVotos3() >= candidato.getVotos4()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato3()+", com "+candidato.getVotos3()+" votos!");

                    comparacaoEntreVotosDoisEQuatro();
                }else if(candidato.getVotos4() >= candidato.getVotos2() && candidato.getVotos4() >= candidato.getVotos3()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato4()+", com "+candidato.getVotos4()+" votos!");

                    comparacaoEntreVotosDoisETres();
                }
            }else if (candidato.getVotos2() == maiorVotacao) {
                System.out.println("Candidato vencedor: " +candidato.getCandidato2()+", com "+candidato.getVotos2()+" votos!");

                if (candidato.getVotos1() >= candidato.getVotos3() && candidato.getVotos1() >= candidato.getVotos4()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato1()+", com "+candidato.getVotos1()+" votos!");

                    comparacaoEntreVotosTresEQuatro();
                }else if(candidato.getVotos3() >= candidato.getVotos1() && candidato.getVotos3() >= candidato.getVotos4()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato3()+", com "+candidato.getVotos3()+" votos!");

                    comparacaoEntreVotosUmEQuatro();
                }else if(candidato.getVotos4() >= candidato.getVotos1() && candidato.getVotos4() >= candidato.getVotos3()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato4()+", com "+candidato.getVotos4()+" votos!");

                    comparacaoEntreVotosUmETres();
                }
            }else if (candidato.getVotos3() == maiorVotacao) {
                System.out.println("Candidato vencedor: " +candidato.getCandidato3()+", com "+candidato.getVotos3()+" votos!");

                if (candidato.getVotos1() >= candidato.getVotos2() && candidato.getVotos1() >= candidato.getVotos4()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato1()+", com "+candidato.getVotos1()+" votos!");

                    comparacaoEntreVotosDoisEQuatro();
                }else if(candidato.getVotos2() >= candidato.getVotos1() && candidato.getVotos2() >= candidato.getVotos4()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato2()+", com "+candidato.getVotos2()+" votos!");

                    comparacaoEntreVotosUmEQuatro();
                }else if(candidato.getVotos4() >= candidato.getVotos1() && candidato.getVotos4() >= candidato.getVotos2()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato4()+", com "+candidato.getVotos4()+" votos!");

                    comparacaoEntreVotosUmEDois();
                }
            }else if (candidato.getVotos4() == maiorVotacao) {
                System.out.println("Candidato vencedor: " +candidato.getCandidato4()+", com "+candidato.getVotos4()+" votos!");

                if (candidato.getVotos1() >= candidato.getVotos2() && candidato.getVotos1() >= candidato.getVotos3()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato1()+", com "+candidato.getVotos1()+" votos!");

                    comparacaoEntreVotosDoisETres();
                }else if(candidato.getVotos2() >= candidato.getVotos1() && candidato.getVotos2() >= candidato.getVotos3()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato2()+", com "+candidato.getVotos2()+" votos!");

                    comparacaoEntreVotosUmETres();
                }else if(candidato.getVotos3() >= candidato.getVotos1() && candidato.getVotos3() >= candidato.getVotos2()){
                    System.out.println("Segundo colocado: " +candidato.getCandidato3()+", com "+candidato.getVotos3()+" votos!");

                    comparacaoEntreVotosUmEDois();
                }
            }
        }

        System.out.println("\nTotal de votos nulos: "+candidato.getVotosNulo());
        System.out.println("Total de votos em branco: "+candidato.getVotosEmBranco());
        System.out.printf("Porcentagem de votos em branco: %.2f%%",calculaPorcentagemDeVotosEmBranco());
    }

    private void mensagemCandidatosEmpatados() {
        System.out.println("\n\nCANDIDATOS EMPATADOS!");
        System.out.println("Candidato: " +candidato.getCandidato1()+", com "+candidato.getVotos1()+" votos!");
        System.out.println("Candidato: " +candidato.getCandidato2()+", com "+candidato.getVotos2()+" votos!");
        System.out.println("Candidato: " +candidato.getCandidato3()+", com "+candidato.getVotos3()+" votos!");
        System.out.println("Candidato: " +candidato.getCandidato4()+", com "+candidato.getVotos4()+" votos!");
    }

    private void comparacaoEntreVotosUmEDois() {
        if (candidato.getVotos1() >= candidato.getVotos2()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato1()+", com "+candidato.getVotos1()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato2()+", com "+candidato.getVotos2()+" votos!");
        } else if (candidato.getVotos1() <= candidato.getVotos2()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato2()+", com "+candidato.getVotos2()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato1()+", com "+candidato.getVotos1()+" votos!");
        }
    }

    private void comparacaoEntreVotosUmETres() {
        if (candidato.getVotos1() >= candidato.getVotos3()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato1()+", com "+candidato.getVotos1()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato3()+", com "+candidato.getVotos3()+" votos!");
        } else if (candidato.getVotos1() <= candidato.getVotos3()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato3()+", com "+candidato.getVotos3()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato1()+", com "+candidato.getVotos1()+" votos!");
        }
    }

    private void comparacaoEntreVotosUmEQuatro() {
        if (candidato.getVotos1() >= candidato.getVotos4()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato1()+", com "+candidato.getVotos1()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato4()+", com "+candidato.getVotos4()+" votos!");
        } else if (candidato.getVotos1() <= candidato.getVotos4()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato4()+", com "+candidato.getVotos4()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato1()+", com "+candidato.getVotos1()+" votos!");
        }
    }

    private void comparacaoEntreVotosDoisETres() {
        if (candidato.getVotos2() >= candidato.getVotos3()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato2()+", com "+candidato.getVotos2()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato3()+", com "+candidato.getVotos3()+" votos!");
        } else if (candidato.getVotos2() <= candidato.getVotos3()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato3()+", com "+candidato.getVotos3()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato2()+", com "+candidato.getVotos2()+" votos!");
        }
    }

    private void comparacaoEntreVotosDoisEQuatro() {
        if (candidato.getVotos2() >= candidato.getVotos4()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato2()+", com "+candidato.getVotos2()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato4()+", com "+candidato.getVotos4()+" votos!");
        } else if (candidato.getVotos2() <= candidato.getVotos4()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato4()+", com "+candidato.getVotos4()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato2()+", com "+candidato.getVotos2()+" votos!");
        }
    }

    private void comparacaoEntreVotosTresEQuatro() {
        if (candidato.getVotos3() >= candidato.getVotos4()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato3()+", com "+candidato.getVotos3()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato4()+", com "+candidato.getVotos4()+" votos!");
        } else if (candidato.getVotos3() <= candidato.getVotos4()){
            System.out.println("Terceiro colocado: " +candidato.getCandidato4()+", com "+candidato.getVotos4()+" votos!");
            System.out.println("Quarto colocado: " +candidato.getCandidato3()+", com "+candidato.getVotos3()+" votos!");
        }
    }
}
