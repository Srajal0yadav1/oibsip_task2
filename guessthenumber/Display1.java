/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guessthenumber;

import java.util.Random;
/**
 *
 * @author srj
 */
public class Display1 extends javax.swing.JFrame {
   
    int count;
    int hcount;
    int playerGuess;
    Random rg=new Random();
    int ranNo=rg.nextInt(100)+1;
    /**
     * Creates new form Display1
     */
    boolean isPrime(int rno)
    {
        if(rno<=1)
        {
            return false;
        }
        for(int i=2;i<Math.sqrt(rno);i++)
        {
            if(rno%i==0)                
            {
                return false;
            }
        }
        return true;
    }
    public String checkDiviByEven(int rno)
    {
        if(rno%8==0)
        {
            return("divisible by 8");
        }
        else  if(rno%6==0)
        {
            return("divisible by 6");
        }
        else  if(rno%4==0)
        {
            return("divisible by 4");
        }
        else if(checkEven(rno)){
            return("divisible by 2");
        }
       return("divisible by 1");
    }
    public String checkDiviByOdd(int rno)
    {
        if(rno%9==0)
        {
            return("divisible by 9");
        }
        else  if(rno%7==0)
        {
            return("divisible by 7");
        }
        else  if(rno%5==0)
        {
            return("divisible by 5");
        }
        else if(rno%11==0)
        {
            return("divisible by 11");
        }
        else if(rno%3==0)
        {
            return("divisible by 3");
        }
        else{
            return("maybe prime!");
        }
    }
    boolean checkEven(int rno)
    {
        return rno%2==0;

    }
    public Display1() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bRan = new javax.swing.JButton();
        bGus = new javax.swing.JButton();
        tfOutput = new javax.swing.JTextField();
        bHint = new javax.swing.JButton();
        LHint = new javax.swing.JLabel();
        LCount = new javax.swing.JLabel();
        tfCount = new javax.swing.JTextField();
        LNewGen = new javax.swing.JLabel();
        tfNoInput = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Display1");
        setBackground(new java.awt.Color(0, 255, 204));
        setForeground(new java.awt.Color(51, 255, 204));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Game");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 204, 0)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 204, 51))); // NOI18N

        bRan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bRan.setForeground(new java.awt.Color(255, 51, 102));
        bRan.setText("Random genration");
        bRan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 153, 153), new java.awt.Color(255, 102, 102), null, null));
        bRan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRanActionPerformed(evt);
            }
        });

        bGus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bGus.setForeground(new java.awt.Color(0, 255, 153));
        bGus.setText("Guess ");
        bGus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 102), new java.awt.Color(0, 255, 51), null, null));
        bGus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGusActionPerformed(evt);
            }
        });

        tfOutput.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N

        bHint.setBackground(new java.awt.Color(153, 255, 255));
        bHint.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bHint.setForeground(new java.awt.Color(0, 153, 204));
        bHint.setText("Hint.");
        bHint.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 204), 5, true));
        bHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHintActionPerformed(evt);
            }
        });

        LHint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LCount.setText("Guess Count :");

        LNewGen.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        LNewGen.setForeground(new java.awt.Color(255, 0, 0));
        LNewGen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tfNoInput.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        tfNoInput.setText("Enter a Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(LHint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bGus, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(LCount, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(tfCount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 197, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LNewGen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfOutput)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bHint, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bRan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNoInput)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(tfNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bHint)
                    .addComponent(LHint, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tfOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LNewGen, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRanActionPerformed
        // TODO add your handling code here:
        LNewGen.setText("Number Generated!");
        hcount=0;
        count=0;
        LHint.setText("");
        tfCount.setText("");
        tfOutput.setText("");
        ranNo=rg.nextInt(100)+1;
    }//GEN-LAST:event_bRanActionPerformed

    private void bGusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGusActionPerformed
        // TODO add your handling code here:
        boolean flag=true;
        try{
            playerGuess=Integer.parseInt(tfNoInput.getText());
        }
        catch(Exception e)
        {
            LNewGen.setText("Enter a valid no."); 
            flag=false;
        }
        if(flag)
        {
            tfCount.setText(""+count++);
            LNewGen.setText("Number given is :"+tfNoInput.getText());
            if(playerGuess==ranNo)
            {
                tfOutput.setText("Guess Successfull!!");
                LNewGen.setText("you win!!\nTo play more Hit \nThe Generation Button again! ");
            }
            else if(playerGuess<ranNo)
            {
                tfOutput.setText("Number Is Higher.\nGuess again!");
            }
            else
            {
                tfOutput.setText("Number Is Smaller.\nGuess again!");
            }
            tfNoInput.setText("");
        }
    }//GEN-LAST:event_bGusActionPerformed

    private void bHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHintActionPerformed
        // TODO add your handling code here:
        
        switch(hcount)
        {
            case 0 -> {
                if(checkEven(ranNo))
                    LHint.setText("Is a even no.");
                else
                    LHint.setText(" Is a odd no.");
                hcount++;
            }
            case 1 -> {
                LHint.setText(checkDiviByEven(ranNo));
                LHint.setText(checkDiviByOdd(ranNo));
                hcount++;
            }
            case 2 -> {
                if(isPrime(ranNo))
                {
                   LHint.setText("Is a prime no.");
                }
                else{
                    LHint.setText("Is not a prime no.");
                }
                hcount++;
            }
            default -> LHint.setText("you are out of Hint., try on your own now!");
        }
    }//GEN-LAST:event_bHintActionPerformed

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
            java.util.logging.Logger.getLogger(Display1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LCount;
    private javax.swing.JLabel LHint;
    private javax.swing.JLabel LNewGen;
    private javax.swing.JButton bGus;
    private javax.swing.JButton bHint;
    private javax.swing.JButton bRan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfCount;
    private javax.swing.JTextField tfNoInput;
    private javax.swing.JTextField tfOutput;
    // End of variables declaration//GEN-END:variables
}