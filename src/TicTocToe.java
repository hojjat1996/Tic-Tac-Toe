import java.awt.Color;
import javax.swing.* ;

public class TicTocToe extends javax.swing.JFrame {
    public TicTocToe() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        textField = new javax.swing.JTextField();
        playAgain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
        setResizable(false);

        btn1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionHndler(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionHndler(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionHndler(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionHndler(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionHndler(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionHndler(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionHndler(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionHndler(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionHndler(evt);
            }
        });

        textField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textField.setText("X's turn");
        textField.setToolTipText("");

        playAgain.setText("play again");
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(playAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static final String[] states = {"X" , "O"};
    private static int[] colorWinnerChooser = new int[]{0,0};
    private static String state     = "X" ;
    
    private void btnActionHndler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionHndler
        JButton btn = (JButton)evt.getSource();
        if(btn.getText().isEmpty() && (colorWinnerChooser[0] == 0)){
            if(state.equals(states[0])){
                //state == X ; 
                btn.setText(states[0]);
                textField.setText("O's turn");
                checkWinner(); 
                if(colorWinnerChooser[0] == 0){
                    state = states[1] ; //state = O ;
                }
                else{
                    textField.setText("'X' is winner");
                    switch(colorWinnerChooser[1]){
                        case 1 :
                            btn1.setForeground(Color.red);
                            btn2.setForeground(Color.red);
                            btn3.setForeground(Color.red);
                            break ;
                        case 2 :
                            btn4.setForeground(Color.red);
                            btn5.setForeground(Color.red);
                            btn6.setForeground(Color.red);
                            break ;
                        case 3 :
                            btn7.setForeground(Color.red);
                            btn8.setForeground(Color.red);
                            btn9.setForeground(Color.red);
                            break ;
                        case 4 :
                            btn1.setForeground(Color.red);
                            btn4.setForeground(Color.red);
                            btn7.setForeground(Color.red);
                            break ;
                        case 5 :
                            btn2.setForeground(Color.red);
                            btn5.setForeground(Color.red);
                            btn8.setForeground(Color.red);
                            break ;
                        case 6 :
                            btn3.setForeground(Color.red);
                            btn6.setForeground(Color.red);
                            btn9.setForeground(Color.red);
                            break ;
                        case 7 :
                            btn1.setForeground(Color.red);
                            btn5.setForeground(Color.red);
                            btn9.setForeground(Color.red);
                            break ;
                        case 8 :
                            btn7.setForeground(Color.red);
                            btn5.setForeground(Color.red);
                            btn3.setForeground(Color.red);
                            break ;
                    }
                }
            }else{
                //state == O ;
                btn.setText(states[1]);
                textField.setText("X's turn");
                checkWinner();
                if(colorWinnerChooser[0] == 0)
                    state = states[0] ; //state = X ;
                else{
                    textField.setText("'O' is winner");
                    switch(colorWinnerChooser[1]){
                        case 1 :
                            btn1.setForeground(Color.red);
                            btn2.setForeground(Color.red);
                            btn3.setForeground(Color.red);
                            break ;
                        case 2 :
                            btn4.setForeground(Color.red);
                            btn5.setForeground(Color.red);
                            btn6.setForeground(Color.red);
                            break ;
                        case 3 :
                            btn7.setForeground(Color.red);
                            btn8.setForeground(Color.red);
                            btn9.setForeground(Color.red);
                            break ;
                        case 4 :
                            btn1.setForeground(Color.red);
                            btn4.setForeground(Color.red);
                            btn7.setForeground(Color.red);
                            break ;
                        case 5 :
                            btn2.setForeground(Color.red);
                            btn5.setForeground(Color.red);
                            btn8.setForeground(Color.red);
                            break ;
                        case 6 :
                            btn3.setForeground(Color.red);
                            btn6.setForeground(Color.red);
                            btn9.setForeground(Color.red);
                            break ;
                        case 7 :
                            btn1.setForeground(Color.red);
                            btn5.setForeground(Color.red);
                            btn9.setForeground(Color.red);
                            break ;
                        case 8 :
                            btn7.setForeground(Color.red);
                            btn5.setForeground(Color.red);
                            btn3.setForeground(Color.red);
                            break ;
                    }
            }
            
        }
        
        }
        
    }//GEN-LAST:event_btnActionHndler

    private void playAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainActionPerformed
    
        JButton[] button = new JButton[]{btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9} ;
        for(int i=0; i < 9; i++){
            button[i].setText("");
            button[i].setForeground(Color.black);
            textField.setText("");
        }
        colorWinnerChooser[0] = 0 ;
        textField.setText("X's turn");
    }//GEN-LAST:event_playAgainActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTocToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTocToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTocToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTocToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTocToe().setVisible(true);
           }
        });
    }
    
    public int[] checkWinner(){
        if(checkEqual(btn1, btn2, btn3)){
            colorWinnerChooser[0] = 1 ;
            colorWinnerChooser[1] = 1 ;
        }
        if(checkEqual(btn4, btn5, btn6)){
            colorWinnerChooser[0] = 1 ;
            colorWinnerChooser[1] = 2 ;
        }
        if(checkEqual(btn7, btn8, btn9)){
            colorWinnerChooser[0] = 1 ;
            colorWinnerChooser[1] = 3 ;
        }
        if(checkEqual(btn1, btn4, btn7)){
            colorWinnerChooser[0] = 1 ;
            colorWinnerChooser[1] = 4 ;
        }
        if(checkEqual(btn2, btn5, btn8)){
            colorWinnerChooser[0] = 1 ;
            colorWinnerChooser[1] = 5 ;
        }
        if(checkEqual(btn9, btn6, btn3)){
            colorWinnerChooser[0] = 1 ;
            colorWinnerChooser[1] = 6 ;
        }
        if(checkEqual(btn1, btn9, btn5)){
            colorWinnerChooser[0] = 1 ;
            colorWinnerChooser[1] = 7 ;
        }
        if(checkEqual(btn7, btn5, btn3)){
            colorWinnerChooser[0] = 1 ;
            colorWinnerChooser[1] = 8 ;
        }
    return colorWinnerChooser ;
    }
    public boolean checkEqual(JButton b1, JButton b2, JButton b3){
        if(!b1.getText().isEmpty() && b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText()))
            return true ;
        return false ;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton playAgain;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}