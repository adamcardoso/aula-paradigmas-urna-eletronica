package entities;

public class ResultadoEleicao {
    Candidato candidato = new Candidato();

    private double totalVotosEmBranco = 0.0;

    public ResultadoEleicao() {
    }

    public ResultadoEleicao(double totalVotosEmBranco) {
        this.totalVotosEmBranco = totalVotosEmBranco;
    }

    public void calculoVotacaoCandidatoUm(){
        candidato.setVotos1(candidato.getVotos1() + 1);
        candidato.setTotalVotos(candidato.getTotalVotos() + 1);

        mostraResultadoDaEleicao();
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

    public double calculaPorcentagemDeVotosEmBranco(){
        candidato.setVotosEmBranco(candidato.getVotosEmBranco() + 1);
        return totalVotosEmBranco = (double) candidato.getVotosEmBranco() / 100;
    }

    //falta fazer a comparaçao de quem é maior que quem e colocar em ordem crescente
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


        System.out.println("\nCandidato vencedor das eleições: ");
        if (candidato.getVotos1() == maiorVotacao) {
            System.out.println(candidato.getCandidato1());
        }
        if (candidato.getVotos2() == maiorVotacao) {
            System.out.println(candidato.getCandidato2());
        }
        if (candidato.getVotos3() == maiorVotacao) {
            System.out.println(candidato.getCandidato3());
        }
        if (candidato.getVotos4() == maiorVotacao) {
            System.out.println(candidato.getCandidato4());
        }


        System.out.println("\nTotal de votos nulos: "+candidato.getVotosNulo());
        System.out.println("Total de votos em branco: "+candidato.getVotosEmBranco());
        System.out.println("Porcentagem de votos em branco: "+totalVotosEmBranco+" %");
    }

    public double getTotalVotosEmBranco() {
        return totalVotosEmBranco;
    }

    public void setTotalVotosEmBranco(double totalVotosEmBranco) {
        this.totalVotosEmBranco = totalVotosEmBranco;
    }
}
