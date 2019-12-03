/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: Emprestimo.java

* ================================================================== */

package biblioteca.models;

public class Emprestimo {
    String dataEmprestimo;
    String dataDevolucao;
    String raAluno;
    String numeroLivro;
    String dataPrevista;
    
    public Emprestimo(String dataE, String dataD, String raA, String numeroL, String dataP){
        this.dataEmprestimo = dataE;
        this.dataDevolucao = dataD;
        this.raAluno = raA;
        this.numeroLivro = numeroL;
        this.dataPrevista = dataP;
    }
    
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public String getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    public String getRaAluno() {
        return raAluno;
    }
    public void setRaAluno(String raAluno) {
        this.raAluno = raAluno;
    }
    
    public String getNumeroLivro() {
        return numeroLivro;
    }
    public void setNumeroLivro(String numeroLivro) {
        this.numeroLivro = numeroLivro;
    }
    
    public String getDataPrevista() {
        return dataPrevista;
    }
    public void setDataPrevista(String dataPrevista) {
        this.dataPrevista = dataPrevista;
    }
}