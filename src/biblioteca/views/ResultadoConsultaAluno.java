/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: ResultadoConsultaAluno.java

* ================================================================== */

package biblioteca.views;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import biblioteca.ConexaoBD;
import biblioteca.models.Aluno;

public class ResultadoConsultaAluno extends javax.swing.JFrame {
    
    private Aluno alu;
    private ArrayList resAux;
    private int posicaoAtual;
    
    public ResultadoConsultaAluno(Aluno a, int posicao) {
        ConexaoBD conn = new ConexaoBD();
        ArrayList listaAlunos = conn.consultaAluno(a);
        
        if (listaAlunos.size() > 0) {
            initComponents();
            setLocationRelativeTo(null);
            initialize();
            
            resAux = listaAlunos;

            if (resAux.size() == posicao) {
                posicao = posicao - 1;
            } else if (resAux.size() == 1) {
                posicao = 0;
            }

            posicaoAtual = posicao;            
            alu = a;
            
            exibicao(resAux, posicao);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
        }
    }
    
    private void initialize() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../livros.png")));
    }

    private ResultadoConsultaAluno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void exibicao(ArrayList res, int posicao) {
        Aluno a = (Aluno) res.get(posicao);
        
        posicaoAtual = posicao;

        nomeAlunoLabel.setText(a.getNomeAluno());
        raAlunoLabel.setText(a.getRaAluno());
        serieAlunoLabel.setText(a.getSerieAluno());
        contPagLabel.setText(((posicaoAtual + 1) + "/" + res.size()));

        if (a.equals(res.get(0))) {
            btAnterior.setEnabled(false);
        } else {
            btAnterior.setEnabled(true);
        }

        if (a.equals(res.get(res.size()-1))) {
            btProximo.setEnabled(false);
        } else {
            btProximo.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeAlunoLabel = new javax.swing.JLabel();
        raAlunoLabel = new javax.swing.JLabel();
        serieAlunoLabel = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        contPagLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eureka!");

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Resultado(s) ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nome: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("RA: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Série: ");

        nomeAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeAlunoLabel.setText("Nome do aluno");

        raAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        raAlunoLabel.setText("123456");

        serieAlunoLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        serieAlunoLabel.setText("Funcionário");

        btAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btAlterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setToolTipText("Alterar dados do aluno");
        btAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setToolTipText("Excluir cadastro do aluno");
        btExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeAlunoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(raAlunoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serieAlunoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nomeAlunoLabel))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(raAlunoLabel)
                            .addComponent(jLabel3)
                            .addComponent(serieAlunoLabel))
                        .addGap(25, 25, 25)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contPagLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAnterior)
                    .addComponent(btProximo)
                    .addComponent(contPagLabel))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName(" Resultado ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        exibicao(resAux, posicaoAtual - 1);
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        this.dispose();
        AlterarAluno t = new AlterarAluno(resAux, posicaoAtual, alu);
        t.setVisible(true);
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Aluno a = new Aluno(null, null, null);
        ConexaoBD conn = new ConexaoBD();
        Object[] options = { "Sim", "Cancelar" };
        int opcao = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir o cadastro do aluno?", null, JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if (opcao == 0) {
            a.setNomeAluno(nomeAlunoLabel.getText());
            a.setRaAluno(raAlunoLabel.getText());
            a.setSerieAluno(serieAlunoLabel.getText());
 
            if(conn.excluiAluno(a)){
                JOptionPane.showMessageDialog(null, "Cadastro do aluno excluído com sucesso!");
                
                this.dispose();
                ResultadoConsultaAluno t = new ResultadoConsultaAluno(alu, posicaoAtual);
                t.setVisible(true);      
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao excluir cadastro do aluno!");
            }
        }      
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        exibicao(resAux, posicaoAtual + 1);
    }//GEN-LAST:event_btProximoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ResultadoConsultaAluno().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btProximo;
    private javax.swing.JLabel contPagLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nomeAlunoLabel;
    private javax.swing.JLabel raAlunoLabel;
    private javax.swing.JLabel serieAlunoLabel;
    // End of variables declaration//GEN-END:variables
}
