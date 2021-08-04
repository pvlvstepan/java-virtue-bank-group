package Pages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Users extends javax.swing.JFrame {

    public Users() {
        initComponents();

        // load users with empty search string
        LoadUsers("");

        // load table row click event
        loadTableClickEvent();

        // hide users Button if user role is not Admin
        if (!GlobalStorage.user_role.equals("Admin")) {
            UsersButton.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        AccountsButton = new javax.swing.JButton();
        UsersButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SearchInput = new javax.swing.JTextField();
        AddUserBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Virtue Bank Group | Users");
        setMinimumSize(new java.awt.Dimension(740, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 41, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Users");

        jPanel3.setBackground(new java.awt.Color(91, 73, 245));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(91, 73, 245));
        jPanel2.setMinimumSize(new java.awt.Dimension(50, 50));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(91, 73, 245));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VBG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        HomeButton.setBackground(new java.awt.Color(91, 73, 245));
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pages/Icons/home.png"))); // NOI18N
        HomeButton.setBorder(null);
        HomeButton.setBorderPainted(false);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        AccountsButton.setBackground(new java.awt.Color(91, 73, 245));
        AccountsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pages/Icons/networking.png"))); // NOI18N
        AccountsButton.setBorder(null);
        AccountsButton.setBorderPainted(false);
        AccountsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountsButtonActionPerformed(evt);
            }
        });

        UsersButton.setBackground(new java.awt.Color(91, 73, 245));
        UsersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pages/Icons/group.png"))); // NOI18N
        UsersButton.setBorder(null);
        UsersButton.setBorderPainted(false);
        UsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsersButtonActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(91, 73, 245));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pages/Icons/logout.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AccountsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UsersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AccountsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        SearchInput.setBackground(new java.awt.Color(255, 255, 255));
        SearchInput.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        SearchInput.setForeground(new java.awt.Color(91, 73, 245));
        SearchInput.setPreferredSize(new java.awt.Dimension(300, 40));
        SearchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchInputKeyPressed(evt);
            }
        });

        AddUserBtn.setBackground(new java.awt.Color(91, 73, 245));
        AddUserBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        AddUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddUserBtn.setText("Add User");
        AddUserBtn.setBorder(null);
        AddUserBtn.setBorderPainted(false);
        AddUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 63, 65));
        jLabel4.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                            .addComponent(SearchInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadTableClickEvent() {
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                //if column selected
                if (!event.getValueIsAdjusting() && jTable1.getSelectedRow() != -1) {
                    // Assign EditUsers public userId variable to the seleted row userId
                    EditUser.userId = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();

                    //close this window and show EditUser window
                    dispose();
                    EditUser window = new EditUser();
                    window.setVisible(true);
                }
            }
        });
    }

    private void LoadUsers(String searchTerm) {
        String filepath = "UsersDatatable.txt";
        File f = new File(filepath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            // get first line as table headers
            String header = br.readLine().trim();

            // split line with coma separator
            String[] columnTitles = header.split(",");

            // assign table models to alter rows and columns later
            DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
            TableColumnModel cm = (TableColumnModel) jTable1.getColumnModel();

            //set column identifiers
            m.setColumnIdentifiers(columnTitles);

            // Assign file lines to array
            Object[] tableRows = br.lines().toArray();

            // clear table rows before loading new ones
            for (int i = jTable1.getRowCount() - 1; i >= 0; i--) {
                m.removeRow(i);
            }

            for (int i = 0; i < tableRows.length; i++) {
                // remove whitespace in line
                String line = tableRows[i].toString().replaceAll("\\s+", "");
                // if search input is "" load all users
                if (line != null && searchTerm == "") {
                    String[] dataRow = line.split("/");
                    m.addRow(dataRow);
                    // else if search input is not empty load users that contain search string
                } else if (line != null && line.contains(searchTerm)) {
                    String[] dataRow = line.split("/");
                    m.addRow(dataRow);
                }

            }
            // remove column with user password
            jTable1.removeColumn(jTable1.getColumnModel().getColumn(6));

            // disable table editing
            jTable1.setDefaultEditor(Object.class, null);
            cm.getColumn(0).setPreferredWidth(1);

            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong...", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        Navigation.NavigateHome(this);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void AccountsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountsButtonActionPerformed
        Navigation.NavigateAccounts(this);
    }//GEN-LAST:event_AccountsButtonActionPerformed

    private void UsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersButtonActionPerformed
        Navigation.NavigateUsers(this);
    }//GEN-LAST:event_UsersButtonActionPerformed

    private void AddUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserBtnActionPerformed
        this.dispose();
        AddUser window = new AddUser();
        window.setVisible(true);
    }//GEN-LAST:event_AddUserBtnActionPerformed

    private void SearchInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchInputKeyPressed
        // on search input change reload users with the search term string
        String searchTerm = SearchInput.getText();
        LoadUsers(searchTerm);
    }//GEN-LAST:event_SearchInputKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Warning", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            // if logout confirmed
            Navigation.Logout(this);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountsButton;
    private javax.swing.JButton AddUserBtn;
    private javax.swing.JButton HomeButton;
    private javax.swing.JTextField SearchInput;
    private javax.swing.JButton UsersButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
