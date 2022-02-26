
import java.util.regex.Pattern;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author merin
 */
public class login_driver extends javax.swing.JFrame {
    Connection connect = null;
    /**
     * Creates new form login_driver
     */
    public login_driver() {
        initComponents();
        connect = dbms.dbconnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        email_id = new javax.swing.JLabel();
        mobile_no = new javax.swing.JLabel();
        license_num = new javax.swing.JLabel();
        car_model = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        register1 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        CheckBox = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        mobile_no1 = new javax.swing.JTextField();
        email_id1 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        car_model1 = new javax.swing.JTextField();
        license_num2 = new javax.swing.JLabel();
        license_num3 = new javax.swing.JLabel();
        license_num4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        name.setText("Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 67, 105, 32));

        title.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(204, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Sign Up");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 280, 50));

        email_id.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        email_id.setText("Email id");
        getContentPane().add(email_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 106, 105, 34));

        mobile_no.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        mobile_no.setText("Mobile number");
        getContentPane().add(mobile_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 140, 36));

        license_num.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        license_num.setText("AC/non-AC");
        getContentPane().add(license_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 120, 32));

        car_model.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        car_model.setText("Car Model");
        getContentPane().add(car_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 105, 32));

        username.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        username.setText("Username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 196, 105, 26));

        username1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });
        getContentPane().add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 239, 35));

        pass.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pass.setText("Password");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 105, 32));

        register1.setBackground(new java.awt.Color(204, 204, 204));
        register1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        register1.setText("Register");
        register1.setBorder(null);
        register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register1ActionPerformed(evt);
            }
        });
        getContentPane().add(register1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 150, 40));

        cancel.setBackground(new java.awt.Color(204, 204, 204));
        cancel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 150, 40));

        CheckBox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        CheckBox.setText("Show Password");
        CheckBox.setBorder(null);
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 164, -1));

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 239, 40));

        mobile_no1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(mobile_no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 239, 35));

        email_id1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(email_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 239, 34));

        name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 239, 33));

        car_model1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        car_model1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car_model1ActionPerformed(evt);
            }
        });
        getContentPane().add(car_model1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 239, 35));

        license_num2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        license_num2.setText("License No");
        getContentPane().add(license_num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 105, 32));

        license_num3.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        license_num3.setText("Car_type");
        getContentPane().add(license_num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 105, 32));

        license_num4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        license_num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                license_num4ActionPerformed(evt);
            }
        });
        getContentPane().add(license_num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 239, 35));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "non-AC" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 239, 35));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 239, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        else if("".equals(car_model1.getText())){
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
            String dblicense_num = license_num4.getText();
            String dbcar_model = car_model1.getText();
            String dbcar_type = jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
            String ac_type = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
            int db_fare=0;
            if(car_model.equals("Small")){
                if(ac_type.equals("AC")){
                    db_fare=150;
                }
                else{
                    db_fare=100;
                }
            }
            else if(car_model.equals("Medium")){
                if(ac_type.equals("AC")){
                    db_fare=250;
                }
                else{
                    db_fare=200;
                }
            }
            else{
                if(ac_type.equals("AC")){
                    db_fare=350;
                }
                else{
                    db_fare=300;
                }
            }
            String dbpassword = String.valueOf(password.getPassword());

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
                ps.setInt(7,1);//u_type=0
                ps.execute();
                query="insert into driver() values(?,?,?,?,?,?,?,?)";                
                ps=connect.prepareStatement(query);
                ps.setString(1, dbname);
                ps.setString(2, dbusername);
                ps.setString(3,dblicense_num);
                ps.setString(4, dbcar_model);
                ps.setInt(5,0);
                ps.setString(6, dbcar_type);
                ps.setString(7, ac_type);
                ps.setInt(8, db_fare);
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

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.setVisible(false);
        new login1().setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        if(CheckBox.isSelected()){
            password.setEchoChar((char)0);
        }else{
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void car_model1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car_model1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_car_model1ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void license_num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_license_num4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_license_num4ActionPerformed

    /**
     * @param args the command line arguments
     */
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel car_model;
    private javax.swing.JTextField car_model1;
    private javax.swing.JLabel email_id;
    private javax.swing.JTextField email_id1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel license_num;
    private javax.swing.JLabel license_num2;
    private javax.swing.JLabel license_num3;
    private javax.swing.JTextField license_num4;
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
