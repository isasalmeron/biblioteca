/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: Livro.java

* ================================================================== */

package projetobiblioteca.extensao;

public class Livro {
    String tituloLivro;
    String autorLivro;
    String numLivro;
    String generoLivro;
    String estanteLivro;
    String editoraLivro;
    int statusLivro;

    public Livro(String tituloL, String autorL, String numL, String generoL, String estanteL, String editoraL, int stat){
        this.tituloLivro = tituloL;
        this.autorLivro = autorL;
        this.numLivro = numL;
        this.generoLivro = generoL;
        this.estanteLivro = estanteL;
        this.statusLivro = stat; 
        this.editoraLivro = editoraL;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }
    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorLivro(){
        return autorLivro;
    }
    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }
    
    public String getNumLivro(){
        return numLivro;
    }
    public void setNumLivro(String numLivro) {
        this.numLivro = numLivro;
    }

    public String getGeneroLivro(){
        return generoLivro;
    }    
    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }

    public String getEstanteLivro(){
        return estanteLivro;
    }    
    public void setEstanteLivro(String estanteLivro) {
        this.estanteLivro = estanteLivro;
    }
    
    public String getEditoraLivro(){
        return editoraLivro;
    }
    public void setEditoraLivro(String editoraLivro){
        this.editoraLivro = editoraLivro;
    }
    
    public int getStatusLivro() {
        return statusLivro;
    }
    public void setStatusLivro(int statusLivro) {
        this.statusLivro = statusLivro;
    }
}