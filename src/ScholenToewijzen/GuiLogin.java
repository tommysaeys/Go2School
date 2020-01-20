package ScholenToewijzen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GuiLogin extends javax.swing.JFrame {

    public GuiLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private BusinessLayer main;

    public GuiLogin(BusinessLayer b) {
        initComponents();
        this.main = b;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jPanel_Login = new javax.swing.JPanel();
        jTextField_gebruikersnaam = new javax.swing.JTextField();
        jPasswordField_wachtwoord = new javax.swing.JPasswordField();
        jCheckBox_showPassword = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel_Message = new javax.swing.JPanel();
        jButton_ok = new javax.swing.JButton();
        jLabel_Message = new javax.swing.JLabel();
        jPanel_bericht = new javax.swing.JPanel();
        jTextField_naamSchool = new javax.swing.JTextField();
        jCheckBox_showPassword1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField_wwSchool = new javax.swing.JPasswordField();
        jButton_loginSchool = new javax.swing.JButton();
        jButton_loginOuder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Login.setBackground(new java.awt.Color(96, 186, 242));
        jPanel_Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 140, 217), 4));
        jPanel_Login.setToolTipText("");

        jTextField_gebruikersnaam.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_gebruikersnaam.setText("Mailadres");
        jTextField_gebruikersnaam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_gebruikersnaamMouseClicked(evt);
            }
        });
        jTextField_gebruikersnaam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_gebruikersnaamActionPerformed(evt);
            }
        });

        jPasswordField_wachtwoord.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField_wachtwoord.setText("wachtwoord");
        jPasswordField_wachtwoord.setToolTipText("");
        jPasswordField_wachtwoord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField_wachtwoordMouseClicked(evt);
            }
        });
        jPasswordField_wachtwoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_wachtwoordActionPerformed(evt);
            }
        });

        jCheckBox_showPassword.setBackground(new java.awt.Color(96, 186, 242));
        jCheckBox_showPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox_showPassword.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox_showPassword.setText("toon wachtwoord");
        jCheckBox_showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_showPasswordActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("jLabel_message");

        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(27, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(382, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel_Message.setBackground(new java.awt.Color(255, 101, 50));

        jButton_ok.setText("ok");
        jButton_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MessageLayout = new javax.swing.GroupLayout(jPanel_Message);
        jPanel_Message.setLayout(jPanel_MessageLayout);
        jPanel_MessageLayout.setHorizontalGroup(
            jPanel_MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MessageLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(jButton_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel_MessageLayout.setVerticalGroup(
            jPanel_MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_MessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_berichtLayout = new javax.swing.GroupLayout(jPanel_bericht);
        jPanel_bericht.setLayout(jPanel_berichtLayout);
        jPanel_berichtLayout.setHorizontalGroup(
            jPanel_berichtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        jPanel_berichtLayout.setVerticalGroup(
            jPanel_berichtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextField_naamSchool.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_naamSchool.setText("Naam school");
        jTextField_naamSchool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_naamSchoolMouseClicked(evt);
            }
        });
        jTextField_naamSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_naamSchoolActionPerformed(evt);
            }
        });

        jCheckBox_showPassword1.setBackground(new java.awt.Color(96, 186, 242));
        jCheckBox_showPassword1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox_showPassword1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox_showPassword1.setText("toon wachtwoord");
        jCheckBox_showPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_showPassword1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("School");

        jPasswordField_wwSchool.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField_wwSchool.setText("wachtwoord");
        jPasswordField_wwSchool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField_wwSchoolMouseClicked(evt);
            }
        });

        jButton_loginSchool.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton_loginSchool.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton_loginSchool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_20px_4.png"))); // NOI18N
        jButton_loginSchool.setText("Login als school");
        jButton_loginSchool.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_loginSchoolMouseClicked(evt);
            }
        });
        jButton_loginSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginSchoolActionPerformed(evt);
            }
        });

        jButton_loginOuder.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jButton_loginOuder.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton_loginOuder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_20px_4.png"))); // NOI18N
        jButton_loginOuder.setText("Login als ouder");
        jButton_loginOuder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_loginOuder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_loginOuderMouseClicked(evt);
            }
        });
        jButton_loginOuder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginOuderActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Ouder");

        jLabel7.setText("jLabel7");

        jPanel1.setBackground(new java.awt.Color(15, 140, 217));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 140, 217), 4, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(557, 57));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welkom bij Go2School!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1569, 1569, 1569)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Mommy_and_Me_Classes_67px.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon (2).png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/V1_7.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_LoginLayout = new javax.swing.GroupLayout(jPanel_Login);
        jPanel_Login.setLayout(jPanel_LoginLayout);
        jPanel_LoginLayout.setHorizontalGroup(
            jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                                .addGap(1148, 1148, 1148)
                                .addComponent(jPanel_bericht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel_LoginLayout.createSequentialGroup()
                                    .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox_showPassword)
                                        .addComponent(jPasswordField_wachtwoord, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_gebruikersnaam, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_loginOuder))
                                    .addGap(70, 70, 70)
                                    .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_naamSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox_showPassword1)
                                        .addComponent(jButton_loginSchool)
                                        .addComponent(jPasswordField_wwSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel_LoginLayout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                                    .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(78, 78, 78))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jPanel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_LoginLayout.setVerticalGroup(
            jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_LoginLayout.createSequentialGroup()
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel_bericht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))))
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_LoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_gebruikersnaam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField_wachtwoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_showPassword)
                            .addComponent(jCheckBox_showPassword1))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel_LoginLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jTextField_naamSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_wwSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGroup(jPanel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_loginOuder)
                    .addComponent(jButton_loginSchool))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextField_gebruikersnaamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_gebruikersnaamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_gebruikersnaamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox_showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_showPasswordActionPerformed
        if (jCheckBox_showPassword.isSelected()) {
            jPasswordField_wachtwoord.setEchoChar((char) 0);
        } else {
            jPasswordField_wachtwoord.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox_showPasswordActionPerformed

    private void jButton_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_okActionPerformed

    }//GEN-LAST:event_jButton_okActionPerformed

    private void jButton_loginOuderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginOuderActionPerformed
        String mailadres = jTextField_gebruikersnaam.getText();
        String ww = String.valueOf(jPasswordField_wachtwoord.getPassword());
        try {
            if (this.main.loginOuder(mailadres, ww)) {
                this.jTextField_gebruikersnaam.setText("mailadres");
                this.jPasswordField_wachtwoord.setText("wachtwoord");
                GuiOuderWelkom startscherm = new GuiOuderWelkom(main, mailadres);
                startscherm.setVisible(true);
                startscherm.pack();
                startscherm.setLocationRelativeTo(null);

            } else {
                JOptionPane.showMessageDialog(null, "Ongeldige inloggegevens");

            }
        } catch (SQLException | DBException ex) {
            ex.printStackTrace(); // toont waar je zat in programma, usefull to diagnoze exception
        }
    }//GEN-LAST:event_jButton_loginOuderActionPerformed

    private void jButton_loginOuderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginOuderMouseClicked

    }//GEN-LAST:event_jButton_loginOuderMouseClicked

    private Boolean gebruikersnaamGeklikt;
    private void jTextField_gebruikersnaamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_gebruikersnaamMouseClicked
        if (jTextField_gebruikersnaam.getText().equals("Mailadres")) {
            gebruikersnaamGeklikt = false;
            if (!gebruikersnaamGeklikt) {
                jTextField_gebruikersnaam.setText("");
                jTextField_gebruikersnaam.setForeground(Color.DARK_GRAY);
            }
            gebruikersnaamGeklikt = true;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_gebruikersnaamMouseClicked

    private void jPasswordField_wachtwoordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField_wachtwoordMouseClicked

        jPasswordField_wachtwoord.setText("");
        jPasswordField_wachtwoord.setForeground(Color.DARK_GRAY);

        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_wachtwoordMouseClicked

    private void jButton_loginSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginSchoolActionPerformed
        String naam = this.jTextField_naamSchool.getText();
        String ww = String.valueOf(this.jPasswordField_wwSchool.getPassword());
        try {
            if (this.main.loginSchool(naam, ww)) { // als het inloggen gelukt is
                this.jTextField_naamSchool.setText("Naam");
                this.jPasswordField_wwSchool.setText("wachtwoord");
                if (LocalDateTime.now().isAfter(this.main.deadline)) // als de deadline voorbij is
                {
                    GuiSchoolWelkomNaDeadline startscherm = new GuiSchoolWelkomNaDeadline(main, naam);
                    startscherm.setVisible(true);
                    startscherm.pack();
                    startscherm.setLocationRelativeTo(null);
                    //this.dispose();
                } else // als de deadline nog niet voorbij is
                {
                    GuiSchoolWelkomVoorDeadline startscherm = new GuiSchoolWelkomVoorDeadline(main, naam);
                    startscherm.setVisible(true);
                    startscherm.pack();
                    startscherm.setLocationRelativeTo(null);
                    //this.dispose();
                }
            } else { // foute inloggegevens
                JOptionPane.showMessageDialog(null, "Ongeldige inloggegevens");
            }
        } catch (SQLException | DBException ex) {
            // toont waar je zat in programma, usefull to diagnoze exception

        }

    }//GEN-LAST:event_jButton_loginSchoolActionPerformed

    private void jButton_loginSchoolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginSchoolMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_loginSchoolMouseClicked

    private void jCheckBox_showPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_showPassword1ActionPerformed
        if (jCheckBox_showPassword1.isSelected()) {
            jPasswordField_wwSchool.setEchoChar((char) 0);
        } else {
            jPasswordField_wwSchool.setEchoChar('*');
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_showPassword1ActionPerformed

    private void jTextField_naamSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_naamSchoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_naamSchoolActionPerformed

    private Boolean naamSchoolGeklikt;
    private void jTextField_naamSchoolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_naamSchoolMouseClicked
        if (jTextField_naamSchool.getText().equalsIgnoreCase("Naam school")) {
            naamSchoolGeklikt = false;
            if (!naamSchoolGeklikt) {
                jTextField_naamSchool.setText("");
                jTextField_naamSchool.setForeground(Color.DARK_GRAY);
            }
            naamSchoolGeklikt = true;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_naamSchoolMouseClicked

    //private Boolean wwSchoolGeklikt = false;
    private void jPasswordField_wwSchoolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField_wwSchoolMouseClicked

        //if (!wwSchoolGeklikt) {
        jPasswordField_wwSchool.setText("");
        jPasswordField_wwSchool.setForeground(Color.DARK_GRAY);
        //}
        // wwSchoolGeklikt = true;

        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_wwSchoolMouseClicked

    private void jPasswordField_wachtwoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_wachtwoordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_wachtwoordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        GuiLogin nieuw = new GuiLogin();
        nieuw.setVisible(true);
        /* java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiLogin(null).setVisible(true);
            }
        });
         */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_loginOuder;
    private javax.swing.JButton jButton_loginSchool;
    private javax.swing.JButton jButton_ok;
    private javax.swing.JCheckBox jCheckBox_showPassword;
    private javax.swing.JCheckBox jCheckBox_showPassword1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Message;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Login;
    private javax.swing.JPanel jPanel_Message;
    private javax.swing.JPanel jPanel_bericht;
    private javax.swing.JPasswordField jPasswordField_wachtwoord;
    private javax.swing.JPasswordField jPasswordField_wwSchool;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_gebruikersnaam;
    private javax.swing.JTextField jTextField_naamSchool;
    // End of variables declaration//GEN-END:variables
}
