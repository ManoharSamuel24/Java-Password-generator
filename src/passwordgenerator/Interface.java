
package passwordgenerator;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;


public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/LockIcon.png")).getImage();
        this.setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        length = new javax.swing.JTextField();
        result = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        copyButton = new javax.swing.JButton();
        about = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Generator");
        setPreferredSize(new java.awt.Dimension(400, 270));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(248, 37, 71));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 270));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 40));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Random Password Generator");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 253, 255));
        jLabel2.setText("Password Length:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Generated Password:");

        length.setBackground(new java.awt.Color(255, 255, 255));
        length.setFont(new java.awt.Font("Microsoft Tai Le", 1, 15)); // NOI18N
        length.setForeground(new java.awt.Color(0, 0, 0));
        length.setPreferredSize(new java.awt.Dimension(170, 30));
        length.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthActionPerformed(evt);
            }
        });

        result.setEditable(false);
        result.setBackground(new java.awt.Color(255, 255, 255));
        result.setFont(new java.awt.Font("Microsoft Tai Le", 1, 15)); // NOI18N
        result.setForeground(new java.awt.Color(0, 0, 0));
        result.setPreferredSize(new java.awt.Dimension(170, 30));

        generateButton.setBackground(new java.awt.Color(0, 136, 225));
        generateButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        generateButton.setForeground(new java.awt.Color(255, 255, 255));
        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(0, 136, 225));
        clearButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        copyButton.setBackground(new java.awt.Color(0, 136, 225));
        copyButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        copyButton.setForeground(new java.awt.Color(255, 255, 255));
        copyButton.setText("Copy");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        about.setBackground(new java.awt.Color(0, 136, 225));
        about.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        about.setForeground(new java.awt.Color(255, 255, 255));
        about.setText("About App");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(generateButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(length, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(about)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(copyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generateButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(copyButton)
                    .addComponent(about))
                .addGap(0, 58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        length.setText("");
        result.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        result.selectAll();
        result.copy();
    }//GEN-LAST:event_copyButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String special = "<>,.?/!@#$%^&*(){}[]-=+";
        String combination = upper+lower+num+special;
        if(length.getText().equals("")){
            result.setText("Enter Password Length!");
        }
        else{
            try{
                int n = Integer.parseInt(length.getText());
                char[] password = new char[n];
                Random r = new Random();
                for(int i=0;i<n;i++){
                    password[i] = combination.charAt(r.nextInt(combination.length()));
                }
                String res = new String(password);
                result.setText(res);
            }
            catch(NumberFormatException e){
                result.setText("Input a number!");
            }
            
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        AboutApp abt = new AboutApp(this,true);
        abt.setVisible(true);
        abt.pack();
        abt.setLocationRelativeTo(this);
    }//GEN-LAST:event_aboutActionPerformed

    private void lengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthActionPerformed
        generateButtonActionPerformed(evt);
    }//GEN-LAST:event_lengthActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton copyButton;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField length;
    private javax.swing.JTextField result;
    // End of variables declaration//GEN-END:variables
}
