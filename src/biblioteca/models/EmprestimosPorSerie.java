/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: EmprestimosPorSerie.java

* ================================================================== */

package biblioteca.models;

public class EmprestimosPorSerie {
    int qtdEmprestimos;
    String serieAluno;
    
    public EmprestimosPorSerie(String serieAluno, int qtdEmprestimos) {
        this.qtdEmprestimos = qtdEmprestimos;
        this.serieAluno = serieAluno;
    }
    
    public Integer getQtdEmprestimos() {
        return qtdEmprestimos;
    }
    public void setQtdEmprestimos(int qtdEmprestimos) {
        this.qtdEmprestimos = qtdEmprestimos;
    }
    
    public String getSerieAluno() {
        return serieAluno;
    }
    public void setSerieAluno(String serieAluno) {
        this.serieAluno = serieAluno;
    }  
}
