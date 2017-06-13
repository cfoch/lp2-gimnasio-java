/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EntrenadorModificarControlador;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Entrenador;
import vista.interfaces.IVista;

/**
 *
 * @author Lin
 */
public class VentrenadorModPerfil extends javax.swing.JPanel implements IVista {
    EntrenadorModificarControlador controlador;
    public static final class Action {
        public static final String MODIFICAR_CLICKED = "modificar_clicked";
    }
    
    /**
     * Creates new form VentrenadorModPerfil
     */
    public VentrenadorModPerfil() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtApMat = new javax.swing.JTextField();
        txtFecNac = new javax.swing.JTextField();
        txtNomb = new javax.swing.JTextField();
        txtApPat = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pswContrasena = new javax.swing.JPasswordField();
        pswConfContrasena = new javax.swing.JPasswordField();
        btnModPerfil = new javax.swing.JButton();

        setBackground(new java.awt.Color(85, 123, 131));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(85, 123, 131));

        jPanel2.setBackground(new java.awt.Color(85, 123, 131));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(229, 239, 193))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setForeground(new java.awt.Color(229, 239, 193));
        jLabel5.setText("DNI:");

        jLabel6.setForeground(new java.awt.Color(229, 239, 193));
        jLabel6.setText("Nombres: ");

        jLabel7.setForeground(new java.awt.Color(229, 239, 193));
        jLabel7.setText("Apellido Paterno: ");

        jLabel8.setForeground(new java.awt.Color(229, 239, 193));
        jLabel8.setText("Apellido Materno: ");

        jLabel9.setForeground(new java.awt.Color(229, 239, 193));
        jLabel9.setText("Fecha Nacimiento: ");

        txtApMat.setBackground(new java.awt.Color(229, 239, 193));
        txtApMat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApMat.setForeground(new java.awt.Color(91, 81, 81));
        txtApMat.setText("XXXX-XXXX-XXXX-XXXX");
        txtApMat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtApMat.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtApMat.setSelectionColor(new java.awt.Color(57, 174, 169));

        txtFecNac.setBackground(new java.awt.Color(229, 239, 193));
        txtFecNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFecNac.setForeground(new java.awt.Color(91, 81, 81));
        txtFecNac.setText("XXXX-XXXX-XXXX-XXXX");
        txtFecNac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtFecNac.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtFecNac.setSelectionColor(new java.awt.Color(57, 174, 169));

        txtNomb.setBackground(new java.awt.Color(229, 239, 193));
        txtNomb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomb.setForeground(new java.awt.Color(91, 81, 81));
        txtNomb.setText("XXXX-XXXX-XXXX-XXXX");
        txtNomb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtNomb.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtNomb.setSelectionColor(new java.awt.Color(57, 174, 169));

        txtApPat.setBackground(new java.awt.Color(229, 239, 193));
        txtApPat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApPat.setForeground(new java.awt.Color(91, 81, 81));
        txtApPat.setText("XXXX-XXXX-XXXX-XXXX");
        txtApPat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtApPat.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtApPat.setSelectionColor(new java.awt.Color(57, 174, 169));

        txtDNI.setEditable(false);
        txtDNI.setBackground(new java.awt.Color(85, 123, 131));
        txtDNI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(162, 213, 171));
        txtDNI.setText("12345678");
        txtDNI.setBorder(null);
        txtDNI.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtDNI.setSelectionColor(new java.awt.Color(57, 174, 169));

        txtDir.setBackground(new java.awt.Color(229, 239, 193));
        txtDir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDir.setForeground(new java.awt.Color(91, 81, 81));
        txtDir.setText("XXXX-XXXX-XXXX-XXXX");
        txtDir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtDir.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtDir.setSelectionColor(new java.awt.Color(57, 174, 169));

        txtDistrito.setBackground(new java.awt.Color(229, 239, 193));
        txtDistrito.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDistrito.setForeground(new java.awt.Color(91, 81, 81));
        txtDistrito.setText("XXXX-XXXX-XXXX-XXXX");
        txtDistrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtDistrito.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtDistrito.setSelectionColor(new java.awt.Color(57, 174, 169));

        jLabel10.setForeground(new java.awt.Color(229, 239, 193));
        jLabel10.setText("Dirección: ");

        jLabel11.setForeground(new java.awt.Color(229, 239, 193));
        jLabel11.setText("E-mail: ");

        jLabel12.setForeground(new java.awt.Color(229, 239, 193));
        jLabel12.setText("Teléfono: ");

        jLabel13.setForeground(new java.awt.Color(229, 239, 193));
        jLabel13.setText("Distrito: ");

        txtTel.setBackground(new java.awt.Color(229, 239, 193));
        txtTel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTel.setForeground(new java.awt.Color(91, 81, 81));
        txtTel.setText("XXXX-XXXX-XXXX-XXXX");
        txtTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtTel.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtTel.setSelectionColor(new java.awt.Color(57, 174, 169));

        txtEmail.setBackground(new java.awt.Color(229, 239, 193));
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(91, 81, 81));
        txtEmail.setText("XXXX-XXXX-XXXX-XXXX");
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 174, 169)));
        txtEmail.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        txtEmail.setSelectionColor(new java.awt.Color(57, 174, 169));

        jLabel14.setForeground(new java.awt.Color(229, 239, 193));
        jLabel14.setText("Contraseña:  ");

        jLabel15.setForeground(new java.awt.Color(229, 239, 193));
        jLabel15.setText("Confirmar Contraseña: ");

        pswContrasena.setBackground(new java.awt.Color(229, 239, 193));
        pswContrasena.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pswContrasena.setForeground(new java.awt.Color(91, 81, 81));
        pswContrasena.setText("jPasswordField1");
        pswContrasena.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        pswContrasena.setSelectionColor(new java.awt.Color(57, 174, 169));

        pswConfContrasena.setBackground(new java.awt.Color(229, 239, 193));
        pswConfContrasena.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pswConfContrasena.setForeground(new java.awt.Color(91, 81, 81));
        pswConfContrasena.setText("jPasswordField1");
        pswConfContrasena.setSelectedTextColor(new java.awt.Color(253, 255, 246));
        pswConfContrasena.setSelectionColor(new java.awt.Color(57, 174, 169));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(36, 36, 36))
                            .addComponent(jLabel7)))
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApMat, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApPat, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pswConfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtApPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pswContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswConfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnModPerfil.setBackground(new java.awt.Color(32, 101, 98));
        btnModPerfil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModPerfil.setForeground(new java.awt.Color(229, 239, 193));
        btnModPerfil.setText("Modificar");
        btnModPerfil.setBorder(null);
        btnModPerfil.setBorderPainted(false);
        btnModPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnModPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnModPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModPerfilActionPerformed
        Action action;
        
        /*
        Ventrenador_perfil ventPerfil = new Ventrenador_perfil();
        ventPerfil.setSize(610,490); 
        ventPerfil.setLocation(0, 0); 

        panelFondo.removeAll();
        panelFondo.add(ventPerfil, BorderLayout.CENTER);
        panelFondo.revalidate();
        panelFondo.repaint();
        */

    }//GEN-LAST:event_btnModPerfilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModPerfil;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPasswordField pswConfContrasena;
    private javax.swing.JPasswordField pswContrasena;
    private javax.swing.JTextField txtApMat;
    private javax.swing.JTextField txtApPat;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFecNac;
    private javax.swing.JTextField txtNomb;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    
    private void setPerfil(Entrenador entrenador) {
        this.txtApMat.setText(entrenador.getApellidoMaterno());
        this.txtApPat.setText(entrenador.getApellidoPaterno());
        this.txtDNI.setText((entrenador.getDni().toString()));
        this.txtDir.setText(entrenador.getDireccion());
        this.txtDistrito.setText((entrenador.getDistrito()));
        this.txtEmail.setText(entrenador.getEmail());
        this.txtFecNac.setText(entrenador.getFechaNacimiento().toString());
        this.txtNomb.setText(entrenador.getNombre());
        this.txtTel.setText(entrenador.getTelefono());
        this.pswContrasena.setText(entrenador.getContrasena());
        this.pswConfContrasena.setText(entrenador.getContrasena());
    }
    
    public void mostrarError(){
        JFrame frame;
        frame = new JFrame();    
        JOptionPane.showMessageDialog(frame, "Hubo un problema",
            "Upps! Hubo un problema.", JOptionPane.ERROR_MESSAGE);
    }
    
    public boolean actualizarEntrenador(Entrenador entrenador) {
        String contrasena, contrasenaConfirmada;
        Entrenador e;
        JFrame frame;
        frame = new JFrame();        
        // TODO
        // Creo que falta VALIDAR.
        e = this.controlador.getEntrenador();
        e.setApellidoMaterno(this.txtApMat.getText());
        e.setApellidoPaterno(this.txtApPat.getText());
        e.setDireccion(this.txtDir.getText());
        e.setEmail(this.txtEmail.getText());
        // TODO
        // e.setFechaNacimiento(fechaNacimiento);
        e.setNombre(this.txtNomb.getText());
        e.setTelefono(this.txtTel.getText());

        contrasena = String.valueOf(this.pswContrasena.getPassword());
        contrasenaConfirmada = String.valueOf(this.pswConfContrasena.getPassword());
        
        if (!contrasena.equals(contrasenaConfirmada)) {
            JOptionPane.showMessageDialog(frame, "Las contraseñas deben coincidir.",
                "Upps! Hubo un problema.", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        e.setContrasena(contrasena);
        
        return true;
    }
    
    @Override
    public void agregarControlador(ActionListener controlador) {
        this.controlador = (EntrenadorModificarControlador) controlador;
        setPerfil(this.controlador.getEntrenador());
        this.btnModPerfil.addActionListener(controlador);
        this.btnModPerfil.setActionCommand(Action.MODIFICAR_CLICKED);
    }
}
