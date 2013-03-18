package projet;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Clement
 */


public class Connexion extends javax.swing.JFrame implements KeyListener {
    
    private String login;
    private String password;

    public String str;
    /**
     * Creates new form Connexion
     */
    public Connexion() {
        initComponents();
        passwordFieldCo.addKeyListener(this);
    }
    
    public boolean connect(String login, String password){
        try {
          Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver O.K.");

          String url = "jdbc:mysql://localhost:8889/webphone";
          String user = "root";
          String passwd = "root";

          Connection conn = DriverManager.getConnection(url, user, passwd);
          System.out.println("Connexion effective !"); 
          Statement instruction = conn.createStatement();
          ResultSet resultat = instruction.executeQuery("SELECT * FROM UTILISATEURS");
          System.out.println("requette envoyée");
          
          while(resultat.next()==true)
          {
              if ((login.equals(resultat.getString("login"))==true) && (MD5(password).equals(resultat.getString("mdp"))==true)){
                  return true;
              }
          }
          resultat.close();
        }
        catch (Exception e) {
            System.out.println("ça marche pas");
            return false;
        }      
        return false;
    }
    
    public String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        } 
        return null;
    }
    
    public void open(){
        new Ouverture(login).setVisible(true);
        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConnexion = new javax.swing.JPanel();
        labelLoginCo = new javax.swing.JLabel();
        textfieldLoginCo = new javax.swing.JTextField();
        labelPasswordCo = new javax.swing.JLabel();
        passwordFieldCo = new javax.swing.JPasswordField();
        labelConnexionCo = new javax.swing.JLabel();
        buttonValidateCo = new javax.swing.JButton();
        buttonCancelCo = new javax.swing.JButton();
        labelLogoCo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanelConnexion.setBackground(new java.awt.Color(204, 204, 204));

        labelLoginCo.setText("Login :");

        labelPasswordCo.setText("Mot de passe :");

        labelConnexionCo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labelConnexionCo.setText("Connexion");

        buttonValidateCo.setText("Valider");
        buttonValidateCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonValidateCoActionPerformed(evt);
            }
        });

        buttonCancelCo.setText("Annuler");
        buttonCancelCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelCoActionPerformed(evt);
            }
        });

        labelLogoCo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/LogoWP.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanelConnexionLayout = new org.jdesktop.layout.GroupLayout(jPanelConnexion);
        jPanelConnexion.setLayout(jPanelConnexionLayout);
        jPanelConnexionLayout.setHorizontalGroup(
            jPanelConnexionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelConnexionLayout.createSequentialGroup()
                .add(32, 32, 32)
                .add(jPanelConnexionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelConnexionLayout.createSequentialGroup()
                        .add(labelLoginCo)
                        .add(89, 89, 89)
                        .add(textfieldLoginCo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                    .add(jPanelConnexionLayout.createSequentialGroup()
                        .add(labelPasswordCo)
                        .add(41, 41, 41)
                        .add(jPanelConnexionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(passwordFieldCo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanelConnexionLayout.createSequentialGroup()
                                .add(buttonValidateCo)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(buttonCancelCo)))))
                .add(20, 20, 20))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelConnexionLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(labelConnexionCo)
                .add(78, 78, 78)
                .add(labelLogoCo)
                .addContainerGap())
        );
        jPanelConnexionLayout.setVerticalGroup(
            jPanelConnexionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelConnexionLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelConnexionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(labelConnexionCo)
                    .add(labelLogoCo))
                .add(41, 41, 41)
                .add(jPanelConnexionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelLoginCo)
                    .add(textfieldLoginCo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanelConnexionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelPasswordCo)
                    .add(passwordFieldCo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(31, 31, 31)
                .add(jPanelConnexionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(buttonValidateCo)
                    .add(buttonCancelCo))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelConnexion, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelConnexion, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonValidateCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonValidateCoActionPerformed
        login = textfieldLoginCo.getText();
        password = passwordFieldCo.getText();
        
        open();
        
        /*      Connections, a regler plus tard
        if (connect(login, password)){
            open();
        }
        else{
            JOptionPane.showMessageDialog(this, "Erreur de connexion");
        }*/
    }//GEN-LAST:event_buttonValidateCoActionPerformed

    private void buttonCancelCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelCoActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buttonCancelCoActionPerformed
 
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelCo;
    private javax.swing.JButton buttonValidateCo;
    private javax.swing.JPanel jPanelConnexion;
    private javax.swing.JLabel labelConnexionCo;
    private javax.swing.JLabel labelLoginCo;
    private javax.swing.JLabel labelLogoCo;
    private javax.swing.JLabel labelPasswordCo;
    private javax.swing.JPasswordField passwordFieldCo;
    private javax.swing.JTextField textfieldLoginCo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode()==KeyEvent.VK_ENTER){
            login = textfieldLoginCo.getText();
            password = passwordFieldCo.getText();
            if (connect(login, password)){
                open();
            }
            else{
                JOptionPane.showMessageDialog(this, "Erreur de connexion");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

}


