/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: ResultadoConsultaLivro.java

* ================================================================== */

package biblioteca.views;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import biblioteca.ConexaoBD;
import biblioteca.models.Livro;

public class ResultadoConsultaLivro extends javax.swing.JFrame {
    
    private ArrayList resAux;
    private Livro livr;
    private int posicaoAtual;
    
    public ResultadoConsultaLivro(ArrayList listaLivros, int posicao, Livro l) {
        initComponents();
        setLocationRelativeTo(null);
        initialize();

        resAux = listaLivros;
        posicaoAtual = posicao;
        livr = l;

        exibicao(resAux, posicaoAtual);
    }
    
    private void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../livros.png")));
    }
    
    private ResultadoConsultaLivro() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void exibicao(ArrayList res, int posicao) {
        Livro liv = (Livro) res.get(posicao);
        
        posicaoAtual = posicao;
        tituloLivroLabel.setText(liv.getTituloLivro());
        autorLivroLabel.setText(liv.getAutorLivro());
        generoLivroLabel.setText(liv.getGeneroLivro());
        numLivroLabel.setText(liv.getNumLivro());
        estanteLivroLabel.setText(liv.getEstanteLivro()); 
        editoraLivroLabel.setText(liv.getEditoraLivro());
        contPagLabel.setText(((posicao + 1) + "/" + res.size()));
    
        if (liv.getStatusLivro() == 1) {
            statusLivroLabel.setText("Na estante");
        } else {
           statusLivroLabel.setText("Emprestado"); 
        }
        
        if (liv.equals(res.get(0))) {
            btAnterior.setEnabled(false);
        } else {
            btAnterior.setEnabled(true);
        }

        if (liv.equals(res.get(res.size()-1))) {
            btProximo.setEnabled(false);
        } else {
            btProximo.setEnabled(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tituloLivroLabel = new javax.swing.JLabel();
        autorLivroLabel = new javax.swing.JLabel();
        generoLivroLabel = new javax.swing.JLabel();
        numLivroLabel = new javax.swing.JLabel();
        estanteLivroLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        statusLivroLabel = new javax.swing.JLabel();
        editoraLivroLabel = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        contPagLabel = new javax.swing.JLabel();
        btAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eureka!");

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Resultado(s) ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Título: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Autor(a): ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Gênero: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Número: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Estante: ");

        tituloLivroLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tituloLivroLabel.setText("O menino do pijama listrado");

        autorLivroLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        autorLivroLabel.setText("John Boyne");

        generoLivroLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        generoLivroLabel.setText("Lit./FIcção");

        numLivroLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        numLivroLabel.setText("60");

        estanteLivroLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        estanteLivroLabel.setText("Lit./Ficção");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Editora: ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Status: ");

        statusLivroLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        statusLivroLabel.setText("Na estante");

        editoraLivroLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        editoraLivroLabel.setText("David Fickling Books");

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setToolTipText("Excluir livro");
        btExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editoraLivroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tituloLivroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autorLivroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generoLivroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numLivroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estanteLivroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLivroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tituloLivroLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(autorLivroLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(generoLivroLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numLivroLabel)
                    .addComponent(jLabel5)
                    .addComponent(estanteLivroLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(editoraLivroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(statusLivroLabel)
                    .addComponent(btExcluir))
                .addGap(25, 25, 25))
        );

        btProximo.setBackground(new java.awt.Color(255, 255, 255));
        btProximo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btProximo.setText("Próximo");
        btProximo.setToolTipText("Próximo resultado");
        btProximo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });

        contPagLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        contPagLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contPagLabel.setText("1/100");

        btAnterior.setBackground(new java.awt.Color(255, 255, 255));
        btAnterior.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAnterior.setText("Anterior");
        btAnterior.setToolTipText("Resultado anterior");
        btAnterior.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contPagLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAnterior)
                    .addComponent(contPagLabel)
                    .addComponent(btProximo))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        exibicao(resAux, posicaoAtual - 1);
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        exibicao(resAux, posicaoAtual + 1);
    }//GEN-LAST:event_btProximoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        ConexaoBD conn = new ConexaoBD();
        Livro l = new Livro(null, null, null, null, null, null, 0);
        Object[] options = { "Sim", "Cancelar" };
        int opcao = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir o livro do acervo?", null, JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if(opcao == 0){
            l.setNumLivro(numLivroLabel.getText());

            if (conn.excluiLivro(l)) {
                JOptionPane.showMessageDialog(null, "Livro excluído do acervo com sucesso!");
                
                resAux = conn.consultaLivro(livr);
                
                if (resAux.size() > 0) {
                    this.dispose();
                    ResultadoConsultaLivro t = new ResultadoConsultaLivro(resAux, posicaoAtual-1, livr);
                    t.setVisible(true);
                } else {
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Livro não encontrado!");
                }     
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao excluir cadastro do aluno!");
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ResultadoConsultaLivro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autorLivroLabel;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btProximo;
    private javax.swing.JLabel contPagLabel;
    private javax.swing.JLabel editoraLivroLabel;
    private javax.swing.JLabel estanteLivroLabel;
    private javax.swing.JLabel generoLivroLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel numLivroLabel;
    private javax.swing.JLabel statusLivroLabel;
    private javax.swing.JLabel tituloLivroLabel;
    // End of variables declaration//GEN-END:variables
}
