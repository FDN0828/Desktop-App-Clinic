/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package klinikuntan;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form NewDokter
     */
    public Doctor() {
        initComponents();
    }
    
    int curkd_resep = 4;
    List<Object[]> rows = new ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        doctorTabbedPane = new javax.swing.JTabbedPane();
        pemeriksaanDoctorTabbedPane = new javax.swing.JTabbedPane();
        panelDiagnosaPemeriksaanDoctor = new javax.swing.JPanel();
        labelKodePemeriksaan3 = new javax.swing.JLabel();
        labelDiagnosa2 = new javax.swing.JLabel();
        textKdPemeriksaanDokter = new javax.swing.JTextField();
        buttonDiagnosaPemeriksaan = new javax.swing.JButton();
        scrollPaneDiagnosaPemeriksaan = new javax.swing.JScrollPane();
        textAreaDiagnosaPemeriksaan = new javax.swing.JTextArea();
        textHargaPemeriksaanDoctor = new javax.swing.JTextField();
        labelKodePemeriksaan4 = new javax.swing.JLabel();
        resepDoctorTabbedPane = new javax.swing.JTabbedPane();
        panelTambahObatResepDoctor = new javax.swing.JPanel();
        textDosisObat = new javax.swing.JTextField();
        labelObat3 = new javax.swing.JLabel();
        labelNamaObat3 = new javax.swing.JLabel();
        textNamaObatResep = new javax.swing.JTextField();
        labelStok3 = new javax.swing.JLabel();
        textJumlahObatResep = new javax.swing.JTextField();
        labelObat4 = new javax.swing.JLabel();
        scrollPaneDeskripsiResep = new javax.swing.JScrollPane();
        textAreaDeskripsi = new javax.swing.JTextArea();
        buttonTambahResepDoctor = new javax.swing.JButton();
        panelResepObatDoctor = new javax.swing.JPanel();
        scrollPaneResep = new javax.swing.JScrollPane();
        tableResepObat = new javax.swing.JTable();
        buttonCetakResepDoctor = new javax.swing.JButton();
        buttonLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Dokter");

        doctorTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        doctorTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        labelKodePemeriksaan3.setText("Kode Pemeriksaan");
        labelKodePemeriksaan3.setPreferredSize(new java.awt.Dimension(90, 25));

        labelDiagnosa2.setText("Diagnosa");
        labelDiagnosa2.setPreferredSize(new java.awt.Dimension(90, 25));

        textKdPemeriksaanDokter.setPreferredSize(new java.awt.Dimension(300, 25));
        textKdPemeriksaanDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textKdPemeriksaanDokterMouseClicked(evt);
            }
        });

        buttonDiagnosaPemeriksaan.setText("Tambah");
        buttonDiagnosaPemeriksaan.setMaximumSize(new java.awt.Dimension(80, 25));
        buttonDiagnosaPemeriksaan.setMinimumSize(new java.awt.Dimension(80, 25));
        buttonDiagnosaPemeriksaan.setPreferredSize(new java.awt.Dimension(80, 25));
        buttonDiagnosaPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDiagnosaPemeriksaanActionPerformed(evt);
            }
        });

        textAreaDiagnosaPemeriksaan.setColumns(20);
        textAreaDiagnosaPemeriksaan.setRows(5);
        scrollPaneDiagnosaPemeriksaan.setViewportView(textAreaDiagnosaPemeriksaan);

        textHargaPemeriksaanDoctor.setPreferredSize(new java.awt.Dimension(300, 25));

        labelKodePemeriksaan4.setText("Harga");
        labelKodePemeriksaan4.setPreferredSize(new java.awt.Dimension(90, 25));

        javax.swing.GroupLayout panelDiagnosaPemeriksaanDoctorLayout = new javax.swing.GroupLayout(panelDiagnosaPemeriksaanDoctor);
        panelDiagnosaPemeriksaanDoctor.setLayout(panelDiagnosaPemeriksaanDoctorLayout);
        panelDiagnosaPemeriksaanDoctorLayout.setHorizontalGroup(
            panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelKodePemeriksaan3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDiagnosa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKodePemeriksaan4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textKdPemeriksaanDokter, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(scrollPaneDiagnosaPemeriksaan)
                    .addComponent(textHargaPemeriksaanDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiagnosaPemeriksaanDoctorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDiagnosaPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        panelDiagnosaPemeriksaanDoctorLayout.setVerticalGroup(
            panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodePemeriksaan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textKdPemeriksaanDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelKodePemeriksaan4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHargaPemeriksaanDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDiagnosa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneDiagnosaPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(buttonDiagnosaPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pemeriksaanDoctorTabbedPane.addTab("Diagnosa Pasien", panelDiagnosaPemeriksaanDoctor);

        doctorTabbedPane.addTab("Pemeriksaan", pemeriksaanDoctorTabbedPane);

        textDosisObat.setPreferredSize(new java.awt.Dimension(300, 25));

        labelObat3.setText("Dosis");
        labelObat3.setPreferredSize(new java.awt.Dimension(90, 25));

        labelNamaObat3.setText("Nama Obat");
        labelNamaObat3.setPreferredSize(new java.awt.Dimension(90, 25));

        textNamaObatResep.setPreferredSize(new java.awt.Dimension(300, 25));

        labelStok3.setText("Jumlah");
        labelStok3.setPreferredSize(new java.awt.Dimension(90, 25));

        textJumlahObatResep.setPreferredSize(new java.awt.Dimension(300, 25));

        labelObat4.setText("Deskripsi");
        labelObat4.setPreferredSize(new java.awt.Dimension(90, 25));

        textAreaDeskripsi.setColumns(20);
        textAreaDeskripsi.setRows(5);
        textAreaDeskripsi.setPreferredSize(new java.awt.Dimension(300, 84));
        scrollPaneDeskripsiResep.setViewportView(textAreaDeskripsi);

        buttonTambahResepDoctor.setText("Tambah");
        buttonTambahResepDoctor.setMaximumSize(new java.awt.Dimension(80, 25));
        buttonTambahResepDoctor.setMinimumSize(new java.awt.Dimension(80, 25));
        buttonTambahResepDoctor.setPreferredSize(new java.awt.Dimension(80, 25));
        buttonTambahResepDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahResepDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTambahObatResepDoctorLayout = new javax.swing.GroupLayout(panelTambahObatResepDoctor);
        panelTambahObatResepDoctor.setLayout(panelTambahObatResepDoctorLayout);
        panelTambahObatResepDoctorLayout.setHorizontalGroup(
            panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahObatResepDoctorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelObat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelObat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStok3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNamaObat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNamaObatResep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textJumlahObatResep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textDosisObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPaneDeskripsiResep))
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTambahObatResepDoctorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonTambahResepDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        panelTambahObatResepDoctorLayout.setVerticalGroup(
            panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahObatResepDoctorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaObat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNamaObatResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStok3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textJumlahObatResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelObat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDosisObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneDeskripsiResep, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(buttonTambahResepDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        resepDoctorTabbedPane.addTab("Buat Resep", panelTambahObatResepDoctor);

        scrollPaneResep.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableResepObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NO", "Nama Obat", "Jumlah", "Dosis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneResep.setViewportView(tableResepObat);

        buttonCetakResepDoctor.setText("Cetak");
        buttonCetakResepDoctor.setMaximumSize(new java.awt.Dimension(80, 25));
        buttonCetakResepDoctor.setMinimumSize(new java.awt.Dimension(80, 25));
        buttonCetakResepDoctor.setPreferredSize(new java.awt.Dimension(80, 25));
        buttonCetakResepDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCetakResepDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelResepObatDoctorLayout = new javax.swing.GroupLayout(panelResepObatDoctor);
        panelResepObatDoctor.setLayout(panelResepObatDoctorLayout);
        panelResepObatDoctorLayout.setHorizontalGroup(
            panelResepObatDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResepObatDoctorLayout.createSequentialGroup()
                .addGroup(panelResepObatDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelResepObatDoctorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCetakResepDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelResepObatDoctorLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(scrollPaneResep, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)))
                .addGap(55, 55, 55))
        );
        panelResepObatDoctorLayout.setVerticalGroup(
            panelResepObatDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResepObatDoctorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(scrollPaneResep, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(buttonCetakResepDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        resepDoctorTabbedPane.addTab("Cetak Resep", panelResepObatDoctor);

        doctorTabbedPane.addTab("Resep", resepDoctorTabbedPane);

        buttonLogOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonLogOut.setForeground(new java.awt.Color(255, 0, 0));
        buttonLogOut.setText("Log Out");
        buttonLogOut.setPreferredSize(new java.awt.Dimension(80, 25));
        buttonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(doctorTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buttonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(doctorTabbedPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDiagnosaPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDiagnosaPemeriksaanActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/klinik_pratama_untan", "root", "Adwira121804");
            String kd_periksa = textKdPemeriksaanDokter.getText();
            PreparedStatement pst = conn.prepareStatement("Update pemeriksaan set diagnosa = ?, harga = ? where kd_periksa = " + kd_periksa);

            String diagnosa = textAreaDiagnosaPemeriksaan.getText();
            String stringHarga = textHargaPemeriksaanDoctor.getText();
            Integer harga = Integer.parseInt(stringHarga);

            pst.setString(1, diagnosa);
            pst.setInt(2, harga);

            pst.executeUpdate();
            conn.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kegagalan");
        }
        
    }//GEN-LAST:event_buttonDiagnosaPemeriksaanActionPerformed

    private void buttonTambahResepDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahResepDoctorActionPerformed
        // TODO add your handling code here:
        Object[] header = {"NO", "Nama", "Jumlah", "Dosis"};
        Object[][] matchedData = null;
        int rowCount = 1;
        
        String kd_periksa = "";
        DefaultTableModel model = new DefaultTableModel();
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/klinik_pratama_untan", "root", "Adwira121804")) {

            // Get the last kd_periksa
            try (PreparedStatement pst = conn.prepareStatement("SELECT kd_periksa FROM pemeriksaan ORDER BY kd_periksa DESC LIMIT 1")) {
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    kd_periksa = rs.getString("kd_periksa");
                } else {
                    // Handle case where no pemeriksaan records exist
                    JOptionPane.showMessageDialog(null, "Tidak ada data pemeriksaan ditemukan.");
                    return;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An error occurred (getting kd_periksa): " + e.getMessage());
                return;
            }

            String kd_resep = String.format("%08d", curkd_resep);
            String kd_obat = "";
            int stok = 0;
            
            String nama = textNamaObatResep.getText();
            String stringJumlah = textJumlahObatResep.getText();
            Integer jumlah = Integer.parseInt(stringJumlah);
//            Integer hargaObat = Integer.parseInt();
            int hrg = 0;
            String dosis = textDosisObat.getText();
            String deskripsi = textAreaDeskripsi.getText();

            // Check for existing obat and stock
            try (PreparedStatement pst1 = conn.prepareStatement("SELECT kd_obat, stok, harga_obat FROM obat WHERE nama_obat = ?")) {
                pst1.setString(1, nama);
                ResultSet rs = pst1.executeQuery();
                if (rs.next()) {
                    kd_obat = rs.getString("kd_obat");
                    stok = rs.getInt("stok");
                    hrg = rs.getInt("harga_obat");
                } else {
                    JOptionPane.showMessageDialog(null, "Obat tidak ditemukan");
                    return; // Exit if obat not found
                }
                if (stok == 0) {
                    JOptionPane.showMessageDialog(null, "Stok Habis");
                    return; // Exit if stock is zero
                }

                // Insert into resep table if obat is found and has stock
                hrg *= jumlah;
                PreparedStatement pst = conn.prepareStatement("INSERT INTO resep(kd_resep, nama_obat, jumlah, dosis, deskripsi, kd_periksa, kd_obat, harga) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                pst.setString(1, kd_resep);
                pst.setString(2, nama);
                pst.setInt(3, jumlah);
                pst.setString(4, dosis);
                pst.setString(5, deskripsi);
                pst.setString(6, kd_periksa);
                pst.setString(7, kd_obat);
                pst.setInt(8, hrg);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Berhasil Ditambahkan Ke Resep");
                String srowCount = String.valueOf(rowCount);
                String sjumlah = String.valueOf(jumlah);

                String[] rowData = {srowCount, nama, sjumlah, dosis};
                rowCount++;
                rows.add(rowData);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An error occurred (adding resep): " + e.getMessage());
            }
            matchedData = new Object[rows.size()][];
            for (int i = 0; i < rows.size(); i++) {
                matchedData[i] = rows.get(i);
            }
            
            model.setDataVector(matchedData, header);
            tableResepObat.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: outer: " + e.getMessage());
        }
        
    }//GEN-LAST:event_buttonTambahResepDoctorActionPerformed

    private void textKdPemeriksaanDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textKdPemeriksaanDokterMouseClicked
        // TODO add your handling code here:
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/klinik_pratama_untan", "root", "Adwira121804"); PreparedStatement pst = conn.prepareStatement("select * from pemeriksaan order by kd_periksa desc limit 1;"); ResultSet rs = pst.executeQuery()) {
            String kd_periksa = "";
            while (rs.next()) {
                kd_periksa = rs.getString("kd_periksa");
                System.out.println(kd_periksa);
            }
            textKdPemeriksaanDokter.setText(kd_periksa);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
        
    }//GEN-LAST:event_textKdPemeriksaanDokterMouseClicked

    private void buttonCetakResepDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCetakResepDoctorActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Berhasil Dicetak");
        curkd_resep++;
        rows.clear();
    }//GEN-LAST:event_buttonCetakResepDoctorActionPerformed

    private void buttonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogOutActionPerformed
        new LoginPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonLogOutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        }catch(Exception e){
            e.printStackTrace();
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCetakResepDoctor;
    private javax.swing.JButton buttonDiagnosaPemeriksaan;
    private javax.swing.JButton buttonLogOut;
    private javax.swing.JButton buttonTambahResepDoctor;
    private javax.swing.JTabbedPane doctorTabbedPane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelDiagnosa2;
    private javax.swing.JLabel labelKodePemeriksaan3;
    private javax.swing.JLabel labelKodePemeriksaan4;
    private javax.swing.JLabel labelNamaObat3;
    private javax.swing.JLabel labelObat3;
    private javax.swing.JLabel labelObat4;
    private javax.swing.JLabel labelStok3;
    private javax.swing.JPanel panelDiagnosaPemeriksaanDoctor;
    private javax.swing.JPanel panelResepObatDoctor;
    private javax.swing.JPanel panelTambahObatResepDoctor;
    private javax.swing.JTabbedPane pemeriksaanDoctorTabbedPane;
    private javax.swing.JTabbedPane resepDoctorTabbedPane;
    private javax.swing.JScrollPane scrollPaneDeskripsiResep;
    private javax.swing.JScrollPane scrollPaneDiagnosaPemeriksaan;
    private javax.swing.JScrollPane scrollPaneResep;
    private javax.swing.JTable tableResepObat;
    private javax.swing.JTextArea textAreaDeskripsi;
    private javax.swing.JTextArea textAreaDiagnosaPemeriksaan;
    private javax.swing.JTextField textDosisObat;
    private javax.swing.JTextField textHargaPemeriksaanDoctor;
    private javax.swing.JTextField textJumlahObatResep;
    private javax.swing.JTextField textKdPemeriksaanDokter;
    private javax.swing.JTextField textNamaObatResep;
    // End of variables declaration//GEN-END:variables
}
