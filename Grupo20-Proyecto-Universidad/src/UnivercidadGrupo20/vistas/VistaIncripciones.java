package UnivercidadGrupo20.vistas;

import UnivercidadGrupo20.accesoADatos.AlumnoData;
import UnivercidadGrupo20.accesoADatos.Conexion;
import UnivercidadGrupo20.entidades.Alumno;
import java.awt.Graphics;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import javax.swing.JDesktopPane;

public class VistaIncripciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alumno
     */
    public VistaIncripciones() {
        initComponents();
         

    }

    @Override
    protected Graphics getComponentGraphics(Graphics g) {
        return super.getComponentGraphics(g); //To change body of generated methods, choose Tools | Templates.
    }

    public static int getHIDE_ON_CLOSE() {
        return HIDE_ON_CLOSE;
    }

    @Override
    public Graphics getGraphics() {
        return super.getGraphics(); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bModificar = new javax.swing.JButton();
        Bguardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Beliminar = new javax.swing.JButton();
        tfDocumento = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jdFechaNacimiento = new com.toedter.calendar.JDateChooser();
        rbEstado = new javax.swing.JRadioButton();
        jBVolver = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 434, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 468, -1, -1));

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Gestion de alumnos");

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre:");

        tfNombre.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Estado:");

        bModificar.setBackground(new java.awt.Color(153, 153, 255));
        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        Bguardar.setBackground(new java.awt.Color(153, 153, 255));
        Bguardar.setText("Guardar");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Fecha de nacimiento:");

        Beliminar.setBackground(new java.awt.Color(153, 153, 255));
        Beliminar.setText("Eliminar");

        tfDocumento.setBackground(new java.awt.Color(204, 204, 204));

        bBuscar.setBackground(new java.awt.Color(153, 153, 255));
        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Documento:");

        tfApellido.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Apellido:");

        jdFechaNacimiento.setBackground(new java.awt.Color(153, 153, 255));
        jdFechaNacimiento.setToolTipText("LocalDate");

        rbEstado.setBackground(new java.awt.Color(153, 153, 255));
        rbEstado.setForeground(new java.awt.Color(0, 0, 0));
        rbEstado.setText("Activo");

        jBVolver.setText("Volver");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Bguardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Beliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfDocumento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jdFechaNacimiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBVolver, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(37, 37, 37)
                                .addComponent(rbEstado))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(bBuscar)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBVolver)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Beliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bguardar)))
                        .addGap(50, 50, 50)
                        .addComponent(bModificar)
                        .addGap(33, 33, 33))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbEstado))
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bguardar)
                    .addComponent(Beliminar)
                    .addComponent(bModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jBVolver)
                .addContainerGap())
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -24, 410, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:

        // Obtén el texto ingresado en el JTextFile
        String documento = tfDocumento.getText();

        // Convierte el texto a un entero
        int dni = Integer.parseInt(documento);

        // Llama al método buscarAlumnoPorDni con el número ingresado
        Alumno alumno = new AlumnoData().buscarAlumnoPorDni(dni);

        // Obtén los datos del alumno encontrado
        int idAlumno = alumno.getIdAlumno();
        dni = alumno.getDni();
        String apellido = alumno.getApellido();
        String nombre = alumno.getNombre();
        LocalDate fechaDeNacimiento = alumno.getFechaNac();
        boolean estado = alumno.isActivo();

// Muestra los datos en los respectivos JTextFile
        tfDocumento.setText("" + dni);
        tfApellido.setText(apellido);
        tfNombre.setText(nombre);
        this.jdFechaNacimiento.setDate(Date.from(alumno.getFechaNac().atStartOfDay().toInstant(ZoneOffset.UTC)));
        jRadioButton1.setSelected(estado);

//        AlumnoData alumnoData = new AlumnoData();
//        
//        int dni= Integer.parseInt(tfDocumento.getText());
//        alumnoData.buscarAlumno(dni);
//        tfApellido.setText(alumnoData.);

    }//GEN-LAST:event_bBuscarActionPerformed

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        // TODO add your handling code here:
        Connection con = Conexion.getConexion();

        int dni = Integer.parseInt(tfDocumento.getText());
        String nombre = tfNombre.getText();
        String apellido = tfApellido.getText();
//        LocalDate fecha = jdFechaNacimiento.getJCalendar();
        java.sql.Date fdn = new java.sql.Date(jdFechaNacimiento.getDate().getTime());
        boolean estado = rbEstado.isSelected();

        Alumno alu = new Alumno(dni, apellido, nombre, fdn.toLocalDate(), estado);
        AlumnoData ad = new AlumnoData();
        ad.guardarALumno(alu);

    }//GEN-LAST:event_BguardarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed

    }//GEN-LAST:event_bModificarActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        //Botno volver.
        this.dispose();  //Borra la pantalla 
        MenuPrincipal panta = new MenuPrincipal();
        panta.setVisible(true); // Hace visible la pantalla menu principal.
        panta.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Beliminar;
    private javax.swing.JButton Bguardar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBVolver;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfDocumento;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

   
    }


