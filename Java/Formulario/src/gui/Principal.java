/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import data.GBDConn;
import classes.Endereco;
import classes.Pessoa;
import classes.rg;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan_pessoal = new javax.swing.JPanel();
        txt_npai = new javax.swing.JTextField();
        txt_oem = new javax.swing.JTextField();
        txt_rg = new javax.swing.JTextField();
        txt_emissao = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        txt_nmae = new javax.swing.JTextField();
        lbl_emissao = new javax.swing.JLabel();
        lbl_npai = new javax.swing.JLabel();
        lbl_rg = new javax.swing.JLabel();
        lbl_oem = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_nmae = new javax.swing.JLabel();
        txt_dtnasc = new javax.swing.JTextField();
        lbl_dtnasc = new javax.swing.JLabel();
        pan_endereco = new javax.swing.JPanel();
        txt_fcel = new javax.swing.JTextField();
        txt_rua = new javax.swing.JTextField();
        txt_uf = new javax.swing.JTextField();
        txt_cidade = new javax.swing.JTextField();
        txt_bairro = new javax.swing.JTextField();
        txt_fres = new javax.swing.JTextField();
        lbl_fonecel = new javax.swing.JLabel();
        lbl_rua = new javax.swing.JLabel();
        lbl_uf = new javax.swing.JLabel();
        lbl_bairro = new javax.swing.JLabel();
        lbl_cidade = new javax.swing.JLabel();
        lbl_foneres = new javax.swing.JLabel();
        txt_cep = new javax.swing.JTextField();
        lbl_cep = new javax.swing.JLabel();
        btn_gravar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pan_pessoal.setLayout(null);
        pan_pessoal.add(txt_npai);
        txt_npai.setBounds(10, 230, 390, 28);
        pan_pessoal.add(txt_oem);
        txt_oem.setBounds(320, 110, 80, 28);
        pan_pessoal.add(txt_rg);
        txt_rg.setBounds(10, 110, 173, 28);
        pan_pessoal.add(txt_emissao);
        txt_emissao.setBounds(190, 110, 120, 28);
        pan_pessoal.add(txt_nome);
        txt_nome.setBounds(10, 50, 242, 28);
        pan_pessoal.add(txt_nmae);
        txt_nmae.setBounds(10, 170, 390, 28);

        lbl_emissao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_emissao.setText("Emissão:");
        pan_pessoal.add(lbl_emissao);
        lbl_emissao.setBounds(190, 90, 80, 20);

        lbl_npai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_npai.setText("Nome Pai:");
        pan_pessoal.add(lbl_npai);
        lbl_npai.setBounds(10, 210, 60, 20);

        lbl_rg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_rg.setText("RG:");
        pan_pessoal.add(lbl_rg);
        lbl_rg.setBounds(10, 90, 50, 20);

        lbl_oem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_oem.setText("Org. Emissor:");
        pan_pessoal.add(lbl_oem);
        lbl_oem.setBounds(320, 90, 80, 20);

        lbl_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_nome.setText("Nome:");
        pan_pessoal.add(lbl_nome);
        lbl_nome.setBounds(10, 30, 50, 20);

        lbl_nmae.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_nmae.setText("Nome Mãe:");
        pan_pessoal.add(lbl_nmae);
        lbl_nmae.setBounds(10, 150, 70, 20);
        pan_pessoal.add(txt_dtnasc);
        txt_dtnasc.setBounds(260, 50, 140, 28);

        lbl_dtnasc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_dtnasc.setText("Data de Nascimento:");
        pan_pessoal.add(lbl_dtnasc);
        lbl_dtnasc.setBounds(260, 30, 120, 20);

        pan_endereco.setLayout(null);
        pan_endereco.add(txt_fcel);
        txt_fcel.setBounds(170, 170, 150, 28);
        pan_endereco.add(txt_rua);
        txt_rua.setBounds(10, 50, 170, 28);
        pan_endereco.add(txt_uf);
        txt_uf.setBounds(280, 50, 40, 28);
        pan_endereco.add(txt_cidade);
        txt_cidade.setBounds(10, 170, 150, 28);
        pan_endereco.add(txt_bairro);
        txt_bairro.setBounds(10, 110, 150, 28);
        pan_endereco.add(txt_fres);
        txt_fres.setBounds(170, 110, 150, 28);

        lbl_fonecel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_fonecel.setText("Fone Cel:");
        pan_endereco.add(lbl_fonecel);
        lbl_fonecel.setBounds(170, 150, 60, 20);

        lbl_rua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_rua.setText("Rua:");
        pan_endereco.add(lbl_rua);
        lbl_rua.setBounds(10, 30, 40, 20);

        lbl_uf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_uf.setText("UF:");
        pan_endereco.add(lbl_uf);
        lbl_uf.setBounds(280, 30, 30, 20);

        lbl_bairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_bairro.setText("Bairro:");
        pan_endereco.add(lbl_bairro);
        lbl_bairro.setBounds(10, 90, 50, 20);

        lbl_cidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cidade.setText("Cidade:");
        pan_endereco.add(lbl_cidade);
        lbl_cidade.setBounds(10, 150, 40, 20);

        lbl_foneres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_foneres.setText("Fone Res:");
        pan_endereco.add(lbl_foneres);
        lbl_foneres.setBounds(170, 90, 60, 20);
        pan_endereco.add(txt_cep);
        txt_cep.setBounds(190, 50, 80, 28);

        lbl_cep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cep.setText("Cep:");
        pan_endereco.add(lbl_cep);
        lbl_cep.setBounds(190, 30, 40, 20);

        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });
        pan_endereco.add(btn_gravar);
        btn_gravar.setBounds(60, 230, 110, 30);

        btn_cancelar.setText("Cancel");
        pan_endereco.add(btn_cancelar);
        btn_cancelar.setBounds(180, 230, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan_pessoal, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pan_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pan_pessoal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        // TODO add your handling code here
        
        
        try{
        
            
            //PROBLEMA: FK no Banco de dados não dá update soziho.
            Pessoa ps = new Pessoa();
            Endereco en = new Endereco();
            rg rg = new rg();
            GBDConn db = new GBDConn();
            
            //Endereco
            en.setEndereco(this.txt_rua.getText());
            en.setBairro(this.txt_bairro.getText());
            en.setCidade(this.txt_cidade.getText());
            en.setUf(this.txt_uf.getText());
            en.setCep(this.txt_cep.getText());
            //RG
            rg.setNomeMae(this.txt_nmae.getText());
            rg.setNomePai(this.txt_npai.getText());
            rg.setNumero(Double.parseDouble(this.txt_rg.getText()));
            rg.setOrgEmissor(this.txt_oem.getText());
            rg.setDataEXP(this.txt_emissao.getText());
            //Pessoa
            ps.setNome(this.txt_nome.getText());
            ps.setDataNasc(this.txt_dtnasc.getText());
            ps.setTelRes(this.txt_fres.getText());
            ps.setTelCel(this.txt_fcel.getText());
            ps.setRg(rg);
            ps.setEndereco(en);
            db.inserir(ps);
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"Preencha todos os campos obrigatorios!");
        }
    
        finally{
            JOptionPane.showMessageDialog(null,"ok");
        }
          
    }//GEN-LAST:event_btn_gravarActionPerformed
    public void commitBanco(){
        GBDConn db = new GBDConn();
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JLabel lbl_bairro;
    private javax.swing.JLabel lbl_cep;
    private javax.swing.JLabel lbl_cidade;
    private javax.swing.JLabel lbl_dtnasc;
    private javax.swing.JLabel lbl_emissao;
    private javax.swing.JLabel lbl_fonecel;
    private javax.swing.JLabel lbl_foneres;
    private javax.swing.JLabel lbl_nmae;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_npai;
    private javax.swing.JLabel lbl_oem;
    private javax.swing.JLabel lbl_rg;
    private javax.swing.JLabel lbl_rua;
    private javax.swing.JLabel lbl_uf;
    private javax.swing.JPanel pan_endereco;
    private javax.swing.JPanel pan_pessoal;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cep;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_dtnasc;
    private javax.swing.JTextField txt_emissao;
    private javax.swing.JTextField txt_fcel;
    private javax.swing.JTextField txt_fres;
    private javax.swing.JTextField txt_nmae;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_npai;
    private javax.swing.JTextField txt_oem;
    private javax.swing.JTextField txt_rg;
    private javax.swing.JTextField txt_rua;
    private javax.swing.JTextField txt_uf;
    // End of variables declaration//GEN-END:variables
}
