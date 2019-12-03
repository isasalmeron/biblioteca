/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: Aluno.java

* ================================================================== */

package biblioteca.models;

public class Aluno {
    String nomeAluno;
    String raAluno;
    String serieAluno;

    public Aluno(String nomeA, String raA, String serieA){
        this.nomeAluno = nomeA;
        this.raAluno = raA;
        this.serieAluno = serieA;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getRaAluno(){
        return raAluno;
    }
    public void setRaAluno(String raAluno) {
        this.raAluno = raAluno;
    }
    
    public String getSerieAluno(){
        return serieAluno;
    }
    public void setSerieAluno(String serieAluno) {
        this.serieAluno = serieAluno;
    }
}