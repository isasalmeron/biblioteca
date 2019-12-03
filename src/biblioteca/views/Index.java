/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: Index.java

* ================================================================== */

package biblioteca.views;

import biblioteca.ConexaoBD;
import biblioteca.views.Relatorio;
import biblioteca.views.ResultadoEmprestados;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Index extends javax.swing.JFrame {

    public Index() {
        initComponents();
        setLocationRelativeTo(null);
        initialize();
    }
    
    private void initialize(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../livros.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btCadastrarLivro = new javax.swing.JButton();
        btConsultarLivro = new javax.swing.JButton();
        btEmprestados = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btCadastrarAluno = new javax.swing.JButton();
        btConsultarAluno = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btConsultarEmprestimo = new javax.swing.JButton();
        btEmprestar = new javax.swing.JButton();
        btRelatorio = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eureka!");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setText("Eureka!");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biblioteca/livros.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Livro ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        btCadastrarLivro.setBackground(new java.awt.Color(255, 255, 255));
        btCadastrarLivro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrarLivro.setText("Cadastrar");
        btCadastrarLivro.setToolTipText("Cadastrar novo livro");
        btCadastrarLivro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCadastrarLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarLivroActionPerformed(evt);
            }
        });

        btConsultarLivro.setBackground(new java.awt.Color(255, 255, 255));
        btConsultarLivro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btConsultarLivro.setText("Consultar");
        btConsultarLivro.setToolTipText("Consultar livros cadastrados");
        btConsultarLivro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btConsultarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarLivroActionPerformed(evt);
            }
        });

        btEmprestados.setBackground(new java.awt.Color(255, 255, 255));
        btEmprestados.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEmprestados.setText("Emprestados");
        btEmprestados.setToolTipText("Verificar livros que ainda não foram devolvidos");
        btEmprestados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btEmprestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmprestadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btConsultarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btCadastrarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btEmprestados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCadastrarLivro)
                .addGap(18, 18, 18)
                .addComponent(btConsultarLivro)
                .addGap(18, 18, 18)
                .addComponent(btEmprestados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Aluno ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        btCadastrarAluno.setBackground(new java.awt.Color(255, 255, 255));
        btCadastrarAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrarAluno.setText("Cadastrar");
        btCadastrarAluno.setToolTipText("Cadastrar novo aluno");
        btCadastrarAluno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarAlunoActionPerformed(evt);
            }
        });

        btConsultarAluno.setBackground(new java.awt.Color(255, 255, 255));
        btConsultarAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btConsultarAluno.setText("Consultar");
        btConsultarAluno.setToolTipText("Consultar alunos cadastrados");
        btConsultarAluno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btConsultarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCadastrarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btConsultarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCadastrarAluno)
                .addGap(18, 18, 18)
                .addComponent(btConsultarAluno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Empréstimo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        btConsultarEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        btConsultarEmprestimo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btConsultarEmprestimo.setText("Consultar");
        btConsultarEmprestimo.setToolTipText("Consultar empréstimos realizados");
        btConsultarEmprestimo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btConsultarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarEmprestimoActionPerformed(evt);
            }
        });

        btEmprestar.setBackground(new java.awt.Color(255, 255, 255));
        btEmprestar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEmprestar.setText("Emprestar");
        btEmprestar.setToolTipText("Realizar empréstimo");
        btEmprestar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmprestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEmprestar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btConsultarEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btEmprestar)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btConsultarEmprestimo)
                .addContainerGap())
        );

        btRelatorio.setBackground(new java.awt.Color(255, 255, 255));
        btRelatorio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btRelatorio.setText("Relatório");
        btRelatorio.setToolTipText("Gerar relatório");
        btRelatorio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(127, 127, 127))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRelatorio)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarLivroActionPerformed
        this.dispose();
        CadastrarLivro t = new CadastrarLivro();
        t.setVisible(true);
    }//GEN-LAST:event_btCadastrarLivroActionPerformed

    private void btConsultarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarLivroActionPerformed
        this.dispose();
        ConsultarLivro t = new ConsultarLivro();
        t.setVisible(true);
    }//GEN-LAST:event_btConsultarLivroActionPerformed

    private void btEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmprestarActionPerformed
        this.dispose();
        Emprestar t = new Emprestar();
        t.setVisible(true);
    }//GEN-LAST:event_btEmprestarActionPerformed

    private void btConsultarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarAlunoActionPerformed
        this.dispose();
        ConsultarAluno t = new ConsultarAluno();
        t.setVisible(true);
    }//GEN-LAST:event_btConsultarAlunoActionPerformed

    private void btCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarAlunoActionPerformed
        this.dispose();
        CadastrarAluno t = new CadastrarAluno();
        t.setVisible(true);
    }//GEN-LAST:event_btCadastrarAlunoActionPerformed

    private void btConsultarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarEmprestimoActionPerformed
        this.dispose();
        ConsultarEmprestimo t = new ConsultarEmprestimo();
        t.setVisible(true);
    }//GEN-LAST:event_btConsultarEmprestimoActionPerformed

    private void btEmprestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmprestadosActionPerformed
        ConexaoBD conn = new ConexaoBD();
        
        Vector listaEmprestimos = conn.livrosEmprestados();

        if(listaEmprestimos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos os livros já foram devolvidos!");
        }
        else{
            try {
                ResultadoEmprestados t;
                t = new ResultadoEmprestados(listaEmprestimos);
                t.setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(ResultadoEmprestados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btEmprestadosActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        this.dispose();
        Relatorio t = new Relatorio();
        t.setVisible(true);
    }//GEN-LAST:event_btRelatorioActionPerformed
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarAluno;
    private javax.swing.JButton btCadastrarLivro;
    private javax.swing.JButton btConsultarAluno;
    private javax.swing.JButton btConsultarEmprestimo;
    private javax.swing.JButton btConsultarLivro;
    private javax.swing.JButton btEmprestados;
    private javax.swing.JButton btEmprestar;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}