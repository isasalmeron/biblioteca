/* ================================================================== *
   
    Autora: Isabela Salmeron Boschi
    Arquivo: AlterarData.java

* ================================================================== */

package biblioteca.views;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import biblioteca.ConexaoBD;
import biblioteca.models.Emprestimo;

public class AlterarData extends javax.swing.JFrame {
    
    private Emprestimo empr;
    private int posicao;
    
    public AlterarData(ArrayList res, int posicaoAtual, Emprestimo empre) throws ParseException {
        Emprestimo emp = (Emprestimo) res.get(posicaoAtual);
        
        initComponents();
        setLocationRelativeTo(null);
        initialize();

        posicao = posicaoAtual;
        empr = empre;
        
        numeroLivroField.setText(emp.getNumeroLivro());
        raAlunoField.setText(emp.getRaAluno());
        
        SimpleDateFormat in= new SimpleDateFormat("yyyy-MM-dd");  
        SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");   
        String retirada = out.format(in.parse(emp.getDataEmprestimo())); 
        dtEmprestimoField.setText(retirada);
    }
    
    private void initialize(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../livros.png")));
    }

    private AlterarData() {
        throw new UnsupportedOperationException("Not supported yet.");
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
        numeroLivroField = new javax.swing.JTextField();
        raAlunoField = new javax.swing.JTextField();
        dtEmprestimoField = new javax.swing.JTextField();
        dtDevolucaoFormattedField = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eureka!");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Alteração de Devolução ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Número do livro: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("RA do aluno: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Data de empréstimo: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Data de devolução: ");

        numeroLivroField.setEditable(false);
        numeroLivroField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        numeroLivroField.setToolTipText("");
        numeroLivroField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        raAlunoField.setEditable(false);
        raAlunoField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        raAlunoField.setToolTipText("");
        raAlunoField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        dtEmprestimoField.setEditable(false);
        dtEmprestimoField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dtEmprestimoField.setToolTipText("");
        dtEmprestimoField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        dtDevolucaoFormattedField.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        try {
            dtDevolucaoFormattedField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dtDevolucaoFormattedField.setToolTipText("Informe a data em que o livro foi devolvido");
        dtDevolucaoFormattedField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ao alterar a data de devolução, o livro");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("será considerado devolvido.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(raAlunoField))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dtEmprestimoField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dtDevolucaoFormattedField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroLivroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(raAlunoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dtEmprestimoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dtDevolucaoFormattedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btAlterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btAlterar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
        ResultadoConsultaEmprestimo t;
        
        try {
            t = new ResultadoConsultaEmprestimo(empr, posicao);
            t.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(AlterarData.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        ConexaoBD conn = new ConexaoBD();
        Emprestimo emp = new Emprestimo(null, null, null, null, null);
        
        if (dtDevolucaoFormattedField.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "Erro! Informe uma nova data de devolução.");
        } else {
            emp.setNumeroLivro(numeroLivroField.getText());
            emp.setRaAluno(raAlunoField.getText());
            emp.setDataEmprestimo(dtEmprestimoField.getText());
            
            try {
                Calendar dtDev = Calendar.getInstance();
                Calendar dtEmp = Calendar.getInstance();
                DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                
                dtEmp.setTime(sdf.parse(dtEmprestimoField.getText()));
                dtDev.setTime(sdf.parse(dtDevolucaoFormattedField.getText()));

                if (dtDev.before(dtEmp)) {
                    JOptionPane.showMessageDialog(null, "Erro! Data de devolução inválida.");
                    
                    return;
                }            
            } catch (ParseException ex) { 
                Logger.getLogger(AlterarData.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            emp.setDataDevolucao(dtDevolucaoFormattedField.getText());
            
            if (conn.alteraData(emp)) {      
                if (conn.alteraStatus(emp.getNumeroLivro(), 1)) {
                    JOptionPane.showMessageDialog(null, "Data de devolução alterada com sucesso!");
                    this.dispose();
                    
                    ResultadoConsultaEmprestimo t;
                    try {
                        t = new ResultadoConsultaEmprestimo(empr, posicao);
                        t.setVisible(true);
                    } catch (ParseException ex) {
                        Logger.getLogger(AlterarData.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao alterar data de devolução!");
                }     
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao alterar data de devolução!");
            }
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AlterarData().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JFormattedTextField dtDevolucaoFormattedField;
    private javax.swing.JTextField dtEmprestimoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField numeroLivroField;
    private javax.swing.JTextField raAlunoField;
    // End of variables declaration//GEN-END:variables
}
