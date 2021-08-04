package Pages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        LoginTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        SignInButton = new javax.swing.JButton();
        LoginUsername = new javax.swing.JTextField();
        LoginPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        ShowPwdBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Virtue Bank Group | Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        setForeground(java.awt.Color.gray);
        setMinimumSize(new java.awt.Dimension(400, 540));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 450));

        LoginTitle.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        LoginTitle.setForeground(new java.awt.Color(45, 41, 51));
        LoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTitle.setText("Virtue Bank Group");

        jPanel1.setBackground(new java.awt.Color(91, 73, 245));
        jPanel1.setForeground(new java.awt.Color(91, 73, 245));
        jPanel1.setMinimumSize(new java.awt.Dimension(103, 103));
        jPanel1.setPreferredSize(new java.awt.Dimension(103, 103));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VBG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(91, 73, 245));

        SignInButton.setBackground(new java.awt.Color(255, 255, 255));
        SignInButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        SignInButton.setForeground(new java.awt.Color(91, 73, 245));
        SignInButton.setText("Sign In");
        SignInButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SignInButton.setBorderPainted(false);
        SignInButton.setMaximumSize(new java.awt.Dimension(300, 40));
        SignInButton.setMinimumSize(new java.awt.Dimension(300, 40));
        SignInButton.setPreferredSize(new java.awt.Dimension(300, 40));
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });

        LoginUsername.setBackground(new java.awt.Color(255, 255, 255));
        LoginUsername.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        LoginUsername.setForeground(new java.awt.Color(91, 73, 245));
        LoginUsername.setPreferredSize(new java.awt.Dimension(300, 40));

        LoginPassword.setBackground(new java.awt.Color(255, 255, 255));
        LoginPassword.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        LoginPassword.setForeground(new java.awt.Color(91, 73, 245));
        LoginPassword.setMinimumSize(new java.awt.Dimension(300, 40));
        LoginPassword.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        ResetButton.setBackground(new java.awt.Color(91, 73, 245));
        ResetButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton.setText("Reset");
        ResetButton.setBorder(null);
        ResetButton.setBorderPainted(false);
        ResetButton.setMaximumSize(new java.awt.Dimension(300, 40));
        ResetButton.setMinimumSize(new java.awt.Dimension(300, 40));
        ResetButton.setPreferredSize(new java.awt.Dimension(300, 40));
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        ShowPwdBtn.setBackground(new java.awt.Color(255, 255, 255));
        ShowPwdBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        ShowPwdBtn.setForeground(new java.awt.Color(91, 73, 245));
        ShowPwdBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pages/Icons/eye.png"))); // NOI18N
        ShowPwdBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ShowPwdBtn.setBorderPainted(false);
        ShowPwdBtn.setMaximumSize(new java.awt.Dimension(300, 40));
        ShowPwdBtn.setMinimumSize(new java.awt.Dimension(300, 40));
        ShowPwdBtn.setPreferredSize(new java.awt.Dimension(300, 40));
        ShowPwdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPwdBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(LoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ShowPwdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(SignInButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoginUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowPwdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LoginTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(386, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(LoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean showPwd = false;

    public void verifyLogin(String username, String password) {
        File f = new File("UsersDatatable.txt");

        // declare "found" boolean
        Boolean found = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));

            // read file lines to array
            Object[] users = br.lines().toArray();

            for (int i = 1; i < users.length; i++) {
                // remove whitespace from the lines
                String line = users[i].toString().replaceAll("\\s+", "");
                if (line != null) {
                    // split the line with / char
                    String[] dataRow = line.split("/");
                    // if line's username and password equal to the inputs then assign global variables and found user boolean
                    if (dataRow[1].equals(username) && dataRow[6].equals(password)) {
                        found = true;
                        GlobalStorage.userId = dataRow[0];
                        GlobalStorage.first_name = dataRow[2];
                        GlobalStorage.last_name = dataRow[3];
                        GlobalStorage.user_role = dataRow[5];
                    }
                }

            }

            br.close();

            // if user is found go to dashboard, otherwise show error
            if (found) {
                Navigation.NavigateHome(this);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username or password!", "Warning", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong...", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        // assign input values to new variables
        String password = LoginPassword.getText();
        String username = LoginUsername.getText().toUpperCase();

        // declare REGEX patterns to test input strings
        Pattern pattern = Pattern.compile("^[vV][bB][gG]\\d\\d\\d\\d\\d\\d$");
        Matcher matcher = pattern.matcher(username);

        // check if strings are not empty and if the strings match REGEX
        if (password.equals("") || username.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter username and password", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (!matcher.find()) {
            JOptionPane.showMessageDialog(null, "Username should follow the VBGXXXXXX format!", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            // if all checks passed verify login
            verifyLogin(username, password);
        }
    }//GEN-LAST:event_SignInButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // reset input values when reset button is cliked
        LoginPassword.setText(null);
        LoginUsername.setText(null);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void ShowPwdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPwdBtnActionPerformed
        // toggle show password boolean
        showPwd = !showPwd;

        // assign password input char according to boolean
        if (showPwd) {
            LoginPassword.setEchoChar((char) 0);
        } else {
            LoginPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPwdBtnActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField LoginPassword;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JTextField LoginUsername;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton ShowPwdBtn;
    private javax.swing.JButton SignInButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
