/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui.FormEdit;

import Bus.Impl.NhaXuatBanlmpl;
import Dao.SACHDAO;
import Dto.SACH;
import Gui.FormAdd.*;
import Gui.FormChinh.NhapHangPanel;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author DELL
 */
public class EditSach extends javax.swing.JFrame {

    /**
     * Creates new form AddNhanVien
     */
        private NhapHangPanel nhaphang;
        private SACH sach;
        String url=null;
    public EditSach(NhapHangPanel nhaphang1,SACH masachclicked) {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.nhaphang=nhaphang1;
        this.sach=masachclicked;
//        NhaCungCap.setText(this.sach.getTENNHAXUATBAN());
        TenSach.setText(this.sach.getTENSACH());
        LanTaiBan.setText(""+this.sach.getLANTAIBAN());
        GiaBia.setText(""+this.sach.getGIABIA());
        NhaXuatBanlmpl nxb=new NhaXuatBanlmpl();
        nxb.danhsachNHAXUATBAN(NhaCungCap);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAdd = new javax.swing.JPanel();
        mid = new javax.swing.JPanel();
        MaSach = new javax.swing.JTextField();
        TenSach = new javax.swing.JTextField();
        LanTaiBan = new javax.swing.JTextField();
        GiaBia = new javax.swing.JTextField();
        URL_img = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        NhaCungCap = new javax.swing.JComboBox<>();
        bot = new javax.swing.JPanel();
        submitbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        PanelAdd.setLayout(new java.awt.BorderLayout());

        mid.setBackground(new java.awt.Color(51, 255, 255));

        MaSach.setEditable(false);
        MaSach.setBackground(new java.awt.Color(204, 255, 204));
        MaSach.setForeground(new java.awt.Color(0, 51, 51));
        MaSach.setText("S1");
        MaSach.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã Sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 51))); // NOI18N
        MaSach.setFocusable(false);

        TenSach.setBackground(new java.awt.Color(204, 255, 204));
        TenSach.setForeground(new java.awt.Color(0, 51, 51));
        TenSach.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên Sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 51))); // NOI18N
        TenSach.setRequestFocusEnabled(false);

        LanTaiBan.setBackground(new java.awt.Color(204, 255, 204));
        LanTaiBan.setForeground(new java.awt.Color(0, 51, 51));
        LanTaiBan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lần tái bản", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 51))); // NOI18N

        GiaBia.setBackground(new java.awt.Color(204, 255, 204));
        GiaBia.setForeground(new java.awt.Color(0, 51, 51));
        GiaBia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gía Bìa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 51))); // NOI18N
        GiaBia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiaBiaActionPerformed(evt);
            }
        });

        URL_img.setBackground(new java.awt.Color(204, 255, 204));
        URL_img.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        URL_img.setForeground(new java.awt.Color(0, 51, 51));
        URL_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        URL_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_windows_phone_store_30px.png"))); // NOI18N
        URL_img.setText("Chọn URL ảnh minh họa");
        URL_img.setOpaque(true);
        URL_img.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                URL_imgMouseMoved(evt);
            }
        });
        URL_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                URL_imgMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                URL_imgMouseExited(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cancel_30px_1.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        NhaCungCap.setBackground(new java.awt.Color(204, 255, 204));
        NhaCungCap.setForeground(new java.awt.Color(0, 51, 51));
        NhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhà cung cấp 1", "Nhà cung cấp 2", "Nhà cung cấp 3" }));
        NhaCungCap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhà Cung Cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 51))); // NOI18N

        javax.swing.GroupLayout midLayout = new javax.swing.GroupLayout(mid);
        mid.setLayout(midLayout);
        midLayout.setHorizontalGroup(
            midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(midLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(midLayout.createSequentialGroup()
                        .addComponent(URL_img, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(GiaBia, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(midLayout.createSequentialGroup()
                        .addGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LanTaiBan, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(NhaCungCap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        midLayout.setVerticalGroup(
            midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midLayout.createSequentialGroup()
                .addComponent(exit)
                .addGap(40, 40, 40)
                .addGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MaSach)
                    .addComponent(NhaCungCap))
                .addGap(50, 50, 50)
                .addGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LanTaiBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(midLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GiaBia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(URL_img, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(226, 226, 226))
        );

        PanelAdd.add(mid, java.awt.BorderLayout.CENTER);

        submitbtn.setBackground(new java.awt.Color(255, 255, 255));
        submitbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(0, 51, 51));
        submitbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submitbtn.setText("Xác Nhận");
        submitbtn.setOpaque(true);
        submitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout botLayout = new javax.swing.GroupLayout(bot);
        bot.setLayout(botLayout);
        botLayout.setHorizontalGroup(
            botLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        botLayout.setVerticalGroup(
            botLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        PanelAdd.add(bot, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitbtnMouseClicked
        int masach=this.sach.getMASACH();
        String nhaxuatban=(String) NhaCungCap.getSelectedItem();
        String nameSach=TenSach.getText();
        String lantaibanStr=LanTaiBan.getText();
        int lantaiban=Integer.parseInt(lantaibanStr);
        String giabiaStr=GiaBia.getText();
        int giabiaSach=Integer.parseInt(giabiaStr);
        if(url!=null){
            SACH sach=new SACH(masach,nameSach,url,0,nhaxuatban,giabiaSach,lantaiban,false);
            SACHDAO.getInstance().update(sach);
        }
        else{
            url=this.sach.getIMAGE();
            SACH sach=new SACH(masach,nameSach,url,0,nhaxuatban,giabiaSach,lantaiban,false);
            SACHDAO.getInstance().update(sach);
        }
        this.nhaphang.loadBooksToTable();
        System.out.println("da thuc hien sua");
        this.dispose();
    }//GEN-LAST:event_submitbtnMouseClicked

    private void URL_imgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_URL_imgMouseMoved
        // TODO add your handling code here:
        URL_img.setBackground(new Color(0,255,204));
        URL_img.setForeground(new Color(0,0,102));
    }//GEN-LAST:event_URL_imgMouseMoved

    private void URL_imgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_URL_imgMouseExited
        // TODO add your handling code here:
        URL_img.setBackground(new Color(204,255,204));
        URL_img.setForeground(new Color(0,51,51));
    }//GEN-LAST:event_URL_imgMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void GiaBiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiaBiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GiaBiaActionPerformed

    private void URL_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_URL_imgMouseClicked
        // TODO add your handling code here:
                // TODO add your handling code here:\
    JFileChooser fileChooser = new JFileChooser();

    // Set the file chooser to select files only
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

    // Set filter to display only image files
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg");
    fileChooser.setFileFilter(filter);

    // Show the file chooser dialog to the user
    int result = fileChooser.showOpenDialog(null);

    // Check if the user selected a file
    if (result == JFileChooser.APPROVE_OPTION) {
        // Get the selected file
        File selectedFile = fileChooser.getSelectedFile();

        // Get the path of the selected file
        String selectedFilePath = selectedFile.getAbsolutePath();

         url = selectedFilePath;
    }        
    }//GEN-LAST:event_URL_imgMouseClicked

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
            java.util.logging.Logger.getLogger(AddNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GiaBia;
    private javax.swing.JTextField LanTaiBan;
    private javax.swing.JTextField MaSach;
    private javax.swing.JComboBox<String> NhaCungCap;
    private javax.swing.JPanel PanelAdd;
    private javax.swing.JTextField TenSach;
    private javax.swing.JLabel URL_img;
    private javax.swing.JPanel bot;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel mid;
    private javax.swing.JLabel submitbtn;
    // End of variables declaration//GEN-END:variables
}
