package Pages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewAccount extends javax.swing.JFrame {

    // declare public accoundId variable
    public static String accountId = "";

    // declare account balance variables
    private Double currentBalance = 0.0;
    private Double savingsBalance = 0.0;

    // declare private accountNumber variable
    private String accountNumber = "";

    // declare decimal format to format doubles
    DecimalFormat decimalFormat = new DecimalFormat("0.##");

    public ViewAccount() {
        initComponents();

        // load account with accoundId
        LoadAccount();

        // load account's transactions
        LoadTransactions();

        // hide users Button if user role is not Admin
        if (!GlobalStorage.user_role.equals("Admin")) {
            UsersButton.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AccLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        AccountsButton = new javax.swing.JButton();
        UsersButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PassportLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Current = new javax.swing.JTable();
        CurrentBalance = new javax.swing.JLabel();
        CWithdraw = new javax.swing.JButton();
        CDeposit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Savings = new javax.swing.JTable();
        SavingsBalance = new javax.swing.JLabel();
        SWithdraw = new javax.swing.JButton();
        SDeposit = new javax.swing.JButton();
        EditAccBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Virtue Bank Group | Account");
        setMinimumSize(new java.awt.Dimension(740, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText(null);

        AccLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        AccLabel.setForeground(new java.awt.Color(45, 41, 51));
        AccLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AccLabel.setText("Account ");

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

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 63, 65));
        jLabel4.setText("First Name:");

        FirstNameLabel.setBackground(new java.awt.Color(102, 102, 102));
        FirstNameLabel.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        FirstNameLabel.setForeground(new java.awt.Color(153, 153, 153));
        FirstNameLabel.setText("Stepan");

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(60, 63, 65));
        jLabel6.setText("Last Name:");

        LastNameLabel.setBackground(new java.awt.Color(102, 102, 102));
        LastNameLabel.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        LastNameLabel.setForeground(new java.awt.Color(153, 153, 153));
        LastNameLabel.setText("Pavlov");

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 63, 65));
        jLabel8.setText("Passport Number:");

        PassportLabel.setBackground(new java.awt.Color(102, 102, 102));
        PassportLabel.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        PassportLabel.setForeground(new java.awt.Color(153, 153, 153));
        PassportLabel.setText("763645657");

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 63, 65));
        jLabel10.setText("Email:");

        EmailLabel.setBackground(new java.awt.Color(102, 102, 102));
        EmailLabel.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(153, 153, 153));
        EmailLabel.setText("pvlv.stepan@gmail.com");

        jLabel12.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(60, 63, 65));
        jLabel12.setText("Phone:");

        PhoneLabel.setBackground(new java.awt.Color(102, 102, 102));
        PhoneLabel.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(153, 153, 153));
        PhoneLabel.setText("01161379874");

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel14.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(45, 41, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Current");

        Current.setModel(new javax.swing.table.DefaultTableModel(
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
        Current.setRowHeight(40);
        jScrollPane1.setViewportView(Current);

        CurrentBalance.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        CurrentBalance.setForeground(new java.awt.Color(91, 73, 245));
        CurrentBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CurrentBalance.setText("RM 0.00");

        CWithdraw.setBackground(new java.awt.Color(91, 73, 245));
        CWithdraw.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        CWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        CWithdraw.setText("Withdraw");
        CWithdraw.setBorder(null);
        CWithdraw.setBorderPainted(false);
        CWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CWithdrawActionPerformed(evt);
            }
        });

        CDeposit.setBackground(new java.awt.Color(91, 73, 245));
        CDeposit.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        CDeposit.setForeground(new java.awt.Color(255, 255, 255));
        CDeposit.setText("Deposit");
        CDeposit.setBorder(null);
        CDeposit.setBorderPainted(false);
        CDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDepositActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CurrentBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(CDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CDeposit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(CWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CurrentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel15.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(45, 41, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Savings");

        Savings.setModel(new javax.swing.table.DefaultTableModel(
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
        Savings.setRowHeight(40);
        jScrollPane2.setViewportView(Savings);

        SavingsBalance.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        SavingsBalance.setForeground(new java.awt.Color(91, 73, 245));
        SavingsBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SavingsBalance.setText("RM 0.00");

        SWithdraw.setBackground(new java.awt.Color(91, 73, 245));
        SWithdraw.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        SWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        SWithdraw.setText("Withdraw");
        SWithdraw.setBorder(null);
        SWithdraw.setBorderPainted(false);
        SWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SWithdrawActionPerformed(evt);
            }
        });

        SDeposit.setBackground(new java.awt.Color(91, 73, 245));
        SDeposit.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        SDeposit.setForeground(new java.awt.Color(255, 255, 255));
        SDeposit.setText("Deposit");
        SDeposit.setBorder(null);
        SDeposit.setBorderPainted(false);
        SDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDepositActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SavingsBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(SDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(SWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SavingsBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        EditAccBtn.setBackground(new java.awt.Color(91, 73, 245));
        EditAccBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        EditAccBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditAccBtn.setText("Edit Account");
        EditAccBtn.setBorder(null);
        EditAccBtn.setBorderPainted(false);
        EditAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditAccBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(LastNameLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(FirstNameLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(PassportLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(PhoneLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(EmailLabel)))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(AccLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(EditAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditAccBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FirstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(PassportLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(PhoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(EmailLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void LoadAccount() {
        File f = new File("Accounts.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));

            // read file line to array
            Object[] accounts = br.lines().toArray();

            for (int i = 1; i < accounts.length; i++) {
                // remove whitespace from the lines
                String line = accounts[i].toString().replaceAll("\\s+", "");
                if (line != null) {
                    // split lines by the / char
                    String[] dataRow = line.split("/");
                    // if accoundId equals to the line's part accountId then assign labels text to the line data
                    if (dataRow[0].equals(accountId)) {
                        AccLabel.setText("Account number " + dataRow[1].toString());
                        accountNumber = dataRow[1].toString();
                        FirstNameLabel.setText(dataRow[2]);
                        LastNameLabel.setText(dataRow[3]);
                        PhoneLabel.setText(dataRow[4]);
                        EmailLabel.setText(dataRow[5]);
                        PassportLabel.setText(dataRow[6]);
                    }
                }

            }

            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong...", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LoadTransactions() {
        File f = new File("Transactions.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            // take first line of the file as table headers
            String header = br.readLine().trim();
            // split the line with coma separator
            String[] columnTitles = header.split(",");
            // create a copy of the columnTitles array to remove first 3 columns
            columnTitles = Arrays.copyOfRange(columnTitles, 3, columnTitles.length);

            //get both table models for future use
            DefaultTableModel sm = (DefaultTableModel) Savings.getModel();
            DefaultTableModel cm = (DefaultTableModel) Current.getModel();

            // set tables column identifiers
            sm.setColumnIdentifiers(columnTitles);
            cm.setColumnIdentifiers(columnTitles);

            // read file lines to array
            Object[] transactions = br.lines().toArray();

            // clean both tables before loading new rows
            for (int i = Savings.getRowCount() - 1; i >= 0; i--) {
                sm.removeRow(i);
            }
            // clear savings balance
            savingsBalance = 0.0;

            for (int i = Current.getRowCount() - 1; i >= 0; i--) {
                cm.removeRow(i);
            }
            // clear current balance
            currentBalance = 0.0;

            // loop through each transaction in the file
            for (int i = 0; i < transactions.length; i++) {
                String line = transactions[i].toString();
                if (line != null && line != "") {
                    // split the line with / char
                    String[] dataRow = line.split(" / ");
                    // if transaction's accountId equals to current accountId
                    if (dataRow[1].equals(accountNumber)) {
                        // check if transaction account is savings
                        if (dataRow[2].equals("Savings")) {
                            // if transaction type is deposit
                            if (dataRow[3].equals("Deposit")) {
                                // add transaction amount to the balance
                                savingsBalance += parseDouble(dataRow[4]);
                            } else {
                                // substract transaction amount from the balance
                                savingsBalance -= parseDouble(dataRow[4]);
                            }

                            // remove first 3 columns of the row and add row to the savings table
                            dataRow = Arrays.copyOfRange(dataRow, 3, dataRow.length);
                            sm.addRow(dataRow);
                            // else if transaction account is current
                        } else {
                            // if transaction type is deposit
                            if (dataRow[3].equals("Deposit")) {
                                // add transaction amount to the balance
                                currentBalance += parseDouble(dataRow[4]);
                            } else {
                                // substract transaction amount from the balance
                                currentBalance -= parseDouble(dataRow[4]);
                            }

                            // remove first 3 columns of the row and add row to the current table
                            dataRow = Arrays.copyOfRange(dataRow, 3, dataRow.length);
                            cm.addRow(dataRow);
                        }
                    }
                }

            }

            // toggle withdraw buttons based on the balance
            if (savingsBalance <= 100) {
                SWithdraw.setEnabled(false);
            } else {
                SWithdraw.setEnabled(true);
            }
            if (currentBalance <= 500) {
                CWithdraw.setEnabled(false);
            } else {
                CWithdraw.setEnabled(true);
            }

            // format the balance to a proper format
            savingsBalance = parseDouble(decimalFormat.format(savingsBalance));
            currentBalance = parseDouble(decimalFormat.format(currentBalance));

            // set the balance text label
            CurrentBalance.setText("RM " + decimalFormat.format(currentBalance).toString());
            SavingsBalance.setText("RM " + decimalFormat.format(savingsBalance).toString());

            // remove table editor
            Savings.setDefaultEditor(Object.class, null);
            Current.setDefaultEditor(Object.class, null);

            br.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong...", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Integer transactionId = 0;

    private void findUnusedTransactionId() {
        // find the largest TransactionId in the file and assign a new TransactionId

        String filepath = "Transactions.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            br.readLine();
            String line = null;

            for (line = br.readLine(); line != null; line = br.readLine()) {
                String[] parts = line.replaceAll("\\s+", "").split("/");
                int tempTcId = Integer.parseInt(parts[0]);

                if (tempTcId > transactionId) {
                    transactionId = tempTcId;
                }
            }

            transactionId = transactionId + 1;

            br.close();
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong...", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void performTransaction(String account, String type, Double amount) {
        findUnusedTransactionId();

        String filepath = "Transactions.txt";

        // declare a timestamp for the transaction
        String timestamp = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss").format(new Date()).toString();

        try {
            FileWriter fw = new FileWriter(filepath, true);

            // insert new transaction into the file
            fw.write("" + transactionId + " / " + accountNumber + " / " + account + " / " + type + " / " + decimalFormat.format(amount).toString() + " / " + timestamp + "");
            fw.write(System.getProperty("line.separator"));
            fw.close();

            JOptionPane.showMessageDialog(null, "Transaction completed successfuly", "Success", JOptionPane.INFORMATION_MESSAGE);

            // reload transactions table
            LoadTransactions();

        } catch (IOException e) {
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Warning", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            // if logout confirmed
            Navigation.Logout(this);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void CWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CWithdrawActionPerformed
        // show withdraw dialog
        String s = JOptionPane.showInputDialog("Enter amount to withdraw from savings");
        double d;
        if (s != null) {
            try {
                // parse input string to double
                d = Double.parseDouble(s);

                // check if the balance fill be affected, otherwise perform withdrawal
                if ((currentBalance - d) < 500) {
                    JOptionPane.showMessageDialog(null, "A minimum balance of RM 500.00 on current will be exceeded. Try entering amount less than RM" + decimalFormat.format((currentBalance - 500)).toString(), "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    performTransaction("Current", "Withdraw", d);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You've entered wrong number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_CWithdrawActionPerformed

    private void EditAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditAccBtnActionPerformed
        // assign EditAccount window variables and open this window

        EditAccount.accountId = accountId;
        EditAccount.accountNumber = accountNumber;
        this.dispose();
        EditAccount window = new EditAccount();
        window.setVisible(true);
    }//GEN-LAST:event_EditAccBtnActionPerformed

    private void CDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDepositActionPerformed
        String s = JOptionPane.showInputDialog("Enter amount to deposit on current");
        double d;
        if (s != null) {
            try {
                // parse input string to double
                d = Double.parseDouble(s);

                // perform deposit
                performTransaction("Current", "Deposit", d);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You've entered wrong number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_CDepositActionPerformed

    private void SWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SWithdrawActionPerformed
        // show withdraw dialog
        String s = JOptionPane.showInputDialog("Enter amount to withdraw from savings");
        double d;
        if (s != null) {
            try {
                // parse input string to double
                d = Double.parseDouble(s);

                // check if the balance fill be affected, otherwise perform withdrawal
                if ((savingsBalance - d) < 100) {
                    JOptionPane.showMessageDialog(null, "A minimum balance of RM 100.00 on savings will be exceeded. Try entering amount less than RM " + decimalFormat.format((savingsBalance - 100)).toString(), "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    performTransaction("Savings", "Withdraw", d);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You've entered wrong number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_SWithdrawActionPerformed

    private void SDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDepositActionPerformed
        String s = JOptionPane.showInputDialog("Enter amount to deposit on savings");
        double d;
        if (s != null) {
            try {
                // parse input string to double
                d = Double.parseDouble(s);
                // perform deposit
                performTransaction("Savings", "Deposit", d);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You've entered wrong number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_SDepositActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccLabel;
    private javax.swing.JButton AccountsButton;
    private javax.swing.JButton CDeposit;
    private javax.swing.JButton CWithdraw;
    private javax.swing.JTable Current;
    private javax.swing.JLabel CurrentBalance;
    private javax.swing.JButton EditAccBtn;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JButton HomeButton;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JLabel PassportLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JButton SDeposit;
    private javax.swing.JButton SWithdraw;
    private javax.swing.JTable Savings;
    private javax.swing.JLabel SavingsBalance;
    private javax.swing.JButton UsersButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
