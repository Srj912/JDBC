
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class signup extends javax.swing.JFrame {
    Connection connect = null;
    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
        connect  = dbms.dbconnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email_id = new javax.swing.JLabel();
        mobile_no = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        email_id1 = new javax.swing.JTextField();
        username1 = new javax.swing.JTextField();
        mobile_no1 = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        cancel = new javax.swing.JButton();
        register1 = new javax.swing.JButton();
        CheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(204, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Sign Up");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 280, 50));

        name.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        name.setText("Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 67, 105, 32));

        email_id.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        email_id.setText("Email id");
        getContentPane().add(email_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 106, 105, 34));

        mobile_no.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        mobile_no.setText("Mobile number");
        getContentPane().add(mobile_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 140, 36));

        username.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        username.setText("Username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 196, 105, 26));

        pass.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pass.setText("Password");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 235, 105, 32));

        name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 239, 33));

        email_id1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(email_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 239, 34));

        username1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });
        getContentPane().add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 239, 35));
        username1.getAccessibleContext().setAccessibleDescription("");

        mobile_no1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(mobile_no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 239, 35));

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 239, 35));

        cancel.setBackground(new java.awt.Color(204, 204, 204));
        cancel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 321, 150, 40));

        register1.setBackground(new java.awt.Color(204, 204, 204));
        register1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        register1.setText("Register");
        register1.setBorder(null);
        register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register1ActionPerformed(evt);
            }
        });
        getContentPane().add(register1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 321, 150, 40));

        CheckBox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        CheckBox.setText("Show Password");
        CheckBox.setBorder(null);
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 164, -1));

        setSize(new java.awt.Dimension(655, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        if(CheckBox.isSelected()){
            password.setEchoChar((char)0);
        }else{
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.setVisible(false);
        new login1().setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register1ActionPerformed
        long num;
        int coun=1,nf=1;
        try {
            num = Long.parseLong(mobile_no1.getText());
            //System.out.println("num is set");
        } catch (NumberFormatException e) {
            coun = 0;
            System.out.println(e.getMessage());
        }
        
        if("".equals(name1.getText()) || !(Pattern.matches("[a-zA-Z]+",name1.getText()))){
            nf = 0;
            JOptionPane.showMessageDialog(null, "Enter Valid Name");
        }
        else if(coun==0 || "".equals(mobile_no1.getText()) || (mobile_no1.getText()).length()!=10){
            JOptionPane.showMessageDialog(null, "Enter Valid Phone Number");
        }
        else if("".equals(email_id1.getText()) || !verify_email(email_id1.getText())){
            JOptionPane.showMessageDialog(null, "Enter a Valid Email-ID");
        }
        else if("".equals(username1.getText())){
            JOptionPane.showMessageDialog(null, "Enter Valid User ID");
        }
        else if(password.getPassword().length==0){
            JOptionPane.showMessageDialog(null, "Enter Valid Password");
        }
        else{  
            String dbname = name1.getText();   
            String dbphone = mobile_no1.getText();
            String dbemail = email_id1.getText();
            String dbusername = username1.getText();
            String dbpassword = String.valueOf(password.getPassword());
            String zero =String.valueOf(0);
                             
            try{
                String query="insert into users values(?,?,?,?,?,?,?)";
                PreparedStatement ps=null;
                ps=connect.prepareStatement(query);
                ps.setString(1, dbname);
                ps.setString(2, dbusername);
                ps.setString(3, dbpassword);
                ps.setString(4, dbemail);
                ps.setString(5, dbphone);
                ps.setInt(6, 500);
                ps.setInt(7,0);
                //ps.setInt(7, 0);
                //ps.setString(8, zero);
                //ps.setString(9, zero);
                ps.execute();
                this.setVisible(false);
                new login1().setVisible(true);
                JOptionPane.showMessageDialog(null, "Signup Successful");
                }
            catch (java.sql.SQLException e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Username Already Taken");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null ,e);
            } 
        }        
    }//GEN-LAST:event_register1ActionPerformed
    
    public boolean verify_email(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false;
        return pat.matcher(email).matches();
    }
    
    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
     
    }
*/
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel email_id;
    private javax.swing.JTextField email_id1;
    private javax.swing.JLabel mobile_no;
    private javax.swing.JTextField mobile_no1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name1;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel username;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables
}
