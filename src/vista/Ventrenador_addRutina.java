/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Lin
 */
public class Ventrenador_addRutina extends javax.swing.JPanel {

    /**
     * Creates new form Ventrenador_addRutina
     */
    public Ventrenador_addRutina() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarDniCli = new javax.swing.JTextField();
        btnBuscarCli = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDNICli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombCli = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRutinasCli = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDescRut = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMedidas = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        ftfFecIni = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        ftfFecFin = new javax.swing.JFormattedTextField();
        btnAgregarClase = new javax.swing.JButton();

        setBackground(new java.awt.Color(85, 123, 131));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(85, 123, 131));

        jPanel2.setBackground(new java.awt.Color(32, 101, 98));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 239, 193));
        jLabel4.setText("BUSCAR CLIENTE POR DNI: ");

        txtBuscarDniCli.setBackground(new java.awt.Color(229, 239, 193));
        txtBuscarDniCli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscarDniCli.setForeground(new java.awt.Color(91, 81, 81));
        txtBuscarDniCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtBuscarDniCli.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtBuscarDniCli.setSelectionColor(new java.awt.Color(57, 174, 169));

        btnBuscarCli.setBackground(new java.awt.Color(57, 174, 169));
        btnBuscarCli.setForeground(new java.awt.Color(229, 239, 193));
        btnBuscarCli.setText("Buscar");
        btnBuscarCli.setBorder(null);
        btnBuscarCli.setBorderPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(txtBuscarDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnBuscarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtBuscarDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(btnBuscarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(229, 239, 193));
        jLabel5.setText("DNI Cliente: ");

        txtDNICli.setEditable(false);
        txtDNICli.setBackground(new java.awt.Color(85, 123, 131));
        txtDNICli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDNICli.setForeground(new java.awt.Color(229, 239, 193));
        txtDNICli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtDNICli.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtDNICli.setSelectionColor(new java.awt.Color(57, 174, 169));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(229, 239, 193));
        jLabel3.setText("Nombre Cliente: ");

        txtNombCli.setEditable(false);
        txtNombCli.setBackground(new java.awt.Color(85, 123, 131));
        txtNombCli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombCli.setForeground(new java.awt.Color(229, 239, 193));
        txtNombCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtNombCli.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtNombCli.setSelectionColor(new java.awt.Color(57, 174, 169));

        jPanel3.setBackground(new java.awt.Color(32, 101, 98));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 239, 193));
        jLabel6.setText("RUTINAS ASIGNADAS: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblRutinasCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Entrenador", "Descripción Rutina", "Descripción Medidas", "Fecha Inicio", "Fecha Fin"
            }
        ));
        tblRutinasCli.setGridColor(new java.awt.Color(162, 213, 171));
        tblRutinasCli.setSelectionBackground(new java.awt.Color(57, 174, 169));
        tblRutinasCli.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblRutinasCli);

        jPanel4.setBackground(new java.awt.Color(32, 101, 98));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(229, 239, 193));
        jLabel7.setText(" NUEVA RUTINA: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(229, 239, 193));
        jLabel8.setText("Descripción de la rutina: ");

        txtDescRut.setBackground(new java.awt.Color(229, 239, 193));
        txtDescRut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDescRut.setForeground(new java.awt.Color(91, 81, 81));
        txtDescRut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtDescRut.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtDescRut.setSelectionColor(new java.awt.Color(57, 174, 169));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(229, 239, 193));
        jLabel9.setText("Descripción de las medidas: ");

        txtMedidas.setBackground(new java.awt.Color(229, 239, 193));
        txtMedidas.setColumns(20);
        txtMedidas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMedidas.setForeground(new java.awt.Color(91, 81, 81));
        txtMedidas.setRows(5);
        txtMedidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        jScrollPane2.setViewportView(txtMedidas);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(229, 239, 193));
        jLabel10.setText("Fecha Inicio: ");

        ftfFecIni.setBackground(new java.awt.Color(229, 239, 193));
        ftfFecIni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        ftfFecIni.setForeground(new java.awt.Color(91, 81, 81));
        ftfFecIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftfFecIni.setText("DD/MM/AAAA");
        ftfFecIni.setToolTipText("dd/mm/aaaa");
        ftfFecIni.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        ftfFecIni.setSelectionColor(new java.awt.Color(57, 174, 169));
        ftfFecIni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftfFecIniMouseClicked(evt);
            }
        });
        ftfFecIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfFecIniActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(229, 239, 193));
        jLabel11.setText("Fecha Fin: ");

        ftfFecFin.setBackground(new java.awt.Color(229, 239, 193));
        ftfFecFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        ftfFecFin.setForeground(new java.awt.Color(91, 81, 81));
        ftfFecFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftfFecFin.setText("DD/MM/AAAA");
        ftfFecFin.setToolTipText("dd/mm/aaaa");
        ftfFecFin.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        ftfFecFin.setSelectionColor(new java.awt.Color(57, 174, 169));
        ftfFecFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftfFecFinMouseClicked(evt);
            }
        });

        btnAgregarClase.setBackground(new java.awt.Color(32, 101, 98));
        btnAgregarClase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregarClase.setForeground(new java.awt.Color(229, 239, 193));
        btnAgregarClase.setText("Agregar");
        btnAgregarClase.setBorder(null);
        btnAgregarClase.setBorderPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombCli, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDescRut)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(ftfFecIni, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ftfFecFin, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombCli, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDNICli, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescRut, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftfFecFin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(ftfFecIni, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(16, 16, 16)
                .addComponent(btnAgregarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void ftfFecIniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftfFecIniMouseClicked
        ftfFecIni.setText("");
    }//GEN-LAST:event_ftfFecIniMouseClicked

    private void ftfFecIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfFecIniActionPerformed

    }//GEN-LAST:event_ftfFecIniActionPerformed

    private void ftfFecFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftfFecFinMouseClicked
        ftfFecFin.setText("");
    }//GEN-LAST:event_ftfFecFinMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarClase;
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JFormattedTextField ftfFecFin;
    private javax.swing.JFormattedTextField ftfFecIni;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRutinasCli;
    private javax.swing.JTextField txtBuscarDniCli;
    private javax.swing.JTextField txtDNICli;
    private javax.swing.JTextField txtDescRut;
    private javax.swing.JTextArea txtMedidas;
    private javax.swing.JTextField txtNombCli;
    // End of variables declaration//GEN-END:variables
}
