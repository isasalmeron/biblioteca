/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: ConexaoBD.java

* ================================================================== */

package biblioteca;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import biblioteca.models.Aluno;
import biblioteca.models.Emprestimo;
import biblioteca.models.EmprestimosPorSerie;
import biblioteca.models.Livro;

public class ConexaoBD {
    
    private Connection myConnection;
    private Statement st;
    public static String nome;
    public static int codigo;

    public ConexaoBD() {
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            myConnection = DriverManager.getConnection("jdbc:postgresql:" +"//localhost/biblioteca?user=postgres&password=1234");
            st = myConnection.createStatement();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean insereLivro(Livro livro) {
        try {
            String sql  = "INSERT INTO livros VALUES (";
            sql += livro.getNumLivro();
            sql += ", '";
            sql += livro.getTituloLivro();
            sql += "', '";            
            sql += livro.getAutorLivro();
            sql += "', '";
            sql += livro.getGeneroLivro();
            sql += "', '";
            sql += livro.getEstanteLivro();
            sql += "', '";
            sql += livro.getEditoraLivro();
            sql += "', ";
            sql += livro.getStatusLivro();
            sql += ")";

            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
        return true;
    }
    
    public boolean buscaLivro(String numLivro) {
        try {
            st.execute("SELECT numero_livro FROM livros WHERE numero_livro = " + numLivro);           
            ResultSet rs = st.getResultSet();

            if (rs.next()) {
                return true; 
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return false;
    }

    public ArrayList consultaLivro(Livro livro) {
        ArrayList res = new ArrayList();
        Livro livroAux;
            
        try {
            String sql = "SELECT * FROM livros WHERE titulo_livro LIKE '%"; 
            if (!livro.getTituloLivro().equals("")) {
                sql += livro.getTituloLivro();
                sql += "%";
            }
            
            sql += "' AND autor_livro LIKE '%";
            if (!livro.getAutorLivro().equals("")) {
                sql += livro.getAutorLivro();
                sql += "%";
            }
            
            sql += "' AND genero_livro LIKE '%"; 
            if (!livro.getGeneroLivro().equals("")) {
                sql += livro.getGeneroLivro();
                sql += "%";
            }
            
            sql += "' AND estante_livro ";
            if (livro.getEstanteLivro().equals("")) {
                sql += "LIKE '%";
            } else {
                sql += "= '";
                sql += livro.getEstanteLivro();
            }
            
            sql += "' AND editora_livro LIKE '%";
            if (!livro.getEditoraLivro().equals("")) {
                sql += livro.getEditoraLivro();
                sql += "%";
            }
            
            sql += "'";
            if (!livro.getNumLivro().equals("")) {
                sql += " AND numero_livro = ";
                sql += livro.getNumLivro();
            }
            
            sql += " ORDER BY titulo_livro";

            st.execute(sql);
            ResultSet rs = st.getResultSet();

            while (rs.next()) {                
                livroAux = new Livro(rs.getString(2),rs.getString(3),rs.getString(1),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));

                res.add(livroAux);
            }
        } catch(SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;
    }
    
    public boolean excluiLivro(Livro l) {
        try {
            String sql  = "DELETE FROM livros WHERE numero_livro = '";
            sql += l.getNumLivro();
            sql += "'";
            
            st.execute(sql);            
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
        return true;
    }
    
    public String retornaNomeLivro(String numLivro) {
        String nomeLivro = null;

        try{
            st.execute("SELECT titulo_livro FROM livros WHERE numero_livro = " + numLivro);
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {
                nomeLivro = rs.getString(1);
            }
        } catch(SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nomeLivro;
    }
    
    public int maiorNumeroLivro() {
        int maiorNumero = 0;

        try{
            st.execute("SELECT MAX(numero_livro) FROM livros");
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {
                maiorNumero = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return maiorNumero;
    }
    
    public String retornaGeneroLivro(String numLivro) {
        String genero = null;
        
        try {
            st.execute("SELECT genero_livro FROM livros WHERE numero_livro = " + numLivro);
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {
                genero = rs.getString(1);
            }
        } catch(SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return genero;
    }
    
    public int consultaStatus(String numLivro) {
        int status = -1;
        
        try {
            st.execute("SELECT status FROM livros WHERE numero_livro = " + numLivro);
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {
                status = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    } 
    
    public boolean alteraStatus(String numLivro, int status) {       
        try {
            st.execute("UPDATE livros SET status = " + status + " WHERE numero_livro = " + numLivro);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
        return true;
    }
    
    public ArrayList consultaAluno(Aluno aluno) {
        Aluno alunoAux;
        ArrayList res = new ArrayList();
           
        try {
            String sql = "SELECT * FROM alunos WHERE nome_aluno LIKE '%"; 
            
            if (!aluno.getNomeAluno().equals("")) {
                sql += aluno.getNomeAluno();
                sql += "%";
            }
            
            if (!aluno.getRaAluno().equals("")) {
                sql += "' AND ra_aluno = '";
                sql += aluno.getRaAluno();
            }
            
            if (!aluno.getSerieAluno().equals("")) {
                sql += "' AND serie_aluno = '";
                sql += aluno.getSerieAluno();
            }
            
            sql += "' ORDER BY serie_aluno, nome_aluno";
            
            st.execute(sql);
            ResultSet rs = st.getResultSet();

            while (rs.next()) {                
                alunoAux = new Aluno(rs.getString(1),rs.getString(2),rs.getString(3));

                res.add(alunoAux);
            }
        } catch (SQLException ex){
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;
    }

    public boolean alteraAluno(Aluno aluno) {
        try {
            String sql  = "UPDATE alunos SET serie_aluno = '";
            sql += aluno.getSerieAluno();
            sql += "', nome_aluno = '";
            sql += aluno.getNomeAluno();
            sql += "' WHERE ra_aluno = '";
            sql += aluno.getRaAluno();
            sql += "'";
            
            st.execute(sql);            
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
        return true;
    }
    
    public boolean insereAluno(Aluno aluno) {      
        try {
            String sql  = "INSERT INTO alunos VALUES ('";
            sql += aluno.getNomeAluno();
            sql += "', '";
            sql += aluno.getRaAluno();
            sql += "', '";
            sql += aluno.getSerieAluno();
            sql += "')";
            
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        return true;
    }

    public boolean buscaAluno(String raAluno, String nomeAluno) {
        try {
            st.execute("SELECT ra_aluno FROM alunos WHERE ra_aluno = '" + raAluno + "' OR nome_aluno = '" + nomeAluno + "'");           
            ResultSet rs = st.getResultSet();

            if (rs.next()) {
                return true; 
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    public boolean excluiAluno(Aluno aluno) {
        try {
            String sql  = "DELETE FROM alunos WHERE nome_aluno = '";
            sql += aluno.getNomeAluno();
            sql += "' AND ra_aluno = '";
            sql += aluno.getRaAluno();
            sql += "' AND serie_aluno = '";
            sql += aluno.getSerieAluno();
            sql += "'";
            
            st.execute(sql);            
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
        return true;
    }
    
    public String retornaNomeAluno(String raAluno) {
        String nomeAluno = null;
        
        try{
            st.execute("SELECT nome_aluno FROM alunos WHERE ra_aluno = '" + raAluno + "'");
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {
                nomeAluno = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nomeAluno;
    }
    
    public String retornaSerieAluno(String raAluno) {
        String serieAluno = null;

        try {
            st.execute("SELECT serie_aluno FROM alunos WHERE ra_aluno = '" + raAluno + "'");
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {
                serieAluno = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return serieAluno;
    }
    
    public boolean realizaEmprestimo(Emprestimo emp) {
        try {
            String sql  = "INSERT INTO emprestimos VALUES (";
            sql += emp.getNumeroLivro();
            sql += ", '";
            sql += emp.getRaAluno();
            sql += "', '";
            sql += emp.getDataEmprestimo();
            sql += "', '";
            sql += emp.getDataPrevista();
            sql += "', null)";
            
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
        return true;
    }

    public ArrayList consultaEmprestimo(Emprestimo emp) {
        ArrayList res = new ArrayList();
        Emprestimo empAux;
        int flag = 0;

        try {
            String sql = "SELECT * FROM emprestimos WHERE ";
            
            if (!emp.getNumeroLivro().equals("")) {
                sql += "numero_livro = ";
                sql += emp.getNumeroLivro();
                flag = 1;
            }
            
            if (!emp.getRaAluno().equals("")) {
                if (flag == 1) {
                    sql += " AND ";
                }
                
                sql += "ra_aluno = '";
                sql += emp.getRaAluno();
                sql += "'";
                flag = 1;
            } else {
                flag = 0;
            }
            
            if (!emp.getDataEmprestimo().equals("  /  /    ")) {
                if (flag == 1) {
                    sql += " AND ";
                }
                
                sql += "data_retirada = '";
                sql += emp.getDataEmprestimo();
                sql += "'";
                flag = 1;
            } else {
                flag = 0;
            }
            
            if (!emp.getDataPrevista().equals("  /  /    ")) {
                if (flag == 1) {
                    sql += " AND ";
                }
                
                sql += "data_prevista = '";
                sql += emp.getDataPrevista();
                sql += "'";
            }
            
            st.execute(sql);
            ResultSet rs = st.getResultSet();

            while (rs.next()) {                
                empAux = new Emprestimo(rs.getString(3),rs.getString(5),rs.getString(2),rs.getString(1), rs.getString(4));
                res.add(empAux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;
    }

    public boolean alteraData(Emprestimo emp) {
        try {
            String sql  = "UPDATE emprestimos SET data_devolucao = '";
            sql += emp.getDataDevolucao();
            sql += "' WHERE numero_livro = ";
            sql += emp.getNumeroLivro();
            sql += " AND ra_aluno = ";
            sql += emp.getRaAluno();
            sql += " AND data_retirada = '";
            sql += emp.getDataEmprestimo();
            sql += "'";

            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        }
        
        return true;
    }
    
    public ArrayList livrosEmprestados() {
        ArrayList res = new ArrayList();
        Emprestimo empAux;

        try{
            st.execute("SELECT * FROM emprestimos WHERE data_devolucao IS NULL ORDER BY data_prevista");
            ResultSet rs = st.getResultSet();

            while (rs.next()) {                
                empAux = new Emprestimo(rs.getString(3),rs.getString(5),rs.getString(2),rs.getString(1), rs.getString(4));
                res.add(empAux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;
    }
    
    public ArrayList relatorio(String dataIni, String dataFim, String genero) {
        ArrayList res = new ArrayList();
        EmprestimosPorSerie empAux;

        try {
            String sql = "SELECT a.serie_aluno, COUNT(a.serie_aluno) AS quantidade "
                    + "FROM emprestimos AS e "
                    + "JOIN livros AS l ON e.numero_livro = l.numero_livro "
                    + "JOIN alunos AS a ON CAST(e.ra_aluno AS VARCHAR(15)) = a.ra_aluno "
                    + "WHERE e.data_retirada >= '";
            sql += dataIni;
            sql += "' AND ";
            sql += "e.data_retirada <= '";
            sql += dataFim;
            sql += "' ";
            
            if (!genero.equals("")) {
                sql += "AND l.genero_livro = '";
                sql += genero;
                sql += "' ";
            }
           
            sql += "GROUP BY a.serie_aluno ORDER BY a.serie_aluno;";
            
            st.execute(sql);
            ResultSet rs = st.getResultSet();
            
            while (rs.next()) {  
                empAux = new EmprestimosPorSerie(rs.getString(1), rs.getInt(2));
                res.add(empAux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;
    }
}
