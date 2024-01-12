package Form;

import Config.Koneksi;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FormMahasiswa extends javax.swing.JFrame {
    
    private Connection conn;

    public FormMahasiswa() {
        initComponents();
        conn = Koneksi.getConnection();
        getData();
        nonAktifButton();
        AktifButton();
    }
    
     private void getData() {
        DefaultTableModel model =(DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM `mahasiswa`";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int id          = rs.getInt("id");
                String nama     = rs.getString("nama");
                String telepon  = rs.getString("telepon");
                String alamat   = rs.getString("alamat");
                
                Object[] rowData = {id, nama, telepon, alamat};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null, e);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        t_nama = new javax.swing.JTextField();
        t_telepon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_alamat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t_search = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_data.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tbl_data.setForeground(new java.awt.Color(102, 102, 102));
        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAMA", "TELEPON", "ALAMAT"
            }
        ));
        tbl_data.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_data.setRowHeight(30);
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        jLabel1.setText("Nama");

        t_telepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_teleponActionPerformed(evt);
            }
        });

        jLabel2.setText("Telepon");

        jLabel3.setText("Alamat");

        t_search.setText("Search");
        t_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_searchMouseClicked(evt);
            }
        });
        t_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_searchKeyTyped(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_alamat)
                    .addComponent(t_telepon)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_delete))
                            .addComponent(t_nama))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(t_search))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(t_search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_teleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_teleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_teleponActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String nama = t_nama.getText();
        String telepon = t_telepon.getText();
        String alamat = t_alamat.getText();
        
        if(nama.isEmpty() || telepon.isEmpty() || alamat.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Valiadasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "INSERT INTO mahasiswa (nama,telepon,alamat) VALUES (?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama);
            st.setString(2, telepon);
            st.setString(3, alamat);
            
            int rowUpdated = st.executeUpdate();
            if(rowUpdated > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                resetForm();
                getData();
            }
            
            st.close();
        } catch (Exception e) {
             Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null, e);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        resetForm();
        AktifButton();
        nonAktifButton();
        btn_delete.setEnabled(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int selectedRow = tbl_data.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan di perbarui");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String id = tbl_data.getValueAt(selectedRow, 0).toString();
            
            try {
                String sql = "DELETE FROM mahasiswa WHERE id=?";
                PreparedStatement st = conn.prepareCall(sql);
                st.setString(1, id);
                
                int rowDelete = st.executeUpdate();
                if(rowDelete > 0){
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                    
                }
                
                st.close();
                
            } catch (Exception e) {
                Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null, e);
            }
        }
        resetForm();
        getData();
        AktifButton();
        nonAktifButton();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int selectedRow = tbl_data.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan di perbarui");
            return;
        }
        String id = tbl_data.getValueAt(selectedRow, 0).toString();
        String nama = t_nama.getText();
        String telepon = t_telepon.getText();
        String alamat = t_alamat.getText();
        
        if(nama.isEmpty() || telepon.isEmpty() || alamat.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Valiadasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            String sql = "UPDATE mahasiswa SET nama=?, telepon=?, alamat=? WHERE id=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama);
            st.setString(2, telepon);
            st.setString(3, alamat);
            st.setString(4, id);
            
            int rowInserted = st.executeUpdate();
            if(rowInserted > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm();
                getData();
            }
            
            st.close();
            
        } catch (Exception e) {
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null, e);
        }
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        int selectedRow = tbl_data.getSelectedRow();
        if(selectedRow != -1){
            String nama = tbl_data.getValueAt(selectedRow, 1).toString();
            String telepon = tbl_data.getValueAt(selectedRow, 2).toString();
            String alamat = tbl_data.getValueAt(selectedRow, 3).toString();
            
            t_nama.setText(nama);
            t_telepon.setText(telepon);
            t_alamat.setText(alamat);
        }
        
        btn_update.setEnabled(true);
        btn_add.setEnabled(false);
        btn_delete.setEnabled(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void t_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_searchKeyTyped
        DefaultTableModel model =(DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        
        String pencarian = t_search.getText();
        
        try {
            String sql = "SELECT * FROM mahasiswa WHERE nama LIKE ? OR telepon LIKE ? OR alamat LIKE ?";
            PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1,"%" + pencarian + "%");
                st.setString(2,"%" + pencarian + "%");
                st.setString(3,"%" + pencarian + "%");
                
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int id          = rs.getInt("id");
                String nama     = rs.getString("nama");
                String telepon  = rs.getString("telepon");
                String alamat   = rs.getString("alamat");
                
                Object[] rowData = {id,nama,telepon,alamat};
                model.addRow(rowData);
            }
            
            rs.close();
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null, e);
        }
    }//GEN-LAST:event_t_searchKeyTyped

    private void t_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_searchMouseClicked
        t_search.setText("");
    }//GEN-LAST:event_t_searchMouseClicked

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_alamat;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_search;
    private javax.swing.JTextField t_telepon;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        t_nama.setText("");
        t_telepon.setText("");
        t_alamat.setText("");
    }

    private void nonAktifButton() {
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
    }

    private void AktifButton() {
        btn_add.setEnabled(true);
        btn_cancel.setEnabled(true);
    }
 
}
