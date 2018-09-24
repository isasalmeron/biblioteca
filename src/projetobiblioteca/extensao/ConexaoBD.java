/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: ConexaoBD.java

* ================================================================== */

package projetobiblioteca.extensao;

import java.sql.*;
import java.util.Vector;

public class ConexaoBD {
    private Connection myConnection;
    private Statement st;
    public static String nome;
    public static int codigo;

    public ConexaoBD(){
        try{
            Class.forName("org.postgresql.Driver").newInstance();
            myConnection = DriverManager.getConnection("jdbc:postgresql:" +"//localhost/biblioteca?user=postgres&password=1234");
            st = myConnection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean insereLivro(Livro l){
        String textoInsereLivro;
        
        try{
            textoInsereLivro  = "INSERT INTO livros VALUES (";
            textoInsereLivro += l.getNumLivro();
            textoInsereLivro += ", '";
            textoInsereLivro += l.getTituloLivro();
            textoInsereLivro += "', '";            
            textoInsereLivro += l.getAutorLivro();
            textoInsereLivro += "', '";
            textoInsereLivro += l.getGeneroLivro();
            textoInsereLivro += "', '";
            textoInsereLivro += l.getEstanteLivro();
            textoInsereLivro += "', '";
            textoInsereLivro += l.getEditoraLivro();
            textoInsereLivro += "', ";
            textoInsereLivro += l.getStatusLivro();
            textoInsereLivro += ")";

            st.execute(textoInsereLivro);
        }

        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean buscaLivro(String numL){
       ResultSet rs = null;
       
        try{
            st.execute("SELECT numero_livro FROM livros WHERE numero_livro = "+numL);           
            rs = st.getResultSet();

            if(rs.next()){
                return true; 
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
       
       return false;
    }

    public Vector consultaLivro(Livro l){
        String sql;
        ResultSet rs = null;
        Vector res = new Vector();
        Livro lAux;
            
        try{
            sql = "SELECT * FROM livros WHERE titulo_livro LIKE '%"; 
            if(!l.getTituloLivro().equals("")){
                sql += l.getTituloLivro();
                sql += "%";
            }
            
            sql += "' AND autor_livro LIKE '%";
            if(!l.getAutorLivro().equals("")){
                sql += l.getAutorLivro();
                sql += "%";
            }
            
            sql += "' AND genero_livro LIKE '%"; 
            if(!l.getGeneroLivro().equals("")){
                sql += l.getGeneroLivro();
                sql += "%";
            }
            
            sql += "' AND estante_livro ";
            if(l.getEstanteLivro().equals("")){
                sql += "LIKE '%";
            }
            else{
                sql += "= '";
                sql += l.getEstanteLivro();
            }
            
            sql += "' AND editora_livro LIKE '%";
            if(!l.getEditoraLivro().equals("")){
                sql += l.getEditoraLivro();
                sql += "%";
            }
            
            sql += "'";
            if(!l.getNumLivro().equals("")){
                sql += " AND numero_livro = ";
                sql += l.getNumLivro();
            }
            
            sql += " ORDER BY titulo_livro";

            st.execute(sql);
            rs = st.getResultSet();

            while(rs.next()){                
                lAux = new Livro(rs.getString(2),rs.getString(3),rs.getString(1),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));

                res.addElement(lAux);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
            
        return res;
    }
    
    public boolean excluiLivro(Livro l){
        String textoExcluiLivro;
        
        try{
            textoExcluiLivro  = "DELETE FROM livros WHERE numero_livro = '";
            textoExcluiLivro += l.getNumLivro();
            textoExcluiLivro += "'";
            st.execute(textoExcluiLivro);            
        }

        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public String retornaNomeLivro(String numLivro){
        String aux = null;
        ResultSet rs = null;
        
        try{
            st.execute("SELECT titulo_livro FROM livros WHERE numero_livro = "+numLivro);
            rs = st.getResultSet();
            
            while(rs.next()){
                aux = rs.getString(1);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return aux;
    }
    
    public int maiorNumeroLivro(){
        int aux = 0;
        ResultSet rs = null;
        
        try{
            st.execute("SELECT MAX(numero_livro) FROM livros");
            rs = st.getResultSet();
            
            while(rs.next()){
                aux = rs.getInt(1);
            }
        }
         catch(SQLException e){
            e.printStackTrace();
        }
        
        return aux;
    }
    
    public String retornaGeneroLivro(String numLivro){
        String aux = null;
        ResultSet rs = null;
        
        try{
            st.execute("SELECT genero_livro FROM livros WHERE numero_livro = "+numLivro);
            rs = st.getResultSet();
            
            while(rs.next()){
                aux = rs.getString(1);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return aux;
    }
    
    public int consultaStatus(String numLivro){
        int aux = -1;
        ResultSet rs = null;
        
        try{
            st.execute("SELECT status FROM livros WHERE numero_livro = "+numLivro);
            rs = st.getResultSet();
            
            while(rs.next()){
                aux = rs.getInt(1);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return aux;
    } 
    
    public boolean alteraStatus(String numL, int num){
        
        try{
            st.execute("UPDATE livros SET status = "+num+" WHERE numero_livro = "+numL);
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public Vector consultaAluno(Aluno a){
        String sql;
        ResultSet rs = null;
        Vector res = new Vector();
        Aluno aAux;
            
        try{
            sql = "SELECT * FROM alunos WHERE nome_aluno LIKE '%"; 
            if(!a.getNomeAluno().equals("")){
                sql += a.getNomeAluno();
                sql += "%";
            }
            
            if(!a.getRaAluno().equals("")){
                sql += "' AND ra_aluno = '";
                sql += a.getRaAluno();
            }
            
            if(!a.getSerieAluno().equals("")){
                sql += "' AND serie_aluno = '";
                sql += a.getSerieAluno();
            }
            
            sql += "' ORDER BY serie_aluno, nome_aluno";
            st.execute(sql);
            rs = st.getResultSet();

            while(rs.next()){                
                aAux = new Aluno(rs.getString(1),rs.getString(2),rs.getString(3));

                res.addElement(aAux);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
            
        return res;
    }

    public boolean alteraAluno(Aluno a){
        String textoAlteraAluno;
        
        try{
            textoAlteraAluno  = "UPDATE alunos SET serie_aluno = '";
            textoAlteraAluno += a.getSerieAluno();
            textoAlteraAluno += "', nome_aluno = '";
            textoAlteraAluno += a.getNomeAluno();
            textoAlteraAluno += "' WHERE ra_aluno = '";
            textoAlteraAluno += a.getRaAluno();
            textoAlteraAluno += "'";
            st.execute(textoAlteraAluno);            
        }

        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean insereAluno(Aluno a){
        String textoInsereAluno;
        
        try{
            textoInsereAluno  = "INSERT INTO alunos VALUES ('";
            textoInsereAluno += a.getNomeAluno();
            textoInsereAluno += "', '";
            textoInsereAluno += a.getRaAluno();
            textoInsereAluno += "', '";
            textoInsereAluno += a.getSerieAluno();
            textoInsereAluno += "')";
            st.execute(textoInsereAluno);
        }

        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean buscaAluno(String raA, String nomeA){
        ResultSet rs = null;

        try{
            st.execute("SELECT ra_aluno FROM alunos WHERE ra_aluno = '"+raA+"' OR nome_aluno = '"+nomeA+"'");           
            rs = st.getResultSet();

            if(rs.next()){
                return true; 
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }

        return false;
    }
    
    public boolean excluiAluno(Aluno a){
        String textoExcluiAluno;
        
        try{
            textoExcluiAluno  = "DELETE FROM alunos WHERE nome_aluno = '";
            textoExcluiAluno += a.getNomeAluno();
            textoExcluiAluno += "' AND ra_aluno = '";
            textoExcluiAluno += a.getRaAluno();
            textoExcluiAluno += "' AND serie_aluno = '";
            textoExcluiAluno += a.getSerieAluno();
            textoExcluiAluno += "'";
            st.execute(textoExcluiAluno);            
        }

        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public String retornaNomeAluno(String raAluno){
        String aux = null;
        ResultSet rs = null;
        
        try{
            st.execute("SELECT nome_aluno FROM alunos WHERE ra_aluno = '"+raAluno+"'");
            rs = st.getResultSet();
            
            while(rs.next()){
                aux = rs.getString(1);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return aux;
    }
    
    public String retornaSerieAluno(String raAluno){
        String aux = null;
        ResultSet rs = null;
        
        try{
            st.execute("SELECT serie_aluno FROM alunos WHERE ra_aluno = '"+raAluno+"'");
            rs = st.getResultSet();
            
            while(rs.next()){
                aux = rs.getString(1);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return aux;
    }
    
    public boolean realizaEmprestimo(Emprestimo emp){
        String sql;
        
        try{
            sql  = "INSERT INTO emprestimos VALUES (";
            sql += emp.getNumeroLivro();
            sql += ", '";
            sql += emp.getRaAluno();
            sql += "', '";
            sql += emp.getDataEmprestimo();
            sql += "', '";
            sql += emp.getDataPrevista();
            sql += "', null)";
            st.execute(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public Vector consultaEmprestimo(Emprestimo emp){
        int flag = 0;
        String sql;
        ResultSet rs = null;
        Vector res = new Vector();
        Emprestimo empAux;

        try{
            sql = "SELECT * FROM emprestimos WHERE "; 
            if(!emp.getNumeroLivro().equals("")){
                sql += "numero_livro = ";
                sql += emp.getNumeroLivro();
                flag = 1;
            }
            
            if(!emp.getRaAluno().equals("")){
                if(flag == 1){
                    sql += " AND ";
                }
                sql += "ra_aluno = '";
                sql += emp.getRaAluno();
                sql += "'";
                flag = 1;
            }
            else{
                flag = 0;
            }
            
            if(!emp.getDataEmprestimo().equals("  /  /    ")){
                if(flag == 1){
                    sql += " AND ";
                }
                sql += "data_retirada = '";
                sql += emp.getDataEmprestimo();
                sql += "'";
                flag = 1;
            }
            else{
                flag = 0;
            }
            
            if(!emp.getDataPrevista().equals("  /  /    ")){
                if(flag == 1){
                    sql += " AND ";
                }
                sql += "data_prevista = '";
                sql += emp.getDataPrevista();
                sql += "'";
            }
            
            st.execute(sql);
            rs = st.getResultSet();

            while(rs.next()){                
                empAux = new Emprestimo(rs.getString(3),rs.getString(5),rs.getString(2),rs.getString(1), rs.getString(4));

                res.addElement(empAux);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
            
        return res;
    }

    public boolean alteraData(Emprestimo emp){
        String sql;
        
        try{
            sql  = "UPDATE emprestimos SET data_devolucao = '";
            sql += emp.getDataDevolucao();
            sql += "' WHERE numero_livro = ";
            sql += emp.getNumeroLivro();
            sql += " AND ra_aluno = ";
            sql += emp.getRaAluno();
            sql += " AND data_retirada = '";
            sql += emp.getDataEmprestimo();
            sql += "'";

            st.execute(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public Vector livrosEmprestados(){
        ResultSet rs = null;
        Vector res = new Vector();
        Emprestimo empAux;

        try{
            st.execute("SELECT * FROM emprestimos WHERE data_devolucao IS NULL ORDER BY data_prevista");
            rs = st.getResultSet();

            while(rs.next()){                
                empAux = new Emprestimo(rs.getString(3),rs.getString(5),rs.getString(2),rs.getString(1), rs.getString(4));

                res.addElement(empAux);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
            
        return res;
    }
    
    public int[] relatorio(String dataIni, String dataFim, String genero){
        ConexaoBD conn = new ConexaoBD();
        String sql, serie, genero2;
        ResultSet rs = null;
        int vetor[] = new int[38];

        try{
            sql = "SELECT ra_aluno, numero_livro FROM emprestimos WHERE data_retirada >= '";
            sql += dataIni;
            sql += "' AND ";
            sql += "data_retirada <= '";
            sql += dataFim;
            sql += "'";
            
            st.execute(sql);
            rs = st.getResultSet();

            while(rs.next()){  
                if(genero.equals("") || (!genero.equals("") && genero.equals((conn.retornaGeneroLivro(rs.getString(2))).trim()))){
                    serie = (conn.retornaSerieAluno(rs.getString(1))).trim();          
                    switch(serie){
                        case "6ºA":
                            vetor[0] = vetor[0] + 1;
                            break;
                        case "6ºB":
                            vetor[1] = vetor[1] + 1;
                            break;
                        case "6ºC":
                            vetor[2] = vetor[2] + 1;
                            break;
                        case "6ºD":
                            vetor[3] = vetor[3] + 1;
                            break;
                        case "6ºE":
                            vetor[4] = vetor[4] + 1;
                            break;
                        case "7ºA":
                            vetor[5] = vetor[5] + 1;
                            break;
                        case "7ºB":
                            vetor[6] = vetor[6] + 1;
                            break;
                        case "7ºC":
                            vetor[7] = vetor[7] + 1;
                            break;
                        case "7ºD":
                            vetor[8] = vetor[8] + 1;
                            break;
                        case "7ºE":
                            vetor[9] = vetor[9] + 1;
                            break;
                        case "8ºA":
                            vetor[10] = vetor[10] + 1;
                            break;
                        case "8ºB":
                            vetor[11] = vetor[11] + 1;
                            break;
                        case "8ºC":
                            vetor[12] = vetor[12] + 1;
                            break;
                        case "8ºD":
                            vetor[13] = vetor[13] + 1;
                            break;
                        case "8ºE":
                            vetor[14] = vetor[14] + 1;
                            break;
                        case "9ºA":
                            vetor[15] = vetor[15] + 1;
                            break;
                        case "9ºB":
                            vetor[16] = vetor[16] + 1;
                            break;
                        case "9ºC":
                            vetor[17] = vetor[17] + 1;
                            break;
                        case "9ºD":
                            vetor[18] = vetor[18] + 1;
                            break;
                        case "9ºE":
                            vetor[19] = vetor[19] + 1;
                            break;
                        case "1ºTF-1ºS":
                            vetor[20] = vetor[20] + 1;
                            break;
                        case "1ºTI-1ºS":
                            vetor[21] = vetor[21] + 1;
                            break;
                        case "1ºTF-2ºS":
                            vetor[22] = vetor[22] + 1;
                            break;
                        case "1ºTI-2ºS":
                            vetor[23] = vetor[23] + 1;
                            break;
                        case "2ºTF-1ºS":
                            vetor[24] = vetor[24] + 1;
                            break;
                        case "2ºTI-1ºS":
                            vetor[25] = vetor[25] + 1;
                            break;
                        case "2ºTF-2ºS":
                            vetor[26] = vetor[26] + 1;
                            break;
                        case "2ºTI-2ºS":
                            vetor[27] = vetor[27] + 1;
                            break;
                        case "3ºTF-1ºS":
                            vetor[28] = vetor[28] + 1;
                            break;
                        case "3ºTI-1ºS":
                            vetor[29] = vetor[29] + 1;
                            break;
                        case "3ºTF-2ºS":
                            vetor[30] = vetor[30] + 1;
                            break;
                        case "3ºTI-2ºS":
                            vetor[31] = vetor[31] + 1;
                            break;
                        case "4ºTF-1ºS":
                            vetor[32] = vetor[32] + 1;
                            break;
                        case "4ºTI-1ºS":
                            vetor[33] = vetor[33] + 1;
                            break;
                        case "4ºTF-2ºS":
                            vetor[34] = vetor[34] + 1;
                            break;
                        case "4ºTI-2ºS":
                            vetor[35] = vetor[35] + 1;
                            break;
                        case "Funcionário":
                            vetor[36] = vetor[36] + 1;
                            break;
                        case "Professor":
                            vetor[37] = vetor[37] + 1;
                            break;
                        default:
                            break;
                    }
                } 
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
            
        return vetor;
    }
}