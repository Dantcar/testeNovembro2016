/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package visao;

import static controle.UsuarioCtrl.logarUsuario;
import static controle.ValidaCampos.validaLogin;
import static controle.ValidaCampos.validaSenhaForte;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author deciodecarvalho
 */
public class TelaLogin extends javax.swing.JFrame {
    public static final double PETFAST_VERSAO = 0.2;
    private Point pos1, pos2;
    private int posX, posY;

    /**
     * Creates new form TelaUsuario
     */
    public TelaLogin() {

        initComponents();
        
        String pathProjeto = System.getProperty("user.dir")+"//";
        String iconPetfast = pathProjeto + "src//Icones//petfastIcone.png";
        setIconImage(Toolkit.getDefaultToolkit().getImage( iconPetfast ));
        

        // Center in the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                              (screenSize.height - frameSize.width) / 2));
        //setLocationRelativeTo(null);
        lblOlhoSenha.setLocation(posX, posY);
        pack();
        lblMostraSenha.setVisible(false);
        //setLocation(250,100); //(ponto inicial apartir lateral,altura)

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUsuario = new javax.swing.JPanel();
        btnUsuarioVoltar = new javax.swing.JButton();
        btnNovoUsuarioBd = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        tctLogin = new javax.swing.JTextField();
        lblUsuarioSenha = new javax.swing.JLabel();
        lblLogoPet = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        tctSenha = new javax.swing.JPasswordField();
        lblMostraSenha = new javax.swing.JLabel();
        lblOlhoSenha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        panelUsuario.setBackground(new java.awt.Color(255, 234, 167));
        panelUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelUsuarioKeyPressed(evt);
            }
        });

        btnUsuarioVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnUsuarioVoltar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnUsuarioVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/saidaDireitaRed.png"))); // NOI18N
        btnUsuarioVoltar.setText("Sair");
        btnUsuarioVoltar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnUsuarioVoltar.setPreferredSize(new java.awt.Dimension(100, 50));
        btnUsuarioVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioVoltarActionPerformed(evt);
            }
        });

        btnNovoUsuarioBd.setBackground(new java.awt.Color(204, 204, 204));
        btnNovoUsuarioBd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNovoUsuarioBd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bdVerdeAlvo.png"))); // NOI18N
        btnNovoUsuarioBd.setText("Login Usuário");
        btnNovoUsuarioBd.setIconTextGap(2);
        btnNovoUsuarioBd.setInheritsPopupMenu(true);
        btnNovoUsuarioBd.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnNovoUsuarioBd.setPreferredSize(new java.awt.Dimension(100, 50));
        btnNovoUsuarioBd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnNovoUsuarioBdStateChanged(evt);
            }
        });
        btnNovoUsuarioBd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnNovoUsuarioBdFocusGained(evt);
            }
        });
        btnNovoUsuarioBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioBdActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(102, 102, 102));
        lblLogin.setText("Login: ");

        tctLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tctLogin.setForeground(new java.awt.Color(51, 51, 51));
        tctLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tctLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tctLoginMouseReleased(evt);
            }
        });
        tctLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tctLoginKeyPressed(evt);
            }
        });

        lblUsuarioSenha.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblUsuarioSenha.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuarioSenha.setText("Senha: ");

        lblLogoPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/IconesPet/petCatDog.jpg"))); // NOI18N
        lblLogoPet.setText(" ");

        tctSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tctSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tctSenhaKeyPressed(evt);
            }
        });

        lblMostraSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblOlhoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/eye-icon.png"))); // NOI18N
        lblOlhoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblOlhoSenhaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblOlhoSenhaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnNovoUsuarioBd, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUsuarioVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelUsuarioLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelUsuarioLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lblOlhoSenha))
                                .addGroup(panelUsuarioLayout.createSequentialGroup()
                                    .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblLogin)
                                        .addComponent(lblUsuarioSenha))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMostraSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tctSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tctLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(93, 93, 93)))
                    .addGroup(panelUsuarioLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(lblLogoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tctLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tctSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarioSenha))
                .addGap(5, 5, 5)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOlhoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lblMostraSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuarioVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoUsuarioBd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnUsuarioVoltarActionPerformed

    private void btnNovoUsuarioBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioBdActionPerformed
        //meu codigo aqui
        String login;
        String password;
        String msg = "";
        login = tctLogin.getText().trim();
        password = String.valueOf(tctSenha.getPassword()).trim(); //de password para String.trim();

        boolean logarUsuarioPet = false;

        if (validaSenhaForte(password) && validaLogin(login)) {

            logarUsuarioPet = logarUsuario(login, password);
            if (logarUsuarioPet) {
                this.dispose();
                msg = "Usuário: " + login + " logado com sucesso";
                String tituloPrincipal;
                tituloPrincipal = "Gestão Petfast";

                EntradaSistemaPetFast telaPrincipal = new EntradaSistemaPetFast();
                telaPrincipal.setTitle(tituloPrincipal);
                telaPrincipal.setVisible(true);
                // JOptionPane.showMessageDialog(null, msg );
            } else {
                msg = "Usuário: " + login + " falha login";
                JOptionPane.showMessageDialog(null, msg);
            }

        } else {
            msg = msg + "A Senha não atende o requisito: \n"
                    + "pelo menos uma letra minúscula\n"
                    + "pelo menos uma letra maiúscula\n"
                    + "pelo menos um número\n"
                    + "pelo menos um caractere especial\n"
                    + "minímo de 8 caracteres e máximo de 15\n"
                    + "ou usuário invalido";
            JOptionPane.showMessageDialog(null, msg);
        }


    }//GEN-LAST:event_btnNovoUsuarioBdActionPerformed

    private void tctLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tctLoginMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tctLoginMouseReleased

    private void lblOlhoSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlhoSenhaMousePressed
        // mostra senha ao mouse ser pressionado
        // metodo para mostrar a senha
        String vsenha = "";
        vsenha = String.valueOf(tctSenha.getPassword()); //de password para String
        tctSenha.setVisible(false);
        lblMostraSenha.setText(vsenha);
        posX = tctSenha.getWidth();
        posY = tctSenha.getHeight();
        //pos1 = tctSenha.getLocation();
        //lblOlhoSenha.setLocation(posX, posY);
        //lblMostraSenha.setLocation(pos1);
        //lblMostraSenha.setSize(posX, posY);
        lblMostraSenha.setVisible(true);

        //String senha =String.valueOf(tctSenha.getPassword()); //de password para String
        //System.out.println(senha);

        pack();
    }//GEN-LAST:event_lblOlhoSenhaMousePressed

    private void lblOlhoSenhaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlhoSenhaMouseReleased
        // mostra senha ao click mouse ser solto
        tctSenha.setVisible(true);
        //lblMostraSenha.setSize(posX, posY);
        //lblMostraSenha.setLocation(pos1);
        lblMostraSenha.setVisible(false);
        pack();
    }//GEN-LAST:event_lblOlhoSenhaMouseReleased

    private void btnNovoUsuarioBdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnNovoUsuarioBdFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoUsuarioBdFocusGained

    private void btnNovoUsuarioBdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnNovoUsuarioBdStateChanged
        //Colocar focus no botao login
        btnNovoUsuarioBd.grabFocus();
    }//GEN-LAST:event_btnNovoUsuarioBdStateChanged

    private void tctSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tctSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){  
            //O botão desejado foi pressionado então só preciso  
            //inserir o código aqui, no caso, execute o código do botão que realiza o login  
       btnNovoUsuarioBd.doClick();
        
        } 
        
    }//GEN-LAST:event_tctSenhaKeyPressed

    private void panelUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelUsuarioKeyPressed
              
       
    }//GEN-LAST:event_panelUsuarioKeyPressed

    private void tctLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tctLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){  
            //O botão desejado foi pressionado então só preciso  
            //inserir o código aqui, no caso, execute o código do botão que realiza o login  
       btnNovoUsuarioBd.doClick();
        }
    }//GEN-LAST:event_tctLoginKeyPressed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoUsuarioBd;
    private javax.swing.JButton btnUsuarioVoltar;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogoPet;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblMostraSenha;
    private javax.swing.JLabel lblOlhoSenha;
    private javax.swing.JLabel lblUsuarioSenha;
    private javax.swing.JPanel panelUsuario;
    private static javax.swing.JTextField tctLogin;
    private javax.swing.JPasswordField tctSenha;
    // End of variables declaration//GEN-END:variables
}
