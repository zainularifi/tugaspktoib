/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import kelas.category;
import kelas.product;


/**
 *
 * @author zainul
 */
public class frame_product extends javax.swing.JFrame {

    /**
     * Creates new form frame_product
     */
    public frame_product() {
        initComponents();
        loadtabel();
        otid();
        comboCategory();
        
    }
    void  loadtabel(){
        DefaultTableModel model=new DefaultTableModel();
    model.addColumn("id product");
    model.addColumn("nama product");
    model.addColumn("deskripsi");
    model.addColumn("harga");
    model.addColumn("category");
    
    try{
        product prd=new product();
        ResultSet data=prd.tampilproduct();
        while (data.next()){
         model.addRow(new Object[]{
                    data.getString("product_id"),
                    data.getString("product_name"),
                    data.getString("product_desc"),
                    data.getString("product_price"),
                    data.getString("category_name"),});
        }
        }catch (SQLException sQLException){
            
    }
    tproduct.setModel(model);
    }
    void comboCategory() {
        try {
            category cat = new category();
            ResultSet data = cat.tampilComboBox();

            while (data.next()) {
                String isi = data.getString("category_name");
                tcat.addItem(isi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(frame_product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     void otid() {
        try {
            product prod = new product();
            ResultSet id = prod.otid();

            if (id.next()) {
                int auto = id.getInt("product_id") + 1;
                tidp.setText(String.valueOf(auto));

            } else {
                tidp.setText("1");
            }
            tidp.setEditable(false);

        } catch (SQLException sQLException) {
        }

    }
     void reset() {

        otid();
        tnamap.setText(null);
        tdes.setText(null);
        tharga.setText(null);
        tcat.setSelectedItem(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tidp = new javax.swing.JTextField();
        tnamap = new javax.swing.JTextField();
        tharga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdes = new javax.swing.JTextArea();
        tcat = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tproduct = new javax.swing.JTable();
        btambah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bubah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id product");

        jLabel2.setText("nama");

        jLabel3.setText("harga");

        jLabel4.setText("deskripsi");

        jLabel5.setText("category");

        tdes.setColumns(20);
        tdes.setRows(5);
        jScrollPane1.setViewportView(tdes);

        tcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcatActionPerformed(evt);
            }
        });

        tproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tproductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tproduct);

        btambah.setText("tambah");
        btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btambahActionPerformed(evt);
            }
        });

        bhapus.setText("hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bubah.setText("ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(tidp)
                            .addComponent(tnamap)
                            .addComponent(tharga)
                            .addComponent(tcat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btambah)
                        .addGap(18, 18, 18)
                        .addComponent(bhapus)
                        .addGap(18, 18, 18)
                        .addComponent(bubah)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tidp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tnamap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btambah)
                            .addComponent(bhapus)
                            .addComponent(bubah))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcatActionPerformed

    private void btambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btambahActionPerformed
        // TODO add your handling code here:
        try {
            product prod = new product();
            category cat = new category();
            prod.setProduct_id(Integer.parseInt(tidp.getText()));
            prod.setProduct_nama(tnamap.getText());
            prod.setProduct_desc(tdes.getText());
            prod.setProduct_price(Integer.parseInt(tharga.getText()));
            String selectedCategory = (String) tcat.getSelectedItem();
            cat.setCategory_name(tcat.getSelectedItem().toString());
            ResultSet data = cat.Konversi();

            if (data.next()) {
                String isi = data.getString("category_id");
                prod.setProduct_cat_id(Integer.parseInt(isi));
            }

            prod.tambahproduct();
        } catch (SQLException sQLException) {
            System.out.println("Data tidak masuk");
        }
        loadtabel();
        reset();
        
    }//GEN-LAST:event_btambahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
          try {
            product prod = new product();
            prod.setProduct_id(Integer.parseInt(tidp.getText()));
            prod.hapusProduct();
        } catch (SQLException sQLException) {
        }
        loadtabel();
        reset();
    }//GEN-LAST:event_bhapusActionPerformed

    private void tproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tproductMouseClicked
        // TODO add your handling code here:
         int baris = tproduct.rowAtPoint(evt.getPoint());
        String productID = tproduct.getValueAt(baris, 0).toString();
        String productName = tproduct.getValueAt(baris, 1).toString();
        String productDesc = tproduct.getValueAt(baris, 2).toString();
        String productPrice = tproduct.getValueAt(baris, 3).toString();
        String productCat = tproduct.getValueAt(baris, 4).toString();

        tidp.setText(productID);
        tidp.setEditable(false);
        tnamap.setText(productName);
        tdes.setText(productDesc);
        tharga.setText(productPrice);
        tcat.setSelectedItem(productCat);
    }//GEN-LAST:event_tproductMouseClicked

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        // TODO add your handling code here:
         try {
            product prod = new product();
            category cat = new category();

            prod.setProduct_id(Integer.parseInt(tidp.getText()));
            prod.setProduct_nama(tnamap.getText());
            prod.setProduct_desc(tdes.getText());
            prod.setProduct_price(Integer.parseInt(tharga.getText()));

            cat.setCategory_name(tcat.getSelectedItem().toString());
            ResultSet data = cat.Konversi();

            if (data.next()) {
                String isi = data.getString("category_id");
                prod.setProduct_cat_id(Integer.parseInt(isi));
            }

            prod.ubahProduct();
        } catch (SQLException sQLException) {
            System.out.println("data tidak masuk");
        }

        loadtabel();
        reset();
    }//GEN-LAST:event_bubahActionPerformed

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
            java.util.logging.Logger.getLogger(frame_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bhapus;
    private javax.swing.JButton btambah;
    private javax.swing.JButton bubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> tcat;
    private javax.swing.JTextArea tdes;
    private javax.swing.JTextField tharga;
    private javax.swing.JTextField tidp;
    private javax.swing.JTextField tnamap;
    private javax.swing.JTable tproduct;
    // End of variables declaration//GEN-END:variables
}
