/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20g_almasib
 */
public class Calculator extends javax.swing.JFrame {

    double num, ans;
    int calculation;

    public Calculator() {
        initComponents();
        rbON.setEnabled(false);
    }

    public void arithmetic_operation() {
        switch (calculation) {
            case 1 -> { // ------ ÖSSZEADÁS
                ans = num + Double.parseDouble(txtKiiratas.getText());
                txtKiiratas.setText(Double.toString(ans));
                break;
            }
                
                case 2 -> { // ------ KIVONÁS
                    ans = num - Double.parseDouble(txtKiiratas.getText());
                    txtKiiratas.setText(Double.toString(ans));
                    break;
            }
                case 3 -> { // ------ SZORZÁS
                    ans = num * Double.parseDouble(txtKiiratas.getText());
                    txtKiiratas.setText(Double.toString(ans));
                    break;
            }
                case 4 -> { // ------ OSZTÁS
                    ans = num / Double.parseDouble(txtKiiratas.getText());
                    txtKiiratas.setText(Double.toString(ans));
                    break;
            }
        }
    }

    public void OFF() {
        rbON.setEnabled(true);
        rbOFF.setEnabled(false);

        txtKiiratas.setEnabled(false);
        btn0.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);

        btnPlusz.setEnabled(false);
        btnMinusz.setEnabled(false);
        btnOszt.setEnabled(false);
        btnSzoroz.setEnabled(false);
        btnC.setEnabled(false);
        btnPont.setEnabled(false);
        btnEredmeny.setEnabled(false);
        btnBackspace.setEnabled(false);
    }

    public void ON() {
        rbON.setEnabled(false);
        rbOFF.setEnabled(true);

        txtKiiratas.setEnabled(true);
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

        btnPlusz.setEnabled(true);
        btnMinusz.setEnabled(true);
        btnOszt.setEnabled(true);
        btnSzoroz.setEnabled(true);
        btnC.setEnabled(true);
        btnPont.setEnabled(true);
        btnEredmeny.setEnabled(true);
        btnBackspace.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        txtKiiratas = new javax.swing.JTextField();
        rbON = new javax.swing.JRadioButton();
        rbOFF = new javax.swing.JRadioButton();
        btnBackspace = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnPlusz = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMinusz = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnSzoroz = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnOszt = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnEredmeny = new javax.swing.JButton();
        btnPont = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        txtKiiratas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtKiiratas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtKiiratas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKiiratasActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbON);
        rbON.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbON.setText("ON");
        rbON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbONActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbOFF);
        rbOFF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbOFF.setText("OFF");
        rbOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOFFActionPerformed(evt);
            }
        });

        btnBackspace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBackspace.setText("<");
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnPlusz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPlusz.setText("+");
        btnPlusz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPluszActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnMinusz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMinusz.setText("-");
        btnMinusz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinuszActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnSzoroz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSzoroz.setText("*");
        btnSzoroz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSzorozActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnOszt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOszt.setText("/");
        btnOszt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsztActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnEredmeny.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEredmeny.setText("=");
        btnEredmeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEredmenyActionPerformed(evt);
            }
        });

        btnPont.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPont.setText(".");
        btnPont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 51, 204));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl1.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKiiratas, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(btn0)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnPont, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btn4)
                                                    .addComponent(btn1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btn2)
                                                    .addComponent(btn5))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn6)
                                            .addComponent(btn3))
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btn7)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnBackspace)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnC))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn8)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn9)))
                                        .addGap(8, 8, 8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPlusz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSzoroz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOszt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMinusz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(rbON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbOFF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKiiratas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOFF)
                    .addComponent(rbON))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusz, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn8)
                    .addComponent(btn9)
                    .addComponent(btnMinusz)
                    .addComponent(btn7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6)
                    .addComponent(btn5)
                    .addComponent(btn4)
                    .addComponent(btnSzoroz))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btnOszt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btnPont)
                    .addComponent(btnEredmeny))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKiiratasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKiiratasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKiiratasActionPerformed

    private void btnPluszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPluszActionPerformed
        // ÖSSZEADÁS
        // txtKiiratas.setText(txtKiiratas.getText() + "+");
        num = Double.parseDouble(txtKiiratas.getText());
        calculation =1;
        txtKiiratas.setText("");
        lbl1.setText(num + " + ");
    }//GEN-LAST:event_btnPluszActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtKiiratas.setText(txtKiiratas.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtKiiratas.setText(txtKiiratas.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtKiiratas.setText(txtKiiratas.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnMinuszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinuszActionPerformed
        // KIVONÁS
        // txtKiiratas.setText(txtKiiratas.getText() + "-");
        num = Double.parseDouble(txtKiiratas.getText());
        calculation =2;
        txtKiiratas.setText("");
        lbl1.setText(num + " - ");
    }//GEN-LAST:event_btnMinuszActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtKiiratas.setText(txtKiiratas.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtKiiratas.setText(txtKiiratas.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtKiiratas.setText(txtKiiratas.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnSzorozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSzorozActionPerformed
        // SZORZÁS
        //txtKiiratas.setText(txtKiiratas.getText() + "*");
        num = Double.parseDouble(txtKiiratas.getText());
        calculation =3;
        txtKiiratas.setText("");
        lbl1.setText(num + " * ");
    }//GEN-LAST:event_btnSzorozActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtKiiratas.setText(txtKiiratas.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtKiiratas.setText(txtKiiratas.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnOsztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsztActionPerformed
        // OSZTÁS
        //txtKiiratas.setText(txtKiiratas.getText() + "/");
        num = Double.parseDouble(txtKiiratas.getText());
        calculation =4;
        txtKiiratas.setText("");
        lbl1.setText(num + " / ");
    }//GEN-LAST:event_btnOsztActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtKiiratas.setText(txtKiiratas.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtKiiratas.setText(txtKiiratas.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnEredmenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEredmenyActionPerformed
        // EREDMÉNY
        arithmetic_operation();
        lbl1.setText("");
    }//GEN-LAST:event_btnEredmenyActionPerformed

    private void btnPontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontActionPerformed
        txtKiiratas.setText(txtKiiratas.getText() + ".");
    }//GEN-LAST:event_btnPontActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtKiiratas.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void rbOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOFFActionPerformed
        OFF(); // ------ KIKAPCSOLÁS
    }//GEN-LAST:event_rbOFFActionPerformed

    private void rbONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbONActionPerformed
        ON(); // ------ BEKAPCSOLÁS
    }//GEN-LAST:event_rbONActionPerformed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
        int length = txtKiiratas.getText().length();
        int number = txtKiiratas.getText().length() - 1;
        String store;

        if (length > 0) {
            StringBuilder back = new StringBuilder(txtKiiratas.getText());
            back.deleteCharAt(number);
            store = back.toString();
            txtKiiratas.setText(store);
        }
    }//GEN-LAST:event_btnBackspaceActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnEredmeny;
    private javax.swing.JButton btnMinusz;
    private javax.swing.JButton btnOszt;
    private javax.swing.JButton btnPlusz;
    private javax.swing.JButton btnPont;
    private javax.swing.JButton btnSzoroz;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JRadioButton rbOFF;
    private javax.swing.JRadioButton rbON;
    private javax.swing.JTextField txtKiiratas;
    // End of variables declaration//GEN-END:variables
}