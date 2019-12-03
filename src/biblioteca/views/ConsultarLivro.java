/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: ConsultarLivro.java

* ================================================================== */

package biblioteca.views;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import biblioteca.ConexaoBD;
import biblioteca.models.Livro;

public class ConsultarLivro extends javax.swing.JFrame {
    
    public ConsultarLivro() {
        initComponents();
        setLocationRelativeTo(null);
        initialize();
    }
    
    private void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../livros.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tituloLivroField = new javax.swing.JTextField();
        autorLivroField = new javax.swing.JTextField();
        numLivroField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        estanteLivroComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        editoraLivroField = new javax.swing.JTextField();
        generoLivroComboBox = new javax.swing.JComboBox<>();
        btVoltar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eureka!");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Consulta de Livros ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Título: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Autor(a): ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Número: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Gênero: ");

        tituloLivroField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tituloLivroField.setToolTipText("Informe o título do livro");
        tituloLivroField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        autorLivroField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        autorLivroField.setToolTipText("Informe o(a) autor(a) do livro");
        autorLivroField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        numLivroField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        numLivroField.setToolTipText("Informe o número do livro");
        numLivroField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Estante: ");

        estanteLivroComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estanteLivroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Arte", "Assistência Social", "Ciências Aplicadas", "Ciências Naturais", "Ciências Sociais", "Direito", "Economia", "Educação", "Filosofia", "Geografia", "História", "Linguagem/Linguística", "Lit./Autoajuda", "Lit./Biografia", "Lit./Carta", "Lit./Conto", "Lit./Crônica", "Lit./Diário", "Lit./Ensaio", "Lit./Fábula", "Lit./Ficção", "Lit./História em quadrinhos", "Lit./Memória", "Lit./Narrativa", "Lit./Novela", "Lit./Poema", "Lit./Romance", "Lit./Roteiro", "Lit./Teatro", "Matemática", "Medicina", "Política", "Psicologia", "Religião", "Tecnologia", "Teologia" }));
        estanteLivroComboBox.setToolTipText("Informe a estante do livro");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Para consultar os dados do(s) livro(s) e verificar se ele está");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("emprestado ou disponível em acervo, preencha ao menos um");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("dos campos abaixo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Editora: ");

        editoraLivroField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        editoraLivroField.setToolTipText("Informe a editora do livro");
        editoraLivroField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        generoLivroComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generoLivroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Arte", "Assistência Social", "Ciências Aplicadas", "Ciências Naturais", "Ciências Sociais", "Direito", "Economia", "Educação", "Filosofia", "Geografia", "História", "Linguagem/Linguística", "Lit./Autoajuda", "Lit./Biografia", "Lit./Carta", "Lit./Conto", "Lit./Crônica", "Lit./Diário", "Lit./Ensaio", "Lit./Fábula", "Lit./Ficção", "Lit./História em quadrinhos", "Lit./Memória", "Lit./Narrativa", "Lit./Novela", "Lit./Poema", "Lit./Romance", "Lit./Roteiro", "Lit./Teatro", "Matemática", "Medicina", "Política", "Psicologia", "Religião", "Tecnologia", "Teologia" }));
        generoLivroComboBox.setToolTipText("Informe o gênero do livro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autorLivroField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tituloLivroField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editoraLivroField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estanteLivroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generoLivroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numLivroField)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tituloLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(autorLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(generoLivroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(numLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(estanteLivroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(editoraLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        btVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setToolTipText("Voltar ao Menu");
        btVoltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(255, 255, 255));
        btSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btSair.setText("Sair");
        btSair.setToolTipText("Sair do sistema");
        btSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btConsultar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btConsultar.setText("Consultar");
        btConsultar.setToolTipText("Consultar livro");
        btConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btSair)
                    .addComponent(btConsultar))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
        Index t = new Index();
        t.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        ConexaoBD conn = new ConexaoBD();
        Livro l = new Livro(null, null, null, null, null, null, -1);

        l.setTituloLivro(tituloLivroField.getText());
        l.setAutorLivro(autorLivroField.getText());
        l.setGeneroLivro(generoLivroComboBox.getSelectedItem().toString());
        l.setNumLivro(numLivroField.getText());
        l.setEstanteLivro(estanteLivroComboBox.getSelectedItem().toString());
        l.setEditoraLivro(editoraLivroField.getText());
        
        ArrayList listaLivros = conn.consultaLivro(l);
        
        if (listaLivros.size() > 0) {
            ResultadoConsultaLivro t = new ResultadoConsultaLivro(listaLivros, 0, l);
            t.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado!");
        }

        tituloLivroField.setText("");
        autorLivroField.setText("");
        generoLivroComboBox.setSelectedItem("");
        numLivroField.setText("");
        estanteLivroComboBox.setSelectedItem("");
        editoraLivroField.setText("");
    }//GEN-LAST:event_btConsultarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ConsultarLivro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorLivroField;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField editoraLivroField;
    private javax.swing.JComboBox<String> estanteLivroComboBox;
    private javax.swing.JComboBox<String> generoLivroComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField numLivroField;
    private javax.swing.JTextField tituloLivroField;
    // End of variables declaration//GEN-END:variables
}
