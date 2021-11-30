package gui;


import business.SystemController;
import exception.BookException;
import exception.InvalidArgumentException;
import exception.MemberException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LibrarianFrame extends javax.swing.JFrame {


	private static final long serialVersionUID = -6274661851299280976L;
	public LibrarianFrame() {
        initComponents();
    }

    private void initComponents() {

        librarianPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        librarianMiniPane = new javax.swing.JLabel();
        enterISBN = new javax.swing.JButton();
        enterMemberID = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();
        lookUpPanel = new javax.swing.JPanel();
        defaultNew = new javax.swing.JPanel();
        displayISBN22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayISBN23 = new javax.swing.JTextArea();
        searchISBNPanel = new javax.swing.JPanel();
        isbnLabel = new javax.swing.JLabel();
        clearISBN = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        isbn = new javax.swing.JTextPane();
        search2 = new javax.swing.JButton();
        backISBN = new javax.swing.JButton();
        addCheckOutPanel = new javax.swing.JPanel();
        searchMember = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        memberID = new javax.swing.JTextPane();
        memeberID = new javax.swing.JLabel();
        backSearchMember = new javax.swing.JButton();
        clearSearchMember = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        isbnID3 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        copyId3 = new javax.swing.JTextPane();
        memeberID1 = new javax.swing.JLabel();
        memeberID2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        librarianPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        librarianMiniPane.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        librarianMiniPane.setForeground(new java.awt.Color(255, 51, 51));
        librarianMiniPane.setText("Logged in as a Librarian");

        enterISBN.setBackground(new java.awt.Color(255, 204, 255));
        enterISBN.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        enterISBN.setText("Search ISBN");
        enterISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterISBNActionPerformed(evt);
            }
        });

        enterMemberID.setBackground(new java.awt.Color(255, 204, 255));
        enterMemberID.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        enterMemberID.setText("Add Member Checkout");
        enterMemberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterMemberIDActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        displayPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout librarianPanelLayout = new javax.swing.GroupLayout(librarianPanel);
        librarianPanel.setLayout(librarianPanelLayout);
        librarianPanelLayout.setHorizontalGroup(
            librarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librarianPanelLayout.createSequentialGroup()
                .addGroup(librarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(librarianPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(librarianPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(librarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enterMemberID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enterISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(librarianPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(logout))
                    .addGroup(librarianPanelLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(librarianPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(librarianMiniPane, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        librarianPanelLayout.setVerticalGroup(
            librarianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librarianPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(librarianMiniPane, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(enterISBN)
                .addGap(58, 58, 58)
                .addComponent(enterMemberID)
                .addGap(48, 48, 48)
                .addComponent(logout)
                .addGap(31, 31, 31)
                .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        lookUpPanel.setBackground(new java.awt.Color(255, 255, 255));
        lookUpPanel.setLayout(new java.awt.CardLayout());

        defaultNew.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout defaultNewLayout = new javax.swing.GroupLayout(defaultNew);
        defaultNew.setLayout(defaultNewLayout);
        defaultNewLayout.setHorizontalGroup(
            defaultNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        defaultNewLayout.setVerticalGroup(
            defaultNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );

        lookUpPanel.add(defaultNew, "card4");

        displayISBN23.setColumns(20);
        displayISBN23.setRows(5);
        jScrollPane1.setViewportView(displayISBN23);

        javax.swing.GroupLayout displayISBN22Layout = new javax.swing.GroupLayout(displayISBN22);
        displayISBN22.setLayout(displayISBN22Layout);
        displayISBN22Layout.setHorizontalGroup(
            displayISBN22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayISBN22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayISBN22Layout.setVerticalGroup(
            displayISBN22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayISBN22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lookUpPanel.add(displayISBN22, "card5");

        searchISBNPanel.setBackground(new java.awt.Color(255, 255, 255));

        isbnLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        isbnLabel.setText("Enter ISBN");

        clearISBN.setBackground(new java.awt.Color(255, 204, 255));
        clearISBN.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        clearISBN.setForeground(new java.awt.Color(0, 102, 255));
        clearISBN.setText("Clear");
        clearISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearISBNActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(isbn);

        search2.setBackground(new java.awt.Color(255, 204, 255));
        search2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        search2.setForeground(new java.awt.Color(0, 102, 255));
        search2.setText("Search");
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });

        backISBN.setBackground(new java.awt.Color(255, 204, 255));
        backISBN.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        backISBN.setForeground(new java.awt.Color(0, 102, 255));
        backISBN.setText("Back");
        backISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backISBNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchISBNPanelLayout = new javax.swing.GroupLayout(searchISBNPanel);
        searchISBNPanel.setLayout(searchISBNPanelLayout);
        searchISBNPanelLayout.setHorizontalGroup(
            searchISBNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchISBNPanelLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(searchISBNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchISBNPanelLayout.createSequentialGroup()
                        .addComponent(isbnLabel)
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchISBNPanelLayout.createSequentialGroup()
                        .addComponent(search2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearISBN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backISBN)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchISBNPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        searchISBNPanelLayout.setVerticalGroup(
            searchISBNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchISBNPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(isbnLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(searchISBNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearISBN)
                    .addComponent(backISBN)
                    .addComponent(search2))
                .addContainerGap(474, Short.MAX_VALUE))
        );

        lookUpPanel.add(searchISBNPanel, "card2");

        addCheckOutPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchMember.setBackground(new java.awt.Color(255, 204, 255));
        searchMember.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        searchMember.setForeground(new java.awt.Color(0, 102, 255));
        searchMember.setText("Add");
        searchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMemberActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(memberID);

        memeberID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        memeberID.setText("Enter Member ID");

        backSearchMember.setBackground(new java.awt.Color(255, 204, 255));
        backSearchMember.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        backSearchMember.setForeground(new java.awt.Color(0, 102, 255));
        backSearchMember.setText("Back");
        backSearchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSearchMemberActionPerformed(evt);
            }
        });

        clearSearchMember.setBackground(new java.awt.Color(255, 204, 255));
        clearSearchMember.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        clearSearchMember.setForeground(new java.awt.Color(0, 102, 255));
        clearSearchMember.setText("Clear");
        clearSearchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSearchMemberActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(isbnID3);

        jScrollPane5.setViewportView(copyId3);

        memeberID1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        memeberID1.setText("ISBN");

        memeberID2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        memeberID2.setText("Copy ID");

        javax.swing.GroupLayout addCheckOutPanelLayout = new javax.swing.GroupLayout(addCheckOutPanel);
        addCheckOutPanel.setLayout(addCheckOutPanelLayout);
        addCheckOutPanelLayout.setHorizontalGroup(
            addCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCheckOutPanelLayout.createSequentialGroup()
                .addGroup(addCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCheckOutPanelLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(memeberID))
                    .addGroup(addCheckOutPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(addCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addCheckOutPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(searchMember)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearSearchMember)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backSearchMember))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addCheckOutPanelLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(memeberID1)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCheckOutPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(memeberID2)
                .addGap(272, 272, 272))
        );
        addCheckOutPanelLayout.setVerticalGroup(
            addCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCheckOutPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(memeberID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(memeberID1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(memeberID2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(addCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchMember)
                    .addComponent(clearSearchMember)
                    .addComponent(backSearchMember))
                .addContainerGap(343, Short.MAX_VALUE))
        );

        lookUpPanel.add(addCheckOutPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(librarianPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lookUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lookUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(librarianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enterISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterISBNActionPerformed
        swapPanels(searchISBNPanel); 
    }//GEN-LAST:event_enterISBNActionPerformed

    private void enterMemberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterMemberIDActionPerformed
        swapPanels(addCheckOutPanel);       
    }//GEN-LAST:event_enterMemberIDActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        LoginFrame a = new LoginFrame();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void clearISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearISBNActionPerformed
        isbn.setText("");
    }//GEN-LAST:event_clearISBNActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        // TODO add your handling code here:
        SystemController controller = new SystemController();
        String isbn12 = isbn.getText();
        try{
           String s = controller.bookLookUp(isbn12);
           displayISBN23.setText(s);
           swapPanels(displayISBN22);           
        }catch(InvalidArgumentException e){            
             JOptionPane.showMessageDialog(informationFrame,e.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);
        } catch (BookException ex) {
            JOptionPane.showMessageDialog(informationFrame,ex.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);
        }   
        
    }//GEN-LAST:event_search2ActionPerformed

    private void backISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backISBNActionPerformed
        swapPanels(defaultNew); 
    }//GEN-LAST:event_backISBNActionPerformed

    private void searchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMemberActionPerformed
        SystemController controller = new SystemController();
        String currId = memberID.getText().toString();
        
        String isbnID33 = isbnID3.getText();
        String copyId33 = copyId3.getText();
        if(isbnID33.isEmpty() || copyId33.isEmpty()){
            JOptionPane.showMessageDialog(informationFrame,"Enter all Fields","Error !!!",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
            	controller.addCheckOutRecord(currId, isbnID33, copyId33);
            	JOptionPane.showMessageDialog(informationFrame,"Member Checkout Record Added","Information",JOptionPane.INFORMATION_MESSAGE);
  
         }catch (MemberException e){
             JOptionPane.showMessageDialog(informationFrame,e.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);

         }  catch (InvalidArgumentException ex) {
                 JFrame frame = new JFrame();
                 JOptionPane.showMessageDialog(frame,ex.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);

            } catch (Exception ex1) {
                JOptionPane.showMessageDialog(informationFrame,ex1.getMessage(),"Information",JOptionPane.INFORMATION_MESSAGE);

            }finally {
            memberID.setText("");
            isbnID3.setText("");
            copyId3.setText("");
         } 
        }       
        
    }//GEN-LAST:event_searchMemberActionPerformed

    private void backSearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSearchMemberActionPerformed
        memberID.setText("");
        swapPanels(defaultNew); 
    }//GEN-LAST:event_backSearchMemberActionPerformed

    private void clearSearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSearchMemberActionPerformed
        memberID.setText("");
        isbnID3.setText("");
        copyId3.setText("");
    }//GEN-LAST:event_clearSearchMemberActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianFrame().setVisible(true);
            }
        });
    }
    
    public void swapPanels(javax.swing.JPanel s){
        lookUpPanel.removeAll();
        lookUpPanel.repaint();
        lookUpPanel.revalidate();
        
        //Adding Panels
        lookUpPanel.add(s);
        lookUpPanel.repaint();
        lookUpPanel.revalidate();
    }
    
     JFrame informationFrame = new JFrame();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addCheckOutPanel;
    private javax.swing.JButton backISBN;
    private javax.swing.JButton backSearchMember;
    private javax.swing.JButton clearISBN;
    private javax.swing.JButton clearSearchMember;
    private javax.swing.JTextPane copyId3;
    private javax.swing.JPanel defaultNew;
    private javax.swing.JPanel displayISBN22;
    private javax.swing.JTextArea displayISBN23;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JButton enterISBN;
    private javax.swing.JButton enterMemberID;
    private javax.swing.JTextPane isbn;
    private javax.swing.JTextPane isbnID3;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel librarianMiniPane;
    private javax.swing.JPanel librarianPanel;
    private javax.swing.JButton logout;
    private javax.swing.JPanel lookUpPanel;
    private javax.swing.JTextPane memberID;
    private javax.swing.JLabel memeberID;
    private javax.swing.JLabel memeberID1;
    private javax.swing.JLabel memeberID2;
    private javax.swing.JButton search2;
    private javax.swing.JPanel searchISBNPanel;
    private javax.swing.JButton searchMember;
    // End of variables declaration//GEN-END:variables
}
