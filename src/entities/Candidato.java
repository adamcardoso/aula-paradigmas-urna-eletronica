package entities;


public class Candidato {
    private int votosNulo = 0, votosEmBranco = 0, totalVotos = 0, votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0;

    private String candidato1 = "Ada", candidato2 = "Einstein", candidato3 = "Jobs", candidato4 = "Turing";

    public Candidato() {
    }

    public Candidato(int votosNulo, int votosEmBranco, int totalVotos, int votos1, int votos2, int votos3, int votos4, String candidato1, String candidato2, String candidato3, String candidato4) {
        this.votosNulo = votosNulo;
        this.votosEmBranco = votosEmBranco;
        this.totalVotos = totalVotos;
        this.votos1 = votos1;
        this.votos2 = votos2;
        this.votos3 = votos3;
        this.votos4 = votos4;
        this.candidato1 = candidato1;
        this.candidato2 = candidato2;
        this.candidato3 = candidato3;
        this.candidato4 = candidato4;
    }


    public int getVotosNulo() {
        return votosNulo;
    }

    public void setVotosNulo(int votosNulo) {
        this.votosNulo = votosNulo;
    }

    public int getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(int totalVotos) {
        this.totalVotos = totalVotos;
    }

    public int getVotosEmBranco() {
        return votosEmBranco;
    }

    public void setVotosEmBranco(int votosEmBranco) {
        this.votosEmBranco = votosEmBranco;
    }

    public int getVotos1() {
        return votos1;
    }

    public void setVotos1(int votos1) {
        this.votos1 = votos1;
    }

    public int getVotos2() {
        return votos2;
    }

    public void setVotos2(int votos2) {
        this.votos2 = votos2;
    }

    public int getVotos3() {
        return votos3;
    }

    public void setVotos3(int votos3) {
        this.votos3 = votos3;
    }

    public int getVotos4() {
        return votos4;
    }

    public void setVotos4(int votos4) {
        this.votos4 = votos4;
    }

    public String getCandidato1() {
        return candidato1;
    }

    public String getCandidato2() {
        return candidato2;
    }


    public String getCandidato3() {
        return candidato3;
    }

    public String getCandidato4() {
        return candidato4;
    }
}
