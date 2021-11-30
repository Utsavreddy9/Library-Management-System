
package gui;

import business.SystemController;
import business.UserType;
import exception.UserException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {


	private static final long serialVersionUID = 2595330704429224595L;
	public LoginFrame() {
        initComponents();
    }
 
  
    private void initComponents() {

        loginMainPanel = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login1 = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        userLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        userLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        passwordLabel.setText("Password");

        login1.setBackground(new java.awt.Color(255, 255, 255));
        login1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        login1.setText("Login");
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1ActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginMainPanelLayout = new javax.swing.GroupLayout(loginMainPanel);
        loginMainPanel.setLayout(loginMainPanelLayout);
        loginMainPanelLayout.setHorizontalGroup(
            loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginMainPanelLayout.createSequentialGroup()
                        .addGroup(loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel)
                            .addComponent(passwordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginMainPanelLayout.createSequentialGroup()
                        .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        loginMainPanelLayout.setVerticalGroup(
            loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginMainPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login1)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1ActionPerformed
        // TODO add your handling code here:
        
        SystemController controller = new SystemController();
        try{
            //DataAccessFacade.loadUserMap(testUsers);
            String uid = userName.getText();
            @SuppressWarnings("deprecation")
			String pwd = password.getText();    
            controller.login(uid, pwd);
            
            if(controller.currentUserType == UserType.ADMIN){
                 System.out.println(controller.currentUserType);
               AdministratorFrame a = new AdministratorFrame();
               a.setVisible(true);
               this.setVisible(false);
            }
            else if (controller.currentUserType == UserType.LIBRARAIN){
                 System.out.println(controller.currentUserType);
                LibrarianFrame b = new LibrarianFrame();
                b.setVisible(true);
                this.setVisible(false);
            }
            else if (controller.currentUserType == UserType.BOTH){
                System.out.println(controller.currentUserType);
                AdministratorLibrarianFrame c = new AdministratorLibrarianFrame();
                c.setVisible(true);
                this.setVisible(false);
            }
            else{
                
            }
        } catch (UserException e) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,e.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            
	}
//                
    }//GEN-LAST:event_login1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton login1;
    private javax.swing.JPanel loginMainPanel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
