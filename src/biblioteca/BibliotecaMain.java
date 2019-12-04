/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: BibliotecaMain.java

* ================================================================== */

package biblioteca;

import biblioteca.views.Index;

public class BibliotecaMain {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Index().setVisible(true);
        });
    }
}
