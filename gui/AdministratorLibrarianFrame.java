
package gui;

import business.Address;
import business.Author;
import business.LibraryMember;
import business.SystemController;
import exception.BookException;
import exception.InvalidArgumentException;
import exception.MemberException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdministratorLibrarianFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 6131109877477077224L;
	public AdministratorLibrarianFrame() {
        initComponents();
    }
  
    private void initComponents() {

        mainAdminPanel = new javax.swing.JPanel();
        adminMinPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addNewBook = new javax.swing.JButton();
        editLibMember = new javax.swing.JButton();
        newLibMember = new javax.swing.JButton();
        addBookCopy = new javax.swing.JButton();
        searchISBN = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        enterMemberID = new javax.swing.JButton();
        lookUpPanel = new javax.swing.JPanel();
        defaultPanel1 = new javax.swing.JPanel();
        defaultPanel = new javax.swing.JPanel();
        searchISBNPanel = new javax.swing.JPanel();
        isbnLabel = new javax.swing.JLabel();
        clearISBN = new javax.swing.JButton();
        isbnPane = new javax.swing.JScrollPane();
        isbn = new javax.swing.JTextPane();
        search2 = new javax.swing.JButton();
        backISBN = new javax.swing.JButton();
        isbnPanelDisplay = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTextArea();
        libMemberPanel = new javax.swing.JPanel();
        memberFormLabel = new javax.swing.JLabel();
        memberIDLabel = new javax.swing.JLabel();
        streetLabel = new javax.swing.JLabel();
        fNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        zipLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        memeberID1 = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        fName = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        street = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        zip = new javax.swing.JTextField();
        saveMember = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        editMemberPanel = new javax.swing.JPanel();
        memberFormLabel1 = new javax.swing.JLabel();
        memberIDLabel1 = new javax.swing.JLabel();
        streetLabel1 = new javax.swing.JLabel();
        fNameLabel1 = new javax.swing.JLabel();
        lastNameLabel1 = new javax.swing.JLabel();
        zipLabel1 = new javax.swing.JLabel();
        phoneLabel1 = new javax.swing.JLabel();
        stateLabel1 = new javax.swing.JLabel();
        cityLabel1 = new javax.swing.JLabel();
        memeberID22 = new javax.swing.JTextField();
        lName22 = new javax.swing.JTextField();
        fName22 = new javax.swing.JTextField();
        state22 = new javax.swing.JTextField();
        city22 = new javax.swing.JTextField();
        street22 = new javax.swing.JTextField();
        phoneNumber22 = new javax.swing.JTextField();
        zip22 = new javax.swing.JTextField();
        saveMember1 = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        searchLibraryMemberPanel = new javax.swing.JPanel();
        searchMember = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        memberID = new javax.swing.JTextPane();
        memeberID = new javax.swing.JLabel();
        backSearchMember = new javax.swing.JButton();
        clearSearchMember = new javax.swing.JButton();
        bookPanel = new javax.swing.JPanel();
        addBookTitleLabel = new javax.swing.JLabel();
        isbnLabel2 = new javax.swing.JLabel();
        numCopiesLabel = new javax.swing.JLabel();
        authorsLabel = new javax.swing.JLabel();
        bookTittleLabel = new javax.swing.JLabel();
        bookTittle = new javax.swing.JTextField();
        isbn2 = new javax.swing.JTextField();
        bookID = new javax.swing.JTextField();
        checkOutLen = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit3 = new javax.swing.JButton();
        authorLastName = new javax.swing.JTextField();
        authorFirstName = new javax.swing.JTextField();
        authorStreet = new javax.swing.JTextField();
        authorCity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        authorBio = new javax.swing.JTextArea();
        authorState = new javax.swing.JTextField();
        authorPhoneNumber = new javax.swing.JTextField();
        authorZip = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        authorCredential = new javax.swing.JTextField();
        addBookCopyPanel = new javax.swing.JPanel();
        isbnLabel1 = new javax.swing.JLabel();
        clearISBN1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        copyIsbn = new javax.swing.JTextPane();
        addCopy = new javax.swing.JButton();
        backISBN1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        copyID = new javax.swing.JTextPane();
        bookCopyIDLabel = new javax.swing.JLabel();
        addCheckOutPanel = new javax.swing.JPanel();
        searchMember1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        memberID1 = new javax.swing.JTextPane();
        memeberID2 = new javax.swing.JLabel();
        backSearchMember1 = new javax.swing.JButton();
        clearSearchMember1 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        isbnID3 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        copyId3 = new javax.swing.JTextPane();
        memeberID3 = new javax.swing.JLabel();
        memeberID4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainAdminPanel.setBackground(new java.awt.Color(255, 255, 255));

        adminMinPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout adminMinPanelLayout = new javax.swing.GroupLayout(adminMinPanel);
        adminMinPanel.setLayout(adminMinPanelLayout);
        adminMinPanelLayout.setHorizontalGroup(
            adminMinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );
        adminMinPanelLayout.setVerticalGroup(
            adminMinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Logged in as an Administrator and Librarian");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        addNewBook.setBackground(new java.awt.Color(255, 204, 204));
        addNewBook.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        addNewBook.setText("Add New Book");
        addNewBook.setMaximumSize(new java.awt.Dimension(147, 31));
        addNewBook.setMinimumSize(new java.awt.Dimension(147, 31));
        addNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewBookActionPerformed(evt);
            }
        });

        editLibMember.setBackground(new java.awt.Color(255, 204, 204));
        editLibMember.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        editLibMember.setText("Edit Library Member Details");
        editLibMember.setMaximumSize(new java.awt.Dimension(147, 31));
        editLibMember.setMinimumSize(new java.awt.Dimension(147, 31));
        editLibMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLibMemberActionPerformed(evt);
            }
        });

        newLibMember.setBackground(new java.awt.Color(255, 204, 204));
        newLibMember.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        newLibMember.setText("Create New Library Member");
        newLibMember.setMaximumSize(new java.awt.Dimension(147, 31));
        newLibMember.setMinimumSize(new java.awt.Dimension(147, 31));
        newLibMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLibMemberActionPerformed(evt);
            }
        });

        addBookCopy.setBackground(new java.awt.Color(255, 204, 204));
        addBookCopy.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        addBookCopy.setText("Add Book Copy");
        addBookCopy.setMaximumSize(new java.awt.Dimension(147, 31));
        addBookCopy.setMinimumSize(new java.awt.Dimension(147, 31));
        addBookCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookCopyActionPerformed(evt);
            }
        });

        searchISBN.setBackground(new java.awt.Color(255, 204, 204));
        searchISBN.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        searchISBN.setText("Search ISBN");
        searchISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchISBNActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 204, 204));
        logout.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        enterMemberID.setBackground(new java.awt.Color(255, 204, 204));
        enterMemberID.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        enterMemberID.setText("Add Member Checkout");
        enterMemberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterMemberIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(logout)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterMemberID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newLibMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editLibMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addNewBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBookCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchISBN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(searchISBN)
                .addGap(18, 18, 18)
                .addComponent(addNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(addBookCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(newLibMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(editLibMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(enterMemberID)
                .addGap(62, 62, 62)
                .addComponent(logout)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout mainAdminPanelLayout = new javax.swing.GroupLayout(mainAdminPanel);
        mainAdminPanel.setLayout(mainAdminPanelLayout);
        mainAdminPanelLayout.setHorizontalGroup(
            mainAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainAdminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminMinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(mainAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainAdminPanelLayout.setVerticalGroup(
            mainAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(adminMinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        lookUpPanel.setBackground(new java.awt.Color(255, 255, 255));
        lookUpPanel.setLayout(new java.awt.CardLayout());

        defaultPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout defaultPanel1Layout = new javax.swing.GroupLayout(defaultPanel1);
        defaultPanel1.setLayout(defaultPanel1Layout);
        defaultPanel1Layout.setHorizontalGroup(
            defaultPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );
        defaultPanel1Layout.setVerticalGroup(
            defaultPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        lookUpPanel.add(defaultPanel1, "card7");

        defaultPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout defaultPanelLayout = new javax.swing.GroupLayout(defaultPanel);
        defaultPanel.setLayout(defaultPanelLayout);
        defaultPanelLayout.setHorizontalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );
        defaultPanelLayout.setVerticalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        lookUpPanel.add(defaultPanel, "card6");

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

        isbnPane.setViewportView(isbn);

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
                .addGap(169, 169, 169)
                .addComponent(isbnPane, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchISBNPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(172, 172, 172))))
        );
        searchISBNPanelLayout.setVerticalGroup(
            searchISBNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchISBNPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(isbnLabel)
                .addGap(18, 18, 18)
                .addComponent(isbnPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(searchISBNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearISBN)
                    .addComponent(backISBN)
                    .addComponent(search2))
                .addContainerGap(494, Short.MAX_VALUE))
        );

        lookUpPanel.add(searchISBNPanel, "card2");

        isbnPanelDisplay.setBackground(new java.awt.Color(255, 255, 255));

        Display.setColumns(20);
        Display.setRows(5);
        jScrollPane1.setViewportView(Display);

        javax.swing.GroupLayout isbnPanelDisplayLayout = new javax.swing.GroupLayout(isbnPanelDisplay);
        isbnPanelDisplay.setLayout(isbnPanelDisplayLayout);
        isbnPanelDisplayLayout.setHorizontalGroup(
            isbnPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isbnPanelDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
        );
        isbnPanelDisplayLayout.setVerticalGroup(
            isbnPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isbnPanelDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
        );

        lookUpPanel.add(isbnPanelDisplay, "card10");

        libMemberPanel.setBackground(new java.awt.Color(255, 255, 255));

        memberFormLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        memberFormLabel.setForeground(new java.awt.Color(255, 0, 0));
        memberFormLabel.setText("Enter Library Member Details");

        memberIDLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        memberIDLabel.setText("Member ID");

        streetLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        streetLabel.setText("Street");

        fNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fNameLabel.setText("First Name");

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lastNameLabel.setText("Last Name");

        zipLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zipLabel.setText("zip");

        phoneLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneLabel.setText("Telephone Number");

        stateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        stateLabel.setText("State");

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cityLabel.setText("City");

        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        saveMember.setBackground(new java.awt.Color(204, 255, 204));
        saveMember.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        saveMember.setForeground(new java.awt.Color(51, 51, 255));
        saveMember.setText("Save");
        saveMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMemberActionPerformed(evt);
            }
        });

        clear1.setBackground(new java.awt.Color(204, 255, 204));
        clear1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        clear1.setForeground(new java.awt.Color(51, 0, 255));
        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(204, 255, 204));
        back.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(0, 51, 204));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout libMemberPanelLayout = new javax.swing.GroupLayout(libMemberPanel);
        libMemberPanel.setLayout(libMemberPanelLayout);
        libMemberPanelLayout.setHorizontalGroup(
            libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libMemberPanelLayout.createSequentialGroup()
                .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(libMemberPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(libMemberPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(memberFormLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(libMemberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(libMemberPanelLayout.createSequentialGroup()
                        .addComponent(streetLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cityLabel)
                        .addGap(183, 183, 183)
                        .addComponent(stateLabel)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, libMemberPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, libMemberPanelLayout.createSequentialGroup()
                                .addComponent(zipLabel)
                                .addGap(164, 164, 164)
                                .addComponent(phoneLabel)
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, libMemberPanelLayout.createSequentialGroup()
                                .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, libMemberPanelLayout.createSequentialGroup()
                                .addComponent(saveMember)
                                .addGap(66, 66, 66)
                                .addComponent(clear1)
                                .addGap(70, 70, 70)
                                .addComponent(back)
                                .addGap(111, 111, 111))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, libMemberPanelLayout.createSequentialGroup()
                        .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(memeberID1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memberIDLabel))
                        .addGap(30, 30, 30)
                        .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameLabel))
                        .addGap(29, 29, 29)
                        .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        libMemberPanelLayout.setVerticalGroup(
            libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libMemberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(memberFormLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberIDLabel)
                    .addComponent(fNameLabel)
                    .addComponent(lastNameLabel))
                .addGap(18, 18, 18)
                .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memeberID1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLabel)
                    .addComponent(cityLabel)
                    .addComponent(stateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipLabel)
                    .addComponent(phoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(libMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveMember)
                    .addComponent(clear1)
                    .addComponent(back))
                .addContainerGap(311, Short.MAX_VALUE))
        );

        lookUpPanel.add(libMemberPanel, "card9");

        editMemberPanel.setBackground(new java.awt.Color(255, 255, 255));

        memberFormLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        memberFormLabel1.setForeground(new java.awt.Color(255, 0, 0));
        memberFormLabel1.setText("Enter Library Member Details");

        memberIDLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        memberIDLabel1.setText("Member ID");

        streetLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        streetLabel1.setText("Street");

        fNameLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fNameLabel1.setText("First Name");

        lastNameLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lastNameLabel1.setText("Last Name");

        zipLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zipLabel1.setText("zip");

        phoneLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneLabel1.setText("Telephone Number");

        stateLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        stateLabel1.setText("State");

        cityLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cityLabel1.setText("City");

        fName22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fName22ActionPerformed(evt);
            }
        });

        saveMember1.setBackground(new java.awt.Color(204, 255, 204));
        saveMember1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        saveMember1.setForeground(new java.awt.Color(51, 51, 255));
        saveMember1.setText("Save");
        saveMember1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMember1ActionPerformed(evt);
            }
        });

        back1.setBackground(new java.awt.Color(204, 255, 204));
        back1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        back1.setForeground(new java.awt.Color(0, 51, 204));
        back1.setText("Back");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editMemberPanelLayout = new javax.swing.GroupLayout(editMemberPanel);
        editMemberPanel.setLayout(editMemberPanelLayout);
        editMemberPanelLayout.setHorizontalGroup(
            editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editMemberPanelLayout.createSequentialGroup()
                .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editMemberPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(street22, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(city22, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(state22, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editMemberPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(memberFormLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(editMemberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editMemberPanelLayout.createSequentialGroup()
                        .addComponent(streetLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cityLabel1)
                        .addGap(183, 183, 183)
                        .addComponent(stateLabel1)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editMemberPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editMemberPanelLayout.createSequentialGroup()
                                .addComponent(zipLabel1)
                                .addGap(164, 164, 164)
                                .addComponent(phoneLabel1)
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editMemberPanelLayout.createSequentialGroup()
                                .addComponent(zip22, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(phoneNumber22, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editMemberPanelLayout.createSequentialGroup()
                                .addComponent(saveMember1)
                                .addGap(231, 231, 231)
                                .addComponent(back1)
                                .addGap(111, 111, 111))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editMemberPanelLayout.createSequentialGroup()
                        .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(memeberID22, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memberIDLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fName22, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lName22, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        editMemberPanelLayout.setVerticalGroup(
            editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editMemberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(memberFormLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberIDLabel1)
                    .addComponent(fNameLabel1)
                    .addComponent(lastNameLabel1))
                .addGap(18, 18, 18)
                .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memeberID22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lName22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fName22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLabel1)
                    .addComponent(cityLabel1)
                    .addComponent(stateLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(state22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipLabel1)
                    .addComponent(phoneLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zip22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(editMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveMember1)
                    .addComponent(back1))
                .addContainerGap(311, Short.MAX_VALUE))
        );

        lookUpPanel.add(editMemberPanel, "card9");

        searchLibraryMemberPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchMember.setBackground(new java.awt.Color(255, 204, 255));
        searchMember.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        searchMember.setForeground(new java.awt.Color(0, 102, 255));
        searchMember.setText("Search");
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

        javax.swing.GroupLayout searchLibraryMemberPanelLayout = new javax.swing.GroupLayout(searchLibraryMemberPanel);
        searchLibraryMemberPanel.setLayout(searchLibraryMemberPanelLayout);
        searchLibraryMemberPanelLayout.setHorizontalGroup(
            searchLibraryMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLibraryMemberPanelLayout.createSequentialGroup()
                .addGroup(searchLibraryMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLibraryMemberPanelLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(memeberID))
                    .addGroup(searchLibraryMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, searchLibraryMemberPanelLayout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(searchMember)
                            .addGap(30, 30, 30)
                            .addComponent(clearSearchMember)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backSearchMember))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, searchLibraryMemberPanelLayout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        searchLibraryMemberPanelLayout.setVerticalGroup(
            searchLibraryMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchLibraryMemberPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(memeberID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(searchLibraryMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchMember)
                    .addComponent(backSearchMember)
                    .addComponent(clearSearchMember))
                .addContainerGap(536, Short.MAX_VALUE))
        );

        lookUpPanel.add(searchLibraryMemberPanel, "card3");

        bookPanel.setBackground(new java.awt.Color(255, 255, 255));
        bookPanel.setBorder(new javax.swing.border.MatteBorder(null));

        addBookTitleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        addBookTitleLabel.setForeground(new java.awt.Color(255, 0, 0));
        addBookTitleLabel.setText("Add Book Details");

        isbnLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        isbnLabel2.setText("ISBN");

        numCopiesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numCopiesLabel.setText("Book ID");

        authorsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        authorsLabel.setText("Author Details");

        bookTittleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookTittleLabel.setText("Tittle");

        checkOutLen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkOutLen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Checkout Period", "21 Days", "7 days" }));
        checkOutLen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutLenActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(255, 204, 204));
        save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        save.setForeground(new java.awt.Color(0, 0, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 204, 204));
        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit3.setBackground(new java.awt.Color(255, 204, 204));
        exit3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit3.setForeground(new java.awt.Color(0, 0, 255));
        exit3.setText("Back");
        exit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit3ActionPerformed(evt);
            }
        });

        authorLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorLastNameActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Zip");

        jLabel5.setText("Street");

        jLabel6.setText("City");

        jLabel7.setText("State");

        jLabel8.setText("Phone Number");

        authorBio.setColumns(20);
        authorBio.setRows(5);
        jScrollPane4.setViewportView(authorBio);

        jLabel9.setText("Bio");

        jLabel10.setText("Credential");

        javax.swing.GroupLayout bookPanelLayout = new javax.swing.GroupLayout(bookPanel);
        bookPanel.setLayout(bookPanelLayout);
        bookPanelLayout.setHorizontalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bookPanelLayout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(addBookTitleLabel))
                            .addComponent(isbnLabel2)
                            .addGroup(bookPanelLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addComponent(save)
                                        .addGap(51, 51, 51)
                                        .addComponent(clear)
                                        .addGap(49, 49, 49)
                                        .addComponent(exit3))
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addGap(279, 279, 279)
                                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(authorZip, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(authorPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(authorState, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(authorCity, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(authorStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(authorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bookPanelLayout.createSequentialGroup()
                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bookTittleLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(bookTittle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(numCopiesLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(isbn2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bookID, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(31, 31, 31)))
                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel3))
                                            .addComponent(jLabel2))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(authorsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(201, 201, 201))))
                            .addGroup(bookPanelLayout.createSequentialGroup()
                                .addComponent(checkOutLen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(bookPanelLayout.createSequentialGroup()
                                            .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(authorFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                                .addComponent(authorCredential, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                                .addComponent(jScrollPane4)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(252, 252, 252)))
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(296, 296, 296))
                                    .addGroup(bookPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(15, 15, 15)))))
                        .addGap(37, 37, 37))))
        );
        bookPanelLayout.setVerticalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(addBookTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addComponent(isbnLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isbn2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addComponent(authorsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(authorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addComponent(numCopiesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))))
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addComponent(authorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(authorStreet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(authorState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookTittleLabel)
                            .addComponent(jLabel6)
                            .addComponent(authorCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addComponent(checkOutLen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(authorZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorCredential, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(31, 31, 31)))
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)))
                .addGap(39, 39, 39)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(clear)
                    .addComponent(exit3))
                .addContainerGap())
        );

        lookUpPanel.add(bookPanel, "card6");

        addBookCopyPanel.setBackground(new java.awt.Color(255, 255, 255));

        isbnLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        isbnLabel1.setText("Enter ISBN");

        clearISBN1.setBackground(new java.awt.Color(255, 204, 255));
        clearISBN1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        clearISBN1.setForeground(new java.awt.Color(0, 102, 255));
        clearISBN1.setText("Clear");
        clearISBN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearISBN1ActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(copyIsbn);

        addCopy.setBackground(new java.awt.Color(255, 204, 255));
        addCopy.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        addCopy.setForeground(new java.awt.Color(0, 102, 255));
        addCopy.setText("Add");
        addCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCopyActionPerformed(evt);
            }
        });

        backISBN1.setBackground(new java.awt.Color(255, 204, 255));
        backISBN1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        backISBN1.setForeground(new java.awt.Color(0, 102, 255));
        backISBN1.setText("Back");
        backISBN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backISBN1ActionPerformed(evt);
            }
        });

        jScrollPane6.setViewportView(copyID);

        bookCopyIDLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookCopyIDLabel.setText("Book ID");

        javax.swing.GroupLayout addBookCopyPanelLayout = new javax.swing.GroupLayout(addBookCopyPanel);
        addBookCopyPanel.setLayout(addBookCopyPanelLayout);
        addBookCopyPanelLayout.setHorizontalGroup(
            addBookCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookCopyPanelLayout.createSequentialGroup()
                .addGroup(addBookCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBookCopyPanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(addBookCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addBookCopyPanelLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(addCopy)
                        .addGap(31, 31, 31)
                        .addComponent(clearISBN1)
                        .addGap(39, 39, 39)
                        .addComponent(backISBN1)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookCopyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addBookCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookCopyPanelLayout.createSequentialGroup()
                        .addComponent(isbnLabel1)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookCopyPanelLayout.createSequentialGroup()
                        .addComponent(bookCopyIDLabel)
                        .addGap(248, 248, 248))))
        );
        addBookCopyPanelLayout.setVerticalGroup(
            addBookCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookCopyPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(isbnLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(bookCopyIDLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(addBookCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCopy)
                    .addComponent(clearISBN1)
                    .addComponent(backISBN1))
                .addContainerGap(394, Short.MAX_VALUE))
        );

        lookUpPanel.add(addBookCopyPanel, "card2");

        addCheckOutPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchMember1.setBackground(new java.awt.Color(255, 204, 255));
        searchMember1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        searchMember1.setForeground(new java.awt.Color(0, 102, 255));
        searchMember1.setText("Add");
        searchMember1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMember1ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(memberID1);

        memeberID2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        memeberID2.setText("Enter Member ID");

        backSearchMember1.setBackground(new java.awt.Color(255, 204, 255));
        backSearchMember1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        backSearchMember1.setForeground(new java.awt.Color(0, 102, 255));
        backSearchMember1.setText("Back");
        backSearchMember1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSearchMember1ActionPerformed(evt);
            }
        });

        clearSearchMember1.setBackground(new java.awt.Color(255, 204, 255));
        clearSearchMember1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        clearSearchMember1.setForeground(new java.awt.Color(0, 102, 255));
        clearSearchMember1.setText("Clear");
        clearSearchMember1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSearchMember1ActionPerformed(evt);
            }
        });

        jScrollPane7.setViewportView(isbnID3);

        jScrollPane8.setViewportView(copyId3);

        memeberID3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        memeberID3.setText("ISBN");

        memeberID4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        memeberID4.setText("Copy ID");

        javax.swing.GroupLayout addCheckOutPanelLayout = new javax.swing.GroupLayout(addCheckOutPanel);
        addCheckOutPanel.setLayout(addCheckOutPanelLayout);
        addCheckOutPanelLayout.setHorizontalGroup(
            addCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCheckOutPanelLayout.createSequentialGroup()
                .addGroup(addCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCheckOutPanelLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(memeberID2))
                    .addGroup(addCheckOutPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(addCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addCheckOutPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(searchMember1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearSearchMember1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backSearchMember1))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addCheckOutPanelLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(memeberID3))
                    .addGroup(addCheckOutPanelLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(memeberID4)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        addCheckOutPanelLayout.setVerticalGroup(
            addCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCheckOutPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(memeberID2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(memeberID3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(memeberID4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(addCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchMember1)
                    .addComponent(clearSearchMember1)
                    .addComponent(backSearchMember1))
                .addContainerGap(363, Short.MAX_VALUE))
        );

        lookUpPanel.add(addCheckOutPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(mainAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lookUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mainAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lookUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchISBNActionPerformed
        swapPanels(searchISBNPanel);
    }//GEN-LAST:event_searchISBNActionPerformed

    private void addNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBookActionPerformed
        swapPanels(bookPanel);
    }//GEN-LAST:event_addNewBookActionPerformed

    private void addBookCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookCopyActionPerformed
         swapPanels(addBookCopyPanel);
    }//GEN-LAST:event_addBookCopyActionPerformed

    private void newLibMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLibMemberActionPerformed
        swapPanels(libMemberPanel);
    }//GEN-LAST:event_newLibMemberActionPerformed

    private void editLibMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLibMemberActionPerformed
        swapPanels(searchLibraryMemberPanel);
    }//GEN-LAST:event_editLibMemberActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        LoginFrame a = new LoginFrame();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void clearISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearISBNActionPerformed
        isbn.setText("");
    }//GEN-LAST:event_clearISBNActionPerformed

    private void searchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMemberActionPerformed
       SystemController controller = new SystemController();
       String currId = memberID.getText().toString();
        System.out.println("Passed ID : "+currId);
        try{             
            LibraryMember a = controller.editLibMember(currId);            
            Address b = a.getAddress();
            swapPanels(editMemberPanel);

            fName22.setText(a.getFirstName());
            lName22.setText(a.getLastName());
            phoneNumber22.setText(a.getPhone());
            memeberID22.setText(currId);
            street22.setText(b.getStreet());
            state22.setText(b.getState());
            zip22.setText(b.getZipCode());
            city22.setText(b.getCity());            

        }catch (MemberException e){
             JOptionPane.showMessageDialog(informationFrame,e.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);         
        }finally {
            memberID.setText("");                      
        }       
        
    }//GEN-LAST:event_searchMemberActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        
    }//GEN-LAST:event_fNameActionPerformed

    private void saveMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMemberActionPerformed
       SystemController controller = new SystemController();
       String firstName = fName.getText();
       String lastName = lName.getText();
       String phone = phoneNumber.getText();
       String memberID12 = memeberID1.getText();
       String  street1 = street.getText();
       String city1 = city.getText();
       String state1 = state.getText();
       String zip1 = zip.getText();          
       
        if(street1.equals("") || city1.equals("") || firstName.equals("") || lastName.equals("") || phone.equals("") || memberID12.equals("") || state1.equals("") || zip1.equals("")){
            JFrame a = new JFrame();
            JOptionPane.showMessageDialog(a, "All fields must be filled", "Error !!!!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
             try{
                 if(controller.addLibMember(firstName,lastName, phone, memberID12, street1, city1, state1, zip1)){
                    memeberID1.setText("");
                    phoneNumber.setText("");
                    state.setText("");
                    street.setText("");
                    city.setText("");
                    zip.setText("");
                    lName.setText("");
                    fName.setText(""); 
                    JOptionPane.showMessageDialog(informationFrame,"Member Added","Information",JOptionPane.INFORMATION_MESSAGE);
                 }
      
            }catch (MemberException e){
                JOptionPane.showMessageDialog(informationFrame,e.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);
            }          
        }       
    }//GEN-LAST:event_saveMemberActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        // TODO add your handling code here:
        memeberID1.setText("");
        phoneNumber.setText("");
        state.setText("");
        street.setText("");
        city.setText("");
        zip.setText("");
        lName.setText("");
        fName.setText("");
    }//GEN-LAST:event_clear1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        swapPanels(defaultPanel);
    }//GEN-LAST:event_backActionPerformed
    int maxDays =0;
    private void checkOutLenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutLenActionPerformed
        switch (checkOutLen.getSelectedIndex()) {
            case 1:
                maxDays = 21;
                break;
            case 2:
                maxDays = 7;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_checkOutLenActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        String isbn3 = isbn2.getText();
        String bookID1 = bookID.getText();
        String bookTittle1 = bookTittle.getText();
        String authorFirstName1 = authorFirstName.getText();
        String authorLastName1 = authorLastName.getText();
        String authorStreet1 = authorStreet.getText();
        String authorState1 = authorState.getText();
        String authorCity1 = authorCity.getText();
        String authorZip1 = authorZip.getText();
        String authorCredential1 = authorCredential.getText();
        String authorBio1 = authorBio.getText();   
        String authorPhoneNumber1 = authorPhoneNumber.getText(); 
        
        SystemController controller = new SystemController();
        if(isbn3.isEmpty() || bookID1.isEmpty() || bookTittle1.isEmpty()|| authorPhoneNumber1.isEmpty()
                || authorFirstName1.isEmpty() || authorLastName1.isEmpty() || authorStreet1.isEmpty()|| authorState1.isEmpty()
                || authorCity1.isEmpty()|| authorZip1.isEmpty()|| authorCredential1.isEmpty()|| authorBio1.isEmpty()){

                 JOptionPane.showMessageDialog(informationFrame,"Enter all fields","Error !!!",JOptionPane.ERROR_MESSAGE);
                 swapPanels(bookPanel);
        }
        else{
            Author a = new Author(authorFirstName1, authorLastName1, authorPhoneNumber1, authorCredential1, authorBio1);
            try{            
                if(maxDays==0) {
                    maxDays = 21;
                    JOptionPane.showMessageDialog(informationFrame,"Maximum checkout Length set to 21 days by default","Information",JOptionPane.INFORMATION_MESSAGE);
                 }
                controller.addBook(isbn3, bookTittle1, maxDays, a);
                JOptionPane.showMessageDialog(informationFrame,"Book Added","Information",JOptionPane.INFORMATION_MESSAGE);
                clearFileds();
            }catch (BookException e){
                 JFrame frame = new JFrame();
                 JOptionPane.showMessageDialog(frame,e.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);
            } catch (InvalidArgumentException ex) {
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,ex.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(AdministratorLibrarianFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_saveActionPerformed

    public void clearFileds(){
        isbn.setText("");
        bookTittle.setText("");      
        bookID.setText("");
        checkOutLen.setSelectedIndex(0);
        isbn2.setText("");
        bookID.setText("");
        bookTittle.setText("");
        authorFirstName.setText("");
        authorLastName.setText("");
        authorStreet.setText("");
        authorState.setText("");
        authorCity.setText("");
        authorZip.setText("");
        authorCredential.setText("");
        authorBio.setText("");   
        authorPhoneNumber.setText("");
    }
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clearFileds();         
    }//GEN-LAST:event_clearActionPerformed

    private void exit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit3ActionPerformed
        swapPanels(defaultPanel);
    }//GEN-LAST:event_exit3ActionPerformed

    private void backSearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSearchMemberActionPerformed
        memberID.setText("");
        swapPanels(defaultPanel); 
    }//GEN-LAST:event_backSearchMemberActionPerformed

    private void clearSearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSearchMemberActionPerformed
        memberID.setText("");        
    }//GEN-LAST:event_clearSearchMemberActionPerformed

    private void fName22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fName22ActionPerformed
       
    }//GEN-LAST:event_fName22ActionPerformed

    private void saveMember1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMember1ActionPerformed
        
        SystemController controller = new SystemController();
       String firstName = fName22.getText();
       String lastName = lName22.getText();
       String phone = phoneNumber22.getText();
       String memberID1 = memeberID22.getText();
       String  street1 = street22.getText();
       String city1 = city22.getText();
       String state1 = state22.getText();
       String zip1 = zip22.getText();          
       
        if(street1.equals("") || city1.equals("") || firstName.equals("") || lastName.equals("") || phone.equals("") || memberID1.equals("") || state1.equals("") || zip1.equals("")){
            JOptionPane.showMessageDialog(informationFrame, "All fields must be filled", "Error !!!!", JOptionPane.ERROR_MESSAGE);
        }
        else{            
             try{
                 if(controller.addLibMember(firstName,lastName, phone, memberID1, street1, city1, state1, zip1)){
                    memeberID22.setText("");
                    phoneNumber22.setText("");
                    state22.setText("");
                    street22.setText("");
                    city22.setText("");
                    zip22.setText("");
                    lName22.setText("");
                    fName22.setText(""); 
                    JOptionPane.showMessageDialog(informationFrame,"Member Updated","Information",JOptionPane.INFORMATION_MESSAGE);
                 }
      
            }catch (MemberException e){
                JOptionPane.showMessageDialog(informationFrame,e.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);
            } finally{
                 swapPanels(searchLibraryMemberPanel);
             }             
        }           

    }//GEN-LAST:event_saveMember1ActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // TODO add your handling code here:
        SystemController controller = new SystemController();
       String firstName = fName22.getText();
       String lastName = lName22.getText();
       String phone = phoneNumber22.getText();
       String memberID12 = memeberID22.getText();
       String  street1 = street22.getText();
       String city1 = city22.getText();
       String state1 = state22.getText();
       String zip1 = zip22.getText();          

             try{
                 if(controller.addLibMember(firstName,lastName, phone, memberID12, street1, city1, state1, zip1)){
                    memeberID22.setText("");
                    phoneNumber22.setText("");
                    state22.setText("");
                    street22.setText("");
                    city22.setText("");
                    zip22.setText("");
                    lName22.setText("");
                    fName22.setText(""); 
                }      
            }catch (MemberException e){
                JOptionPane.showMessageDialog(informationFrame,e.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);
            } finally{
                 swapPanels(searchLibraryMemberPanel);
             }             
                  
    }//GEN-LAST:event_back1ActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        // TODO add your handling code here:
       SystemController controller = new SystemController();
        String isbn12 = isbn.getText();
        try{
           String s = controller.bookLookUp(isbn12);
           Display.setText(s);
            swapPanels(isbnPanelDisplay);
        }catch(InvalidArgumentException | BookException e){
             JOptionPane.showMessageDialog(informationFrame,e.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_search2ActionPerformed

    private void backISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backISBNActionPerformed
        swapPanels(defaultPanel);
    }//GEN-LAST:event_backISBNActionPerformed

    private void authorLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorLastNameActionPerformed
       
    }//GEN-LAST:event_authorLastNameActionPerformed

    private void clearISBN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearISBN1ActionPerformed
        copyIsbn.setText("");
        copyID.setText("");
    }//GEN-LAST:event_clearISBN1ActionPerformed

    private void addCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCopyActionPerformed
       
        SystemController controller = new SystemController();
        String copyIsbn22 = copyIsbn.getText();
        String copyId22 = copyID.getText();
        if( copyIsbn22.isEmpty() || copyId22.isEmpty()){
             JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"Enter all fields","Error !!!",JOptionPane.ERROR_MESSAGE);
        }
        else{
           try {
                controller.addBookCopy(copyId22, copyIsbn22);
                JOptionPane.showMessageDialog(informationFrame,"Book Added","Information",JOptionPane.INFORMATION_MESSAGE);
                copyIsbn.setText("");
                copyID.setText("");
            } catch (BookException | InvalidArgumentException ex) {
                 JOptionPane.showMessageDialog(informationFrame,ex.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);
            } 
        }
        
        
    }//GEN-LAST:event_addCopyActionPerformed

    private void backISBN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backISBN1ActionPerformed
        swapPanels(defaultPanel);
    }//GEN-LAST:event_backISBN1ActionPerformed

    private void searchMember1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMember1ActionPerformed
        SystemController controller = new SystemController();
        String currId33 = memberID1.getText();
        String isbnID33 = isbnID3.getText();
        String copyId33 = copyId3.getText();    
       
            try{
               controller.addCheckOutRecord(currId33, isbnID33, copyId33);
               JOptionPane.showMessageDialog(informationFrame,"Member Checkout Record Added","Information",JOptionPane.INFORMATION_MESSAGE);

            }catch (MemberException e){
                JOptionPane.showMessageDialog(informationFrame,e.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);

            }  catch (InvalidArgumentException ex) {
                JOptionPane.showMessageDialog(informationFrame,ex.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);

            } catch (Exception ex1) {
                JOptionPane.showMessageDialog(informationFrame,ex1.getMessage(),"Error !!!",JOptionPane.ERROR_MESSAGE);

            }finally {
                memberID.setText("");
                isbnID3.setText("");
                copyId3.setText("");
            }       

    }//GEN-LAST:event_searchMember1ActionPerformed

    private void backSearchMember1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSearchMember1ActionPerformed
        memberID.setText("");
        swapPanels(defaultPanel1);       
    }//GEN-LAST:event_backSearchMember1ActionPerformed

    private void clearSearchMember1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSearchMember1ActionPerformed
        memberID.setText("");
        isbnID3.setText("");
        copyId3.setText("");
    }//GEN-LAST:event_clearSearchMember1ActionPerformed

    private void enterMemberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterMemberIDActionPerformed
        swapPanels(addCheckOutPanel);
    }//GEN-LAST:event_enterMemberIDActionPerformed

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorLibrarianFrame().setVisible(true);
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
    private javax.swing.JTextArea Display;
    private javax.swing.JButton addBookCopy;
    private javax.swing.JPanel addBookCopyPanel;
    private javax.swing.JLabel addBookTitleLabel;
    private javax.swing.JPanel addCheckOutPanel;
    private javax.swing.JButton addCopy;
    private javax.swing.JButton addNewBook;
    private javax.swing.JPanel adminMinPanel;
    private javax.swing.JTextArea authorBio;
    private javax.swing.JTextField authorCity;
    private javax.swing.JTextField authorCredential;
    private javax.swing.JTextField authorFirstName;
    private javax.swing.JTextField authorLastName;
    private javax.swing.JTextField authorPhoneNumber;
    private javax.swing.JTextField authorState;
    private javax.swing.JTextField authorStreet;
    private javax.swing.JTextField authorZip;
    private javax.swing.JLabel authorsLabel;
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JButton backISBN;
    private javax.swing.JButton backISBN1;
    private javax.swing.JButton backSearchMember;
    private javax.swing.JButton backSearchMember1;
    private javax.swing.JLabel bookCopyIDLabel;
    private javax.swing.JTextField bookID;
    private javax.swing.JPanel bookPanel;
    private javax.swing.JTextField bookTittle;
    private javax.swing.JLabel bookTittleLabel;
    private javax.swing.JComboBox<String> checkOutLen;
    private javax.swing.JTextField city;
    private javax.swing.JTextField city22;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel cityLabel1;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JButton clearISBN;
    private javax.swing.JButton clearISBN1;
    private javax.swing.JButton clearSearchMember;
    private javax.swing.JButton clearSearchMember1;
    private javax.swing.JTextPane copyID;
    private javax.swing.JTextPane copyId3;
    private javax.swing.JTextPane copyIsbn;
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JPanel defaultPanel1;
    private javax.swing.JButton editLibMember;
    private javax.swing.JPanel editMemberPanel;
    private javax.swing.JButton enterMemberID;
    private javax.swing.JButton exit3;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField fName22;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JLabel fNameLabel1;
    private javax.swing.JTextPane isbn;
    private javax.swing.JTextField isbn2;
    private javax.swing.JTextPane isbnID3;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JLabel isbnLabel1;
    private javax.swing.JLabel isbnLabel2;
    private javax.swing.JScrollPane isbnPane;
    private javax.swing.JPanel isbnPanelDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField lName22;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel lastNameLabel1;
    private javax.swing.JPanel libMemberPanel;
    private javax.swing.JButton logout;
    private javax.swing.JPanel lookUpPanel;
    private javax.swing.JPanel mainAdminPanel;
    private javax.swing.JLabel memberFormLabel;
    private javax.swing.JLabel memberFormLabel1;
    private javax.swing.JTextPane memberID;
    private javax.swing.JTextPane memberID1;
    private javax.swing.JLabel memberIDLabel;
    private javax.swing.JLabel memberIDLabel1;
    private javax.swing.JLabel memeberID;
    private javax.swing.JTextField memeberID1;
    private javax.swing.JLabel memeberID2;
    private javax.swing.JTextField memeberID22;
    private javax.swing.JLabel memeberID3;
    private javax.swing.JLabel memeberID4;
    private javax.swing.JButton newLibMember;
    private javax.swing.JLabel numCopiesLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneLabel1;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField phoneNumber22;
    private javax.swing.JButton save;
    private javax.swing.JButton saveMember;
    private javax.swing.JButton saveMember1;
    private javax.swing.JButton search2;
    private javax.swing.JButton searchISBN;
    private javax.swing.JPanel searchISBNPanel;
    private javax.swing.JPanel searchLibraryMemberPanel;
    private javax.swing.JButton searchMember;
    private javax.swing.JButton searchMember1;
    private javax.swing.JTextField state;
    private javax.swing.JTextField state22;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel stateLabel1;
    private javax.swing.JTextField street;
    private javax.swing.JTextField street22;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JLabel streetLabel1;
    private javax.swing.JTextField zip;
    private javax.swing.JTextField zip22;
    private javax.swing.JLabel zipLabel;
    private javax.swing.JLabel zipLabel1;
    // End of variables declaration//GEN-END:variables
}
