/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: EmprestimosPorSerie.java

* ================================================================== */

package projetobiblioteca.extensao;

public class EmprestimosPorSerie {
    String serieAluno;
    Integer qtdEmprestimos;

    public EmprestimosPorSerie(String serieA, Integer qtdE){
        this.serieAluno = serieA;
        this.qtdEmprestimos = qtdE;
    }
    
    public String getSerieAluno(){
        return serieAluno;
    }
    public void setSerieAluno(String serieAluno) {
        this.serieAluno = serieAluno;
    }
    
    public Integer getQtdEmprestimos() {
        return qtdEmprestimos;
    }
    public void setQtdEmprestimos(Integer qtdEmprestimos) {
        this.qtdEmprestimos = qtdEmprestimos;
    }
}