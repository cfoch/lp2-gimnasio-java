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
public class Ventrenador_cancelarClase extends javax.swing.JPanel {

    /**
     * Creates new form Ventrenador_cancelarClase
     */
    public Ventrenador_cancelarClase() {
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

        panelFondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClases = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombCurso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDescClase = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ftfFecIni = new javax.swing.JFormattedTextField();
        ftfFecFin = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        ftfHorIni = new javax.swing.JFormattedTextField();
        ftfHorFin = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCap = new javax.swing.JTextField();
        txtVacantes = new javax.swing.JTextField();
        txtDisp2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnEliminarClase = new javax.swing.JButton();

        setBackground(new java.awt.Color(85, 123, 131));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(85, 123, 131));

        jPanel2.setBackground(new java.awt.Color(32, 101, 98));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 239, 193));
        jLabel4.setText("DETALLE CLASE SELECCIONADA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tblClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Curso", "Clase", "Fecha Inicio", "Fecha Fin", "Duración"
            }
        ));
        tblClases.setGridColor(new java.awt.Color(162, 213, 171));
        tblClases.setSelectionBackground(new java.awt.Color(57, 174, 169));
        tblClases.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblClases);

        jPanel3.setBackground(new java.awt.Color(32, 101, 98));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(229, 239, 193));
        jLabel5.setText("CLASES DICTADAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(466, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(85, 123, 131));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(229, 239, 193));
        jLabel3.setText("Nombre del Curso: ");

        txtNombCurso.setEditable(false);
        txtNombCurso.setBackground(new java.awt.Color(85, 123, 131));
        txtNombCurso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombCurso.setForeground(new java.awt.Color(162, 213, 171));
        txtNombCurso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtNombCurso.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtNombCurso.setSelectionColor(new java.awt.Color(57, 174, 169));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 239, 193));
        jLabel6.setText("Descripción de la clase: ");

        txtDescClase.setEditable(false);
        txtDescClase.setBackground(new java.awt.Color(85, 123, 131));
        txtDescClase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDescClase.setForeground(new java.awt.Color(162, 213, 171));
        txtDescClase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtDescClase.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtDescClase.setSelectionColor(new java.awt.Color(57, 174, 169));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(229, 239, 193));
        jLabel8.setText("Fecha Inicio: ");

        ftfFecIni.setEditable(false);
        ftfFecIni.setBackground(new java.awt.Color(85, 123, 131));
        ftfFecIni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        ftfFecIni.setForeground(new java.awt.Color(162, 213, 171));
        ftfFecIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftfFecIni.setToolTipText("");
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

        ftfFecFin.setEditable(false);
        ftfFecFin.setBackground(new java.awt.Color(85, 123, 131));
        ftfFecFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        ftfFecFin.setForeground(new java.awt.Color(162, 213, 171));
        ftfFecFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftfFecFin.setToolTipText("");
        ftfFecFin.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        ftfFecFin.setSelectionColor(new java.awt.Color(57, 174, 169));
        ftfFecFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftfFecFinMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(229, 239, 193));
        jLabel9.setText("Fecha Fin: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(229, 239, 193));
        jLabel11.setText("Hora Inicio: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(229, 239, 193));
        jLabel10.setText("Hora Fin: ");

        txtDuracion.setEditable(false);
        txtDuracion.setBackground(new java.awt.Color(85, 123, 131));
        txtDuracion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDuracion.setForeground(new java.awt.Color(162, 213, 171));
        txtDuracion.setToolTipText("en minutos");
        txtDuracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtDuracion.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtDuracion.setSelectionColor(new java.awt.Color(57, 174, 169));
        txtDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionActionPerformed(evt);
            }
        });

        ftfHorIni.setEditable(false);
        ftfHorIni.setBackground(new java.awt.Color(85, 123, 131));
        ftfHorIni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        ftfHorIni.setForeground(new java.awt.Color(162, 213, 171));
        ftfHorIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        ftfHorIni.setToolTipText("");
        ftfHorIni.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        ftfHorIni.setSelectionColor(new java.awt.Color(57, 174, 169));
        ftfHorIni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftfHorIniMouseClicked(evt);
            }
        });

        ftfHorFin.setEditable(false);
        ftfHorFin.setBackground(new java.awt.Color(85, 123, 131));
        ftfHorFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        ftfHorFin.setForeground(new java.awt.Color(162, 213, 171));
        ftfHorFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        ftfHorFin.setToolTipText("");
        ftfHorFin.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        ftfHorFin.setSelectionColor(new java.awt.Color(57, 174, 169));
        ftfHorFin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftfHorFinMouseClicked(evt);
            }
        });
        ftfHorFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfHorFinActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(229, 239, 193));
        jLabel12.setText("Duración: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(229, 239, 193));
        jLabel7.setText("Capacidad: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(229, 239, 193));
        jLabel14.setText("Vacantes: ");

        txtCap.setEditable(false);
        txtCap.setBackground(new java.awt.Color(85, 123, 131));
        txtCap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCap.setForeground(new java.awt.Color(162, 213, 171));
        txtCap.setToolTipText("");
        txtCap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtCap.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtCap.setSelectionColor(new java.awt.Color(57, 174, 169));
        txtCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapActionPerformed(evt);
            }
        });

        txtVacantes.setEditable(false);
        txtVacantes.setBackground(new java.awt.Color(85, 123, 131));
        txtVacantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtVacantes.setForeground(new java.awt.Color(162, 213, 171));
        txtVacantes.setToolTipText("");
        txtVacantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtVacantes.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtVacantes.setSelectionColor(new java.awt.Color(57, 174, 169));
        txtVacantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVacantesActionPerformed(evt);
            }
        });

        txtDisp2.setEditable(false);
        txtDisp2.setBackground(new java.awt.Color(85, 123, 131));
        txtDisp2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDisp2.setForeground(new java.awt.Color(162, 213, 171));
        txtDisp2.setToolTipText("");
        txtDisp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtDisp2.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtDisp2.setSelectionColor(new java.awt.Color(57, 174, 169));
        txtDisp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisp2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(229, 239, 193));
        jLabel13.setText("Disponibilidad: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftfFecIni, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftfHorIni, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(188, 188, 188))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescClase, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDisp2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftfFecFin, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ftfHorFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                        .addComponent(txtVacantes, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCap, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDescClase, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ftfFecIni, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(ftfFecFin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(ftfHorIni, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ftfHorFin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVacantes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(jLabel7)
                    .addComponent(txtCap, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDisp2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnEliminarClase.setBackground(new java.awt.Color(32, 101, 98));
        btnEliminarClase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarClase.setForeground(new java.awt.Color(229, 239, 193));
        btnEliminarClase.setText("Eliminar Clase");
        btnEliminarClase.setBorder(null);
        btnEliminarClase.setBorderPainted(false);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnEliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnEliminarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void ftfFecIniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftfFecIniMouseClicked
        ftfFecIni.setText("");
    }//GEN-LAST:event_ftfFecIniMouseClicked

    private void ftfFecIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfFecIniActionPerformed

    }//GEN-LAST:event_ftfFecIniActionPerformed

    private void ftfFecFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftfFecFinMouseClicked
        ftfFecFin.setText("");
    }//GEN-LAST:event_ftfFecFinMouseClicked

    private void txtDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionActionPerformed

    private void ftfHorIniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftfHorIniMouseClicked
        ftfHorIni.setText("");
    }//GEN-LAST:event_ftfHorIniMouseClicked

    private void ftfHorFinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftfHorFinMouseClicked
        ftfHorFin.setText("");
    }//GEN-LAST:event_ftfHorFinMouseClicked

    private void ftfHorFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfHorFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfHorFinActionPerformed

    private void txtCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapActionPerformed

    private void txtVacantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVacantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVacantesActionPerformed

    private void txtDisp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisp2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarClase;
    private javax.swing.JFormattedTextField ftfFecFin;
    private javax.swing.JFormattedTextField ftfFecIni;
    private javax.swing.JFormattedTextField ftfHorFin;
    private javax.swing.JFormattedTextField ftfHorIni;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tblClases;
    private javax.swing.JTextField txtCap;
    private javax.swing.JTextField txtDescClase;
    private javax.swing.JTextField txtDisp2;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNombCurso;
    private javax.swing.JTextField txtVacantes;
    // End of variables declaration//GEN-END:variables
}