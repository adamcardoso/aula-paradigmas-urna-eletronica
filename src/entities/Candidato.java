package entities;

import java.util.ArrayList;

public class Candidato {
    private int votosNulo = 0, totalVotosNulos;
    private int votosEmBranco = 0;
    private int totalVotos = 0;
    private int votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0, votos5 = 0;

    private String candidato1 = "Ada", candidato2 = "Einstein", candidato3 = "Jobs", candidato4 = "Turing";

    public Candidato() {
    }

    public Candidato(int votosNulo, int totalVotosNulos, int votosEmBranco, int totalVotos, int votos1, int votos2, int votos3, int votos4, int votos5, String candidato1, String candidato2, String candidato3, String candidato4) {
        this.votosNulo = votosNulo;
        this.totalVotosNulos = totalVotosNulos;
        this.votosEmBranco = votosEmBranco;
        this.totalVotos = totalVotos;
        this.votos1 = votos1;
        this.votos2 = votos2;
        this.votos3 = votos3;
        this.votos4 = votos4;
        this.votos5 = votos5;
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

    public int getVotosEmBranco() {
        return votosEmBranco;
    }

    public void setVotosEmBranco(int votosEmBranco) {
        this.votosEmBranco = votosEmBranco;
    }

    public int getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(int totalVotos) {
        this.totalVotos = totalVotos;
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

    public int getVotos5() {
        return votos5;
    }

    public void setVotos5(int votos5) {
        this.votos5 = votos5;
    }

    public int getTotalVotosNulos() {
        return totalVotosNulos;
    }

    public void setTotalVotosNulos(int totalVotosNulos) {
        this.totalVotosNulos = totalVotosNulos;
    }

    public String getCandidato1() {
        return candidato1;
    }

    public void setCandidato1(String candidato1) {
        this.candidato1 = candidato1;
    }

    public String getCandidato2() {
        return candidato2;
    }

    public void setCandidato2(String candidato2) {
        this.candidato2 = candidato2;
    }

    public String getCandidato3() {
        return candidato3;
    }

    public void setCandidato3(String candidato3) {
        this.candidato3 = candidato3;
    }

    public String getCandidato4() {
        return candidato4;
    }

    public void setCandidato4(String candidato4) {
        this.candidato4 = candidato4;
    }
}
