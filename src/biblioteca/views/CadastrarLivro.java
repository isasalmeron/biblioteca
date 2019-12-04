/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: CadastrarLivro.java

* ================================================================== */

package biblioteca.views;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import biblioteca.ConexaoBD;
import biblioteca.models.Livro;

public class CadastrarLivro extends javax.swing.JFrame {

    public CadastrarLivro() {
        ConexaoBD conn = new ConexaoBD();
        
        initComponents();
        setLocationRelativeTo(null);
        
        numLivroField.setText(Integer.toString((conn.maiorNumeroLivro()+1)));
        initialize();
    }
    
    private void initialize(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../livros.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tituloLivroField = new javax.swing.JTextField();
        autorLivroField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        numLivroField = new javax.swing.JTextField();
        estanteLivroComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        editoraLivroField = new javax.swing.JTextField();
        generLivroComboBox = new javax.swing.JComboBox<>();
        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eureka!");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Cadastro de Livros ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

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

        tituloLivroField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tituloLivroField.setToolTipText("Informe o título do livro");
        tituloLivroField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        autorLivroField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        autorLivroField.setToolTipText("Informe o(a) autor(a) do livro");
        autorLivroField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("(*)");
        jLabel6.setToolTipText("Campo obrigatório");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("(*)");
        jLabel7.setToolTipText("Campo obrigatório");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("(*)");
        jLabel8.setToolTipText("Campo obrigatório");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("(*)");
        jLabel9.setToolTipText("Campo obrigatório");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("(*)");
        jLabel10.setToolTipText("Campo obrigatório");

        numLivroField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        numLivroField.setToolTipText("Informe o número do livro");
        numLivroField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        estanteLivroComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estanteLivroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Arte", "Assistência Social", "Ciências Aplicadas", "Ciências Naturais", "Ciências Sociais", "Direito", "Economia", "Educação", "Filosofia", "Geografia", "História", "Linguagem/Linguística", "Lit./Autoajuda", "Lit./Biografia", "Lit./Carta", "Lit./Conto", "Lit./Crônica", "Lit./Diário", "Lit./Ensaio", "Lit./Fábula", "Lit./Ficção", "Lit./História em quadrinhos", "Lit./Memória", "Lit./Narrativa", "Lit./Novela", "Lit./Poema", "Lit./Romance", "Lit./Roteiro", "Lit./Teatro", "Matemática", "Medicina", "Política", "Psicologia", "Religião", "Tecnologia", "Teologia" }));
        estanteLivroComboBox.setToolTipText("Informe a estante do livro");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Para cadastrar um novo livro no acervo, preencha os campos abaixo:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Editora: ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("(*)");
        jLabel13.setToolTipText("Campo obrigatório");

        editoraLivroField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        editoraLivroField.setToolTipText("Informe a editora do livro");
        editoraLivroField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        generLivroComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generLivroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Arte", "Assistência Social", "Ciências Aplicadas", "Ciências Naturais", "Ciências Sociais", "Direito", "Economia", "Educação", "Filosofia", "Geografia", "História", "Linguagem/Linguística", "Lit./Autoajuda", "Lit./Biografia", "Lit./Carta", "Lit./Conto", "Lit./Crônica", "Lit./Diário", "Lit./Ensaio", "Lit./Fábula", "Lit./Ficção", "Lit./História em quadrinhos", "Lit./Memória", "Lit./Narrativa", "Lit./Novela", "Lit./Poema", "Lit./Romance", "Lit./Roteiro", "Lit./Teatro", "Matemática", "Medicina", "Política", "Psicologia", "Religião", "Tecnologia", "Teologia" }));
        generLivroComboBox.setToolTipText("Informe o gênero do livro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tituloLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(generLivroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(3, 3, 3)
                                .addComponent(numLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(estanteLivroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(editoraLivroField, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autorLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(autorLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(generLivroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estanteLivroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(editoraLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setToolTipText("Cadastrar livro");
        btCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btSair)
                    .addComponent(btCadastrar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        ConexaoBD conn = new ConexaoBD();
        Livro l = new Livro(null, null, null, null, null, null, 1);

        if (tituloLivroField.getText().equals("") || autorLivroField.getText().equals("") || generLivroComboBox.getSelectedItem().equals("") ||
            numLivroField.getText().equals("") || estanteLivroComboBox.getSelectedItem().equals("") || editoraLivroField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar livro! Campo(s) obrigatório(s) em branco.");
        } else {
            l.setTituloLivro(tituloLivroField.getText());
            l.setAutorLivro(autorLivroField.getText());
            l.setGeneroLivro(generLivroComboBox.getSelectedItem().toString());
            l.setNumLivro(numLivroField.getText());
            l.setEstanteLivro(estanteLivroComboBox.getSelectedItem().toString());
            l.setEditoraLivro(editoraLivroField.getText());

            if (!conn.buscaLivro(numLivroField.getText())) {
                if (conn.insereLivro(l)) {
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");

                    tituloLivroField.setText(null);
                    autorLivroField.setText(null);
                    generLivroComboBox.setSelectedItem(null);
                    numLivroField.setText(Integer.toString((conn.maiorNumeroLivro()+1)));
                    editoraLivroField.setText(null);
                    estanteLivroComboBox.setSelectedItem(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao cadastrar livro!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro! Livro já cadastrado.");
            }
        }
    }//GEN-LAST:event_btCadastrarActionPerformed
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new CadastrarLivro().setVisible(true);
        });
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorLivroField;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField editoraLivroField;
    private javax.swing.JComboBox<String> estanteLivroComboBox;
    private javax.swing.JComboBox<String> generLivroComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField numLivroField;
    private javax.swing.JTextField tituloLivroField;
    // End of variables declaration//GEN-END:variables
}
