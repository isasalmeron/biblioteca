/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: ProjetoBibliotecaExtensao.java

* ================================================================== */

package projetobiblioteca.extensao;

public class ProjetoBibliotecaExtensao {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }
}