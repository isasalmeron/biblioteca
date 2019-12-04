/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: ResultadoConsultaEmprestimo.java

* ================================================================== */

package biblioteca.views;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import biblioteca.ConexaoBD;
import biblioteca.models.Emprestimo;

public class ResultadoConsultaEmprestimo extends javax.swing.JFrame {
   
    private ArrayList resAux;
    private Emprestimo empr;
    private int posicaoAtual;
    
    public ResultadoConsultaEmprestimo(Emprestimo emp, int posicao) throws ParseException {
        ConexaoBD conn = new ConexaoBD();
        ArrayList listaEmprestimos = conn.consultaEmprestimo(emp);

        if (listaEmprestimos.size() > 0) {
            initComponents();
            setLocationRelativeTo(null);
            initialize();
            
            resAux = listaEmprestimos;
            posicaoAtual = posicao;
            empr = emp;
            
            exibicao(resAux, posicao);
        } else{
            JOptionPane.showMessageDialog(null, "Empréstimo não encontrado!");
        }        
    }
    
    private void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../livros.png")));
    }
    
    private ResultadoConsultaEmprestimo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void exibicao(ArrayList res, int posicao) throws ParseException {
        ConexaoBD conn = new ConexaoBD();
        Emprestimo emp = (Emprestimo) res.get(posicao);
        SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");  
        SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
        String retirada = out.format(in.parse(emp.getDataEmprestimo())); 
        String prevista = out.format(in.parse(emp.getDataPrevista()));
        
        posicaoAtual = posicao;
 
        tituloLivroLabel.setText(conn.retornaNomeLivro(emp.getNumeroLivro()));
        numLivroLabel.setText(emp.getNumeroLivro());
        nomeAlunoLabel.setText(conn.retornaNomeAluno(emp.getRaAluno()));
        raAlunoLabel.setText(emp.getRaAluno());
        dtEmprestimoLabel.setText(retirada);
        dtPrevDevolucaoLabel.setText(prevista);
        contPagLabel.setText(((posicaoAtual + 1) + "/" + res.size()));

        if (emp.getDataDevolucao() != null) {  
            String devolucao = out.format(in.parse(emp.getDataDevolucao()));
            
            dtDevolucaoLabel.setText(devolucao);
            btAlterar.setEnabled(false);
        } else {
            dtDevolucaoLabel.setText("Não devolvido");
            btAlterar.setEnabled(true);
        }
        
        if (emp.equals(res.get(0))) {
            btAnterior.setEnabled(false);
        } else {
            btAnterior.setEnabled(true);
        }

        if (emp.equals(res.get(res.size()-1))) {
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
        jLabel6 = new javax.swing.JLabel();
        tituloLivroLabel = new javax.swing.JLabel();
        numLivroLabel = new javax.swing.JLabel();
        nomeAlunoLabel = new javax.swing.JLabel();
        raAlunoLabel = new javax.swing.JLabel();
        dtEmprestimoLabel = new javax.swing.JLabel();
        dtPrevDevolucaoLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        dtDevolucaoLabel = new javax.swing.JLabel();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        contPagLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eureka!");

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Resultado(s) ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Título: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Número do livro: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Aluno: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("RA: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Data de empréstimo: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Data prevista de devolução: ");

        tituloLivroLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tituloLivroLabel.setText("O menino do pijama listrado");

        numLivroLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        numLivroLabel.setText("120");

        nomeAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeAlunoLabel.setText("Isabela Salmeron Boschi");

        raAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        raAlunoLabel.setText("123456");

        dtEmprestimoLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dtEmprestimoLabel.setText("03/12/2019");

        dtPrevDevolucaoLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dtPrevDevolucaoLabel.setText("18/12/2019");

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Data de devolução:");

        btAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btAlterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAlterar.setText("Alterar data");
        btAlterar.setToolTipText("Alterar data de devolução");
        btAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        dtDevolucaoLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dtDevolucaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dtDevolucaoLabel.setText("Não devolvido");
        dtDevolucaoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dtDevolucaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dtDevolucaoLabel)
                .addGap(18, 18, 18)
                .addComponent(btAlterar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numLivroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeAlunoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tituloLivroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dtPrevDevolucaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dtEmprestimoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(raAlunoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
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
                    .addComponent(numLivroLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeAlunoLabel))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(raAlunoLabel))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dtEmprestimoLabel))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dtPrevDevolucaoLabel)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btAnterior.setBackground(new java.awt.Color(255, 255, 255));
        btAnterior.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAnterior.setText("Anterior");
        btAnterior.setToolTipText("Rresultado anterior");
        btAnterior.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contPagLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAnterior)
                    .addComponent(btProximo)
                    .addComponent(contPagLabel))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        try {
            exibicao(resAux, posicaoAtual + 1);
        } catch (ParseException ex) {
            Logger.getLogger(ResultadoConsultaEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        try {
            exibicao(resAux, posicaoAtual - 1);
        } catch (ParseException ex) {
            Logger.getLogger(ResultadoConsultaEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        this.dispose();
        
        try {
            AlterarData t = new AlterarData(resAux, posicaoAtual, empr);
            t.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(ResultadoConsultaEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ResultadoConsultaEmprestimo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btProximo;
    private javax.swing.JLabel contPagLabel;
    private javax.swing.JLabel dtDevolucaoLabel;
    private javax.swing.JLabel dtEmprestimoLabel;
    private javax.swing.JLabel dtPrevDevolucaoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nomeAlunoLabel;
    private javax.swing.JLabel numLivroLabel;
    private javax.swing.JLabel raAlunoLabel;
    private javax.swing.JLabel tituloLivroLabel;
    // End of variables declaration//GEN-END:variables
}
