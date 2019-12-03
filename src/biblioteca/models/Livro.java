/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: Livro.java

* ================================================================== */

package biblioteca.models;

public class Livro {
    String autorLivro;
    String editoraLivro;
    String estanteLivro;
    String generoLivro;
    String numLivro;
    int statusLivro;
    String tituloLivro;
    
    public Livro(String tituloLivro, String autorLivro, String numLivro, String generoLivro, String estanteLivro, String editoraLivro, int statusLivro) {
        this.autorLivro = autorLivro;
        this.editoraLivro = editoraLivro;
        this.estanteLivro = estanteLivro;
        this.generoLivro = generoLivro;
        this.numLivro = numLivro;
        this.statusLivro = statusLivro;
        this.tituloLivro = tituloLivro;   
    }

    public String getAutorLivro() {
        return autorLivro;
    }
    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }
    
    public String getEditoraLivro() {
        return editoraLivro;
    }
    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }
    
    public String getEstanteLivro() {
        return estanteLivro;
    }    
    public void setEstanteLivro(String estanteLivro) {
        this.estanteLivro = estanteLivro;
    }
    
    public String getGeneroLivro() {
        return generoLivro;
    }    
    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }
    
    public String getNumLivro() {
        return numLivro;
    }
    public void setNumLivro(String numLivro) {
        this.numLivro = numLivro;
    }
    
    public int getStatusLivro() {
        return statusLivro;
    }
    public void setStatusLivro(int statusLivro) {
        this.statusLivro = statusLivro;
    }
    
    public String getTituloLivro() {
        return tituloLivro;
    }
    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }
}
