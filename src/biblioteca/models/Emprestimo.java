/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: Emprestimo.java

* ================================================================== */

package biblioteca.models;

public class Emprestimo {
    String dataDevolucao;
    String dataEmprestimo;
    String dataPrevista;
    String numeroLivro;
    String raAluno;
    
    public Emprestimo(String dataEmprestimo, String dataDevolucao, String raAluno, String numeroLivro, String dataPrevista) {
        this.dataDevolucao = dataDevolucao;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevista = dataPrevista;
        this.numeroLivro = numeroLivro;
        this.raAluno = raAluno;    
    }
    
    public String getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public String getDataPrevista() {
        return dataPrevista;
    }
    public void setDataPrevista(String dataPrevista) {
        this.dataPrevista = dataPrevista;
    }
    
    public String getNumeroLivro() {
        return numeroLivro;
    }
    public void setNumeroLivro(String numeroLivro) {
        this.numeroLivro = numeroLivro;
    }
    
    public String getRaAluno() {
        return raAluno;
    }
    public void setRaAluno(String raAluno) {
        this.raAluno = raAluno;
    }
}
