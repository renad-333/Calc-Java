public class Calculator extends javax.swing.JFrame {
    
double num1,num2=0,result;
String operator=null;
    
    public Calculator() {
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

        jButton16 = new javax.swing.JButton();
        bmod = new javax.swing.JButton();
        bcomma = new javax.swing.JButton();
        bclear1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bclear = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n1 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        bmulty = new javax.swing.JButton();
        bminus = new javax.swing.JButton();
        badd = new javax.swing.JButton();
        bdevide = new javax.swing.JButton();
        bequal = new javax.swing.JButton();
        btxt = new javax.swing.JTextField();
        reversesignal = new javax.swing.JButton();
        n0 = new javax.swing.JButton();
        bback = new javax.swing.JButton();

        jButton16.setBackground(new java.awt.Color(0, 168, 255));
        jButton16.setForeground(new java.awt.Color(0, 168, 255));
        jButton16.setText("7");

        bmod.setBackground(new java.awt.Color(131, 149, 167));
        bmod.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bmod.setForeground(new java.awt.Color(235, 47, 6));
        bmod.setText("%");

        bcomma.setBackground(new java.awt.Color(131, 149, 167));
        bcomma.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bcomma.setForeground(new java.awt.Color(235, 47, 6));
        bcomma.setText(",");

        bclear1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bclear1.setForeground(new java.awt.Color(60, 99, 130));
        bclear1.setText("clear");
        bclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclear1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(113, 128, 147));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 99, 130));
        jLabel1.setText("Calculator");
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 30));

        jPanel1.setBackground(new java.awt.Color(64, 115, 158));

        bclear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bclear.setForeground(new java.awt.Color(60, 99, 130));
        bclear.setText("clear");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });

        n8.setBackground(new java.awt.Color(131, 149, 167));
        n8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n8.setForeground(new java.awt.Color(235, 47, 6));
        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        n7.setBackground(new java.awt.Color(131, 149, 167));
        n7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n7.setForeground(new java.awt.Color(235, 47, 6));
        n7.setText("7");
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        n6.setBackground(new java.awt.Color(131, 149, 167));
        n6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n6.setForeground(new java.awt.Color(235, 47, 6));
        n6.setText("6");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        n5.setBackground(new java.awt.Color(131, 149, 167));
        n5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n5.setForeground(new java.awt.Color(235, 47, 6));
        n5.setText("5");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        n4.setBackground(new java.awt.Color(131, 149, 167));
        n4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n4.setForeground(new java.awt.Color(235, 47, 6));
        n4.setText("4");
        n4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n2.setBackground(new java.awt.Color(131, 149, 167));
        n2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n2.setForeground(new java.awt.Color(235, 47, 6));
        n2.setText("2");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n1.setBackground(new java.awt.Color(131, 149, 167));
        n1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n1.setForeground(new java.awt.Color(235, 47, 6));
        n1.setText("1");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n9.setBackground(new java.awt.Color(131, 149, 167));
        n9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n9.setForeground(new java.awt.Color(235, 47, 6));
        n9.setText("9");
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        n3.setBackground(new java.awt.Color(131, 149, 167));
        n3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n3.setForeground(new java.awt.Color(235, 47, 6));
        n3.setText("3");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        bmulty.setBackground(new java.awt.Color(131, 149, 167));
        bmulty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bmulty.setForeground(new java.awt.Color(235, 47, 6));
        bmulty.setText("X");
        bmulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultyActionPerformed(evt);
            }
        });

        bminus.setBackground(new java.awt.Color(131, 149, 167));
        bminus.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        bminus.setForeground(new java.awt.Color(235, 47, 6));
        bminus.setText("-");
        bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bminusActionPerformed(evt);
            }
        });

        badd.setBackground(new java.awt.Color(131, 149, 167));
        badd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        badd.setForeground(new java.awt.Color(235, 47, 6));
        badd.setText("+");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });

        bdevide.setBackground(new java.awt.Color(131, 149, 167));
        bdevide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bdevide.setForeground(new java.awt.Color(235, 47, 6));
        bdevide.setText("/");
        bdevide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdevideActionPerformed(evt);
            }
        });

        bequal.setBackground(new java.awt.Color(131, 149, 167));
        bequal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bequal.setForeground(new java.awt.Color(235, 47, 6));
        bequal.setText("=");
        bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });

        btxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxtActionPerformed(evt);
            }
        });

        reversesignal.setBackground(new java.awt.Color(131, 149, 167));
        reversesignal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reversesignal.setForeground(new java.awt.Color(235, 47, 6));
        reversesignal.setText("+/-");
        reversesignal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reversesignalActionPerformed(evt);
            }
        });

        n0.setBackground(new java.awt.Color(131, 149, 167));
        n0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        n0.setForeground(new java.awt.Color(235, 47, 6));
        n0.setText("0");
        n0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0ActionPerformed(evt);
            }
        });

        bback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bback.setForeground(new java.awt.Color(60, 99, 130));
        bback.setText("back");
        bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bdevide, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addComponent(bmulty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bminus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bback, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(badd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(reversesignal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bequal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btxt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bmulty, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btxt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bback, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(bdevide, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(bminus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(badd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bequal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reversesignal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
       btxt.setText(" ");
    }//GEN-LAST:event_bclearActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
       btxt.setText(btxt.getText()+"1");
    }//GEN-LAST:event_n1ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
       btxt.setText(btxt.getText()+"8");
    }//GEN-LAST:event_n8ActionPerformed

    private void bdevideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdevideActionPerformed
     num1 = Double.parseDouble(btxt.getText());
    btxt.setText(" ");
    operator="/";
    }//GEN-LAST:event_bdevideActionPerformed

    private void btxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btxtActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
       btxt.setText(btxt.getText()+"2");
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
       btxt.setText(btxt.getText()+"3");
    }//GEN-LAST:event_n3ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
          btxt.setText(btxt.getText()+"4");
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
         btxt.setText(btxt.getText()+"5");
    }//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
         btxt.setText(btxt.getText()+"6");
    }//GEN-LAST:event_n6ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
         btxt.setText(btxt.getText()+"7");
    }//GEN-LAST:event_n7ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
      btxt.setText(btxt.getText()+"9");
    }//GEN-LAST:event_n9ActionPerformed

    private void reversesignalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reversesignalActionPerformed
 
      double ops = Double.parseDouble(String.valueOf(btxt.getText()));
      ops = ops *(-1);
      btxt.setText(String.valueOf(ops));
   
    }//GEN-LAST:event_reversesignalActionPerformed

    private void n0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0ActionPerformed
       btxt.setText(btxt.getText()+"0");
    }//GEN-LAST:event_n0ActionPerformed

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalActionPerformed
     
        num2 = Double.parseDouble(btxt.getText());
        
        double result=0;
        
        if(operator == "+"){
            result= num1+num2;
        }
         if(operator == "-"){
            result= num1-num2;
        }
          if(operator == "*"){
            result= num1*num2;
        }
           if(operator == "/"){
            result= num1/num2;
        }
            if(operator == "^"){
            
        }
            if(operator == "^"){
            result=Math.sqrt(num1);
        }
            
            
            btxt.setText(""+result);
            operator=null;
        
        
        
               
    }//GEN-LAST:event_bequalActionPerformed

    
    private void bmultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmultyActionPerformed
    num1 = Double.parseDouble(btxt.getText());
    btxt.setText(" ");
    operator="*";    
    }//GEN-LAST:event_bmultyActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
       num1 = Double.parseDouble(btxt.getText());
    btxt.setText(" ");
    operator="+";
    }//GEN-LAST:event_baddActionPerformed

    private void bminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bminusActionPerformed
       num1 = Double.parseDouble(btxt.getText());
    btxt.setText(" ");
    operator="-";
    }//GEN-LAST:event_bminusActionPerformed

    private void bclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bclear1ActionPerformed

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
     
     String str = btxt.getText();
     btxt.setText(str.substring(0,str.length()-1));
    }//GEN-LAST:event_bbackActionPerformed

   
   

   
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
    private javax.swing.JButton badd;
    private javax.swing.JButton bback;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bclear1;
    private javax.swing.JButton bcomma;
    private javax.swing.JButton bdevide;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bminus;
    private javax.swing.JButton bmod;
    private javax.swing.JButton bmulty;
    private javax.swing.JTextField btxt;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton n0;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JButton reversesignal;
    // End of variables declaration//GEN-END:variables
}
