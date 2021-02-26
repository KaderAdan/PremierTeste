
package Interface;


import java.sql.Connection;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class Home extends javax.swing.JFrame {

    
    public Home() {
        initComponents();
        clock();
        Connection conn = DBConnect.connect();
    }

    public void clock(){
        Thread clock = new Thread(){
            public void run(){
                try{
                    Calendar cal = new GregorianCalendar();
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int month = cal.get(Calendar.MONTH)+1;
                    int year = cal.get(Calendar.YEAR);
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR)+1;
                    lbTime.setText(hour +":"+ minute +":"+ second);
                    lblDate.setText(day +"-"+ month +"-"+ year);
                    sleep(1000);
                    
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            }
        };
        clock.start();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        MTP1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        HomeDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        lbltime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2000, 12000));

        jPanel1.setBackground(new java.awt.Color(240, 219, 232));
        jPanel1.setPreferredSize(new java.awt.Dimension(1478, 971));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("BIBLIOTHEQUE  DE L'UNIVERSITE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        lblDate.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblDate.setText("DATE");
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));

        lbTime.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lbTime.setText("TIME");
        jPanel1.add(lbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 80, -1, -1));

        MTP1.setFont(new java.awt.Font("Myanmar Text", 3, 12)); // NOI18N
        MTP1.setForeground(new java.awt.Color(102, 255, 0));
        MTP1.setText("Changer le mot de passe !");
        MTP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MTP1MouseClicked(evt);
            }
        });
        jPanel1.add(MTP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 144, 21));

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Emprunter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 120, 30));

        jButton2.setBackground(java.awt.SystemColor.activeCaption);
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 130, -1));

        jButton3.setBackground(java.awt.SystemColor.activeCaption);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Etudiants");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 513, 130, 30));

        jButton4.setBackground(java.awt.SystemColor.activeCaption);
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Livres");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 673, 130, 30));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 240, 1070));

        javax.swing.GroupLayout HomeDesktopLayout = new javax.swing.GroupLayout(HomeDesktop);
        HomeDesktop.setLayout(HomeDesktopLayout);
        HomeDesktopLayout.setHorizontalGroup(
            HomeDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        HomeDesktopLayout.setVerticalGroup(
            HomeDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.add(HomeDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 1010, 600));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 2000, 1140));

        jToolBar1.setRollover(true);
        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 2020, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lbltime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 2000, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 2000, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1217, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       HomeDesktop.removeAll();
       AddMembers am = new AddMembers();
       HomeDesktop.add(am).setVisible(true);
     
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        HomeDesktop.removeAll();
        Borrow br = new Borrow();
        HomeDesktop.add(br).setVisible(true);
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         HomeDesktop.removeAll();
//       Main  rn = new Main();
        //HomeDesktop.add(rn).setVisible(true);
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        HomeDesktop.removeAll();
        AddBook bk = new AddBook();
        HomeDesktop.add(bk).setVisible(true);
    }                                        

    private void MTP1MouseClicked(java.awt.event.MouseEvent evt) {                                  
        Changer n=new Changer();
        n.setVisible(true);
    }                                 

  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JDesktopPane HomeDesktop;
    private javax.swing.JLabel MTP1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lbltime;
    // End of variables declaration                   
}
